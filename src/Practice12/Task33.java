package Practice12;
import java.util.*;
public class Task33 {
    public static Set<String> mutualFriends(
            Set<String> u1, Set<String> u2) {

        Set<String> result = new HashSet<>(u1);
        result.retainAll(u2);

        return result;
    }

    public static Set<String> suggestedFriends(
            String user,
            Set<String> myFriends,
            Set<String> friendOfFriendSet) {

        Set<String> result = new HashSet<>(friendOfFriendSet);

        result.removeAll(myFriends);
        result.remove(user);

        return result;
    }

    public static int uniqueNetworkSize(List<Set<String>> allGroups) {

        Set<String> network = new HashSet<>();

        for (Set<String> group : allGroups) {
            network.addAll(group);
        }

        return network.size();
    }

    public static void main(String[] args) {

        Set<String> alexFriends = new HashSet<>(
                Arrays.asList("Maria", "Bohdan", "Olena")
        );

        Set<String> mariaFriends = new HashSet<>(
                Arrays.asList("Alex", "Bohdan", "Dmytro", "Iryna")
        );

        Set<String> bohdanFriends = new HashSet<>(
                Arrays.asList("Alex", "Maria", "Petro")
        );

        Set<String> olenaFriends = new HashSet<>(
                Arrays.asList("Alex", "Iryna", "Petro")
        );

        System.out.println("Общие друзья Alex и Maria: "
                + mutualFriends(alexFriends, mariaFriends));

        Set<String> friendsOfFriends = new HashSet<>();

        friendsOfFriends.addAll(mariaFriends);
        friendsOfFriends.addAll(bohdanFriends);
        friendsOfFriends.addAll(olenaFriends);

        System.out.println("Возможно, вы знаете:");

        System.out.println(
                suggestedFriends(
                        "Alex",
                        alexFriends,
                        friendsOfFriends
                )
        );

        List<Set<String>> groups = Arrays.asList(
                alexFriends,
                mariaFriends,
                bohdanFriends,
                olenaFriends
        );

        System.out.println("Уникальных участников сети: "
                + uniqueNetworkSize(groups));
    }
}
