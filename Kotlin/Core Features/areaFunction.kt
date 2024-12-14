//different ways to define a function


fun areaOfTriangle(base: Double, height: Double): Double = base*height/2

fun areaRect(length: Double, breadth: Double): Double {
    return length * breadth
}

fun biggerOf(a: Int, b: Int): Int{
    return if ( a > b ) a else b
}

fun smallerOf(a: Int, b: Int, c: Int): Int = if (a < b && a < c) a else if (b < c) b else c

fun main(){
    println(areaOfTriangle(2.0, 2.0)) // 2.0
    println(areaRect(9.3,10.0))
    println(biggerOf(5,4))
    println(smallerOf(4,3,2))
}