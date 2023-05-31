package class27;

import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {

        String name = "Hiral";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};

        // create a method which can search a name from this array and return true if name is present in the array.
        System.out.println(searchName(names, name));
    }



    public static boolean searchName(String[] names, String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].contains(name)) {
                return true;
            }
        }
        return false;

        }
    }