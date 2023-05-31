package homeworkOOP;

public class Task20 {

    public static void main(String[] args) {

        Task20 task = new Task20();

        int[] arr = {10, 20, 30};

        System.out.println(task.Sum(arr));
    }

    private int Sum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }return sum;
    }
}

