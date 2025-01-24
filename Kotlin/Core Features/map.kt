fun main() {
    val capitals = mapOf("USA" to "Washington", "Poland" to "Warsaw", "Ukraine" to "Kyiv")
    //    val capitals = mapOf(
    //        Pair("USA", "Washington"),
    //        Pair("Poland", "Warsaw"),
    //        Pair("Ukraine", "Kyiv")
    //    )
    println(capitals) // {USA=Washington, Poland=Warsaw, Ukraine=Kyiv}

    val alphabet: Map<Char, Int> = mapOf('A' to 1, 'B' to 2, 'C' to 3)
    println(alphabet) // {A=1, B=2, C=3}
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 + ('C' to "Celina") + ('B' to "Bobby")   //adding duplicate key will overwrite it on the old one
    println(map2)     //  {A=Alex, B=Bobby, C=Celina}
    for(i in map2){
        println("${i.key} for ${i.value}")
    }

}