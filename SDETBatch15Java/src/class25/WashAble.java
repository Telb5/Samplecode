package class25;

public interface WashAble{                          //instead of class we put interface


    void wash();                                //by default public and abstract methods are already there
}

class SmartWatch implements WashAble{

    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch with out any issues");
    }
}

class Phone implements WashAble{

    public   void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }

}

class Inverter implements WashAble{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}
