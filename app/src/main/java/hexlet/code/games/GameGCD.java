package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameGCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    public static int getDivisor(int num1, int num2) {
        var divisor = Math.min(num1, num2);

        while (divisor > 0) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                return divisor;
            } else {
                divisor--;
            }
        }
        return divisor;
    }
    public static void gcd() {
        String[][] data = new String[ROUNDS_COUNT][ROUNDS_COUNT];

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var num1 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var num2 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            data[0][i] = "" + num1 + " " + num2;
            data[1][i] = Integer.toString(getDivisor(num1, num2));
        }

        Engine.game(data, TASK);
    }
}
