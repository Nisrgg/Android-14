data class Dog( val name: String, val age: Int)

fun main(){
    val one = Dog("Pluto",17)
    val two = Dog("Pluto",17)
    val duo = Pair("igu","ereg")
    println(duo)
    val (name, age) = one                  //positional arguement
    println(one == two)
    println(one)
    println("Name: $name , Age: $age")
    println(one.copy())
    println(two.copy(name = "Neptune"))
    println(two.copy(age = 50))

}