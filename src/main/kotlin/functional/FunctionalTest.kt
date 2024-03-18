package functional

import javax.swing.text.View

class FunctionalTest {


    // (T) -> Boolean - called predicate functions
    // (T) -> R - transformation functions
    // (T) -> Unit - returns nothing significant, called operation functions


    /*
    return types:
    Unit -> nothing significant, but the code after this is reachable
    Nothing -> It's like a black hole, the end of execution, the code right after is unreachable
     */

    fun setListItemListener(
        listener: (position: Int, id: Int, firstName: Hazem, secondName: Hazemm) -> String
    ) {
        val res = listener.invoke(5, 3, "daasdda", "adasd")
        println(res)
    }

}

typealias Hazem = String
typealias Hazemm = String

fun main() {
    val functionalTest = FunctionalTest()
    functionalTest.setListItemListener { position, id, firstName, secondName ->
        println(position)
        println(id)
        println(firstName)
        println(secondName)

        "$position: Done"
    }

}