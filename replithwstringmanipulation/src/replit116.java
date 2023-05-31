public class replit116 {

    boolean check(int x, int y){

        if (x%2==0 && y%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        replit116 checkeven = new replit116();

        System.out.println(checkeven.check(-1, 1));
    }

}
