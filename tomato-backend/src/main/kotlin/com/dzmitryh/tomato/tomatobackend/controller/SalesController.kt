package com.dzmitryh.tomato.tomatobackend.controller

import com.dzmitryh.tomato.tomatobackend.domain.Sale
import com.dzmitryh.tomato.tomatobackend.service.SalesService
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("sales")
class SalesController(private val salesService: SalesService) {

    @GetMapping
    fun getSales(@RequestParam(value = "size", required = false, defaultValue = "3") size: Int): Collection<Sale> {
        return salesService.getSales(size)
    }
}