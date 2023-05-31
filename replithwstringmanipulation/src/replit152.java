public class replit152
    {

    replit152(String city)
        {
            System.out.println(city);
        }


    replit152()
    {
        System.out.println("Parent constructor");
    }

}



class Child extends replit152
    {

         Child(String city)
    {
    }

}


   class MainClass
   {

       public static void main(String[] args)
       {
           replit152 print = new replit152("Vienna");
       }
}
