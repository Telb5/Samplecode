import java.util.*;
import java.util.Map.Entry;

public class replit207 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");

        map.put("TWO", "BBB");

        map.put("THREE", "CCC");

        map.put("FOUR", "DDD");

        map.put("FIVE", "EEE");


        System.out.println("HashMap before Replace : ");

        //Iterator Map.Entry<String, String> ita =

        Iterator itr = map.entrySet().iterator();

        while (itr.hasNext()) {

           itr.next();


        }

           System.out.println("------------------");


        System.out.println("HashMap After Replace : ");


        map.put("FIVE" , "SUMAIR");
        map.put("THREE" , "ASEL");

        map.remove("THREE", "CCC");
        map.remove("FIVE" , "EEE");

        for (Map.Entry<String, String> io: map.entrySet()) {
            System.out.println(io.getKey() + " : " + io.getValue());

        }




        }
        }