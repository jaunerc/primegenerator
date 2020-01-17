package ch.travbit.primes.calculator

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {

    val calculator = PrimeCalculator()

    @Test
    fun probablePrimeWithBitLength_WorkingBitLength_PrimeHasBitLength() {
        val bitLen = 16
        val probablePrime = calculator.probablePrimeWithBitLength(bitLen)
        Assertions.assertEquals(bitLen, probablePrime.bitLength())
    }

    @Test
    fun probablePrimeWithBitLength_TooLowBitLength_Exception() {
        val tooLowBitLen = 1
        assertThrows<ArithmeticException> { calculator.probablePrimeWithBitLength(tooLowBitLen) }
    }

    @Test
    fun probablePrimeWithBitLength_TooHighBitLength_Exception() {
        /*
        * There is constant that defines an upper limit for the bit length of a probable prime number in BigInteger
         */
        val tooHighBitLen = 1_000_000_000
        assertThrows<ArithmeticException> { calculator.probablePrimeWithBitLength(tooHighBitLen) }
    }
}