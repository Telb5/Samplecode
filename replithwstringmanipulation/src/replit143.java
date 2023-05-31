import java.util.PrimitiveIterator;
import java.util.function.ToDoubleBiFunction;

public class replit143 {

    String make;
    String model;
    int numberOfDoors;
    double topSpeed;
    double price;


    replit143(String make, String model, int numberOfDoors, double topSpeed, double price)
    {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;

    }



    replit143(String make, String model, double topSpeed, double price)
    {
        this(make, model,4, topSpeed, price);

    }



    replit143(int numberOfDoors, double topSpeed, double price)
    {
        this("unknown", "unknown",4, topSpeed, price);

    }



    replit143(String make, String model)
    {
        this(make, model,4,90, 0.0);

    }



    void display()
    {
        System.out.println(make +" "+ model +" "+ numberOfDoors +" "+ topSpeed +" "+ price);
    }
}





class Mainn{
    public static void main(String[] args) {
        replit143 car = new replit143("Toyota", "Prius", 4, 120, 30000.0);
        car.display();
        replit143 car1 = new replit143("Toyota", "Prius", 120, 30000.0);
        car1.display();
        replit143 car2 = new replit143(4, 120, 30000.0);
        car2.display();
        replit143 car3 = new replit143("Toyota", "Prius");
        car3.display();
    }
}
