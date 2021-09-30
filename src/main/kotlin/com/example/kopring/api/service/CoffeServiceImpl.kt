package com.example.kopring.api.service

import org.springframework.stereotype.Service

@Service
class CoffeServiceImpl : CoffeeService {
    override fun getCoffeeOrderList(): String{
        return "커피 주문 목록을 반환합니다."
    }
}