fun consume(a: String?) {
    if (a == null || a.length == 0){
        println("0")       // after || a is smart-casted to String
    } else {
    println(a.length) // the type of a is String
    }
}
    
fun main() {
    consume("ABC") // 3
    consume(null)
    consume("")
    consume("dgeg")
}