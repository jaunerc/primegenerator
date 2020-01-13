package ch.travbit.primes.service

import java.math.BigInteger

/**
 * This interface provides methods to request probable primes.
 */
interface IPrimesService {

    /**
     * Returns a probable prime with the specified bit length.
     */
    fun probablePrime(bitLength: Int): BigInteger
}