package Practice08;

public class Task19 {
    public static void main(String[] args) {
        Ticket regular = new Ticket(
                "Концерт",
                1000
        );

        StudentTicket student = new StudentTicket(
                "Концерт",
                1000,
                "STUDENT-123"
        );

        VipTicket vip = new VipTicket(
                "Концерт",
                1000,
                true,
                500
        );

        System.out.println("Звичайний квиток:");
        System.out.println(regular);

        System.out.println("-------------------");

        System.out.println("Студентський квиток:");
        System.out.println(student);

        System.out.println("-------------------");

        System.out.println("VIP-квиток:");
        System.out.println(vip);
    }
}
