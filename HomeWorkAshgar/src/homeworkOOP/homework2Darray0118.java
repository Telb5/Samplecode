package homeworkOOP;

public class homework2Darray0118 {
    public static void main(String[] args) {


//1) Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
//Then your program should print name of the students that has A and B grade

        String[][] arra = {{"Hiral", "TA", "Nelson", "Adem"}, {"A", "D", "B", "C"}};

        for (int i = 0; i < arra.length; i++) {
            for (int j = 0; j < arra[i].length; j++) {
                if (j<=1){
                    System.out.println(arra[i][j]);
                }

            }

        }
    }
}