package Project2;

public class replit179 {
}


    class EncapsulationDemo1{
        private String Name;
        private int Age;


    public String getName(){
        return Name;
    }

    public void setName(String name){
        this.Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }
    }


class Main12{
    public static void main(String[] args) {
        EncapsulationDemo1 obj1 = new EncapsulationDemo1();
        obj1.setName("Mario");
        obj1.setAge(32);

        System.out.println("Employee Name:"+" "+obj1.getName());
        System.out.println("Employee Age:"+" "+obj1.getAge());
    }
}

