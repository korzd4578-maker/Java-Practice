package Practice06;

public class Assingment10 {
    public static void main(String[] args) {

        Animal cat = new Animal();

        cat.species = "Кіт";
        cat.name = "Мурчик";

        Animal dog = new Animal();

        dog.species = "Собака";
        dog.name = "Бобік";

        cat.printInfo();
        cat.makeSound();

        System.out.println("----------------");

        dog.printInfo();
        dog.makeSound();
    }
}
