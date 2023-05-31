package class22;

public class Animal {

    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("Animals can speak");
    }

    // the reusibility aka inheritance can be a good thing but in this example (line 10 and 16), if we have different animals in the future
    //those animals eat and speak differently, which means that inheritance won't work perfectly in this case.
    // in order

    void eat(){
        System.out.println("All the animals eat");
    }

}

class Cat extends Animal{

    // we are overriding speak method in Cat class.
    void speak(){
        super.speak();
        System.out.println("Meow meow...");

        }
    }


class DOg extends Animal{

}

class Tester{

    public static void main(String[] args) {
        Cat cat = new Cat();

    }
}