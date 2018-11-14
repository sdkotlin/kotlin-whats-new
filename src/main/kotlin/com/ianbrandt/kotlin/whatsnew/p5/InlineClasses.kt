package com.ianbrandt.kotlin.whatsnew.p5

inline class FirstName(val value: String)

inline class LastName(val value: String)

inline class Age(val value: Int) {

	fun canDrive() = value > 17
}

inline class SSNumber(val value: String) {

	fun format() = "${value.substring(0, 3)}-${value.substring(3, 5)}-${value.substring(5)}"

	override fun toString(): String {

		return "SSNumber(value=${format()})"
	}
}

data class Person(
	val first: FirstName,
	val last: LastName,
	val age: Age,
	val social: SSNumber)

fun main() {

	val person = Person(
		FirstName("Kotlin"),
		LastName("Programmer"),
		Age(18),
		SSNumber("123456789"))

	println("$person, drivingAge=${person.age.canDrive()}")
}
