import java.util.HashSet;
import java.util.Set;

public class replit196 {

    public static void main(String[] args) {

        Set<String> value = new HashSet<>();

            value.add("third");
            value.add("first");
            value.add("second");

            System.out.println(value);

         value.removeAll(value);
            System.out.println(value);

    }
}
