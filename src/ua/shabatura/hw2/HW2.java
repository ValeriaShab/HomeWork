package ua.shabatura.hw2;

public class HW2 {
    public static void main(String[] args) {
        int x1 = 1, x2 = 3, x3 = 2;
        int y1 = 3, y2 = 0, y3 = 4;
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        if (a + b <= c || a + c <= b)
            System.out.println("Треугольник не существует");
        else {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Square = " + square);
        }
        int number = 8;
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Не четное");
        }
        int num1 = 2, num2 = 3, num3 = -1;
        if ((Math.abs(num1)) < (Math.abs(num2)) && (Math.abs(num1)) < (Math.abs(num3))) {
            System.out.println("Наименшее значение: " + num1);
        } else if ((Math.abs(num2)) < (Math.abs(num1)) && (Math.abs(num2)) < (Math.abs(num3))) {
            System.out.println("Наименшее значение: " + num2);
        } else {
            System.out.println("Наименшее значение: " + num3);
        }
    }
}
