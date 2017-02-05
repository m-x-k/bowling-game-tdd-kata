package com.mxk.kata.bowling;

public class BowlingGame {

    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameindex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[frameindex] == 10)  // strike
            {
                score += 10 + rolls[frameindex + 1] + rolls[frameindex + 2];
                frameindex++;
            }
            else if (isSpare(frameindex))  // spare
            {
                score += 10 + rolls[frameindex + 2];
                frameindex += 2;
            } else {
                score += rolls[frameindex] + rolls[frameindex + 1];
                frameindex += 2;
            }
        }
        return score;
    }

    private boolean isSpare(int frameindex) {
        return rolls[frameindex] + rolls[frameindex + 1] == 10;
    }
}
