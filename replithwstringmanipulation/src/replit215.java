import java.util.Scanner;

public class replit215 {

    /*public static void main(String[] args) {

        replit215 balanced = new replit215();
        balanced.isBalanced("(", ")");


    }


            String open;
            String close;
     public void isBalanced(String open, String close){

            this.open = open;
            this.close = close;

            String isBalancedBr = open + close;

            if (isBalancedBr.equals("()")){
                System.out.println(true);
            }else {
                System.out.println(false);

            }



    }

    }*/


    public static void main(String[] args) {

        isBalanced("(()()");

    }




       static public void isBalanced(String brackets){

            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter a or some characters");
            String stringOfChar = scanner.nextLine();

            //String[] Chara = {"(", ")", };
            String openedBrackets = "(";
            String closedBrackets = ")";
            int lenghOp = openedBrackets.length();
            int lenghCl = openedBrackets.length();

            if(brackets.contains(openedBrackets)||brackets.contains(closedBrackets)){
                if (lenghOp==lenghCl){
                    System.out.println(true);
                }
            }else {
                System.out.println(false);
            }








    }


    }