package AbstractAndInterface;

public class ClassextendingAbstract extends abstractClassExample{


        String name300;
        String name400;

        public ClassextendingAbstract(String name300, String name400, String name200, String name100)
        {
            super(name100, name200);
            this.name300 = name300;
            this.name400 = name400;
        }


        @Override
        void sing()
        {

        }

        public static void main(String[] args) {
            ClassextendingAbstract obj = new ClassextendingAbstract("Hamid", "Nelson", "Hiral", "Daria" );
            obj.Lyrics();
        }
    }

