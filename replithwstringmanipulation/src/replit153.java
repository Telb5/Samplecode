public class replit153
    {

    replit153()
    {
        System.out.println("This is Parent constructor");
    }

}

class ChildClass extends replit153
    {
        ChildClass()
        {

        }

}


class Maiin
    {
        public static void main(String[] args)
        {
            ChildClass obj = new ChildClass();

        }
    }







