import java.util.ArrayList;

class Player {
    String name;
    int points;

    Player(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return name + " - " + points + " pts";
    }
}

public class SelectionSort {

    public static ArrayList<Player> selectionSortByPoints(ArrayList<Player> players) {
        ArrayList<Player> tempArr = new ArrayList<>(players); //
        ArrayList<Player> sortedArr = new ArrayList<>();

        while (!tempArr.isEmpty()) {
            int highestScoreIndex = 0;

            for(int i = 0; i < tempArr.size(); i++) {
                if(tempArr.get(i).points >  tempArr.get(highestScoreIndex).points){
                    highestScoreIndex = i;
                }

            }
            sortedArr.add(tempArr.remove(highestScoreIndex));
        }
        return sortedArr;
    }


    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("LeBron James", 1894));
        players.add(new Player("Stephen Curry", 2101));
        players.add(new Player("Giannis Antetokounmpo", 2234));
        players.add(new Player("Kevin Durant", 1995));

        System.out.println("🏀 Original list:");
        for(int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i).toString());
        }

        System.out.println("\n🏆 Sorted by Points (Selection Sort algorithm):");

        ArrayList<Player> sortedPlayers = selectionSortByPoints(players);
        for(int i = 0; i < sortedPlayers.size(); i++) {
            System.out.println(sortedPlayers.get(i).toString());
        }
    }
}
