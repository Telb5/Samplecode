import java.util.Arrays;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {

        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Germany", "United", "Kingdom", "France", "Spain"},
                {"China", "India", "Japan", "Russia"},
                {"Egypt", "Nigeria", "South Africa", "Ethiopia"}
        };

     //   System.out.println(countries[3].length);

        int counter = 0;
        // using normal for loop
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(i + j + " ");
               // counter++;
            }
          //  System.out.println();
        }
  /*      // Using enhanced for loop
        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
                counter++;
            }
            System.out.println();
        }

        System.out.println("Total countries " + counter);*/










        /* //Creating an object of the String class
            String strObj=new String("Java");
            // another way of creating an object of String class a shorter way
            // mostly this is how we create the objects of String class
            String strObj2="Java";
            System.out.println(strObj2.length());
            String str="Banana ";
            int len=str.length();
            System.out.println(len);
            String name="Hamid poya ";
            if(name.length()>10){
                System.out.println("Name can't be more than 10 letters");/*

         */




       /* String firstName="Akhter";
        String lastName="Lava";
        String fullname=firstName+" "+lastName;
        System.out.println(fullname);
        System.out.println(firstName+" "+lastName);
        System.out.println(firstName.concat( " "+lastName));*/


   /*  String str = "I love Java";
     String startswithh = str.startsWith("I");
        System.out.println();*/


     /*   Scanner scan = new Scanner(System.in);

        System.out.println("Enter username");
        String username = scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.nextLine();
        System.out.println("Re-enter your password");
        String passwordconfirm = scan.nextLine();


        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password cannot be empty");
        }else if (password.length() < 8) {
            System.out.println("Password is less than 8 characters");
        }else    if (password.contains(username)) {
            System.out.println("Password cannot contain username");
        }else       if (!password.equals(passwordconfirm)) {
                        System.out.println("Passwords do not match");
                    }
                else {
                        System.out.println("Your username and password has been created");
                    }*/











      /*  String str = "Java is love";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c);*/


    /*    String str = "Java is love";
        char character = str.charAt(0);
        System.out.println(character);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
       */




/*
    String str = "send it to support channel";
        String newStr = str.substring(5);
        System.out.println(newStr);





     //   Write a program that sums all numbers that are on even index and on even row.

**Expected Output:**

```
        -4
```


        - Create a String given="I love Java classes at Syntax"
                - Retrieve 2 Strings using substring method from given String and print them

**Expected Output:**

```

/*



 */

/*
// How do I print all the letters from this String?
                String str = "Java is great" ;

                for (int i = 0; i < str.length(); i++) {
                    System.out.print(str.charAt(i));
                }
                System.out.println();





// How many times the letter a has appeared in the above string?
                int count = 0 ;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a') ;
                    count++ ;
                }
                System.out.println(count);
            }
        }













        public static void main(String[] args) {
            String string="hello";
            if(!string.isEmpty()){

                if(string.length()%2!=0&&string.length()>3){//checks if number of character is odd
                    int mid=string.length()/2;
                    System.out.println(string.charAt(mid));
                }
            }

        }
    }



    */
/*
        String str = "Sunday";
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }











        String dadsName="Zafar";
        String momsName="Maryum";
        String expectation="Boy";
        String firstHalf="";
        String secondHalf="";

        if(expectation.equalsIgnoreCase("boy")) {
            firstHalf = dadsName.substring(0, dadsName.length() / 2);  //first index starts with"0"
            secondHalf = momsName.substring(momsName.length() / 2);

        }else {
            firstHalf = momsName.substring(0, momsName.length() / 2);
            secondHalf = dadsName.substring(dadsName.length() / 2);
        }
        System.out.println(firstHalf+secondHalf);

    }

}

/*
        String str = ("kKJGJGJKGHJKHGJK$@€€kjhgjgdsg***jkhgj*");
        System.out.println(str.replaceAll("[A-Z]", "#"));
        System.out.println(str.replaceAll("[a-z]", "#"));
        System.out.println(str.replaceAll("[0-9]", "#"));
        System.out.println(str.replaceAll("[A-Za-z]", "#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
    }
}
*/

/*
        String str = "I like java. I write a lot of code daily. I am from batch 15.";
        String[] strArr = str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
//whenever we are working with arrays we use the length and whenever we are working with Strings
// we use the length()
*/
