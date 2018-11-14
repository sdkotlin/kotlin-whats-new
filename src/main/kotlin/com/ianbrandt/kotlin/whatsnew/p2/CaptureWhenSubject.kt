package com.ianbrandt.kotlin.whatsnew.p2


fun main() {

	// Before...
//	val theAnswer = 6
//	when (theAnswer) {
//		theAnswer ->
//	}
//	println(theAnswer)

	// When subjects can now be declared in the expression itself:
	when (val theAnswer = 6) {
		42 -> println("Wait, what was the question?")
		else -> println("$theAnswer?! 🤦‍")
	}

	// They are then scoped to it, so this does not compile...
//	 println(theAnswer)
}
