import java.sql.SQLOutput;

public class Rectangle {

    private double length;
    private double width;


    public Rectangle() {
        length = 10;
        width = 15;
        System.out.println(" a new room created with 10 m length and 15 m width");
    }

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }


    public double setLength(double l) {
        length = l;
        System.out.println("New setLength");
        return l;

    }


    public void setWidth(double w) {
        width = w;
    }




    public static void main(String[] args) {

        //Rectangle r1 = new Rectangle(88, 77);
        //System.out.println(r1.setLength(2));



        new Rectangle().setLength(12);


    //    System.out.println(r1);

       // System.out.println(new Rectangle(23, 34));



    }
}
