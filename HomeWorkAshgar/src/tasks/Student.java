package tasks;

public class Student {

    String IdName;

    int age;

    String grade;

    String level;

    Student(String idName, int studentAge, String studentGrade, String studentLevel) {

        IdName = idName;
        age = studentAge;
        grade = studentGrade;
        level = studentLevel;

    }

    void printInfo(){
    System.out.println(IdName+" "+age+" "+grade+" "+level);


    }

}
