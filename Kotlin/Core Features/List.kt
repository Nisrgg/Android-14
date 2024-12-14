fun main() {
    val list: MutableList<Int> = mutableListOf(1, 2, 3, 4) // Use mutableListOf to create a mutable list
    var ints: List<String> = listOf("A", "B", "C")
    println(ints)
    println(list)
    list.add(5) // Use add() method to append elements to the list
    println(list)
    println("The size of integerlist is ${list.size} ")
    if(list.isEmpty() == true){
        println("The given list is empty")
    }
    else{
        println("Given list is not empty: \n$list")
    }
    var j: Int = 1
    for(i in ints){
        println("Element at position $j: $i")
        j+=1
    }
}
