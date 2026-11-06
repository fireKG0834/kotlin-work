// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(sideA > 0 && sideB > 0 && sideC > 0) {
            "Sides must be positive: ($sideA, $sideB, $sideC)"
        }
        require(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            "Invalid triangle sides: ($sideA, $sideB, $sideC)"
        }
    }

    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = perimeter / 2
    val area get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}