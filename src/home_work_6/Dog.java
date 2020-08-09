package home_work_6;

public class Dog extends Animals {
    public static int animalCoint;
    static {
        animalCoint=0;
    }
        public Dog( String name, String color, int age, int run, int swim){
        super(name, color, age,run,swim);
        animalCoint++;
    }

    @Override
    public void maxRun( int dist ) {
        super.maxRun(dist);
    }

    @Override
    public void maxSwim( int dist ) {
        super.maxSwim(dist);
    }

    public static int getAnimalCoint() {
        return animalCoint;
    }
}
