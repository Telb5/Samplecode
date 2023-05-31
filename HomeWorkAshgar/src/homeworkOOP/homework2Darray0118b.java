package homeworkOOP;

public class homework2Darray0118b {
    public static void main(String[] args) {
/*3) Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops.*/

 String [][] Grocery_list = {{"tomato", "potato"},
                            {"mango", "avocado"},
                            {"tiramisu", "milk"}};


        for (int i = 0; i < Grocery_list.length; i++) {
            for (int j = 0; j < Grocery_list[i].length; j++) {
                System.out.print(Grocery_list[i][j] + " ");
            }
        }
    }
}
