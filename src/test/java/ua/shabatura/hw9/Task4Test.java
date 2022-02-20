package ua.shabatura.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    private final int[] targetArray = {2, 3, 4, 5, 6, 7};

    @Test
    void changeToZero_allFine() {
        int[] array = Task4.changeToZero(targetArray);
        Assertions.assertArrayEquals(new int[]{0, 3, 0, 5, 0, 7}, array);
    }

    @Test
    void changeToZero_bad() {
        int[] array = Task4.changeToZero(targetArray);
        Assertions.assertNotEquals(new int[]{0, 3, 0, 5, 0, 7}, array);
    }
}