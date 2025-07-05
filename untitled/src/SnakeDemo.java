
import java.util.List;

public class SnakeDemo {
    public static void run() {
        List<Snake> snakes = List.of(new Snake(17,7),new Snake(62,19), new Snake(98,79));
        List<Ladder> ladders = List.of(new Ladder(3, 38), new Ladder(24, 33),
                new Ladder(42, 93), new Ladder(72, 84));

        Board board = new Board(100,snakes,ladders);
        List<String> players= List.of("Player1","Player2");

        Game game=new Game.Builder().setBoard(board).setPlayers(players).setDice(new Dice(1,6)).build();

game.play();
    }
}
