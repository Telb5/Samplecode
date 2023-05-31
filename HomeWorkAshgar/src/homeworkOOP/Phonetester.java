package homeworkOOP;

public class Phonetester {

    public static void main(String[] args) {

        Phone Iphone = new Phone();

        Iphone.brand = "Apple";

        Iphone.color = "Green";

        Iphone.made_in = "China";

        Iphone.Storage = 128;

        Iphone.software = "IOS";



        Iphone.calls();

        Iphone.alarm();

        Iphone.camera();

        Iphone.messaging();

        Iphone.settings();



    }
}
