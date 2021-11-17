open class Animal(val food: String, val location: String) {
    fun sleep() {
        println("Какое-то животное спит")
    }
    open fun makeNoise() {
        println("Какое-то животное издает звук")
    }
    open fun eat() {
        println("Какое-то животное ест")
    }
}