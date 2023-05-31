package class23;

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.

public class HomeworkToDo {

    public void laptopSoftware()
        {
             System.out.println("this X software is piece of art");
        }

    public void laptopHardware()
        {
             System.out.println("this X hardware is solid");
        }

    public void laptopPerformance()
        {
             System.out.println("this X laptop is a beast");
        }

}


class Apple extends HomeworkToDo{

    @Override
    public void laptopSoftware()
        {
                System.out.println("This MacbookAir is very secure");
        }

    @Override
    public void laptopHardware()
        {
                System.out.println("MacbookAir's hardware is quiet solid just like the MacbookPro");
        }

    @Override
    public void laptopPerformance()
        {
                 System.out.println("MacbookAir M1 performance is just awesome");
        }
}


class Lenovo extends HomeworkToDo{

}


class HP extends HomeworkToDo{

    @Override
    public void laptopSoftware()
        {
                 System.out.println("HP's software is not the top 3 anymore");
        }


    @Override
    public void laptopHardware()
        {
                 System.out.println("The material used in HP cannot be compared to the Mac's");
        }

    public void laptopWaranty()
        {
            System.out.println("HP offers 1 year warranty");
        }
}



class Dell extends HomeworkToDo{
    @Override
    public void laptopPerformance()
        {
                System.out.println("Dell has been the leader when it comes to performance on top of the quality");
        }

    public void laptopPrice()
        {
            System.out.println("Dell offers good price deals");
        }
}

