package class22;

public class DegreeTask {
   /* Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes*/
    void getPrerequisite()
    {
        System.out.println("To get a degree you need high school diploma");

    }
}

class Bachelors extends DegreeTask{
    }


class Masters extends DegreeTask{
    void getPrerequisite()
    {
        System.out.println("To get a Master's degree  we need a bachelor's degree first");
    }
}


class DegreeTester{
    public static void main(String[] args) {

        DegreeTask degree = new DegreeTask();
        degree.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
    }

}

