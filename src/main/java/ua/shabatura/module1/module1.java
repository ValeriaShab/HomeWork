package ua.shabatura.module1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class module1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        fillRandomArray(array);
        System.out.println("Ваш массив: " + Arrays.toString(array));
        sort(array);
        everyThirdNumberCubed(array);
    }
    private static void fillRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 201) - 100);
        }
    }
    private static void sort(int[] array){
        int[] sorted = Arrays.copyOf(array, array.length);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки(lower or higher: ");
        String text = scanner.nextLine();
        if (Objects.equals(text, "lower")){
            boolean changed;
            int amountOfCycles = 0;
            do {
                changed = false;
                for (int i = 1; i < sorted.length - amountOfCycles; i++) {
                    if (sorted[i] > sorted[i - 1]) {
                        int temp = sorted[i];
                        sorted[i]=sorted[i-1];
                        sorted[i-1]=temp;
                        changed = true;
                    }
                }
                amountOfCycles++;
            }while (changed);
            System.out.println("Отсортированный по убыванию масси: " + Arrays.toString(sorted));
        } else if (Objects.equals(text, "higher")){
        boolean changed;
        int amountOfCycles = 0;
        do {
            changed = false;
            for (int i = 1; i < sorted.length - amountOfCycles; i++) {
                if (sorted[i - 1] > sorted[i]) {
                    int temp = sorted[i - 1];
                    sorted[i-1]=sorted[i];
                    sorted[i]=temp;
                    changed = true;
                }
            }
            amountOfCycles++;
        }while (changed);
            System.out.println("Отсортированный по возростанию массив: " + Arrays.toString(sorted));
    } else {
            System.out.println("Выберите lower или higher)");
        }
    }
    private static void everyThirdNumberCubed(int[] array){
        int[] changed = Arrays.copyOf(array, array.length);
        for (int i = 2; i < changed.length; i+=3) {
           changed[i] = changed[i]*changed[i]*changed[i];
        }
        System.out.println(Arrays.toString(changed));
    }
}
