package com.example.kopring.api.rest

import com.example.kopring.api.service.CoffeeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/coffee/api/v1")
class CoffeeController(
    private val coffeeService: CoffeeService
) {
    @GetMapping("/order/list")
    fun showOrderList(): String = coffeeService.getCoffeeOrderList();
}