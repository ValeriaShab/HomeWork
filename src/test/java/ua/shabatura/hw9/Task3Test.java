package ua.shabatura.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    private final int[] targetArray = {2, 3, 4, 5, 6, 7};

    @Test
    void findCompositeNumbers_allFine() {
        Assertions.assertEquals(2, Task3.findCompositeNumbers(targetArray));
    }

    @Test
    void findCompositeNumbers_bad() {
        Assertions.assertNotEquals(5, Task3.findCompositeNumbers(targetArray));
    }
}