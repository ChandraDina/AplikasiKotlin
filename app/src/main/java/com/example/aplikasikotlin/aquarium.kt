class Aquarium(
    var width: Int = 20,
    var length: Int = 100,
    var height: Int = 40
) {
    init {
        println("Initializing the aquarium object...")
    }

    init {
        val volume = width * length * height / 1000
        println("Volume of the aquarium: $volume liters")
    }

    var volume: Int
        get() = width * length * height / 1000
        set(value) {
            val waterVolume = value * 1000 // Convert liters to cm^3
            height = waterVolume / (width * length)
            println("Setting aquarium volume to $value liters. Height adjusted to $height cm.")
        }

    constructor(numberOfFish: Int) : this() {
        val waterVolumePerFish = 2000 // 2 liters (2000 cm^3) per fish
        val extraRoom = 1000 // 1 liter (1000 cm^3) extra room
        val totalWaterVolume = numberOfFish * waterVolumePerFish + extraRoom
        volume = totalWaterVolume / 1000 // Set the volume using setter
        println("Volume of the tank based on $numberOfFish fish: $volume liters")
    }

    fun printSize() {
        println("Width: $width cm, Length: $length cm, Height: $height cm")
    }
}
