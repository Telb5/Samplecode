package homeworkOOP;

public class homework2Darray0118i {
    public static void main(String[] args) {
//2) Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops

        String [][] cars = {{"American", "German"},
                            {"Korean", "Italian"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }
    }
}
