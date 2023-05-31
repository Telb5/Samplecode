public class replit122 {

    String countryName;

    String capital;

    long populationSize;

    public static void main(String[] args) {

        replit122 r = new replit122();

        r.countryName = "USA";
        r.capital = "Washington DC";
        r.populationSize = 330000000L;


        replit122 r1 = new replit122();

        r1.countryName = "Kazakhstan";
        r1.capital = "Astana";
        r1.populationSize = 18500000L;


        System.out.println("The capital of "+r.countryName+" is "+r.capital+" and population is "+r.populationSize);
        System.out.println("The capital of "+r1.countryName+" is "+r1.capital+" and population is "+r1.populationSize);

    }
}
