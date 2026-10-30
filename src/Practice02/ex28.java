package Practice02;

public class ex28 {
    public static void main(String[] args) {

        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);

        System.out.println("Вік: " + personAge + ". Право на безкоштовний проїзд: " + hasFreePass);

    }
}
