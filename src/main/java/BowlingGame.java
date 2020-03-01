import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    public static final int NumberOfFrames = 10;
    public int numberOfRollsPlayed = 0;

    List<Integer> scores = new ArrayList();

    public void roll(int numberOfPins) {
        numberOfRollsPlayed += 1;
        scores.add(numberOfPins);

    }

    public int getFinalScore() {
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}
