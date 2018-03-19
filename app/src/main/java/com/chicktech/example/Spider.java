package com.chicktech.example;

/**
 * Created by ashleychu on 3/18/18.
 */

public class Spider {
    private static int[] taps = {1,2,3};
    private static int numTaps = 0;
    private static int level = 0;
    private static final int NUM_LEVELS = 3;
    private static String[] prompts = {"Try tapping the bug once. You've got this!", "Yay! Tap the spider twice now!", "" +
            "One more time! Tap the spider three times!", "Congratulations! You worked on your fear!"};

    public static int getLevel() {
        return level;
    }

    public static int getLevelTaps() {
        return taps[level];
    }

    public static int getCurrentTaps(){
        return numTaps;
    }

    public static void updateTaps(){
        numTaps++;
    }

    public static void updateLevel(){
        level++;
        numTaps = 0;

    }

    public static int getNUM_LEVELS() {
        return NUM_LEVELS;
    }

    public static String getPrompt(){
        return prompts[level];
    }
}
