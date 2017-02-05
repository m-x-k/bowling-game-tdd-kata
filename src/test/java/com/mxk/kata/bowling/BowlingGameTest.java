package com.mxk.kata.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    private BowlingGame g;

    @Before
    public void setup() throws Exception {
        g = new BowlingGame();
    }

    @Test
    public void testGutterGame() throws Exception {
        for (int i=0; i<20; i++) {
            g.roll(0);
        }
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() throws Exception {
        for (int i = 0; i < 20; i++) {
            g.roll(1);
        }
        assertEquals(20, g.score());
    }
}