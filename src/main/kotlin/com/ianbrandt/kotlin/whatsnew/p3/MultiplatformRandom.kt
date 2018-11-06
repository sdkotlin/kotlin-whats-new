package com.ianbrandt.kotlin.whatsnew.p3

import kotlin.random.Random

fun main() {

	val randomInt = Random.nextInt(9) + 1

	println("I'm thinking of a random number between 1 and 10, and it's $randomInt.")

	val alphabet = 'A'..'Z'

	println("This month's SD Kotlin meeting was brought to you by the letter ${alphabet.random()}.")

	val madLibs = listOf("rocks!", "is a great place to meet up!", "is my happy place!")

	println("SD Kotlin ${madLibs.random()}")
}
