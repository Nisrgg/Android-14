package com.example.kotlinpractice
fun main(){

    //Float - you can use in both uppercase and lowercase for representing F
    val hi = 10.4F
    println(hi)

    //TEXT - 1. Char (single character)  2. String (sequence of char)

    var hey: Char = '\t'       //used for tab
    //println(hey)
    hey = '5'
    var my: String = "My age  is $hey"
    println(my)
    hey =  'N'
    println(my)         //you need to reassign "my" variable to print 'N'
                        //my = "My age is $hey" - before println()

    //you can use toDatatype() methods for converting datatypes
}