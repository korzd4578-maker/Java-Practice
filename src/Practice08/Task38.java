package Practice08;

public class Task38 {
    public static void main(String[] args) {
        TeamLead lead = new TeamLead(
                "Дмитро",
                50000,
                "Java",
                5
        );

        Developer developer1 = new Developer(
                "Максим",
                35000,
                "Java"
        );

        Developer developer2 = new Developer(
                "Владислав",
                32000,
                "Python"
        );

        Developer developer3 = new Developer(
                "Андрій",
                30000,
                "JavaScript"
        );

        System.out.println("Додавання розробників:");

        lead.addTeamMember(developer1);

        lead.addTeamMember(developer2);

        lead.addTeamMember(developer3);

        System.out.println("-------------------");

        System.out.println(lead);

        System.out.println("-------------------");

        System.out.println("Загальний бюджет команди: "
                + lead.getTotalTeamBudget() + " грн");
    }
}
