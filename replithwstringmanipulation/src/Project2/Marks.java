package Project2;
/*
2. We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its paraeters and
the marks in four subjects as its parameters for
student B. Test your code
 */
public abstract class Marks {

    abstract double getPercentage(double x, double y, double w, double t);

    abstract double getPercentage(double x, double y, double w);

}



class A extends Marks{

    double getPercentage(double x, double y, double w) {

        return ((x+y+w)/3);
    }

    @Override
    double getPercentage(double x, double y, double w, double t) {
        return 0;
    }

}


class B extends Marks {


    double getPercentage(double x, double y, double w) {
        return 0;
    }
        @Override
        double getPercentage ( double x, double y, double w, double t){
            return ((x + y + w + t) / 4);
        }
}


class print{
    public static void main(String[] args) {
        A studentA = new A();
        System.out.println(studentA.getPercentage(8, 13.5, 10));

        B studentB = new B();
        System.out.println(studentB.getPercentage(12, 13, 14, 19.75));

    }
}

