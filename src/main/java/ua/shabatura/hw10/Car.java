package ua.shabatura.hw10;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car implements Recovery {
    protected int series;
    protected int year;
    protected String color;
    protected int fuel;

    public void moving() {
        int distance = 0;
        while (fuel > 0) {
            fuel--;
            distance += 30;
            if (fuel == 0) {
                System.out.println("Машина проехала: " + distance + "км" + "\n");
            }
        }
        System.out.println("Топливо закончилось(");
    }

    public void statistic() {
        System.out.println("Серия: " + series + "\n" + "Год выпуска: " + year + "\n" + "Цвет: " + color + "\n" + "Количество топлива: " + fuel);
    }

    public Car(int series, int year, String color, int solar) {
        this.series = series;
        this.year = year;
        this.color = color;
        this.fuel = solar;
    }

    public void refuel() {
        fuel = 100;
        System.out.println("Топливо залито " + fuel);
    }
}
