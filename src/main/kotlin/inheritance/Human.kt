package inheritance

import kotlin.random.Random

class Human : Mammal() {
    override fun feedYoung() {
        if (canFeed) {
            println("Feeding young with milk")
        } else {
            println("Feeding young with milk from bottle")
        }


        val x = "dsf".orThrow()
        val y = null.orThrow()
    }
    private fun <T> T.orThrow(): T & Any = this ?: throw Error()



}