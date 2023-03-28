package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameEven {
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    public static boolean isEven(int number) {
        if (number < 2) {
            return false;
        }
        return number % 2 == 0;
    }
    public static void even() {
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var randomNumber = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            data[i][0] = Integer.toString(randomNumber);
            data[i][1] = isEven(randomNumber) ? "yes" : "no";
        }

        Engine.game(data, TASK);
    }
}
