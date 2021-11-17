class Dog(val foodDog: String, val locationDog: String, val intelligence: Int) : Animal(foodDog, locationDog) {
    override fun makeNoise() {
        println("Собака лает")
    }
    override fun eat() {
        println("Собака ест")
    }
}