package ua.shabatura.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    private final int[] targetArray = {2, 3, 4, 5, 6, 7};

    @Test
    void findPrimeNumbers_allFine() {
        Assertions.assertEquals(4, Task2.findPrimeNumbers(targetArray));
    }

    @Test
    void findPrimeNumbers_bad() {
        Assertions.assertNotEquals(5, Task2.findPrimeNumbers(targetArray));
    }
}