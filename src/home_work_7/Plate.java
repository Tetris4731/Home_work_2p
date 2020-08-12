package home_work_7;

public class Plate {
    private int food;

    public Plate( int food ) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean food( int amount ) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
