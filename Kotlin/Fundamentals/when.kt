fun main(){
    val probability: Int = 50
    val text  = when{
        probability<40 -> "unlikely"
        probability<=80 ->"likely"
        probability>80 -> "Yes"
        else -> "pata nai bhai"         //else block is must
    }
    println(text)
    var number = (1..2).random()
    when(number){
        1 -> println("One")
        2 -> println("two")
    }
}