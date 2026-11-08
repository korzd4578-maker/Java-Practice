package Practice07;

public class Task36 {
    public static void main(String[] args) {
        Processor cpu = new Processor(
                "Intel Core i5-13500",
                2.5,
                9000
        );

        Memory ram = new Memory(
                16,
                3200,
                1800
        );

        Computer computer = new Computer(
                "Gaming PC",
                cpu,
                ram,
                2500
        );

        System.out.println("Початкова конфігурація:");

        computer.printSpecs();

        System.out.println("Початкова ціна: "
                + computer.calculateTotalPrice() + " грн");

        System.out.println("-------------------");

        Memory newRam = new Memory(
                32,
                3600,
                3200
        );

        computer.upgradeMemory(newRam);

        System.out.println("-------------------");

        System.out.println("Оновлена конфігурація:");

        computer.printSpecs();

        System.out.println("Нова ціна: "
                + computer.calculateTotalPrice() + " грн");
    }
}

