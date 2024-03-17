class FirstProgram constructor(val x: String, val y: Int) {


    var name: String = ""
        get() = field + "sad"
        set(value) {
            field = value + "happy"
        }


    val fullName: String
        get() = name

    fun displayNameAndAge(vararg args: String) {
        args.forEach {
            println(it)
        }
    }

    fun printMe() {
        println(this)
    }
}
