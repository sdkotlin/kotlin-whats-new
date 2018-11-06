package com.ianbrandt.kotlin.whatsnew.p4

import kotlin.random.Random

fun Boolean.Companion.coinToss(): String = if (Random.nextBoolean()) "Heads" else "Tails"

fun main() {

	println("${Boolean.coinToss()}, you win!")
}
