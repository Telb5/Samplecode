public class largenum {
    public static void main(String[] args) {

        largenum input = new largenum();

        System.out.println(("the highest number would be "+ (input.largenumbers(3, 7))));

    }





    public int largenumbers(int number, int number1){


        if(number > number1){
            return number;
        }else {
            return number1;
        }
    }

}
