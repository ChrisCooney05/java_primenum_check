import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PrimeDirectiveTest {
    PrimeDirective pd = new PrimeDirective();

    @Test
    void isPrime() {

        assertTrue(pd.isPrime(2));
        assertFalse(pd.isPrime(4));
        assertTrue(pd.isPrime(7));

    }

    @Test
    void onlyPrimes() {
        ArrayList<Integer> arePrime = new ArrayList<>();
        arePrime.add(2);
        arePrime.add(3);
        arePrime.add(5);
        arePrime.add(7);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertIterableEquals(arePrime, pd.onlyPrimes(numbers));
    }
}