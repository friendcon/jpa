package com.practice.jpa.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/hello")
    fun hello(): Array<String> {
        val arr = arrayOf("Hello", "World")
        return arr
    }
}