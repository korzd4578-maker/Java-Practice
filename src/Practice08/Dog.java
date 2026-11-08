package Practice08;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, double weight, String breed) {

        super(name, age, weight);

        this.breed = breed;
    }

    public String fetchStick() {
        return getName() + " приніс палицю!";
    }

    @Override
    public String toString() {

        return "Dog{" + super.toString() +
                ", breed='" + breed + "'}";
    }
}