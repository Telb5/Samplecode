package Project2;

public class replit180 {
}


class EncapsulationDemo13{

    private String empName="John";

    private int empAge=30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}

class Main13{
    public static void main(String[] args) {
        EncapsulationDemo13 obj2 = new EncapsulationDemo13();
        System.out.println("Employee Name:"+" "+ obj2.getEmpName());
        System.out.println("Employee Age:"+" "+ obj2.getEmpAge());

    }
}



