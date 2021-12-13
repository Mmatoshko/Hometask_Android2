package com.example.lesson15

import kotlin.random.Random

class Earth : Astrology {
    constructor(
        name: String,
        planetPocrovitel: String,
        symbol: String
    ) : super(name, planetPocrovitel, symbol)

    fun reliability() {
        val persent: Int = Random.nextInt(0, 100)
        println("Надёжность: $persent %")
    }
}