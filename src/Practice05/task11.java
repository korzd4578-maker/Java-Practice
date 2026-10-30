package Practice05;
public class task11 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 12, 19, 22, 31, 40, 45, 50, 53};
        int evenCount = 0;
        int oddSum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) evenCount++;
            else oddSum += num;
        }
        System.out.println("Кількість парних: " + evenCount + ", Сума непарних: " + oddSum);
    }
}
