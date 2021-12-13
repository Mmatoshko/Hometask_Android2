package com.example.lesson15

import kotlin.random.Random

class Fire : Astrology {
    constructor(
        name:String,
        planetPocrovitel:String,
        symbol:String
    ):super(name,planetPocrovitel,symbol)

    fun cholericity() {
        val persent: Int = Random.nextInt(0, 100)
        println("Холеричность: $persent %")
    }
}