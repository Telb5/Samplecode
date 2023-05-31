import homeworkOOP.evenoroddnumMethod;

public class palindrome {

    boolean palindromeStr(String myStr){
        String reverseStr = new StringBuilder(myStr).reverse().toString();
        if (myStr.equals(reverseStr)){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        palindrome result =new palindrome();
        System.out.println(result.palindromeStr("level"));
    }

}