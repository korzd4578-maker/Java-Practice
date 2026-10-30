package Practice06;

public class ArrayStats {
    private int[] numbers;

    public void setNumbers(int[] nums) {
        numbers = nums;
    }

    public int countEvens() {
        int count = 0;

        if (numbers == null) {
            return 0;
        }

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int countOdds() {
        int count = 0;

        if (numbers == null) {
            return 0;
        }

        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public int calculateSum() {
        int sum = 0;

        if (numbers == null) {
            return 0;
        }

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
