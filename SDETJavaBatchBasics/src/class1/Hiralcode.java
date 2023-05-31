package class1;

import java.util.Scanner;

public class Hiralcode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        String alpha = input.next();
        String alphaLower = alpha.toLowerCase();
        String alphaUpper = alpha.toUpperCase();

        /*   if(!alpha.equals(alphaLower) && !alpha.equals(alphaUpper)){
         System.out.println("Invalid");*/



        if (alpha.equals(alpha.toLowerCase())) {
            System.out.println("Lowercase");

        } else if (alpha.equals(alpha.toUpperCase())) {
            System.out.println("Uppercase");

        }else
                    System.out.println("Wrong input");
                }
            }



