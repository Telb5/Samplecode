public class class128 {
    public static String thirdLetter(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i += 3)
            newString += s.charAt(i) + "";
        return newString;
    }
}
