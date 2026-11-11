package Practice08;

public class Task31 {
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent(
                1001,
                "dmytro@gmail.com",
                "KN-21",
                92.5,
                "Штучний інтелект у кібербезпеці",
                "Іван Петренко"
        );

        System.out.println("ДОСЬЄ АСПІРАНТА");

        System.out.println(student);

        System.out.println("-------------------");

        System.out.println("Допуск до захисту: "
                + student.canDefendThesis());
    }
}
