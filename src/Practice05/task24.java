package Practice05;

public class task24 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };

        System.out.println("Кількість рядків: " + matrix.length);
        System.out.println("Кількість стовпчиків у першому рядку: " + matrix[0].length);
        System.out.println("Лівий верхній елемент: " + matrix[0][0]);
        System.out.println("Правий верхній елемент: " + matrix[0][matrix[0].length - 1]);
        System.out.println("Лівий нижній елемент: " + matrix[matrix.length - 1][0]);
        System.out.println("Правий нижній елемент: " + matrix[matrix.length - 1][matrix[0].length - 1]);
    }
}
