package ua.shabatura.hw10;

public class Truck extends Car {
    private final int cargo;

    public Truck(int series, int year, String color, int fuel) {
        super(series, year, color, fuel);
        this.cargo = 0;
    }

    public void loadUnload(int cargo) {
        if (cargo <= 0) {
            System.out.println("Груза нет");
        } else {
            System.out.println("Груз загружен");
        }
    }

    @Override
    public void moving() {
        int distance = 0;
        while (fuel > 0) {
            fuel--;
            distance += 15;
            if (fuel == 1) {
                System.out.println("Машина проехала: " + distance + "км" + "\n");
            }

        }
        System.out.println("Топливо закончилось(");
    }

    public void refuel() {
        fuel = 100;
        System.out.println("Топливо залито " + fuel);
    }
}
