package ua.shabatura.hw7;

public class Car {
    private String manufacturer;
    private String engine;
    private String color;
    private int petrol;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    public int getPetrol() {
        return petrol;
    }

    @Override
    public String toString() {
        return "Car {" +
                "manufacture='" + manufacturer + '\'' + " engine= '" + engine + '\'' + " color='" + color + '\'' + " petrol='" + petrol + '\'' +
                '}';
    }

    public void startEngine(String name) {
        System.out.println("\"{" + name + "}" + " запустил двигатель " + "\"");

    }

    public boolean isEnoughPetrolLevel() {
        boolean level = false;
        level = petrol >= 50;
        return level;
    }

    public Car(String manufacturer, String engine, String color) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        petrol = 100;
    }
}
