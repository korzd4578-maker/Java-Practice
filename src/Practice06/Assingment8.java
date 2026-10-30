package Practice06;

public class Assingment8 {
    public static void main(String[] args) {

        Student first = new Student();

        first.name = "Іван";

        Student second = first;

        second.name = "Петро";

        System.out.println("Ім'я першого студента: " + first.name);
        System.out.println("Ім'я другого студента: " + second.name);

    }
}
