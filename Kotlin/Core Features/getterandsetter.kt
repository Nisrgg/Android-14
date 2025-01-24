class Company {
	var name: String = ""
		get() = field	 	 // getter
		set(value) {		 // setter
			field = value    //they both are optional as they are auto generated with the code
		}
}
fun main() {
	val c = Company()
	c.name = "GeeksforGeeks"	 // access setter
	println(c.name)				 // access getter 
}


