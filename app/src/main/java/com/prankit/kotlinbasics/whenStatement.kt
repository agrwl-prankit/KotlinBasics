package com.prankit.kotlinbasics

fun main() {
// Kotlin’s "when" expression is the replacement of the switch statement
// from other languages like C, C++, and Java.
// It is compact and more powerful than switch statements.
    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when (month) {
        1, 2, 3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // You can also check a value for being in or !in a range or a collection:
    var age = 17
    when (age) {
        // with the !in it's the same as saying not in ...
        !in 0..20 -> print("now you may drink in the US")
        in 18..20 -> print("now you may vote")
        16, 17 -> print("you now may drive")
        else -> print("you're too young")
    }

    var x: Any = 13.37
    when (x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    /*
        In when statements, the else branch is mandatory in the following conditions:
        1. when has a subject of an Boolean, enum, or sealed type, or their nullable counterparts.
        2. branches of when don't cover all possible cases for this subject.
     */

    // To define a common behavior for multiple cases, combine their conditions in a single line with a comma:

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    // You can use arbitrary expressions (not only constants) as branch conditions

    var s = ""
    when (x) {
        s.toInt() -> print("s encodes x")
        else -> print("s does not encode x")
    }

    // you can access the methods and properties of the type without any extra checks.
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

    // You can capture when subject in a variable using following syntax:
    /*
    fun Request.getBody() =
        when (val response = executeRequest()) {
            is Success -> response.body
            is HttpError -> throw HttpException(response.status)
        }

     */
}

