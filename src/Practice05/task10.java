package Practice05;
public class task10 {
    public static void main(String[] args) {
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int positive = 0, negative = 0, zeros = 0;
        for (int val : data) {
            if (val > 0) positive++;
            else if (val < 0) negative++;
            else zeros++;
        }
        System.out.println("Додатних: " + positive + ", Від'ємних: " + negative + ", Нулів: " + zeros);
    }
}
