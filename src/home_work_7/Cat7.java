package home_work_7;

public class Cat7 {
    private String name;
    private boolean satiety;
    private int appetit;

    public Cat7( String name ) {
        this.name = name;
        appetit = 10;
    }

    public Cat7( String name, int appetit ) {
        this.name = name;
        this.appetit = appetit;
    }

    public String getName() {
        return name;
    }
    public void eat(Plate plate){
        if (plate.food(appetit)) {
            System.out.println(name + " eat");
            satiety = true;
        } else {
            System.out.println(name + " no eat");
        }
    }
    public boolean isSatiet(){
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat7{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                ", appetit=" + appetit +
                '}';
    }
}
