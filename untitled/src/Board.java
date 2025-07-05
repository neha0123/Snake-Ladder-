import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final int boardSize;
    private final Map<Integer, Integer> snakes;
    private final Map<Integer, Integer> ladders;

    Board(int boardSize, List<Snake> snakesList, List<Ladder> laddersLisr) {
        this.boardSize = boardSize;
        snakes = new HashMap<>();
        ladders = new HashMap<>();
        for (Snake snake : snakesList) {
            snakes.put(snake.getHead(), snake.getTail());
        }
        for (Ladder ladder : laddersLisr) {
            ladders.put(ladder.getStart(), ladder.getEnd());
        }
    }

    public int getBoardSize() {
        return boardSize;
    }


    public int getNextPosition(int currentPosition) {
        int newPosition = currentPosition;

        if (snakes.containsKey(currentPosition)) {
            newPosition = snakes.get(currentPosition);
        } else if (ladders.containsKey(currentPosition)) {
            newPosition = ladders.get(currentPosition);
        }
        return newPosition;
    }
}
