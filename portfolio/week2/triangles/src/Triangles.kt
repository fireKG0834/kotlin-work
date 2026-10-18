// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(sides: Triangle): Boolean {
    val (a, b, c) = sides
    return (a + b > c) && (a + c > b) && (b + c > a)
}

fun triangleArea(sides: Triangle): Double {
    val (a, b, c) = sides
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}


