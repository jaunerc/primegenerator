package ch.travbit.primes

import ch.travbit.primes.calculator.PrimeCalculator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * This class represents the spring app config.
 *
 * It is used to define beans for the application.
 */
@Configuration
class AppConfig {

    @Bean
    fun primeCalculator(): PrimeCalculator {
        return PrimeCalculator()
    }
}