public class Students {

   /* 2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
   Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
    students with different marks. Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.*/


    String studentName;
    int mathgrade;
    int biologygrade;
    int chemistrygrade;


    Students(String name, int math, int biology, int chemistry) {

        studentName = name;
        mathgrade = math;
        biologygrade = biology;
        chemistrygrade = chemistry;

    }

    void averagecalcul() {
        System.out.println(studentName+"'s grad is"+" "+(mathgrade + biologygrade + chemistrygrade) / 3);
    }


    public static void main(String[] args) {

        Students average = new Students("Nelson", 2, 5, 9);
        average.averagecalcul();

        Students average1 = new Students("Hiral", 2, 6, 10);
        average1.averagecalcul();

        Students average2 = new Students("Abeeera", 3, 5, 0);
        average2.averagecalcul();

        Students average3 = new Students("Natalia", 2, 5, 9);
        average3.averagecalcul();

        Students average4 = new Students("Asli", 1, 5, 7);
        average4.averagecalcul();


    }


}