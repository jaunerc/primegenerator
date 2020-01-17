package ch.travbit.primes.service

import ch.travbit.primes.calculator.PrimeCalculator
import org.springframework.stereotype.Service
import java.math.BigInteger

/**
 * This class represents a service to generate probable primes.
 */
@Service
class PrimesServiceImpl constructor(private val primeCalculator: PrimeCalculator) : IPrimesService {

    override fun probablePrime(bitLength: Int): BigInteger {
        return primeCalculator.probablePrimeWithBitLength(bitLength)
    }
}