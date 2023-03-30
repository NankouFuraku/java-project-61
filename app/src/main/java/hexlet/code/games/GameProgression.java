package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameProgression {
    private static final String TASK = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_STEP = 5;
    private static final int MIN_RANDOM_NUMBER = 1;

    public static String[] generateProgression(int firstStep, int nextStep, int length) {
        String[] numbers = new String[length];

        for (var i = 0; i < length; i++) {
            numbers[i] = Integer.toString(firstStep + i * nextStep);
        }
        return numbers;
    }

    public static void progression() {
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstStep = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_STEP);
            var nextStep = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_STEP);

            var progression = generateProgression(firstStep, nextStep, PROGRESSION_LENGTH);

            var replacementIndex = Utils.generateNumber(1, PROGRESSION_LENGTH - 1);
            data[i][1] = progression[replacementIndex];

            progression[replacementIndex] = "..";
            data[i][0] = String.join(" ", progression);
        }

        Engine.game(data, TASK);
    }
}
