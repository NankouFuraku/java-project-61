package hexlet.code.games;

import hexlet.code.Engine;

public class GameCalc {
    public static void calc() {
        var task = "What is the result of the expression?";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (var i = 0; i < 3; i++) {
            var operator = 1 + (int) (Math.random() * 3);
            var num1 = 1 + (int) (Math.random() * 100);
            var num2 = 1 + (int) (Math.random() * 100);

            switch (operator) {
                case 1:
                    questions[i] = "" + num1 + "+" + num2;
                    correctAnswers[i] = Integer.toString(num1 + num2);
                    break;
                case 2:
                    questions[i] = "" + num1 + "-" + num2;
                    correctAnswers[i] = Integer.toString(num1 - num2);
                    break;
                case 3:
                    questions[i] = "" + num1 + "*" + num2;
                    correctAnswers[i] = Integer.toString(num1 * num2);
                    break;
            }
        }

        Engine.game(questions, correctAnswers, task);
    }
}
