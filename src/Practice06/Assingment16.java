package Practice06;

public class Assingment16 {
    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.model = "HP LaserJet";
        printer.paperCount = 20;

        printer.printDocument("Звіт", 5);

        System.out.println("----------------");

        printer.printDocument("Практична робота", 30);

    }
}
