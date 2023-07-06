

import java.math.BigInteger
fun main() {
    val numbers = getFibonacciNumbers(100)
    println(numbers)
}
fun getFibonacciNumbers(count: Int): List<BigInteger> {
    val fibonacciNumbers = mutableListOf<BigInteger>(BigInteger.ZERO, BigInteger.ONE)
    for (i in 2 until count) {
        val nextNumber = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2]
        fibonacciNumbers.add(nextNumber)
    }
    return fibonacciNumbers
}