import java.util.*;

public class replit199 {
    public static void main(String[] args) {

        Set<String> Values = new LinkedHashSet<>();

        Values.add("null");
        Values.add("Sohil ");
        Values.add("Diego");
        Values.add("Alijon");
        Values.add("Asel");
        Values.add("Sumair ");

        for (String value : Values) {
            System.out.println(value);
        }



       Iterator<String> value = Values.iterator();
        for (int i = 0; i < Values.size(); i++) {

            System.out.println(value.next());

        }
    }
}
