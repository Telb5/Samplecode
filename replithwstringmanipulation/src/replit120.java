public class replit120 {


    int year;
    String schoolName;
    int batchNumber;

    public static void main(String[] args) {
        replit120 student = new replit120();
        student.year = 2021;
        student.schoolName = "Syntax";
        student.batchNumber = 9;
        System.out.println("I am a student of batch " + student.batchNumber + " studying at " + student.schoolName + " in the year of " + student.year);
    }
}