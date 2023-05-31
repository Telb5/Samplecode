package Project2;

/*
1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.
*/

interface Shape {

     void calculateArea();
     void calculatePerimiter();



class Circle implements Shape{

    @Override
    public void calculateArea() {

    }

    @Override
    public void calculatePerimiter() {
        System.out.println("This method calculates the perimeter of the Circle");
    }
}


class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("This method calculates the area of the square");

    }

    @Override
    public void calculatePerimiter() {

    }
}


    public static void main(String[] args) {
      //  Shape [] calculate = {new Circle(), new Square()};

        /*for (Shape print:calculate) {
            print.calculateArea();
            print.calculatePerimiter();*/

        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimiter();

        Square square = new Square();
        square.calculateArea();
        square.calculatePerimiter();

        }

        }
  //  }