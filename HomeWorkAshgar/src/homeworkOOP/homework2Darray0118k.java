package homeworkOOP;

public class homework2Darray0118k {
    public static void main(String[] args) {

        //Create 2D array of countries: north america countries,
//south america countries, europe countries,  african countries.
//Then print all values from that array using 2 different loops and calculate how many total countries been stored.


        String[][] countries = {{"Usa", "Canada", "Mexico"},
                                   {"Argentina", "Peru"},
                                    {"India", "Pakistan"},
                                    {"Morocco", "Algeria"},
                                   {"Spain", "Portugal"}};

        int sum = 0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                // sum = sum + countries[i].length;
                System.out.println(countries[j]);


            }

    }
}
}