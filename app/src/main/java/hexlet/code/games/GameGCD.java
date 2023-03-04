package hexlet.code.games;

import hexlet.code.Engine;

public class GameGCD {
    public static int getDivisor(int num1, int num2) {
        var divisor = Math.min(num1, num2);

        while (divisor > 0) {
            if (num1 % divisor == 0 && num2 % divisor == 0) {
                return divisor;
            }
            else {
                divisor--;
            }
        }
        return divisor;
    }
    public static void GCD() {
        var task = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (var i = 0; i < 3; i++) {
            var num1 = 1 + (int) (Math.random() * 100);
            var num2 = 1 + (int) (Math.random() * 100);

            questions[i] = "" + num1 + " " + num2;
            correctAnswers[i] = Integer.toString(getDivisor(num1, num2));
        }

        Engine.game(questions, correctAnswers, task);
    }
}
