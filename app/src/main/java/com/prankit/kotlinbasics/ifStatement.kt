package com.prankit.kotlinbasics

fun main(){

    /*
        In Kotlin, if is an expression: it returns a value.
        Therefore, there is no ternary operator (condition ? then : else)
        because ordinary if works fine in this role.
    */

    var max = 10
    if (10 < 20) max = 20

    // With else
    var max2: Int
    if (20 > 10) {
        max2 = 20
    } else {
        max2 = 10
    }

    // As expression
    val max3 = if (50 > 40) 40 else 50

}