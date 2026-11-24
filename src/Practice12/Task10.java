package Practice12;
import java.util.*;
public class Task10 {
    public static double jaccardSimilarity(Set<String> a, Set<String> b) {
        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        Set<String> union = new HashSet<>(a);
        union.addAll(b);

        if (union.isEmpty()) {
            return 1.0;
        }

        return (double) intersection.size() / union.size();
    }

    public static Set<String> missingSkills(
            Set<String> candidate, Set<String> vacancy) {

        Set<String> missing = new HashSet<>(vacancy);
        missing.removeAll(candidate);

        return missing;
    }

    public static void main(String[] args) {

        Set<String> vacancy = new HashSet<>(
                Arrays.asList("Java", "SQL", "Git", "Docker", "Spring")
        );

        Set<String> candidate1 = new HashSet<>(
                Arrays.asList("Java", "SQL", "Git", "Python")
        );

        Set<String> candidate2 = new HashSet<>(
                Arrays.asList("Java", "Docker", "Spring", "Git")
        );

        Set<String> candidate3 = new HashSet<>(
                Arrays.asList("Python", "SQL")
        );

        Set<String>[] candidates = new Set[]{
                candidate1, candidate2, candidate3
        };

        for (int i = 0; i < candidates.length; i++) {

            double similarity = jaccardSimilarity(
                    candidates[i], vacancy
            );

            System.out.printf(
                    "Кандидат %d: %.2f%%\n",
                    i + 1, similarity * 100
            );

            System.out.println("Недостающие навыки: "
                    + missingSkills(candidates[i], vacancy));

            System.out.println();
        }
    }
}
