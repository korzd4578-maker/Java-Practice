package Practice02;

public class ex18 {
    public static void main(String[] args) {

        int totalSeconds = 385;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " секунд = " + minutes + " хв " + seconds + " сек");

    }
}
