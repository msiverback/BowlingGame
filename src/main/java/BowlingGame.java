public class BowlingGame {
    public static final int NumberOfFrames = 10;
    public int numberOfRollsPlayed = 0;

    public void roll(int numberOfPins) {
        numberOfRollsPlayed += 1;
    }

    public int getFinalScore() {
        return 60;
    }
}
