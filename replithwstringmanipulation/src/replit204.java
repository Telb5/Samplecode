import java.util.LinkedHashMap;
import java.util.Map;

public class replit204 {
    public static void main(String[] args) {

        Map<String, String> values = new LinkedHashMap<>();

            values.put("Street","Patrick ST");
            values.put("Suite","265");
            values.put("City","Vienna");
            values.put("Zip","22180");
            values.put("Country","United State");

        for (Map.Entry<String,String> Val:values.entrySet()) {
            System.out.println(Val.getValue());
        }
    }
}
