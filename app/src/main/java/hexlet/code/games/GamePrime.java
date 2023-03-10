package hexlet.code.games;

import hexlet.code.Engine;

public class GamePrime {
    public static String isPrime(int number) {
        if (number < 2) {
            return "no";
        }
        for (var i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void prime() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final var roundsCount = 3;
        final var maxRandomNumber = 100;

        String[] questions = new String[roundsCount];
        String[] correctAnswers = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            var randomNumber = 1 + (int) (Math.random() * maxRandomNumber);
            questions[i] = "" + randomNumber;
            correctAnswers[i] = isPrime(randomNumber);
        }

        Engine.game(questions, correctAnswers, task);
    }
}
