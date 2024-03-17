package inheritance

class Dog : Mammal() {
    override fun feedYoung() {
        if (canFeed) {
            println("Feeding young with milk")
        }
    }
}