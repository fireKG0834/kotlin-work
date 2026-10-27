// Task 7.7.1: statistics functions
fun median(data: List<Float>): Float {
    require(data.isNotEmpty()) { "Data list cannot be empty" }
    val sorted = data.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 0) {
        (sorted[mid - 1] + sorted[mid]) / 2
    } else {
        sorted[mid]
    }
}

fun displayStats(data: List<Float>) {
    println("Minimum: ${data.min()}")
    println("Maximum: ${data.max()}")
    println("Mean:    ${data.average()}")
    println("Median:  ${median(data)}")
}