package ch.travbit.primes.calculator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {

    @Test
    fun testBitLength() {
        val bitLen = 16
        val calculator = PrimeCalculator()
        val probablePrime = calculator.probablePrimeWithBitlength(bitLen)
        Assertions.assertEquals(bitLen, probablePrime.bitLength())
    }

    @Test
    fun testIncorrectBounds() {
        val tooLowBitLen = 1
        val tooHighBitLen = 1_000_000_000
        val calculator = PrimeCalculator()
        assertThrows<ArithmeticException> { calculator.probablePrimeWithBitlength(tooLowBitLen) }
        assertThrows<ArithmeticException> { calculator.probablePrimeWithBitlength(tooHighBitLen) }
    }
}