package hexlet.code.games;

import hexlet.code.Engine;

public class GameGCD {
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
        var task = "Find the greatest common divisor of given numbers.";
        final var roundsCount = 3;
        final var maxRandomNumber = 100;

        String[] questions = new String[roundsCount];
        String[] correctAnswers = new String[roundsCount];


        for (var i = 0; i < roundsCount; i++) {
            var num1 = 1 + (int) (Math.random() * maxRandomNumber);
            var num2 = 1 + (int) (Math.random() * maxRandomNumber);

            questions[i] = "" + num1 + " " + num2;
            correctAnswers[i] = Integer.toString(getDivisor(num1, num2));
        }

        Engine.game(questions, correctAnswers, task);
    }
}
