## Kotlin Fibonacci Series 🎳 🤯 👁️

![Kotlin Fibonacci Series](https://kotlinlang.org/assets/images/open-graph/general.png)

The `Fibonacci` series is a sequence of numbers where each number is the sum of the two preceding numbers. The first two numbers of the series are 0 and 1, and the subsequent numbers are calculated by adding the previous two numbers.

Here's a `Kotlin` program to display the Fibonacci series up to a specified number of terms:

```kotlin
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
```
In this program, we first declare the number of terms we want to display (in this case, range is set to 10). We then initialize two variables `firstNumber` and `secondNumber` with the first two numbers of the series.

We use a for loop to iterate through the series up to the specified number of terms. Inside the loop, we print the value of firstNumber and then calculate the next number in the series by adding firstNumber and secondNumber. We then update the values of `firstNumber` and `secondNumber` so that secondNumber becomes the current number in the series and firstNumber becomes the previous number.

The output of this program will be:

```kotlin
Fibonacci Series up to 10 terms: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
```