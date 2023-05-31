    package Project2;

    public class replit182 {
    }
        class Person {
            private String firstname;
            private String lastname;
            private int birthmonth;
            private int birthday;
            private int birthyear;
            private String ssn;

            public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
                this.firstname = firstname;
                this.lastname = lastname;
                this.birthmonth = birthmonth;
                this.birthday = birthday;
                this.birthyear = birthyear;
                this.ssn = ssn;
            }

            public String getFirstname() {
                return firstname;
            }

            public String getLastname() {
                return lastname;
            }

            public int getBirthmonth() {
                return birthmonth;
            }

            public int getBirthday() {
                return birthday;
            }


            public int getBirthyear() {
                return birthyear;
            }


            public String getSsn() {
                return ssn;
            }


            public void formatBirthday() {
                System.out.println(birthmonth + "/" + birthday + "/" + birthyear);

            }
        }


    class Main15{
        public static void main(String[] args) {
            Person obj15 = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");


            System.out.println(obj15.getFirstname());
            System.out.println(obj15.getLastname());
            obj15.formatBirthday();
            System.out.println(obj15.getSsn());


        }
    }

