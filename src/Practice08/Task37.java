package Practice08;

public class Task37 {
    public static void main(String[] args) {
        CinemaHall hall = new CinemaHall(
                "Зал 1",
                3,
                4,
                150
        );

        VipCinemaHall vipHall = new VipCinemaHall(
                "VIP-зал",
                3,
                4,
                200,
                100
        );

        hall.bookSeat(0, 0);
        hall.bookSeat(1, 1);
        hall.bookSeat(2, 0);

        vipHall.bookSeat(0, 0);
        vipHall.bookSeat(1, 1);
        vipHall.bookSeat(2, 0);
        vipHall.bookSeat(2, 1);

        System.out.println("Звичайний зал:");
        System.out.println(hall);

        System.out.println("-------------------");

        System.out.println("VIP-зал:");
        System.out.println(vipHall);
    }
}
