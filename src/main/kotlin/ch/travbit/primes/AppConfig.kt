package ch.travbit.primes

import ch.travbit.primes.calculator.PrimeCalculator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {

    @Bean
    fun primeCalculator(): PrimeCalculator {
        return PrimeCalculator()
    }
}