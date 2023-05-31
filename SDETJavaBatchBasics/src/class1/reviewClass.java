package class1;

public class reviewClass {
    public static void main(String[] args) {

        boolean vaccine = true;
        int dose = 1;

        if (vaccine) {
            System.out.println("how many doses you have");
            if (dose == 1) {
                System.out.println("you need second shot");
        } else {
                System.out.println("you are fully vaccinated");
            }
        }else{
            System.out.println("I do not have a vaccine");
        }
    }
}
