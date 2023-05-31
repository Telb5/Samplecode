public class replit154
    {
        int number;

    replit154()
    {
        System.out.println("Parent Constructor without argument");
    }


    replit154(int number)
    {
    }

  //  void printreplit154()
   // {
      //  System.out.println(number);
 //   }

}

class little extends replit154 {


    little() {
        System.out.println("Child Constructor without argument");
    }


    little(int number) {
        super(number);
        System.out.println(number);
    }


}

    class Maaain
    {
        public static void main(String[] args) {
            little obbj = new little();
            little obbj1 = new little(10);
        }
}