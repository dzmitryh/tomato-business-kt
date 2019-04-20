package com.dzmitryh.tomato.tomatobackend.service

import com.dzmitryh.tomato.tomatobackend.domain.Sale

interface SalesService {
    fun getSales(size: Int): Collection<Sale>
}
