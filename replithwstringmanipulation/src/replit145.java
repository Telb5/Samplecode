public class replit145 {

    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    public replit145(String dogName, double dogWeight, String dogBreed)
        {
            this.dogName = dogName;
            this.dogWeight = dogWeight;
        }

        void print()
        {
            System.out.println(dogName +" "+ dogBreed +" "+ dogWeight);
        }


static class Main{
    public static void main(String[] args) {

        replit145 dog = new replit145("Tarzan", 50.0, dogBreed );
        dog.print();
        replit145 dog1 = new replit145("Lucy", 10.0, dogBreed );
        dog1.print();
    }

}


//to be reviewed because I didn't pass it on reps.
}
