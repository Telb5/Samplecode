public class replit129 {

    static String countryName;
    static String continent;


    public void countconti(String countryName, String continent)
    {
        this.countryName = countryName;
        this.continent = continent;
        System.out.println(countryName + " located on " + continent + " continent");
    }


    public static void main(String[] args) {
        replit129 a = new replit129();
        a.countconti("Morocco", "Africa");


    }
}
