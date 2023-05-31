import java.awt.image.ReplicateScaleFilter;

public class replit136 {


    private void method1(){
        System.out.println("This is Private Method");
    }

    void method2 (){
        System.out.println("This is Default Method");
    }

    protected void method3 (){
        System.out.println("This is Protected Method");
    }

    public void method4 (){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args){
        replit136 main= new replit136();
        main.method1();
        main.method2();
        main.method3();
        main.method4();
    }

}
