import inheritance.Dog
import inheritance.Human
import inheritance.Mammal
import java.math.BigDecimal

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val firstProgram = FirstProgram("Hazem", 27)
//    x.displayNameAndAge("1", "asda", "asdas", "asdasd", "asdasd", "asdasd")
    firstProgram.printMe()

    val a: Byte = 99
    val b: Short = 9934


    val million = 100_000_000
    println(million)


    val user = User("ds", "ds")


    println('$'.code)

    for (i in 5 downTo 1) {
        print(i)
    }

    val puppy = Puppy("sadas")
    val innerPuppy = puppy.InnerPuppy()

    innerPuppy.think()


    val list = listOf("A", "B")
    println(list.getOrNull(1)) // B
    println(list.getOrElse(1) { "X" }) // B
    println(list.getOrNull(3)) // null
    println(list.getOrElse(3) { "X" }) // X


    val map = mutableMapOf("A" to 1, "B" to 2)
    println(map.getOrPut("A") { 3 }) // 1
    println(map.getOrPut("C") { 3 }) // 3
    println(map) // {A=1, B=2, C=3}

    feedYoung(Human())
    feedYoung(Dog())



    //todo: learn Unary prefix operators
}

fun feedYoung(mammal: Mammal) {
    mammal.feedYoung()
}