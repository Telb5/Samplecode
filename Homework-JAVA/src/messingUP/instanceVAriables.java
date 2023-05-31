package messingUP;

public class instanceVAriables {

    String name1;
    int num1;
    int num2;


    int Number1() {
        num1 = 10;
        int num5 = 100;
        return num5;
    }


    public void AddNum() {
        String DogName = "JackJack";
        System.out.println("Hello world " + DogName);
      //System.out.println(num1);
      // num1 = 1;
    }
}

class instanceVariables2 {

    public static void main(String[] args) {

        instanceVAriables obj = new instanceVAriables();

        System.out.println(obj.Number1());

    }
}
