package BajdaPawel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFinderTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,5,10})
    public void finderTest(Integer amount){
        List<Integer> primes = PrimeFinder.findPrimes(amount);
        assertEquals(amount, primes.size());

    }

    @ParameterizedTest
    @ValueSource(ints = {-1,0})
    public void notFinderTest(Integer amount){
        List<Integer> primes = PrimeFinder.findPrimes(amount);
        assertEquals(amount, primes.size());

    }
}

