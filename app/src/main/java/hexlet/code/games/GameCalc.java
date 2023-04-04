package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameCalc {
    private static final String TASK = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static int calculate(int number1, int number2, char operator) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new Error("Unknown operator: " + operator);
        }
    }

    public static void calc() {
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var operator = OPERATORS[Utils.generateNumber(MIN_RANDOM_NUMBER - 1, OPERATORS.length - 1)];
            var num1 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            var num2 = Utils.generateNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            data[i][0] = "" + num1 + " " + operator + " " + num2;
            data[i][1] = Integer.toString(calculate(num1, num2, operator));
        }

        Engine.game(data, TASK);
    }
}
