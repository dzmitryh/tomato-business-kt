package com.dzmitryh.tomato.tomatobackend.service


import com.dzmitryh.tomato.tomatobackend.domain.Provider
import com.dzmitryh.tomato.tomatobackend.domain.Sale
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.ZoneOffset
import java.time.temporal.TemporalAdjusters.firstDayOfYear
import java.util.*
import kotlin.streams.toList

val TOMATOES_UPPER_BOUND = 2000
val PROVIDERS_COUNT = Provider.values().size
val RANDOM = Random()

@Service
class SalesServiceImpl : SalesService {

    override fun getSales(size: Int): Collection<Sale> {
        return 1.rangeTo(size)
                .map {
                    val dates = getDates()
                    Sale(
                            UUID.randomUUID().toString(),
                            RANDOM.nextInt(TOMATOES_UPPER_BOUND),
                            Provider.values()[RANDOM.nextInt(PROVIDERS_COUNT)].value,
                            toMillis(dates[RANDOM.nextInt(dates.size)])
                    )
                }
    }

    private fun getDates(): List<LocalDate> {
        val now = LocalDate.now()
        val startDateOfTheYear = now.with(firstDayOfYear())
        return startDateOfTheYear.datesUntil(now).toList()
    }

    private fun toMillis(localDate: LocalDate): Long {
        return localDate.atStartOfDay().atZone(ZoneOffset.UTC)
                .toInstant().toEpochMilli()
    }
}