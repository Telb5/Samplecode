package homeworkOOP;

public class Phone {
    String brand;
    String color;
    String software;
    double model;
    double Storage;
    String made_in;


    //Behavior;

    void calls(){
        System.out.println("Call in/out");
    }

    void messaging(){
        System.out.println("Send and receive messages");
    }

    void camera(){
        System.out.println("Take pictures, videos, timelaps, portraits");
    }

    void settings(){
        System.out.println("Modify all phone settings");
    }

    void alarm(){
        System.out.println("Set up alarm");
    }
}
