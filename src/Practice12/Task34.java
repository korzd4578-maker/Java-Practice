package Practice12;
import java.util.*;
public class Task34 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 0, 4, 5},
                {6, 7, 8, 0, 10},
                {11, 12, 13, 14, 15},
                {1, 0, 5, 19, 20}
        };

        TreeSet<Integer> uniqueValues = new TreeSet<>();

        HashSet<Integer> firstRow = new HashSet<>();
        HashSet<Integer> lastRow = new HashSet<>();

        List<String> zeroCoordinates = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                int value = matrix[i][j];

                uniqueValues.add(value);

                if (i == 0) {
                    firstRow.add(value);
                }

                if (i == matrix.length - 1) {
                    lastRow.add(value);
                }

                if (value == 0) {
                    zeroCoordinates.add(i + "," + j);
                }
            }
        }

        System.out.println("Уникальные значения: "
                + uniqueValues);

        Set<Integer> common = new HashSet<>(firstRow);
        common.retainAll(lastRow);

        System.out.println("Общие элементы первого "
                + "и последнего ряда: " + common);

        ListIterator<String> lit = zeroCoordinates.listIterator();

        while (lit.hasNext()) {

            String coordinate = lit.next();

            String[] parts = coordinate.split(",");

            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);

            lit.set("[row=" + row + ", col=" + col + "]");
        }

        System.out.println("Координаты нулей: "
                + zeroCoordinates);
    }
}

