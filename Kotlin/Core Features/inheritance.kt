open class Mammal{
    fun feedMammal(){
        println("feeding animals")
    }
}

class Tiger: Mammal() {
    fun roar(){
        println("Roar")
    }
}

fun feedAll(mammal: Mammal){
    mammal.feedMammal()
}

fun main() {
    val sallu = Tiger()
    val saleem = Mammal()
    saleem.feedMammal()
    sallu.feedMammal()
    sallu.roar()
    feedAll(sallu)
}