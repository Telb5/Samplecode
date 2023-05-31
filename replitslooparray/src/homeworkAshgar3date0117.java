public class homeworkAshgar3date0117 {

    public static void main(String[] args) {

//3) Create a 2D array of integer values. Print the sum of all numbers.

        int[][] nums = {{1, 2},
                        {3, 5},
                        {6, 9}};


        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++)

                sum = sum + (nums[i][j]);
            }


            System.out.println(sum);
        }

    }
