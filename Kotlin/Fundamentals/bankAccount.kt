import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    // Step 1
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")

    // Step 2
    var accountType = ""
    var userChoice = 0

    // Step 3
    while (accountType == "") {
        println("Choose an option (1, 2 or 3)")
        userChoice = reader.nextInt()

        when (userChoice) {
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            3 -> accountType = "checking"
            else -> continue
        }
    }

    //Step 4
    println("Successfully created your ${accountType} account.")
}

    /* println("Welcome to our banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")
    while (accountType == "") {
        println("Choose an option (1, 2 or 3)")
        userChoice = (1..5).random()
        println("The selected option is ${userChoice}.")
        
        when (userChoice) {
            1 -> accountType = "debit"
            2 -> accountType = "credit"
            3 -> accountType = "checking"
            else -> continue
        }
     }
    println("You have created a ${accountType} account.")  
 

}
*/
