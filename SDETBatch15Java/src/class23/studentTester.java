package class23;

public class studentTester {

        public static void main(String[] args) {


            Student [] students={new CollegeStudent(), new SyntaxStudent(),new SchoolStudent()};

            for (Student student:students){
                student.doHomeWork();
                student.practice();
                student.study();
            }
        }
    }

