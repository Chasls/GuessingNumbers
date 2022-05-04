package com.guessinggame.guessing;

import com.guessinggame.GuessingGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingBuildTest {

    private static final int NUMBER = 55;
    private final GuessingGame game = new GuessingGame();


    @Test
    public void testTooHigh() {
        assertEquals(GuessingGame.class, game.equals(NUMBER + 1));
    }

    @Test
    public void testTooLow() {
        assertEquals(GuessingGame.class, game.equals(NUMBER - 1));
    }

   
    @Test
    public void testWin() {
        assertEquals(GuessingGame.class, game);
    }

}