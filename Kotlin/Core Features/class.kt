class smartDevice(){
    val name = "Android TV"
    val category = "Entertainment"
    var status : String = "offline"
    fun Status(){
        println("Status of $name : $status")
    }
    fun turnOn(){
        println("Smart device turned on")
        status = "online"
    }
    fun turnOff(){
        println("Smart device turned off")
        status = "offline"
    }
}

fun main(){
    val smartTv = smartDevice()
    println("Device name: ${smartTv.name}")
    smartTv.Status()
    smartTv.turnOn()
    smartTv.Status()
    smartTv.turnOff()
}