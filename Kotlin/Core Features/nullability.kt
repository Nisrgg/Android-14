class User(
    var name: String?
){
    fun cheer(){
        if(name == null){
        println("Null value")
    } else{
        println("Hey $name, how you doin', eh?")
    }
}
}

fun printUserName(user: User?){
    println(user?.name)
}

fun main(){
    val obj: User? = User("Nisarg")
    val obj1: User? = User(null)
    obj?.name = null
    printUserName(obj)
    obj?.cheer()
    obj1?.cheer()
}