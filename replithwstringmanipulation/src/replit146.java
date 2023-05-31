public class replit146 {
//class Employee{

    String name;
    String lastName;
    int employeeID;
    String startDate;
    int salary;


    replit146()
    {

    }


    replit146(String name, String lastName, int employeeID, String startDate, int salary)
    {
        this.name = name;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.startDate = startDate;
        this.salary = salary;
    }

    void print()
    {
        System.out.println(name +" "+ lastName +" "+ employeeID +" "+ startDate +" "+ salary);
    }

}





class Mainee{
    public static void main(String[] args) {

        replit146 printa = new replit146();
        printa.print();
        replit146 printa1 = new replit146("Joe", "Smith", 12345, "01/01/1970", 35000);
        printa1.print();
    }
}