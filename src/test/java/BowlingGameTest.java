import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    @Test
    public void TestNewGameShallBeEmpty() {
        BowlingGame bowlingGame = new BowlingGame();
        assertEquals(bowlingGame.numberOfRollsPlayed, 0);
    }

    @Test
    public void TestARollShallUpdateNumberOfRolls() {
        BowlingGame bowlingGame = new BowlingGame();
        int numberOfPine = 3;
        bowlingGame.roll(numberOfPine);
        assertEquals(bowlingGame.numberOfRollsPlayed, 1);

    }

}
