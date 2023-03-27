package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameEven {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    public static void even() {
        String[][] data = new String[ROUNDS_COUNT][ROUNDS_COUNT];

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            data[0][i] = "" + Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            data[1][i] = ((Integer.parseInt(data[0][i])) % 2 == 0) ? "yes" : "no";
        }

        Engine.game(data, TASK);
    }
}
