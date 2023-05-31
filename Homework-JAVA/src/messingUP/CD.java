package messingUP;

import java.util.PrimitiveIterator;

public class CD implements RetailItem, Displayable  {

    double price;
    String artist;
    String title;

    double discount;


    public CD (double price, String artist, String title)
    {

        this.price = price;
        this.title = title;
        this.artist = artist;

    }


    public CD()
    {

    }



    @Override
    public double getItemPrice()
    {
        return price;
    }


    public double getDiscount(double price, double discount)
    {
        this.price = price;
        discount = 10;
        return (price-((price*discount)/100));
    }


    @Override
    public void display()
    {
        System.out.println("price " + price + "artist " + artist + "title " + title + "Concert is " + concertName);

        System.out.println(concertName);
    }
}
