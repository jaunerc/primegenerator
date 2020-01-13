package ch.travbit.primes.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PrimeServiceTest {

    @Test
    fun testBitLength() {
        val bitLen = 16
        val primesService = PrimesServiceImpl()
        val probablePrime = primesService.probablePrime(bitLen)
        Assertions.assertEquals(bitLen, probablePrime.bitLength())
    }

    @Test
    fun testIncorrectBounds() {
        val tooLowBitLen = 1
        val tooHighBitLen = 1_000_000_000
        val primesService = PrimesServiceImpl()
        assertThrows<ArithmeticException> { primesService.probablePrime(tooLowBitLen) }
        assertThrows<ArithmeticException> { primesService.probablePrime(tooHighBitLen) }
    }
}