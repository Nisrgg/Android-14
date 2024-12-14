/*
private:
         The private modifier restricts the visibility of a member to the containing class only.
         A private member cannot be accessed from outside the class.
internal: 
        The internal modifier restricts the visibility of a member to the same module. A module is a set of Kotlin files compiled together.
protected: 
        The protected modifier restricts the visibility of a member to the containing class and its subclasses.
public: 
        The public modifier makes a member visible to any code. This is the default visibility for members in Kotlin.
 */



open class A {
	var int1 = 10
} 					// Public Modifier (by default public)


public class B {
	var int2 = 20
	fun display() {
		println("Accessible everywhere")
	}
}  				// Specified with public modifier


private class PrivateA {
	private val int = 10
	fun display() {
		// we can access int in the same class
		println(int)
		println("Accessing int successful")
	}
}		// Private modifier


internal class C {
} 				// Internal modifier


public class D {
	internal val int = 15
	internal fun display() {
		println("Value : $int")
	}
}


// Protected modifier
open class E {
	// Protected variable
	protected val int = 1000
}					// Base Class


class F : E() {
	fun getvalue(): Int {
		// Accessed from the subclass
		return int
	}
}					// Derived class

fun main(args: Array<String>) {
	var a = PrivateA() // Using the private class with a different name
	a.display()
	// Can not access 'int1' as it belongs to another class A, not PrivateA
	// println(a.int1) // This would cause an error
	var b = F() // Use class F instead of B
	println("The value of integer is: " + b.getvalue())
}





/*
----> Advantages of using visibility modifiers in Kotlin:
1) Encapsulation:
	By restricting the visibility of the members of a class, you can enforce the principle of encapsulation and ensure that the internal state of the class remains hidden from the outside world.
2) Modularity:
	By controlling the visibility of the members of a class, you can create modular components that can be easily reused and maintained.
3) Abstraction: 
	By hiding the implementation details of your classes behind public interfaces, you can create an abstraction layer that makes your code more maintainable and less prone to bugs.

----> Disadvantages of using visibility modifiers in Kotlin:
1) Complexity:
	Using visibility modifiers can make your code more complex, especially if you have many classes and members with different visibility levels.
2) Overhead:
	Restricting the visibility of members can add some overhead to your code, as the compiler has to perform additional checks to enforce the visibility rules.
*/