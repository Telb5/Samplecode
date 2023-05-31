package homeworkOOP;

public class evenoroddnumMethod {

    public static void main(String[] args) {

        evenoroddnumMethod input = new evenoroddnumMethod();

       System.out.println(("this num is " + (input.evenoddnum(3))));

    }





    public String evenoddnum(int number){


        if (number%2==0){
            return "even number";
        }else {
            return "odd number";
        }
    }

}

