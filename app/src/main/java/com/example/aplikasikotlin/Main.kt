package com.example.aplikasikotlin

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
}
package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
package example.myapp

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun main () {
    makeFish()
}
interface FishAction  {
    fun eat()
}