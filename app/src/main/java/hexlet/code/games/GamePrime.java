package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GamePrime {
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (var i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void prime() {
        String[][] data = new String[ROUNDS_COUNT][ROUNDS_COUNT];

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var randomNumber = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            data[0][i] = "" + randomNumber;
            data[1][i] = isPrime(randomNumber) ? "yes" : "no";
        }

        Engine.game(data, TASK);
    }
}
