package ua.shabatura.hw11;

public class Phone3 extends Phone {
    @Override
    public void call(int phoneNumber) {
        throw new IllegalArgumentException("Can't call number");
    }

    @Override
    public void sendMessage(String name) {
        System.out.println("Please, write the message to: " + name);
    }
    public void turnPhoneOff(){
        System.out.println("Phone is off");

    }
}
