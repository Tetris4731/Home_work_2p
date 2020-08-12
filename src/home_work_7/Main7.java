package home_work_7;

import home_work_6.Cat;

public class Main7 {
    public static void main( String[] args ) {
    Cat7[] cats = new Cat7[]{
    new Cat7("Murzik"),
    new Cat7("Djesi"),
    new Cat7("Barsik"),
    };
    Plate plate = new Plate(10);
    for (Cat7 cat : cats ){
        cat.eat(plate);
    }
    for(Cat7 cat : cats){
        System.out.println(cat);
    }
        System.out.println("Еды осталось " + plate.getFood());

    }
}
