package messingUP;

import java.util.Scanner;

public class Array12 {

    public static int search(int[] list, int target) {
        int index;

        for (index = 0; index < list.length; index++) {
            if (list[index] == target) ;
            return index;

        }return -1;
    }


    public static void main(String[] args) {

        int[] employee_ids = new int[20];
        int no = search(employee_ids, 10);
    }
}