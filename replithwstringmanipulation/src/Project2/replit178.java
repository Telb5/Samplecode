package Project2;

public class replit178 {

    private String empName;

    private int empAge;



    public String getEmpName(){
        return empName;
    }
    public void setempName(String empName){
        this.empName = empName;
    }


    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

}


class Main10{
    public static void main(String[] args) {
        replit178 obj = new replit178();
        obj.setempName("John");
        obj.setEmpAge(30);

        System.out.println("Employee Name:"+" "+ obj.getEmpName());
        System.out.println("Employee Age:"+" "+ obj.getEmpAge());

    }
}
