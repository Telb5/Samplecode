public class Product {

    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;

    private String color;


    public Product()
    {
        this.name = "No name";
        this.description = "No description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
    }


    public Product(String n, String d, float p, int q, float dis)
    {
        this.name = n;
        this.description = d;
        this.price = p;
        this.quantity = q;
        this.discount = dis;
    }


    public Product(String n, String d, float p, int q, float dis, String cl){
    this(n, d, p, q, dis);
    this.color = cl;






    public void display()
    {
        System.out.println("Name = "+ name);
        System.out.println("description = "+ description);
        System.out.println("price = "+ price);
        System.out.println("quantity = "+ quantity);
        System.out.println("discount = "+ discount);
    }






}
