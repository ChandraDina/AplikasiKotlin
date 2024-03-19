package example.myapp

import kotlin.math.PI

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"

    open fun printSize() {
        println(shape)
        println("Width: $width cm, Length: $length cm, Height: $height cm")
        // 1 liter = 1000 cm^3
        println("Volume: $volume liters")
    }
}

class TowerTank(override var height: Int, var diameter: Int) : Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // cylinder volume = π * r^2 * h
        get() = ((PI * (width / 2) * (width / 2) * height) / 1000).toInt()
        set(value) {
            height = ((value * 1000) / (PI * (width / 2) * (width / 2))).toInt()
        }

    override val shape = "cylinder"
    var water = volume * 0.8 // Define water property

    fun printTowerTankInfo() {
        println("Shape: $shape")
        println("Diameter: $diameter cm, Height: $height cm")
        println("Volume: $volume liters")
        println("Water level: $water liters (${water / volume * 100}% full)")
    }
}

