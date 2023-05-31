import java.util.Scanner;

public class Names {

 /*   static String name1 = "Rquia";
    String name2;
    String name9 = "Adem";


    public Names(String name2){
        this.name2 = name2;
    }



     static String Names2(){

         Names.name1 = "Mohamed";
         String name6 = "Hiral";
         String name7 = (name1 + " is " + name6 + "'s sibling");

         return name7;
    }

    public static void main(String[] args) {
            Names Jname = new Names("Urwa");
        System.out.println(Jname.name2);

        //System.out.println(Names2());

*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the highest number");
        } else if (num2>num3) {
            System.out.println(num2 + " is the highest number");
        } else {
            System.out.println(num3 + " is the highest number");
        }

    }
}