package Practice06;

public class Person {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            if (age >= 0 && age <= 120) {
                this.age = age;
            } else {
                System.out.println("Помилка: некоректний вік!");
            }
        }

        public void printSummary() {
            System.out.println("Ім'я: " + this.name);
            System.out.println("Вік: " + this.age);
        }
    }

