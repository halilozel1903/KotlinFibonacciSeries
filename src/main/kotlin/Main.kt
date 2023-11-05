fun main() {
    val range = 10 // specify the number of terms
    var firstNumber = 0
    var secondNumber = 1

    val fibonacciSeries = mutableListOf<Int>()
    fibonacciSeries.add(firstNumber)

    for (index in 1 until range) {
        val total = firstNumber + secondNumber
        fibonacciSeries.add(total)
        firstNumber = secondNumber
        secondNumber = total
    }

    print("Fibonacci Series up to $range terms: ${fibonacciSeries.joinToString(" - ")}")
}
