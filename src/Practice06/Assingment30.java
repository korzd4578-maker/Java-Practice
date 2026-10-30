package Practice06;

public class Assingment30 {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setName("Дмитро");
        person1.setAge(18);

        Person person2 = new Person();

        person2.setName("Максим");
        person2.setAge(20);

        person1.printSummary();

        System.out.println("----------------");

        person2.printSummary();

    }
}
