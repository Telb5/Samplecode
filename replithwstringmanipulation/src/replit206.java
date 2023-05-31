import java.util.HashMap;
import java.util.Map;

public class replit206 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");

        map.put("TWO", "BBB");

        map.put("THREE", "CCC");

        map.put("FOUR", "DDD");

        map.put("FIVE", "EEE");


        System.out.println("HashMap Before Remove :");
        for (Map.Entry<String, String> Val1 : map.entrySet()) {
            System.out.println(Val1.getKey() + " : " + Val1.getValue());
        }

            System.out.println("------------------");


            System.out.println("HashMap After Remove :");
            for (Map.Entry<String, String> Val : map.entrySet()) {
                if (!Val.getKey().equals("ONE") && (!Val.getKey().equals("FOUR"))) {
                    System.out.println(Val.getKey() + " : " + Val.getValue());

                }
            }
        }
    }

