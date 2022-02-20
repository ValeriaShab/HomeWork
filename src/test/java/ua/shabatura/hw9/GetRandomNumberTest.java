package ua.shabatura.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

class GetRandomNumberTest {
    private GetRandomNumber target;
    private Random mockRandom;


    @BeforeEach
    void setUp() {
        target = new GetRandomNumber();
        mockRandom = Mockito.mock(Random.class);
    }

    @Test
    void if0() {
        Mockito.when(mockRandom.nextInt(100)).thenReturn(0);
        Assertions.assertEquals(target.get(mockRandom), 1);

    }


    @Test
    void getLess10() {
        Mockito.when(mockRandom.nextInt(100)).thenReturn(8);
        Assertions.assertEquals(target.get(mockRandom), 1000 / 8);

    }

    @Test
    void getLess20() {
        Mockito.when(mockRandom.nextInt(100)).thenReturn(15);
        Assertions.assertEquals(target.get(mockRandom), 15 / 5);

    }

    @Test
    void getLess50() {
        Mockito.when(mockRandom.nextInt(100)).thenReturn(42);
        Assertions.assertEquals(target.get(mockRandom), null);

    }

    @Test
    void getLess80() {
        Mockito.when(mockRandom.nextInt(100)).thenReturn(74);
        Assertions.assertEquals(target.get(mockRandom), -10);

    }
}