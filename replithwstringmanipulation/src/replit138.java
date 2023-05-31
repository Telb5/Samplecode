public class replit138 {

   void Default(){
       System.out.println("default");
   }

    protected void Protected(){
        System.out.println("protected");
    }

    public void Public(){
        System.out.println("public");
    }



}




class Main1{
    public static void main(String[] args) {
        replit138 access = new replit138();
        access.Default();
        access.Protected();
        access.Public();
    }

}
