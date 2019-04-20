package com.dzmitryh.tomato.tomatobackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TomatoBackendApplication

fun main(args: Array<String>) {
    runApplication<TomatoBackendApplication>(*args)
}
