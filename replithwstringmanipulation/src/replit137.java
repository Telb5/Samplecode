public class replit137 {

        public static void main(String[] args) {

            replit137 print = new replit137();

            print.name = "John";
            print.city = "Miami";
            print.school = "Syntax";
            print.batchNumber = 9;

            print.school();

        }



        String name;
        public String city;
        protected String school;
        private int batchNumber;

        void school()
        {
            System.out.println("My name is " + name + " and I live in " + city + ". I study at " + school + " in batch " + batchNumber);
        }


    }
