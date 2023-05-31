import java.util.HashSet;
import java.util.Set;

public class replit195 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);

        for (Integer num:numbers) {
            System.out.println(num);
        }
        }
    }