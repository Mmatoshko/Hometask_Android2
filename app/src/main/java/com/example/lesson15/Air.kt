package com.example.lesson15

import kotlin.random.Random

class Air : Astrology {
    constructor(
        name:String,
        planetPocrovitel:String,
        symbol:String
    ):super(name,planetPocrovitel,symbol)


    fun fickleness() {
        val persent: Int = Random.nextInt(0, 100)
        println("Переменчивость: $persent %")
    }
}