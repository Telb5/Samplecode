public class replit142 {
    public static void main(String[] args) {


        SyntaxTechnologies output = new SyntaxTechnologies();
        SyntaxTechnologies output1 = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");


    }
}


class SyntaxTechnologies {

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;



    SyntaxTechnologies()
    {
        System.out.println(schoolName +" "+ batch +" "+ year +" "+ lastDayOfClass);
    }


    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass)
    {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;

       System.out.println(schoolName +" "+ batch +" "+ year +" "+ lastDayOfClass);
    }

}

