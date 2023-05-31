package Project2;

public class Car {

    /*
    3. Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does its own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount.
     */


    double carPrice;
    String color;

     void calculateSalePrice() {
     }
}


class Truck extends Car{

    double weight;

    Truck(int weight,int carPrice) {
        this.weight = weight;
        super.carPrice = carPrice;
    }

    void calculateSalePrice(){
        if (weight>2000){
            carPrice = carPrice-(carPrice*0.1);
        }else {
            carPrice =carPrice-(carPrice*0.2);
        }
        System.out.println(carPrice);
    }

}


class Sedan extends Car {

    double Length;

    Sedan(int Length,int carPrice) {
        this.Length = Length;
        super.carPrice = carPrice;
    }

    void calculateSalePrice() {
            if (Length>2000){
                Length = Length-(Length*0.1);
            }else {
                Length =Length-(Length*0.2);
            }
        System.out.println(carPrice);
        }

    }



class Maaaaaaaaain {
    public static void main(String[] args) {
        Car[] cars = {new Truck(200, 40000), new Sedan(20, 40000)};

        for (Car c : cars) {
            c.calculateSalePrice();

        }
    }
}
