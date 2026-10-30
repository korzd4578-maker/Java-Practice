import Practice01.*;
import Practice02.*;
import Practice03.*;
import Practice04.*;
import Practice05.*;
import Practice06.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("━━━━━━━ ✦ Практична робота №1 ✦ ━━━━━━━");

        for (int i = 1; i <= 40; i++) {
            System.out.println("━━━━━━━ ✦ ЗАВДАННЯ " + i + (i < 10 || i == 25 || i == 26 || i == 27 || i == 29 || i == 30 || i == 31 || i == 32 ? " ✦ ━━━━━━━" : "✦ ━━━━━━━"));
            executeExMethod("Practice01.Ex" + i, args);
            System.out.println();
        }

        System.out.println("━━━━━━━ ✦ Практична робота №2 ✦ ━━━━━━━");

        for (int i = 1; i <= 40; i++) {
            System.out.println("━━━━━━━ ✦ ЗАВДАННЯ " + i + (i < 10 || i == 25 || i == 26 || i == 27 ? " ✦ ━━━━━━━" : "✦ ━━━━━━━"));
            executeExMethod("Practice02.ex" + i, args);
            System.out.println();
        }

        System.out.println("━━━━━━━ ✦ Практична робота №3 ✦ ━━━━━━━");

        for (int i = 1; i <= 40; i++) {
            System.out.println("━━━━━━━ ✦ ЗАВДАННЯ " + i + (i < 10 || i == 25 || i == 26 || i == 27 || i == 29 || i == 30 || i == 31 || i == 32 ? " ✦ ━━━━━━━" : "✦ ━━━━━━━"));
            executeExMethod("Practice03.Exa" + i, args);
            System.out.println();
        }

        System.out.println("━━━━━━━ ✦ Практична робота №4 ✦ ━━━━━━━");

        for (int i = 1; i <= 40; i++) {
            System.out.println("━━━━━━━ ✦ ЗАВДАННЯ " + i + (i < 10 || i == 25 || i == 26 || i == 27 || i == 29 || i == 30 || i == 31 || i == 32 ? " ✦ ━━━━━━━" : "✦ ━━━━━━━"));
            executeExMethod("Practice04.Task" + i, args);
            System.out.println();
        }
        System.out.println("━━━━━━━ ✦ Практична робота №5 ✦ ━━━━━━━");
        for (int i = 1; i <= 40; i++) {
            System.out.println("━━━━━━━ ✦ ЗАВДАННЯ " + i + (i < 10 || i == 25 || i == 26 || i == 27 || i == 29 || i == 30 || i == 31 || i == 32 ? " ✦ ━━━━━━━" : "✦ ━━━━━━━"));
            executeExMethod("Practice05.task" + i, args);
            System.out.println();
        }
        System.out.println("━━━━━━━ ✦ Практична робота №6 ✦ ━━━━━━━");
        for (int i = 1; i <= 40; i++) {
            System.out.println("━━━━━━━ ✦ ЗАВДАННЯ " + i + (i < 10 || i == 25 || i == 26 || i == 27 || i == 29 || i == 30 || i == 31 || i == 32 ? " ✦ ━━━━━━━" : "✦ ━━━━━━━"));
            executeExMethod("Practice06.Assingment" + i, args);
            System.out.println();
        }
    }

    /**
     * Цей метод обов'язково має бути всередині класу Main,
     * але ПІСЛЯ закриваючої фігурної дужки методу main(String[] args)
     */
    private static void executeExMethod(String className, String[] args) {
        try {
            Class<?> clazz = Class.forName(className);
            java.lang.reflect.Method method = clazz.getMethod("main", String[].class);
            method.invoke(null, (Object) args);
        } catch (ClassNotFoundException e) {
            System.out.println("[Помилка] Клас " + className + " не знайдено.");
        } catch (Exception e) {
            System.out.println("[Помилка] Не вдалося виконати метод для " + className);
        }
    }
}