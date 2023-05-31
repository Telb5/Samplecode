public class replit119 {

    String censorLetter(String x, char y) {


        String word = x.replace(y, '*');
        return word;
    }


    public static void main(String[] args) {
        replit119 word1 = new replit119();


        System.out.println(word1.censorLetter("computer science", 'e'));
        System.out.println(word1.censorLetter("trick or treat", 't'));

    }
}



 /*   Then complete the method by programming the following behavior

        ```
        Replace all instances of given character with a "*" within the given String.
        See below examples.
        ```

        Examples:

        ```
        censorLetter("computer science",'e') ==> "comput*r sci*nc*"
        censorLetter("trick or treat",'t') ==> "*rick or *rea*"*/