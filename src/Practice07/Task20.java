package Practice07;

public class Task20 {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("Програму успішно запущено");

        logger.log("WARNING", "Недостатньо місця на диску");

        logger.log("ERROR", 404, "Сторінку не знайдено");

        logger.log("AUTH", "Користувач увійшов у систему", true);
    }
}
