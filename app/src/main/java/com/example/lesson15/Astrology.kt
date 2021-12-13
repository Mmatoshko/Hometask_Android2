package com.example.lesson15

import kotlin.random.Random

open class Astrology(
    var name: String,
    var planetPocrovitel: String,
    var symbol: String
) {
    override fun toString(): String {
        return "Astrology(name='$name', planetPocrovitel='$planetPocrovitel', symbol='$symbol')"
    }

    fun prediction(): String {
        val predictions: ArrayList<String> = arrayListOf(
            "You will have a nice day",
            "You will have a good day",
            "You will have a perfect day"
        )
        var rand = Random.nextInt(0, predictions.size-1)
        return "${predictions[rand]}"

    }

}