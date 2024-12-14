/* For each argument, you can explicitly specify what parameter is associated. 
You do that by introducing parameter names and the equal sign in front of a parameter.
When you do that, arguments do not need to be in parameter order. */

fun cheer(how: String = "Hello,", who: String = "World") {

    println("$how $who")
}

fun main() {
                                                            
    cheer(how = "Hi") // Hi World

    cheer(who = "Learner") // Hello, Learner

    cheer(how = "Hi", who = "Learner") // Hi Learner

    cheer(who = "Learner", how = "Hi ") // Hi Learner
}