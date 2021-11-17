class Horse(val foodHorse: String, val locationHorse: String, val typeOfAppointment: String) : Animal(foodHorse, locationHorse) {
    override fun makeNoise() {
        println("Лошать ржет")
    }

    override fun eat() {
        println("Лошадь ест")
    }
}