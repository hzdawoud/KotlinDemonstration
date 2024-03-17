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


    feedYoung(Human())
    feedYoung(Dog())


}

fun feedYoung(mammal: Mammal) {
    mammal.feedYoung()
}