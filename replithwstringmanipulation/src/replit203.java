import java.util.HashMap;
import java.util.Map;

public class replit203 {

    public static void main(String[] args) {

        Map<String, Integer> values = new HashMap<>();

        values.put("mango", 10);

        values.put("apple", 30);

        values.put("orange", 20);

        values.put("mango", 40);

        values.put("mango", 40);


        for (Map.Entry<String, Integer> Val:values.entrySet()) {
            System.out.println("Key = " + Val.getKey() + " and value = " + Val.getValue());
        }
    }
}
