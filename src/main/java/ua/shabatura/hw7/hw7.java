package ua.shabatura.hw7;


public class hw7 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "EA111", "Gray");
        car1.setManufacturer("Audi");
        car1.setEngine("EA111");
        car1.setColor("Gray");
        car1.setPetrol(80);
        Car car2 = new Car("Audi", "EA112", "Black");
        car2.setManufacturer("Audi");
        car2.setEngine("EA112");
        car2.setColor("Black");
        car2.setPetrol(0);
        Car car3 = new Car("Audi", "EA113", "Brown");
        car3.setManufacturer("Audi");
        car3.setEngine("EA113");
        car3.setColor("Brown");
        car3.setPetrol(40);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car1.startEngine("Лера");
        System.out.println("Количество бензона > 50? " + car1.isEnoughPetrolLevel());
        System.out.println("Количество бензона > 50? " + car2.isEnoughPetrolLevel());
        System.out.println("Количество бензона > 50? " + car3.isEnoughPetrolLevel());
        Car car4 = new Car("Audi", "EA114", "Red");
        System.out.println(car4);

    }

}
