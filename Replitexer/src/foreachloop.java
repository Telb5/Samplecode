public class foreachloop {

    public static void main(String[] args) {


        int[] arr = {10, 13, 20, 25, 45, 50};
/*
        for (int i = 0; i < 6; i++) {
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
*/
//replace all the odd numbers in this array with the help of a normal loop


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
                System.out.println(arr[i]);
            }
        }
    }

