package mainkotlin.function

/**
 *    Developer : cheasocheat
 *    Created on 2/9/18 13:33
 */

fun findBodyMassIndex(weightInKg: Double, heightInCm: Double): Double {
    // Validate the arguments
    if(weightInKg <= 0) {
        throw IllegalArgumentException("Weight must be greater than zero")
    }
    if(heightInCm <= 0) {
        throw IllegalArgumentException("Height must be greater than zero")
    }

    fun calculateBMI(weightInKg: Double, heightInCm: Double): Double {
        val heightInMeter = heightInCm / 100
        return weightInKg / (heightInMeter * heightInMeter)
    }

    // Calculate BMI using the nested function
    return calculateBMI(weightInKg, heightInCm)
}
