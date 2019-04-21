package com.dzmitryh.tomato.tomatobackend.service

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test


internal class SalesServiceImplTest {

    private val salesService = SalesServiceImpl()

    @Test
    internal fun test_getSales_returnsSales() {
        //given
        //when
        val actualSales = salesService.getSales(3)
        //then
        assertNotNull(actualSales)
    }
}