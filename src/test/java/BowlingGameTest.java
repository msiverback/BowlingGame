import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    BowlingGame bowlingGame;

    @BeforeEach
    public void setup() {
        bowlingGame = new BowlingGame();
    }


    private void makeRolls(int totalNumberOfRolls, int numberOfPins) {
        for (int numberOfRolls = 0; numberOfRolls < totalNumberOfRolls; numberOfRolls++)
            bowlingGame.roll(numberOfPins);
    }

    private void makeTwentyRolls(int numberOfPins) {
        makeRolls(2 * BowlingGame.TotalNumberOfFrames, numberOfPins);
    }


    @Test
    public void TestNewGameShallBeEmpty() {
        assertEquals(0, bowlingGame.numberOfRollsPlayed);
    }

    @Test
    public void TestTwentyRollsOfOneShallGiveTwentyPoints(){
        int finalScore = 20;
        int numberOfRolls = 20;
        int numberOfPins = 1;
        makeRolls(numberOfRolls, numberOfPins);
        assertEquals(finalScore, bowlingGame.getTotalScore());
        assertEquals(2 * BowlingGame.TotalNumberOfFrames, bowlingGame.numberOfRollsPlayed);
    }
    @Test
    public void TestTwentyRollsOfThreeShallGiveSixtyPoints(){
        int finalScore = 60;
        int numberOfRolls = 20;
        int numberOfPins = 3;
        makeRolls(numberOfRolls, numberOfPins);
        assertEquals(finalScore, bowlingGame.getTotalScore());
        assertEquals(2 * BowlingGame.TotalNumberOfFrames, bowlingGame.numberOfRollsPlayed);
    }

    @Test
    public void TestTwentyOneRollsOfFiveShallGive150Points() {
        int finalScore = 150;
        int numberOfPins = 5;
        int numberOfRolls = 21;
        makeRolls(numberOfRolls, numberOfPins);
        assertEquals(finalScore, bowlingGame.getTotalScore());
        assertEquals(2 * BowlingGame.TotalNumberOfFrames + 1, bowlingGame.numberOfRollsPlayed);
    }

    @Test
    public void TestTwelveRollsOfTenShallGive300Points() {
        int finalScore = 300;
        int numberOfPins = 10;
        int numberOfRolls = 12;
        makeRolls(numberOfRolls, numberOfPins);
        assertEquals(finalScore, bowlingGame.getTotalScore());
        assertEquals(numberOfRolls, bowlingGame.numberOfRollsPlayed);
    }

}
