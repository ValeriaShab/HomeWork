package ua.shabatura.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[400];
        fillRandomArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Arithmetic mean: " + findArithmeticMean(numbers));
        System.out.println("Geometric mean: " + findGeometricMean(numbers));
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static int findArithmeticMean(int[] array) {
        int arithAverage = 0;
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            arithAverage = sum / array.length;
        }
        return arithAverage;
    }

    private static int findGeometricMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum * array[i];
        }
        int geomAverage = (int) Math.pow(sum, 1 / array.length);
        return geomAverage;
    }
}

