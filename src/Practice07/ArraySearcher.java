package Practice07;

public class ArraySearcher {
    public int find(int[] arr, int target) {

        return find(arr, target, 0);
    }

    public int find(int[] arr, int target, int startIndex) {

        if (arr == null) {
            return -1;
        }

        for (int i = Math.max(0, startIndex); i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int find(String[] arr, String target) {

        return find(arr, target, false);
    }

    public int find(String[] arr, String target, boolean ignoreCase) {

        if (arr == null || target == null) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != null) {

                boolean found;

                if (ignoreCase) {
                    found = arr[i].equalsIgnoreCase(target);
                } else {
                    found = arr[i].equals(target);
                }

                if (found) {
                    return i;
                }
            }
        }

        return -1;
    }
}
