package home_work_6;

public class Animals {
    private String name;
    private String color;
    private int age;
    private int run;
    private int swim;
static private int animalsCoint;
static {
    animalsCoint = 0;
}

    public static int getAnimalsCoint() {
        return animalsCoint;
    }
    public void maxRun(int dist){
    if (dist>=run){
        System.out.println(name + " столько пробежать не может... " + dist);
    }else{
        System.out.println(name + " пробежал " + dist);
    }
    }
    public void maxSwim(int dist){
    if(swim==0){
        System.out.println(name +" плавать не умеет...");
        return;
    }if(swim>=dist){
            System.out.println(name + " столько проплыть не может " + dist);
        }else{
            System.out.println(name + " проплыл " + dist);
        }
    }

    public Animals( String name, String color, int age, int run, int swim ) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.swim = swim;
        animalsCoint++;
    }


}
