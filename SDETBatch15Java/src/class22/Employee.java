package class22;

public class Employee {

    String name;

    static int baseSalary = 30000;
    static int baseHolidays = 10;

    void printSalary()
    {
        System.out.println(baseSalary);
    }

    void printHolidays()
    {
        System.out.println(baseHolidays);
    }


}




class OfficeBoy extends Employee {

}



class Manager extends Employee{

    void printSalary()
    {
        System.out.println((baseSalary*4)+200000);   // in this example, we don't want to pay the Empolyees the same baseSalaries
        //so we create a new method to follow same action but different way of acting it (overriding).
    }
}




class Developper extends Employee{
    void printSalary()
    {
        System.out.println((baseSalary*5)+30000);
    }
}




class QA extends Employee {
    void printSalary() {
        System.out.println((baseSalary * 2) + 30000);
    }

    void printHolidays() {
        System.out.println(baseHolidays + 5);
    }

}
