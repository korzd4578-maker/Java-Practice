package Practice07;

public class Task13 {
    public static void main(String[] args) {
        String sql = new QueryBuilder("users")
                .select("id, name, email")
                .where("age >= 18")
                .build();

        System.out.println("SQL-запит:");
        System.out.println(sql);

        System.out.println("-------------------");

        String secondQuery = new QueryBuilder("products")
                .build();

        System.out.println(secondQuery);
    }
}
