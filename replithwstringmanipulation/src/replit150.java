    public class replit150 {   // PARENT CLASS

        String name;
        String lastName;
        int age;

        void print()
        {
            System.out.print(name +" "+ lastName+" ");
        }
    }


     class Employee extends replit150{
        int salary;
        Employee(String name, String lastName, int age, int salary)
        {
         this.name = name;
         this.lastName = lastName;
         this.age = age;
         this.salary = salary;
        }

         void print1()
         {
             System.out.print(age +" "+ salary);
         }
     }



     class Student extends Employee{
        int grade;
         Student(String name, String lastName, int age, int salary, int grade)
         {
             super(name, lastName, age, salary);
             this.grade = grade;
         }
         void print2()
         {
             System.out.println(age +" "+ grade);
         }


    }


     class Retiree extends Student{
        String seniorActivity;
        Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity)
         {
             super(name, lastName, age, salary, grade);
             this.seniorActivity = seniorActivity;
         }

         void print3()
         {
             System.out.println(grade + " " +seniorActivity);
         }

     }


/*
For Student: grade  (int)

For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

**Expected Output:**

```
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
```*/



    class Mainss {
        public static void main(String[] args) {

            Employee obj = new Employee("Joe", "Smith", 35, 35000);
            obj.print();
            obj.print1();

             System.out.println();

            Student obj1 = new Student("Adam", "Smith", 15, 10, 10);
            obj1.print();
            obj1.print2();


            Retiree obj2 = new Retiree("Frank", "Smith", 15, 0, 15, "tour");
            obj2.print();
            obj2.print3();


        }
    }
