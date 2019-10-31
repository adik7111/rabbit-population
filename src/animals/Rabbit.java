package animals;

public class Rabbit {

    private int id;
    private int age;
    private double hunger;      //between 0.00 and 1.00
    private boolean gender;     //true = female false = male

    public Rabbit(int id, int age, double hunger, boolean gender) {
        this.id = id; this.age = age;
        this.hunger = hunger; this.gender = gender;
    }
}
