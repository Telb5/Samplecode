package homeworkOOP;

public class primenummethod {

    public static void main(String[] args) {

        //5) Write a method to return whether given number is prime or not?

        primenummethod num=new primenummethod();
        System.out.println(num.isPrime(4));
    }

    boolean isPrime(int num){
        int count=0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0){
                count++;
            }
        }if (count==2){
            return true;
        }else {
            return false;
        }
    }


    }
