import java.util.ArrayList;

public class replit186 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);


        System.out.println(num);

        num.removeAll(num);

        System.out.println(num);
        }
    }
