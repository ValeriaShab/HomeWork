package ua.shabatura.hw5;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        fillArray(array);
        negativeLines(array);
        System.out.println(checkArray(array));
    }

    private static void fillArray(int[][] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k + 1;
                k++;
            }
        }
    }

    private static void negativeLines(int[][] array) {
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 != 0)
                    array[i][j] = k * (-1);
                k++;

            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static boolean checkArray(int[][] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[i + 1][j + 1]) {
                    return false;
                } else if (array[i][j] > array[i + 1][j + 1]) {
                    return false;
                }
            }

        }
        return true;
    }
}

