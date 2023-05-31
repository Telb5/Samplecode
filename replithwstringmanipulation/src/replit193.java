import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class replit193 {


    public static void main(String[] args) {


        ArrayList<Integer> Objects = new ArrayList<>();


        Objects.add(111);
        Objects.add(222);
        Objects.add(333);
        Objects.add(444);
        Objects.add(555);
        Objects.add(666);

        int sum = 0;

        for (int i = 0; i < Objects.size(); i++) {

            sum += Objects.get(i);

        }System.out.println(sum);
    }
}
