public class replit211 {
    public static void main(String[] args) {
        try {
            String[] name = {"Hi"};
            System.out.println(name[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
