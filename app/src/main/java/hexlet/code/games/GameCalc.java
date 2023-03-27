package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameCalc {
    private static final String TASK = "What is the result of the expression?";
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static void calc() {
        final var operatorsCount = 3;

        String[][] data = new String[ROUNDS_COUNT][ROUNDS_COUNT];

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var operator = OPERATORS[Utils.generateNumber(MIN_RANDOM_NUMBER, operatorsCount - 1)];
            var num1 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var num2 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            switch (operator) {
                case '+':
                    data[0][i] = "" + num1 + " + " + num2;
                    data[1][i] = Integer.toString(num1 + num2);
                case '-':
                    data[0][i] = "" + num1 + " - " + num2;
                    data[1][i] = Integer.toString(num1 - num2);
                default:
                    data[0][i] = "" + num1 + " * " + num2;
                    data[1][i] = Integer.toString(num1 * num2);
            }
        }

        Engine.game(data, TASK);
    }
}
