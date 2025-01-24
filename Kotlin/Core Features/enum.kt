enum class Phone(val price: Double){
    IPhone(85000.0),
    Pixel(45000.0),
    Samsung(50000.0),
    Huawei(1.0);

    fun display() {
        println("Price of $name is $price")
    }
}

fun main() {

    val phone: Phone = Phone.Pixel
    phone.display()
}
