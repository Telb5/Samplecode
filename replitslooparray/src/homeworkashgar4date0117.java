public class homeworkashgar4date0117 {

    public static void main(String[] args) {

///4) Create a 2D array or integer type where you will store odd and even numbers.
        //Develop a program which will identify/print the even numbers only.

        int[][] nums = {{5, 3},
                       {10, 2, 9, 0}};


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] % 2 == 0) {

                    System.out.print(nums[i][j] + " ");
                    System.out.println();
                }
            }
        }
    }
}

