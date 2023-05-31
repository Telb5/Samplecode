public class Main {

        int modelYear;
        String modelName;


        // DEFAULT CONSTRUCTOR
        public Main(){

        }


         //PARAMETERIZED CONSTRUCTOR
        public Main(int year, String name) {
            modelYear = year;
            modelName = name;
        }

        public static void main(String[] args) {
            Main myCar = new Main();
            System.out.println(myCar.modelYear + " " + myCar.modelName);




        }



    }
