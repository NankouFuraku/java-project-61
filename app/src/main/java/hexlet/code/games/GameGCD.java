package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameGCD {
    private static final String TASK = "Find the greatest common divisor of given numbers.";
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
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var num1 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var num2 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            data[i][0] = "" + num1 + " " + num2;
            data[i][1] = Integer.toString(getDivisor(num1, num2));
        }

        Engine.game(data, TASK);
    }
}
