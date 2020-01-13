package ch.travbit.primes.controller

import ch.travbit.primes.service.IPrimesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger

@RestController
@RequestMapping("/api")
class PrimesController @Autowired constructor(private val primesService: IPrimesService) {

    @GetMapping("/probable-prime")
    fun probablePrime(@RequestParam(value = "bitLength", defaultValue = "32") bitLength: Int): BigInteger {
        return primesService.probablePrime(bitLength)
    }
}