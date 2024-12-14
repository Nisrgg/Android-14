package com.example.kotlinpractice.Kotlin.Fundamentals

fun main() {
    val year = Pair(8.40,53)
    println(year.first)   //8.4
    println(year.second)  //53

    val (cgpa,credits) = year
    println(credits)  //53

    val pair = Triple(1F, "ABC", true)

    println(pair.first) // 1.0
    println(pair.second) // ABC
    println(pair.third) // true
    val (number, letters, boolean) = pair

    println(number) // 1.0
    println(letters) // ABC
    println(boolean)
}

// fun main() {
//     val pair = Pair(1.0, 'A')
//     println(pair.first) // 1.0
//     println(pair.second) // A
//     val (number, letter) = pair
    
//     println(number) // 1.0
//     println(letter) // A
//     }