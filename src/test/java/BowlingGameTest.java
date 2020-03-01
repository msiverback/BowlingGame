import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    BowlingGame bowlingGame;

    @BeforeEach
    public void setup() {
        bowlingGame = new BowlingGame();
    }


    private void makeTwentyRolls(int numberOfPins) {
        for (int numberOfRolls = 0; numberOfRolls < 2 * BowlingGame.NumberOfFrames; numberOfRolls++)
            bowlingGame.roll(numberOfPins);
    }


    @Test
    public void TestNewGameShallBeEmpty() {
        assertEquals(0, bowlingGame.numberOfRollsPlayed);
    }

    @Test
    public void TestTwentyRollsOfOneShallGiveTwentyPoints(){
        int finalScore = 20;
        int numberOfPins = 1;
        makeTwentyRolls(numberOfPins);
        assertEquals(finalScore, bowlingGame.getFinalScore());
        assertEquals(2 * BowlingGame.NumberOfFrames, bowlingGame.numberOfRollsPlayed);
    }
    @Test
    public void TestTwentyRollsOfThreeShallGiveSixtyPoints(){
        int finalScore = 60;
        int numberOfPins = 3;
        makeTwentyRolls(numberOfPins);
        assertEquals(finalScore, bowlingGame.getFinalScore());
        assertEquals(2 * BowlingGame.NumberOfFrames, bowlingGame.numberOfRollsPlayed);
    }

    @Disabled("Disabled until two separeate scores can be handled")
    public void TestTwentyOneRollsOfFiveShallGive150Points() {
        int finalScore = 150;
        int numberOfPins = 5;
        makeTwentyRolls(numberOfPins);
        bowlingGame.roll(5);
        assertEquals(finalScore, bowlingGame.getFinalScore());
        assertEquals(2 * BowlingGame.NumberOfFrames + 1, bowlingGame.numberOfRollsPlayed);
    }

}
