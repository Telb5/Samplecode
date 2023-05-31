package class21.Task;

public class AreaTask {

    // calculate the area of a rectangle and use method overloading.
    void calculateArea(double length, double width)
    {
        System.out.println("Area of rectangle is " + length*width   );
    }


    void calculateArea(double side)
    {
        System.out.println("Area of rectangle is " + (side*side));
    }


    public static void main(String[] args)
    {
    AreaTask area = new AreaTask();
    area.calculateArea(10);
    area.calculateArea(10,20);
    }

}