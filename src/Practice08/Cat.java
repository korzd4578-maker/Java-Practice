package Practice08;

public class Cat extends Animal {

    private boolean isIndoor;

    public Cat(String name, int age, double weight, boolean isIndoor) {

        super(name, age, weight);

        this.isIndoor = isIndoor;
    }

    public String purr() {
        return getName() + " муркоче: мур-мур!";
    }

    @Override
    public String toString() {

        return "Cat{" + super.toString() +
                ", indoor=" + isIndoor + "}";
    }
}
