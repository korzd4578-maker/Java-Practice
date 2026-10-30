package Practice06;

public class ArraySearcher {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public boolean contains(int target) {
        if (data == null) {
            return false;
        }

        for (int number : data) {
            if (number == target) {
                return true;
            }
        }

        return false;
    }

    public int findIndex(int target) {
        if (data == null) {
            return -1;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
