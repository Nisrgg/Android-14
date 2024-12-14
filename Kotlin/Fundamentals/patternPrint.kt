package com.example.kotlinpractice.Kotlin.Fundamentals

fun printStars(num: Int) {
    for (j in 1..num){
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int){
    for (i in 1..height){
        printStars(i)
    } 
}


fun descendingTriangle(depth: Int){
    for(stars in depth downTo 1){
        printStars(stars)
    }
}

fun isoscelesTriangle(width: Int){
    ascendingTriangle(width)
    descendingTriangle(width-1)
}
fun main(){
    println("Ascending Triangle of length 5: ")
    ascendingTriangle(5)
    println()
    println("Descending Triangle of length 7: ")
    descendingTriangle(7)
    println()
    println("Isosceles Triangle for you: ")
    isoscelesTriangle(6)
}
