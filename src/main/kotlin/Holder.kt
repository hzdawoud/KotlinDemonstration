class Holder {

    val v1: Int get() = calculate("v1")
    val v2: Int = calculate("v2")

    private fun calculate(propertyName: String): Int {
        println("Calculating $propertyName")
        return 42
    }
}