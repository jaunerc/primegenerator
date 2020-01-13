package ch.travbit.primes.calculator

import java.math.BigInteger
import kotlin.random.Random
import kotlin.random.asJavaRandom

class PrimeCalculator {

    companion object {
        val random = Random.Default.asJavaRandom()
    }

    fun probablePrimeWithBitlength(bitLength: Int): BigInteger {
        return BigInteger.probablePrime(bitLength, random)
    }
}