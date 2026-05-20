// WAP to demostrating Leaderboard 

// Player class

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Player {

    // Unique player id
    int id;

    // Player name
    String name;

    // Player score
    int score;

    // Constructor
    public Player(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // toString for printing player
    @Override
    public String toString() {
        return this.name + " : " + this.score;
    }
}

public class LeaderboardExample {

    // add Player
    public static void addPlayer(Map<Integer,Player> map, TreeSet<Player> set, Player player) {

        // put into HashMap
        map.put(player.id, player);

        // put into TreeSet
        set.add(player);

    }

    // Update score
    public static void updateScore(Map<Integer,Player> map, TreeSet<Player> set, int playerId, int newScore) {

        // Get Player
        Player player = map.get(playerId);

        // Remove old entry
        set.remove(player);

        // Update score
        player.score = newScore;

        // Reinsert for corrent sorting
        set.add(player);
    }

    public static void main(String[] args) {
        // Fast player lookup 
        Map<Integer, Player> playerMap = new HashMap<>();

        // Sorted leaderboard
        TreeSet<Player> leaderboard = new TreeSet<>((a,b) -> {

            // Descending score sorting
            if (b.score != a.score) {
                return b.score - a.score;
            }

            // if same score , compare id
            return a.id - b.id;

        });

        // add Player
        addPlayer(playerMap, leaderboard, new Player(1, "Rahul", 950));
        addPlayer(playerMap, leaderboard, new Player(2, "Amit",990));
        addPlayer(playerMap, leaderboard, new Player(3, "John",970));

        // Print leaderboard
        System.out.println(leaderboard);

        // Update score
        updateScore(playerMap, leaderboard, 1, 1000);

        System.out.println("After update :");

        System.out.println(leaderboard);
        
    }
}
