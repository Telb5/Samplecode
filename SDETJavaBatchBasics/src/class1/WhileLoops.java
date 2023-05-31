package class1;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String name = "";

            do{
                System.out.println("Enter your name: ");
                name = scanner.nextLine();

            }while(name.equals("Yes"));


            System.out.println("invalid");


            }
        }
