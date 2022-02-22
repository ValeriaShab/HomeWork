package ua.shabatura.hw11;

public class Main {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone1();
        phones[1] = new Phone2();
        phones[2] = new Phone3();
        try {
            testPhones(phones);
        } catch (IllegalArgumentException e){
            System.out.println("WARNING: something go wrong");
        }
        System.out.println("______Check if phones 1 and 3 is same______");
        if (phones[0].hashCode()== phones[2].hashCode()){
            if (phones[0].equals(phones[2])){
                System.out.println("The same");
            }
        } else {
            System.out.println("Not same");
        }
    }

    private static void testPhones(Phone[] phones) {
        for (Phone phone : phones) {
            System.out.println("___________TEST___________");
            phone.call(123456789);
            phone.sendMessage("Valeria");
            if (phone instanceof Phone1 phone1) {
                phone1.turnOnMusic();
            } else if (phone instanceof Phone2 phone2) {
                phone2.haySiri();
            } else if (phone instanceof Phone3 phone3) {
                phone3.turnPhoneOff();
            }
        }
    }
}




