public class Main {

   /*1) Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.*/

    String carmodel;
    int yearmodel;

    String motorcolor;

    String motorname;

    int yearmotor;


     //Car
    Main(String car, int year) {

        carmodel = car;
        yearmodel = year;

    }


    //bike
    Main(String color, String name, int year){

         motorcolor = color;
         motorname = name;
         yearmotor = year;

    }



    void infocar(){

    if (carmodel==null || yearmodel==0) {

        System.out.println(motorcolor + " " + motorname + " " + yearmotor);

    } else if (motorcolor==null || motorname==null || yearmotor==0) {

        System.out.println(carmodel + " " + yearmodel+" "+motorcolor + " " + motorname + " " + yearmotor);
        }


    }
    public static void main(String[] args) {

        Main mycar = new Main("BMW", 2023);
        mycar.infocar();

        Main myMotorcy = new Main("Black","Hayabuza", 7);
        myMotorcy.infocar();

        Main mycar2 = new Main("mycar",120);
        mycar2.infocar();


      //  System.out.println(mycar.carmodel + " " + mycar.yearmodel);
       // System.out.println();

    }
}