package hexlet.code.games;

import hexlet.code.Engine;

public class GameCalc {
    public static void calc() {
        var task = "What is the result of the expression?";
        final var roundsCount = 3;
        final var maxRandomNumber = 100;
        final var operatorsCount = 3;

        String[] questions = new String[roundsCount];
        String[] correctAnswers = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            var operator = 1 + (int) (Math.random() * operatorsCount);
            var num1 = 1 + (int) (Math.random() * maxRandomNumber);
            var num2 = 1 + (int) (Math.random() * maxRandomNumber);

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
