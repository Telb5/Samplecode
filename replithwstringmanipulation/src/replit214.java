import java.util.Scanner;



    class SyntaxStudentException extends RuntimeException{
        SyntaxStudentException(String msg){
            super(msg);
        }
    }
public class replit214 {
        public static void gradeCheck (int grade){
            if(grade>90){
                throw new SyntaxStudentException ("You are an exceptionally awesome student");
            } else {
                System.out.println("You are a great student");
            }
        }

        public static void main(String[] args) {
            try{
                gradeCheck(95);
            }catch(SyntaxStudentException e){
                System.out.println(e);
            }
        }
    }
