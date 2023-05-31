public class replit131 {

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }


    public static String thirdLetter(String s) {

        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < s.length(); i += 3) {
           str1.charAt(i);

        }return s.toString();

    }
}
