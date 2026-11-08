package Practice08;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {

        this.name = name;
        this.age = Math.max(0, age);
        this.weight = Math.max(0, weight);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {

        return String.format(
                "Animal{name='%s', age=%d, weight=%.2f kg}",
                name, age, weight
        );
    }
}
