package class28;

import javax.security.auth.Subject;
import java.util.LinkedList;

public class LinkedListsDemo2 {

    public static void main(String[] args) {

        LinkedList<String> subjects = new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual test");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");


        LinkedList<String> futureSubjects = new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("Testing");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");


        LinkedList<String> allSubjects = new LinkedList<>();
        //Get all the entries from subjects list and futureSubjects and put them in allSubjects list.

        allSubjects.add(String.valueOf(subjects));
        allSubjects.add(String.valueOf(futureSubjects));
        System.out.println(allSubjects);

        }


    }

