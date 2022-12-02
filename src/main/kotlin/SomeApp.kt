object SomeApp {

    @JvmStatic
    fun main(args: Array<String>) = with(Vehicle.Car) {
        something()
    }

}

sealed class Vehicle {

    open fun makeNoise(): String = "generic noise"

    object Car : Vehicle() {
        override fun makeNoise() = "wroom wroom"
    }

    object Bike : Vehicle() {
        override fun makeNoise() = "ring ring"
    }

}

context(Vehicle) private fun something() {
    println("hello ${makeNoise()}")
}
