package ch.travbit.primes.controller

import ch.travbit.primes.service.IPrimesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.math.BigInteger

@RestController
@RequestMapping("/api")
class PrimesController @Autowired constructor(private val primesService: IPrimesService) {

    @CrossOrigin(origins = ["*"])
    @GetMapping("/probable-prime")
    fun probablePrime(@RequestParam(value = "bitLength", defaultValue = "32") bitLength: Int): BigInteger {
        return primesService.probablePrime(bitLength)
    }
}