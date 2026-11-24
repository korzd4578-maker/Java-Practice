package Practice12;
import java.util.*;
public class Task11 {
    public static boolean hasAccess(
            Set<String> userPerms,
            Set<String> requiredPerms) {

        return userPerms.containsAll(requiredPerms);
    }

    public static Set<String> getMissingPermissions(
            Set<String> userPerms,
            Set<String> requiredPerms) {

        Set<String> missing = new HashSet<>(requiredPerms);
        missing.removeAll(userPerms);

        return missing;
    }

    public static void main(String[] args) {

        Set<String> userPermissions = new HashSet<>(
                Arrays.asList("READ", "WRITE", "EXPORT")
        );

        Set<String> fullAccess = new HashSet<>(
                Arrays.asList("READ", "WRITE")
        );

        Set<String> partialAccess = new HashSet<>(
                Arrays.asList("READ", "DELETE", "ADMIN")
        );

        Set<String> emptyRequirements = new HashSet<>();

        System.out.println("Полный доступ: "
                + hasAccess(userPermissions, fullAccess));

        System.out.println("Частичный доступ: "
                + hasAccess(userPermissions, partialAccess));

        System.out.println("Недостающие права: "
                + getMissingPermissions(
                userPermissions, partialAccess
        ));

        System.out.println("Пустые требования: "
                + hasAccess(userPermissions, emptyRequirements));
    }
}
