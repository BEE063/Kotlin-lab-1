class Cat(val foodCat: String, val locationCat: String, val typeOfWool: String) : Animal(foodCat, locationCat) {
    override fun makeNoise() {
        println("Кошка мяукает")
    }

    override fun eat() {
        println("Кошка ест")
    }
}