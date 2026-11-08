package Practice08;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, double salary,
                     String programmingLanguage) {

        super(name, salary);

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {

        return String.format(
                "Developer{name='%s', salary=%.2f, language='%s'}",
                getName(),
                getSalary(),
                programmingLanguage
        );
    }
}