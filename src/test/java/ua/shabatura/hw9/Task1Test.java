package ua.shabatura.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    private final int[] targetArray = {3, 3, 3, 3, 3};

    @Test
    void findArithmeticMean_allFine() {
        Assertions.assertEquals(3, Task1.findArithmeticMean(targetArray));
    }

    @Test
    void findArithmeticMean_bad() {
        Assertions.assertNotEquals(4, Task1.findArithmeticMean(targetArray));
    }

    @Test
    void findGeometricMean() {
        Assertions.assertEquals(3.000000049111797, Task1.findGeometricMean(targetArray));
    }

    @Test
    void findGeometricMean_bad() {
        Assertions.assertNotEquals(4, Task1.findArithmeticMean(targetArray));
    }
}