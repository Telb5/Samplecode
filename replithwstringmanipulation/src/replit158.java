import javax.print.attribute.standard.Chromaticity;

public class replit158
    {
        String city;

        replit158(String city)
            {
                this.city = city;
            }

            public void display()
                {
                    System.out.println("city name" +" "+ this.city);
                }
    }

class CHildd extends replit158
    {

        CHildd(String city)
            {
                super(city);
            }
    }




class Maoinj
    {
        public static void main(String[] args) {
            CHildd prrrint = new CHildd("Fairfax");
            prrrint.display();
        }
    }






/*# Super Keyword.

        # Note: Use separate Classes.

        Create Class call Parent.

        create a class String **variable** call city.

        create Parent constructor take the String parameter city. include the logic to assign the value of parameter to class variable.

        create method with below specification.

        access modifier public.

        return type void

        name display

        Write to logic print below sentence.

        "City name " + the value of class variable.

        Create Child Class.

        inherit to Parent class.

        create Child constructor with one String parameter called city.

        call super constructor and pass the parameter.

        in Main Class.

        Create and object of Child class. pass city name as "Fairfax" and call the display method.

        Output.

        City name Fairfax
        */

