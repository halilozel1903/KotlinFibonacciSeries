fun main() {
    val range = 10 // specify the number of terms
    var firstNumber = 0
    var secondNumber = 1

    print("Fibonacci Series up to $range terms: ")

    for (index in 1..range) {
        print("$firstNumber - ".removeSuffix("-"))

        val total = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = total
    }


}

