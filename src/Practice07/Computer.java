package Practice07;

public class Computer {

    private String title;
    private Processor cpu;
    private Memory ram;
    private double casePrice;

    public Computer(String title, Processor cpu, Memory ram, double casePrice) {

        this.title = title;
        this.cpu = cpu;
        this.ram = ram;
        this.casePrice = casePrice;
    }

    public double calculateTotalPrice() {

        return cpu.getPrice() + ram.getPrice() + casePrice;
    }

    public void upgradeMemory(Memory newRam) {

        this.ram = newRam;

        System.out.println("Оперативну пам'ять успішно оновлено!");
        System.out.println("Новий об'єм: " + ram.getSizeGB() + " GB");
    }

    public void printSpecs() {

        System.out.println("Назва ПК: " + title);

        System.out.println("Процесор: " + cpu.getModel());

        System.out.println("Частота процесора: "
                + cpu.getFrequencyGHz() + " GHz");

        System.out.println("Оперативна пам'ять: "
                + ram.getSizeGB() + " GB");

        System.out.println("Частота RAM: "
                + ram.getFrequencyMHz() + " MHz");

        System.out.println("Ціна корпусу: " + casePrice + " грн");
    }
}