package Practice07;

public class ArrayFilter {
    public int[] filter(int[] arr, int threshold) {

        int count = 0;

        for (int number : arr) {
            if (number > threshold) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int number : arr) {
            if (number > threshold) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    public int[] filter(int[] arr, int min, int max) {

        int count = 0;

        for (int number : arr) {
            if (number >= min && number <= max) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int number : arr) {
            if (number >= min && number <= max) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }

    public int[] filter(int[] arr, boolean keepEvens) {

        int count = 0;

        for (int number : arr) {

            if (keepEvens && number % 2 == 0) {
                count++;
            }

            if (!keepEvens && number % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int number : arr) {

            if (keepEvens && number % 2 == 0) {
                result[index] = number;
                index++;
            }

            if (!keepEvens && number % 2 != 0) {
                result[index] = number;
                index++;
            }
        }

        return result;
    }
}
