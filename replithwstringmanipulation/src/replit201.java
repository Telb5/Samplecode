import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class replit201 {

    public static void main(String[] args) {

        Map<String, String> valeurs = new HashMap<>();

        valeurs.put("Street", "Patrick ST");

        valeurs.put("Suite", "265");

        valeurs.put("City", "Vienna");

        valeurs.put("Zip", "22180");

        valeurs.put("Country", "United State");


        System.out.println(valeurs.size());



        valeurs.clear();

        System.out.println(valeurs.size());

        }
}
