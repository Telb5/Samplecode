public class Car {

    public String maker;
    public int model;
    private static int get_no_of_objects;


    public Car()
    {
        maker = "Honda";
        model = 2018;
        get_no_of_objects ++;
    }


    public Car(String m, int mo)
    {
        maker = m;
        model = mo;
       // get_no_of_objects ++;
    }


    public   int number(int n , int m) {
          return n + m;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Hl", 1);
        Car car3 = new Car("AIK", 12);
        Car car4 = new Car();


        System.out.println(car3.number(1, 2));
    }

}
