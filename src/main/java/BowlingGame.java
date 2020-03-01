import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    public static final int TotalNumberOfFrames = 10;
    public static final int SpareScore = 10;
    public static final int StrikeScore = 10;
    public int numberOfRollsPlayed = 0;

    List<Integer> scores = new ArrayList();

    public void roll(int numberOfPins) {
        numberOfRollsPlayed += 1;
        scores.add(numberOfPins);

    }

    public int getTotalScore() {
        int totalScore = 0;
        for (int numberOfFrames = 0; numberOfFrames < TotalNumberOfFrames; numberOfFrames++) {
            totalScore +=  getFrameScore();
        }
        return totalScore;
    }

    private int getFrameScore() {
        int frameScore = scores.remove(0);
        if (frameScore == StrikeScore)
        {
            frameScore += getStrikeBonus();
        }
        else {
            frameScore += scores.remove(0);
            if (frameScore == SpareScore) {
                frameScore += getSpareBonus();
            }
        }
        return frameScore;
    }

    private Integer getSpareBonus() {
        return scores.get(0);
    }

    private int getStrikeBonus() {
        return scores.get(0) + scores.get(1);
    }
}
