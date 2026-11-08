package Practice07;

public class Task32 {
    public static void main(String[] args) {
        System.out.println("Прискорення вільного падіння: "
                + PhysicsEngine.G + " м/с²");

        System.out.println("Швидкість світла: "
                + PhysicsEngine.SPEED_OF_LIGHT + " м/с");

        System.out.println("-------------------");

        System.out.println("Відстань падіння за 5 секунд: "
                + PhysicsEngine.freeFallDistance(5) + " м");

        System.out.println("Кінетична енергія: "
                + PhysicsEngine.kineticEnergy(10, 20) + " Дж");

        System.out.println("Енергія спокою 1 грама матерії: "
                + PhysicsEngine.restEnergy(0.001) + " Дж");
    }
}
