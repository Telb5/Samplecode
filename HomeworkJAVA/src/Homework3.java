import javax.imageio.stream.ImageInputStream;

public class Homework3 {

    /*3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.*/



public static void Nassir(){
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }
}

public static String Bassir(String name1, String name2) {


   return ("I love " + name1 + " and " + name2);


}

    public static void main(String[] args) {

        System.out.println(Bassir("Slava", "Hiral"));


        float n1=0;
        float n2=0;
        float n3=0;


        float average,sum = n1 + n2 + n3;
            average = sum /3;

        System.out.println(average);

    }
}