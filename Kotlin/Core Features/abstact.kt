abstract class Employee (val name: String,val experience: Int) {

    abstract var salary: Double

    abstract fun dateOfBirth(date:String)

    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}

class Engineer1(name: String,experience: Int, dob: String = "") : Employee(name,experience) {
    override var salary = 500000.00
    var dob : String = ""
    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
        dob = date
    }
}
fun main() {

    val eng = Engineer1("Praveen",2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")
}
