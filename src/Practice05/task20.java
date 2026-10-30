package Practice05;

public class task20 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 12, 19, 25};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Массив отсортирован? " + isSorted);
    }
}
