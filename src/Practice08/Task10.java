package Practice08;

public class Task10 {
    public static void main(String[] args) {
        Dog dog = new Dog(
                "Бобік",
                3,
                12.5,
                "Німецька вівчарка"
        );

        Cat cat = new Cat(
                "Мурчик",
                2,
                4.5,
                true
        );

        System.out.println("Собака:");
        System.out.println(dog);
        System.out.println(dog.fetchStick());

        System.out.println("-------------------");

        System.out.println("Кіт:");
        System.out.println(cat);
        System.out.println(cat.purr());
    }
}
