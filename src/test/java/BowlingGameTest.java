import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    BowlingGame bowlingGame;

    @BeforeEach
    public void setup() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void TestNewGameShallBeEmpty() {
        assertEquals(0, bowlingGame.numberOfRollsPlayed);
    }


    @Test
    public void TestTwentyRollsOfThreeShallGiveSixtyPoints(){
        int finalScore = 60;
        for (int numberOfRolls = 0; numberOfRolls < 2 * BowlingGame.NumberOfFrames; numberOfRolls++){
            bowlingGame.roll(3);
        }
        assertEquals(finalScore, bowlingGame.getFinalScore());
        assertEquals(2 * BowlingGame.NumberOfFrames, bowlingGame.numberOfRollsPlayed);
    }

}
