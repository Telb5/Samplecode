package class23;

public class HomeworkToDoTester {
    public static void main(String[] args) {

        HomeworkToDo [] laptops = {new Apple(), new HP(), new Lenovo(), new Dell()};
       // HP warranty = new HP();

        for (HomeworkToDo laptop:laptops)
        {
            laptop.laptopSoftware();
            laptop.laptopHardware();
            laptop.laptopPerformance();
           // warranty.laptopWaranty();
        }

    }
}


