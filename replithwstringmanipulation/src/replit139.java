import java.sql.SQLOutput;

public class replit139 {

    /* String alphabetical(String str){

        for (int i = 0; i < str.charAt(i); i++) {
            int str1 = str.charAt(0);
            if (str.charAt(i)>str1[i-1]);


        }return str.charAt(str);

}
    static class Mainr {
        public static void main(String[] args) {
            Mainr lk = new Mainr();
            System.out.println();
        }

    }


}

    */


    public String alphabetical(String str) {
        String letter = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str.charAt(i - 1)) {
                letter += str.charAt(i);
            }

        }
        return letter;
    }

    public static void main(String[] args) {
        replit139 ma = new replit139();

        System.out.println(ma.alphabetical("hello"));
        System.out.println(ma.alphabetical("software"));
        System.out.println(ma.alphabetical("language"));
    }
}