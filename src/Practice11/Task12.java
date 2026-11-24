package Practice11;
import java.util.ArrayList;
public class Task12 {
    public static void main(String[] args) {

        ArrayList<String> pipeline = new ArrayList<>();

        pipeline.add("Compile");
        pipeline.add("Package");
        pipeline.add("Deploy");

        System.out.println(
                "Початкові етапи: " + pipeline
                        + "; кількість: " + pipeline.size()
        );

        pipeline.add(0, "Checkout Git");

        System.out.println(
                "Після вставки на початок: " + pipeline
                        + "; кількість: " + pipeline.size()
        );

        pipeline.add(2, "Run Unit Tests");

        System.out.println(
                "Після вставки тестів: " + pipeline
                        + "; кількість: " + pipeline.size()
        );
    }
}
