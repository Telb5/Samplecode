package class1;

import java.util.Scanner;

public class exe {

    public static void main(String[] args) {

        /* In the second-largest city of China, covid cases are spiking (between 500 k - 1 m) on a daily basis.
        For that matter, I want you as a registered nurse in a hospital to track every case that's been admitted to the ER.
        The program consists on taking the patient's age, covid mutant
        and if they have been diagnosed for covid before :

        -If patient is a minor and have never been admitted for covid, output must be "Please send the patient room 1",
        -If patient (minor) has been admitted before for covid, output is "This is a high priority case, , please take to block A-50"".
        -If patient is an adult, and never been admitted then ask them if they have a hard times breathing, if not, "Patient can go home for isolation and treatment".
        -If they find it hard to breath; output should be "patient must go to room number 1TR ASAP".
        -If patient is an adult, and been admitted for covid and don't have hard times breathing then output should be "We will keep the patient for 3 hours then send them home".
        -If patient is an adult, and been admitted for covid and have hard times breathing then ask them which mutant they have, if it's Omicron, then output should be patient must go to room number 1TR ASAP"
        and if it's "RK-20" mutant then output should be "Send patient to DC JH hospital".
      *///


        Scanner scan = new Scanner(System.in);


        System.out.println("How old are you ?");
        int patientAge = Integer.parseInt(scan.nextLine());


        System.out.println("Have you been diagnosed for covid before ?");
        String Diagnosis = scan.nextLine();



        if (patientAge < 18) {
            if (Diagnosis.equalsIgnoreCase("No")) {
                System.out.println("Please send the patient to room A1");
            }
        }
        if ((patientAge < 18) && (Diagnosis.equalsIgnoreCase("Yes"))) {
            System.out.println("This is a high priority case, please take to block A-50");
            /// when you put else if, the work doesn't work, why ? (To review)
        }


        if (patientAge >= 18) {
            if (Diagnosis.equalsIgnoreCase("No")) {
                System.out.println("Can you breath normally ?");
                String breathingStatus = scan.nextLine();
                if (breathingStatus.equalsIgnoreCase("Yes")) {
                    System.out.println("Patient can go home for isolation and treatment");
                } else if (breathingStatus.equalsIgnoreCase("no")) {
                    System.out.println("patient must go to room number 1TR ASAP");
                }
            }

            if (patientAge >= 18) {
                if (Diagnosis.equalsIgnoreCase("Yes")) {
                    System.out.println("Can you breath normally ?");
                    String breathingStatus1 = scan.nextLine();
                    if (breathingStatus1.equalsIgnoreCase("no")) {
                        System.out.println("We will keep the patient for 3 hours then send them home");
                    }else if (breathingStatus1.equalsIgnoreCase("yes")) {
                            System.out.println("which covid mutant do you have ?");
                            String covidMutant = scan.nextLine();
                            if (covidMutant.equalsIgnoreCase("Omicron")) {
                                System.out.println("patient must go to room number 1TR ASAP");
                            } else if (covidMutant.equalsIgnoreCase("RK-20")) {
                                System.out.println("Send patient to DC JH hospital");
                            }
                        }
                    }
                }
            }
        }
    }



