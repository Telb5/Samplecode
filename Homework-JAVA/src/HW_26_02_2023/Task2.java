package HW_26_02_2023;

/*
2) Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
*/

import java.util.Map;
import java.util.TreeMap;

class Person{

       private String name;
       private String lastName;
       private int age;
       private double salary;


        public Person(String name,String lastName, int age, double salary ){

            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }


        public void printData(){
            System.out.println(name + " " + lastName + " is " + age + " years old" + " and his salary is around " + salary );
    }


}

public class Task2 {
    public static void main(String[] args) {

        Map<Integer, String> personData = new TreeMap<>();

        personData.put(34987, "Abeera");
        personData.put(14987, "Hiral");
        personData.put(349822, "Adem");


        for (Map.Entry Data:personData.entrySet()) {

            System.out.println(Data);
        }
    }
}

