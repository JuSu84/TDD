package BajdaPawel;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @ParameterizedTest
    @ValueSource(ints = {13, 17, 5, })
    public void valid_true(int number) {
        assertTrue(Prime.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 15, -1, 1200657})
    public void valid_false(int number) {
        assertFalse(Prime.isPrime(number));
    }

    @ParameterizedTest
    @NullSource
    public void nullOrEmpty(Integer number){
        assertFalse(Prime.isPrime(number));
    }

}