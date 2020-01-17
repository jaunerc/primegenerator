package ch.travbit.primes.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

/**
 * This class represents a controller for exceptions.
 */
@ControllerAdvice
class ExceptionController {

    @ExceptionHandler(value = [ArithmeticException::class])
    fun exception(exception: ArithmeticException): ResponseEntity<String> {
        return ResponseEntity("Arithmetic exception: " + exception.message, HttpStatus.BAD_REQUEST)
    }
}