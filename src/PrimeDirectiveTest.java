import org.junit.jupiter.api.Test;

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
    }
}