import java.util.*;

public class replit200 {

    public static void main(String[] args) {

        Map<String, String> Objects = new LinkedHashMap<>();


        Objects.put("Street", "Patrick ST");
        Objects.put("Suite", "265");
        Objects.put("City", "Vienna");
        Objects.put("Zip", "22180");
        Objects.put("Country", "United States");


        for (String obj : Objects.values()) {

            System.out.println(obj);


            //try to use for loop and see what the output would be
        }
    }
}

