package home_work_6;
import home_work_6.Animals;
public class Main {
    public static void main(String[] args) {

    Cat cat = new Cat("Murzic","black",10,200,0);
//    Cat cat2 = new Cat("Djasi","white",4);
//    Cat cat3 = new Cat("Barsik","Gray",6);
    Dog dog = new Dog("Bobik","black",1,500,10);
//    Dog dog2 = new Dog("Djak","brown",10);
//    Dog dog3 = new Dog("Tuzik","dark grey",15);
//        Animals[] animalCat = {
//                 new Cat("Murzic", "black", 10),
//                 new Cat("Djasi", "white", 4),
//                 new Cat("Barsik", "Gray", 6),
//        };
//        Animals[]animalDog = {
//                new Dog("Bobik", "black", 1),
//                new Dog("Djak", "brown", 10),
//                new Dog("Tuzik", "dark grey", 15),
//        };
//         new Dog("Tuzik", "dark grey", 15);
        cat.maxRun(150);
        dog.maxRun(150);
        cat.maxSwim(100);
        dog.maxSwim(300);
        System.out.println("Всего животных " + (Animals.getAnimalsCoint()));
        System.out.println("Всего котов "+(Cat.getAnimalCoimtCat()));
        System.out.println("Всего собак " + (Dog.getAnimalCoint()));

    }
}
