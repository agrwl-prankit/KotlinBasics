package com.prankit.kotlinbasics

/*
    Any expression in Kotlin may be marked with a label.
    Labels have the form of an identifier followed by the @ sign, such as abc@ or fooBar@.
    To label an expression, just add a label in front of it.
 */

fun label(){
    loop@ for (i in 1..100) {
        // ...
    }
}

/*
    Kotlin has three structural jump expressions:
    1. return by default returns from the nearest enclosing function or anonymous function.
    2. break terminates the nearest enclosing loop.
    3. continue proceeds to the next step of the nearest enclosing loop.
    All of these expressions can be used as part of larger expressions
    The type of these expressions is the Nothing type.
 */

// BREAK and CONTINUE

// we can qualify a break or a continue with a label
fun breakContinue(){
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i in 30..60) break@loop
        }
    }
}
/*
    A break qualified with a label jumps to the execution point right after the loop marked with that label.
    A continue proceeds to the next iteration of that loop.
 */