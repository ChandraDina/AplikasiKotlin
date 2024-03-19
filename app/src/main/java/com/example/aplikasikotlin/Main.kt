fun main() {
    val aquarium = Aquarium(width = 25, height = 35, length = 110)
    println("Original aquarium volume: ${aquarium.volume} liters")

    aquarium.volume = 500 // Set the volume using setter
    println("Updated aquarium volume: ${aquarium.volume} liters")
}