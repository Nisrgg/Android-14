package com.example.kotlinpractice.Kotlin.Fundamentals

fun main(){
    var computerChoice = ""
    var userChoice = ""

    println("Rock, Paper of Scissor? Enter your choice")
    userChoice = readln()

    var num = (1..3).random()
    computerChoice = when(num){
        1 -> "Rock"
        2 -> "Paper"
        else -> "Scissor"
    }
    println(computerChoice)

    val winner = when {
        userChoice == computerChoice -> "Tie"
        userChoice == "Paper" && computerChoice == "Rock" -> "Player"
        userChoice == "Scissor" && computerChoice == "Paper" -> "Player"
        userChoice == "Rock" && computerChoice == "Scissor" -> "Player"
        else -> "Computer"
    }

    println("$winner is the winner")
}