package ua.shabatura.hw11;

public class Phone1 extends Phone{
    @Override
    public void call(int phoneNumber) {
        System.out.println("Call the subscriber by the number: " + phoneNumber);
    }

    @Override
    public void sendMessage(String name) {
        System.out.println("Please, write the message to: " + name);

    }
    public void turnOnMusic(){
        System.out.println("Music is turned on...");
    }
}
