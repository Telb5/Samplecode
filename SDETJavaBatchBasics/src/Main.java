public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("shirt", "xxxop", 103, 2, 5);
        Product p2 = new Product(p1);
        p2.display();
    }
}


