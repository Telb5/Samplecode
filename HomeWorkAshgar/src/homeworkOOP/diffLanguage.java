package homeworkOOP;

public class diffLanguage {
    public static void main(String[] args) {

        //4)Create a method that will say Hello in different language based on
        //the country that will be passed when method is executed.

        diffLanguage lan = new diffLanguage();

        System.out.println(lan.country_language("Spain"));

    }

    public String country_language(String country) {

        if (country.equals("Morocco")) {
            return "Salam";
        } else if (country.equals("Spain")) {
            return "Hola";
        } else if (country.equals("France")) {
            return "Bonjour";
        } else {
            return "Invalid country";
        }
    }
}