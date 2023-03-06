package hexlet.code.games;

import hexlet.code.Engine;

public class GamePrime {
    public static String isPrime(int number) {
        for (var i = 2; i <= number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void prime() {
        var task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (var i =0; i < 3; i++) {
            var randomNumber = 1 + (int) (Math.random() * 100);
            questions[i] = "" + (randomNumber);
            correctAnswers[i] = isPrime(randomNumber);
        }

        Engine.game(questions, correctAnswers, task);
    }
}
