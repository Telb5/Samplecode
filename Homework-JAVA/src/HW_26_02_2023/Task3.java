package HW_26_02_2023;


/*3)Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000*/


import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {


        Map<String, Double> Employee = new HashMap<>();

        Employee.put("Abeera", 120.000);
        Employee.put("Hiral", 121.000);
        Employee.put("Adem", 122.000);


        double maxSalary = 0;

        for (Map.Entry<String, Double> EmployeeData:Employee.entrySet()) {
            if (EmployeeData.getValue() > maxSalary){
                maxSalary = EmployeeData.getValue();
            }
        }
        System.out.println(maxSalary);



    }
}
