package hexlet.code.games;

import hexlet.code.Engine;

public class GameCalc {
    public static void calc() {
        var task = "What is the result of the expression?";
        final var gameRounds = 3;
        String[] questions = new String[gameRounds];
        String[] correctAnswers = new String[gameRounds];

        for (var i = 0; i < gameRounds; i++) {
            final var maxNumber = 100;
            final var numberOfOperators = 3;
            var operator = 1 + (int) (Math.random() * numberOfOperators);
            var num1 = 1 + (int) (Math.random() * maxNumber);
            var num2 = 1 + (int) (Math.random() * maxNumber);

            if (operator == 1) {
                questions[i] = "" + num1 + " + " + num2;
                correctAnswers[i] = Integer.toString(num1 + num2);
            }
            if (operator == 2) {
                questions[i] = "" + num1 + " - " + num2;
                correctAnswers[i] = Integer.toString(num1 - num2);
            } else {
                questions[i] = "" + num1 + " * " + num2;
                correctAnswers[i] = Integer.toString(num1 * num2);
            }
        }

        Engine.game(questions, correctAnswers, task);
    }
}
