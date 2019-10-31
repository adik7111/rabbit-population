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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
