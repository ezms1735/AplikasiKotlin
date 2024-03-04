package id.ac.pnm.ti2a.aplikasikotlin

import android.graphics.Color

class Motorcycle (var tires: Int, color: String = "Black"){
    var motorcycleOfColor: String = color
    val numberOfTires: Int = tires
    val isForSale: Boolean = false

    fun updateColor(newColor: String){
        this.motorcycleOfColor = newColor
    }

    fun putOnSale(status: Boolean){

    }
}

fun main(){
    val motor1 = Motorcycle(tires = 2)
    println("Motor Scoopy berwarna ${motor1.motorcycleOfColor}")
    println("Motor Scoopy ban ${motor1.numberOfTires}")
    motor1.updateColor(newColor = "hitam")
    println("Motor Scoopy warna baru ${motor1.motorcycleOfColor}")
    println("=".repeat(n = 30))

    val motor2 = Motorcycle(tires = 3, color = "hijau")
    println("Motor Becak berwarna ${motor2.motorcycleOfColor}")
    println("Motor Becak ban ${motor2.numberOfTires}")
}