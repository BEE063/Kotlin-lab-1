fun main() {
    val cat = Cat(foodCat = "рыба", locationCat = "Москва", typeOfWool = "короткошерстная")
    val dog = Dog(foodDog = "мясо", locationDog = "Санкт-Петербург", intelligence = 10)
    val horse = Horse(foodHorse = "сено", locationHorse = "Екатеринбург", typeOfAppointment = "Верховая")
    val veterinarian = Veterinarian()

    val animalArray: Array<Animal> = arrayOf(cat, dog, horse)

    for(animal in animalArray){
        veterinarian.treatAnimal(animal)
    }
}
