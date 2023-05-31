public class replit147 {
    public static void main(String[] args) {
        carObject stock = new carObject("Toyota", 250000.0, 10);
        stock.carStockValue();
        carObject stock1 = new carObject("BMW", 65298.0, 10);
        stock1.carStockValue();
    }

}

class carObject{


    String model;
    double price;
    int quantity;


    carObject(String model, double price, int quantity)
    {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }


    void carStockValue()
    {
        double totalValue = price * quantity;

        System.out.println(model +" 2019 Stock Value" +" "+ totalValue);
    }

}