package class1;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first value : ");
        int value1 = scan.nextInt();

        System.out.print("Enter second value : ");
        int value2 = scan.nextInt();

        System.out.print("Enter third value : ");
        int value3 = scan.nextInt();

        scan.nextLine();

        if (value1>value2 && value1>value2){
            System.out.println(value1);

            }if (value2>value1 && value2>value3){
                    System.out.println(value2);
                }else{
            System.out.println(value3);
            }
        }
    }