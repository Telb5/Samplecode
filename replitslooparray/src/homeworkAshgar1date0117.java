import java.util.Scanner;

public class homeworkAshgar1date0117 {

    public static void main(String[] args){

/*1)Using Scanner create an array of integer values. After the array is created,
  calculate the sum of all stored elements in that array. */


        Scanner scanner = new Scanner(System.in);

        int [] nums = new int[4];

        int sum = 0;

            nums[0] = scanner.nextInt();
            nums[1] = scanner.nextInt();
            nums[2] = scanner.nextInt();
            nums[3] = scanner.nextInt();



            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
            }
                System.out.println(sum);


            }


        }