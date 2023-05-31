public class replit134 {

    static int countVowels(String s) {

       // int sum = 0;
        //String str = s.replace("^aeiou","*");
        //for (int i = 0; i < s.length(); i++){
        // if ((s.charAt(i) == 'a') || (s.charAt(i) == 'o') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'u')){
        //sum++;
        //}

        //}
        //return sum;

        //}
////////////////////////////////////////////////////////////////////////////////////////////////////////


      String str = s.replaceAll("[^aoiue]", "");


        return str.length();

    }


        //test case below (dont change):
        public static void main (String[]args){
            System.out.println(countVowels("obama")); //3
            System.out.println(countVowels("happy friday! i love weekends")); //9
        }
}
