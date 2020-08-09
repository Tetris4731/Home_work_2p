package home_work_6;

import javax.xml.namespace.QName;

public class Cat extends Animals {
    private static int animalCoimtCat;
    static {
        animalCoimtCat = 0;
    }
    public Cat( String name, String color, int age,int run,int swim){
        super(name,color,age,run,swim);
        animalCoimtCat++;
    }

    @Override
    public void maxRun( int dist ) {
        super.maxRun(dist);
    }

    @Override
    public void maxSwim( int dist ) {
        super.maxSwim(dist);
    }
    public static int getAnimalCoimtCat(){
        return animalCoimtCat;
    }
}
