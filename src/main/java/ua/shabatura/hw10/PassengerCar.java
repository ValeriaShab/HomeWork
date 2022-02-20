package ua.shabatura.hw10;

import lombok.Setter;

@Setter

public class PassengerCar extends Car {
    private Passenger[] passengersInCar = new Passenger[3];

    public PassengerCar(int series, int year, String color, int fuel) {
        super(series, year, color, fuel);
    }

    public void loadingPassengers(Passenger[] passengers) {
        for (int i = 0; i < passengers.length; i++) {
            if (i < 3) {
                passengersInCar[i] = passengers[i];
            } else {
                System.out.println("Свободных мест в машине нет(");

                break;
            }
        }

    }

    public void showPassengers() {
        if (passengersInCar.length == 0) {
            System.out.println("В машине нет пассажиров");
        } else {
            for (Passenger passenger : passengersInCar) {
                System.out.println(passenger);
            }
        }
    }
}
