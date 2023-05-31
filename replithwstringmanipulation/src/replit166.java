
public class replit166 {


    /*Create a class Animal in which define instance variable type, constructor that will initialize
    instance variables and 2 methods eat and sleep.

Create a subclass Cat in which override method sleep

Create 3 Kitten subclasses of a Cat class and override method eat

for 1 kitten - eats milk

for 2 kitten - eats snack

for 3 kitten - eats everything

In main method create object of Cat class and all 3 kittens classes and store
into an array of Animals. Call available methods:


**Expected Output:**

```
Cat eats
Cat sleeps a lot
kitten1 eats milk
kitten1 sleeps a lot
kitten2 eats snacks
kitten2 sleeps a lot
kitten3 eats everything
kitten3 sleeps a lot
```
*/

    String c;

   replit166 (String e)
        {
            this.c = e;
        }



    void eat()
        {
            System.out.println("Cat eats");

        }



    void sleep()
        {
            System.out.println("Cat sleeps little");
        }


}



class Cat extends replit166
    {
        Cat(String x) {
            super(x);
        }

        @Override
        void sleep()
            {
                System.out.println("Cat sleeps a lot");
            }
    }




class Kitten1 extends Cat
    {
            Kitten1(String x) {
            super(x);
        }

        @Override
        void eat()
        {
            System.out.println("eats milk");
        }
    }


class Kitten2 extends Cat
{

    Kitten2(String l) {
        super(l);
    }

    @Override
    void eat()
        {
            System.out.println( "eats snack");
        }
    }


class Kitten3 extends Cat
{
    Kitten3(String o) {
        super(o);
    }

    @Override
    void eat() {
        System.out.println("eats everything");
    }
}


class Maainan
    {
        public static void main(String[] args) {
            Cat[] cat  = {new Cat("Cat"), new Kitten1("Kitten1"), new Kitten2("Kitten2"), new Kitten3("Kitten3")};

            for (Cat array: cat) {
                array.eat();
                array.sleep();
            }
        }
    }
