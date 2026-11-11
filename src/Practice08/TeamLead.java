package Practice08;

public class TeamLead extends Developer {
    private Developer[] teamMembers;

    private int memberCount;

    public TeamLead(String name, double salary,
                    String programmingLanguage,
                    int maxMembers) {

        super(name, salary, programmingLanguage);

        this.teamMembers = new Developer[Math.max(0, maxMembers)];

        this.memberCount = 0;
    }

    public void addTeamMember(Developer dev) {

        if (dev != null && memberCount < teamMembers.length) {

            teamMembers[memberCount] = dev;

            memberCount++;

            System.out.println(
                    "Розробника успішно додано до команди!"
            );

        } else {

            System.out.println(
                    "Неможливо додати розробника: команда заповнена!"
            );
        }
    }

    public double getTotalTeamBudget() {

        double total = getSalary();

        for (int i = 0; i < memberCount; i++) {

            total += teamMembers[i].getSalary();
        }

        return total;
    }

    @Override
    public String toString() {

        String result = "======= TEAM LEAD =======\n";

        result += super.toString() + "\n";

        result += "Учасники команди:\n";

        for (int i = 0; i < memberCount; i++) {

            result += (i + 1) + ". " +
                    teamMembers[i] + "\n";
        }

        result += "Загальний бюджет команди: "
                + getTotalTeamBudget() + " грн";

        return result;
    }
}
