package com.prankit.kotlinbasics

/*
    For loop looks a bit different.
    a different keyword is used to express iteration over something in where meets the element type.
 */

fun forLoop(){
    val list = listOf("a","b","c")
    for (i in list){
        println("for Loop")
    }
}

/*
    Another difference is that in Kotlin
    1. we can iterate over the contents of a map.
       Here we assign key and value separately at each iteration loop, then printed the result.
    2. This syntax works not only for maps, it can be used to iterate over a collection with index
 */

fun forLoop2(){
    val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    for ((key, value) in map){
        println("$key = $value")
    }
}

//  This syntax works not only for maps, it can be used to iterate over a collection with index.

fun forLoop3(){
    val list = listOf("a","b","c")
    for ((index, value) in list.withIndex()){
        println("$index = $value")
    }
}

//  if we need to work with index directly

fun forLoop4(){
    for (i in 1..4) print(i)                              // 1234
    for (i in 1 until 4) print(i)                         // 123
    for (i in 9 downTo 1 step 2) print(i)                 // 97531

    // Ques: What is printed here?
    for (ch in "aoc") print(ch + 1)                             // bpd
    /*
    When we add a number to a character it turns the character with increased code.
    The letters go one after another
     */

    // Ques: Which one is the right way to rewrite the following Java code into Kotlin?
    /*
        for (char c = '0'; c < '9'; c++) {
            System.out.print(c);                // 012345678
        }
        1. for (c in '0' to '9') { print(c) } - compiler error- 'to' creates a pair not arrange, and we can't iterate over a pair.
        2. for (c in '0'..'9') { print(c) }
        3. for (c in '0' until '9') { print(c) } - // // 012345678 - correct
     */
}

fun main(){
    forLoop()
    forLoop2()
    forLoop3()
    forLoop4()
}