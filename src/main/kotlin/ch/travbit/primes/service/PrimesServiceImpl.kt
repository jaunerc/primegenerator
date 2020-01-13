package ch.travbit.primes.service

import org.springframework.stereotype.Service
import java.math.BigInteger
import kotlin.random.Random
import kotlin.random.asJavaRandom

/**
 * This class represents a service to generate probable primes.
 */
@Service
class PrimesServiceImpl : IPrimesService {

    private val random = Random.Default.asJavaRandom()

    override fun probablePrime(bitLength: Int): BigInteger {
        return BigInteger.probablePrime(bitLength, random)
    }
}