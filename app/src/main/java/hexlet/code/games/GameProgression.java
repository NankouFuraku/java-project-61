package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameProgression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int ROUNDS_COUNT = 3;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_STEP = 5;
    private static final int MIN_RANDOM_NUMBER = 1;

    public static String[] generateProgression(int firstStep, int nextStep) {
        String[] numbers = new String[PROGRESSION_LENGTH];

        for (var i = 0; i < PROGRESSION_LENGTH; i++) {
            numbers[i] = Integer.toString(firstStep + i * nextStep);
        }
        return numbers;
    }
    public static void progression() {
        String[][] data = new String[ROUNDS_COUNT][ROUNDS_COUNT];

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var firstStep = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_STEP);
            var nextStep = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_STEP);

            var progression = generateProgression(firstStep, nextStep);

            var replacementIndex = Utils.generateNumber(1, PROGRESSION_LENGTH - 1);
            data[1][i] = progression[replacementIndex];

            progression[replacementIndex] = "..";
            data[0][i] = String.join(" ", progression);
        }

        Engine.game(data, TASK);
    }
}
