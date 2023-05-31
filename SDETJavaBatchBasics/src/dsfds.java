import java.util.Scanner;
class dsfds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = scan.nextBoolean();
        scan.nextLine();

        int loan1 = scan.nextInt();

        if (loan) {
            System.out.println("What is your credit score?");
        } else {
            System.out.println("Unknown");
        }

        int eligibility = scan.nextInt();
        scan.nextLine();
        if (eligibility < 600) {
            System.out.println("The eligibility is Not eligible");
        } else if (eligibility >= 600 || eligibility <= 700) {
            System.out.println("The eligibility is Maybe eligible");
        } else if (eligibility >= 701 || eligibility <= 800) {
            System.out.println("The eligibility is Eligible");
        } else {
            System.out.println("The eligibility is Definitely eligible");
        }
    }
}