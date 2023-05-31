package homeworkJavaClass12;

public class exercise1 {

    public static void main(String[] args) {

 //1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.

/*

        //  4) How would you reverse a String word by word? for example

        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
        //

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for(String word:arr){
            for (int i =word.length()-1 ; i >=0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");


        /////
            for(String word:arr){
                StringBuilder st=new StringBuilder(word);
                st.reverse();
                System.out.print(st);
                System.out.print(" ");
            }
///////
            String str="This is sentence i want to reverse";
            String [] arr=str.split(" ");
            for(String word:arr){
                System.out.print(new StringBuilder(word).reverse()+" ");
            }

        }

*/


/////////////////

        //example :


        int [] arr={10,20,30,45,50};

        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        System.out.println(sum);
        int [] arr1={10,10,10,20,30};

        int sum1=0;
        for (int num:arr1){
            sum1+=num;
        }
        System.out.println(sum1);
        int [] arr2={10,10,15,20,30};

        int sum2=0;
        for (int num:arr2){
            sum2+=num;
        }
        System.out.println(sum2);
    }
}