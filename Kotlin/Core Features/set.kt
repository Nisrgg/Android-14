    class Collection(val name: String)
data class setCollection(val name: String)

fun main(){
    var set1: Set<Int>  = setOf(1,2,3,4,2,4,5,1,7,6,7,7,8)
    val set2: Set<Double> = setOf(1.23424,2.23)
    println(set2)
    println(set1)
    val set = setOf(Collection("A"), Collection("A"))
    println(set + Collection("A"))
    println(setOf(setCollection("ABC"),setCollection("ABC")))        //for data class, no repetition

    //to check if an element contains a particular element
    val letters: Set<Char> = setOf('A', 'B', 'C')
    println(letters.contains('A')) // true
    println(letters.contains('Z')) // false
    println('A' in letters) // true
    println('Z' in letters) // false


    //Mutable type
    var set3: MutableSet<Char> = mutableSetOf('A', 'B')
    set3.add('C')
    println(set3) // [A, B, C]
    set3.remove('B')
    println(set3) // [A, C]
}