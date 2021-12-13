package com.example.lesson15

import kotlin.random.Random

class Water : Astrology {
    constructor(
        name: String,
        planetPocrovitel: String,
        symbol: String
    ) : super(name, planetPocrovitel, symbol)

    fun melancoly() {
        val persent: Int = Random.nextInt(0, 100)
        println("Меланхоличность: $persent %")
    }
}