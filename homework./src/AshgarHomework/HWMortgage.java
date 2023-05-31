package AshgarHomework;

public class HWMortgage {
    public static void main(String[] args) {

        double mortgageRate = 5;

        int mortgagePrice = 1200;

        int housePrice = 250000;


        if (mortgageRate > 4.5) {
            System.out.println("user will not buy a house");
        }

        if (mortgageRate < 4.5) {
            System.out.println("user will consider buying");

            if (housePrice > 200000) {
                System.out.println("user will take a loan");
            } else {
                System.out.println("user will pay cash");
            }
        }
    }
}
