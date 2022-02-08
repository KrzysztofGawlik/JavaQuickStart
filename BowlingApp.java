import java.util.*; 

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
        int maxpoints = 0;
        String winner = "Nobody win...";
        for(HashMap.Entry<String, Integer> map : players.entrySet()){
            System.out.println(map.getKey() + " = " + map.getValue());
            if(map.getValue() > maxpoints){
                winner = map.getKey();
            }
        }
        System.out.println(winner);
    }
}

public class BowlingApp {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
        sc.close();
    }
}