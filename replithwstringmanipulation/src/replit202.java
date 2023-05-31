import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class replit202 {

    public static void main(String[] args) {

        Map<String,String> Val = new TreeMap<>();

        Val.put("1 item","apple");
        Val.put("2 item","banana");
        Val.put("3 item","pear");
        Val.put("4 item","tomato");
        Val.put("5 item","mango");
        Val.put("6 item","kiwi");


        for (Map.Entry<String, String> valeur : Val.entrySet()) {
            System.out.println("Key is " + valeur.getKey() + " and values is " + valeur.getValue());
        }
    }
}
