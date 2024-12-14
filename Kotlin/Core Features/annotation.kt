annotation class MyAnnotation(val name: String, val version: Int)
@MyAnnotation(name = "MyLibrary", version = 1)
class MyClass {
    @MyAnnotation(name = "MyFunction", version = 1)
    fun myFunction() {
        // Function body
    }
}
