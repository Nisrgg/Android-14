fun openBrowser(url: String, incognitoMode: Boolean = false) {

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

    // ...

}

// Usage

fun main() {

    openBrowser("website1.com") // Opening website1.com

    openBrowser("website2.com") // Opening website2.com

    openBrowser("website3.com", true) // Opening website3.com in incognito mode
}