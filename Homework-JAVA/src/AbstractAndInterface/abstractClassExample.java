package AbstractAndInterface;


    public abstract class abstractClassExample {

        final int num = 3;  //It must be initialized
        String name100;
        String name200;

        abstract void sing();

        public void Lyrics()
        {
            System.out.println("I can buy myself some flowers");
        }


        public abstractClassExample(String name100, String name200) {
            this.name100 = name100;
            this.name200 = name200;
        }



    }
