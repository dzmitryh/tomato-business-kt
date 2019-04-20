package com.dzmitryh.tomato.tomatobackend.domain


data class Sale(
        val id: String,
        val tomatoes: Int,
        val provider: String,
        val timestamp: Long
)