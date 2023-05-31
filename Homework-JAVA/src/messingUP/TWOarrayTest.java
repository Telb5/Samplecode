package messingUP;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TWOarrayTest {

    /*public static void main(String[] args) {

        int[][] firstArray = {{1, 3, 19, 10}, {23, 10, 8}};
        int[][] secondArray = {{12, 5, 76}, {8, 44, 10}, {8, 44, 10}};

        display(firstArray);
        display(secondArray);

    }


    public static void display(int[][] x) {
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + " ");
            }
            System.out.println();
        }
    }*/

    //-------------------------------------------------------------------------------------\\
 /*   public static void main(String[] args) {


        int[][] exArray = new int[3][4];


        exArray[0][0] = 15;
        exArray[0][1] = 10;
        exArray[0][2] = 12;
        exArray[0][3] = 11;
        exArray[1][0] = 11;
        exArray[1][1] = 11;
        exArray[1][2] = 11;
        exArray[1][3] = 11;
        exArray[2][0] = 11;
        exArray[2][1] = 11;
        exArray[2][2] = 11;
        exArray[2][3] = 11;

        System.out.println("col1 " + "| " + "col2 " + "| " + "col3 " + "| " + "col4 ");

        for (int row = 0; row < exArray.length; row++) {
            for (int col = 0; col <exArray[row].length ; col++) {
                System.out.print(exArray[row][col] + "     ");
            }
            System.out.println();
        }*/





      /*  ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        int num = 1;

        while (it.hasNext() && cars.contains("Hyundai"))
            System.out.print(it.next() + " ");

        // Print the first item

    }*/


  /*  public static void main(String[] args) {


        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("croissant");
        bakeryList.add("baguette");


        ArrayList<String> produce = new ArrayList<>();
        produce.add("tomato");
        produce.add("potato");


        ArrayList<String> chill = new ArrayList<>();
        chill.add("milk");
        chill.add("yogurt");
        chill.add("cheese");





        ArrayList<String> drink = new ArrayList<>();
        drink.add("soda");
        drink.add("coffee");
        drink.add("energyDrink");

        ArrayList<ArrayList<String>> shoppingList = new ArrayList<>();
        shoppingList.add(bakeryList);
        shoppingList.add(chill);
        shoppingList.add(produce);

        shoppingList.set(1, drink);
        System.out.println(shoppingList);
    }

*/


    public static void main(String[] args) {

        /*ArrayList<String> food = new ArrayList<>();

        food.add("Atay");
        food.add("fslkfjh");
        food.add("dskjfh");
        food.add("dfskjhfuiziue");


        Iterator<String> it = food.iterator();

        while (it.hasNext()) {
         //   System.out.print(it.next() + " ");


        }*/



        /*//ArrayList<String> friendsList = new ArrayList<>(Arrays.asList("Amine", "Oussama", "Moha", "Simo"));
        ArrayList<String> friendsList = new ArrayList<>(("Amine", "Oussama", "Moha", "Simo"));
        ArrayList<String> friendsList2 = new ArrayList<>();
        friendsList2.add("Kim");
        friendsList2.add("Emmie");
        friendsList2.add("Boustane");


        ArrayList<ArrayList<String>> bothFriendsLists = new ArrayList<>();
        bothFriendsLists.add(friendsList);
        bothFriendsLists.add(friendsList2);

        System.out.println(bothFriendsLists);
    }*/




        Food[] fridge = new Food[3];

    }

    class Food{

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Bastilla");
        Food food3 = new Food("harira");



    }
}