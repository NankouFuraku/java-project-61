package hexlet.code.games;

import hexlet.code.Engine;
public class GameEven {
    public static void even() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final var gameRounds = 3;
        final var maxRandomNumber = 100;

        String[] questions = new String[gameRounds];
        String[] correctAnswers = new String[gameRounds];

        for (var i = 0; i < gameRounds; i++) {
            questions[i] = "" + (1 + (int) (Math.random() * maxRandomNumber));
            correctAnswers[i] = ((Integer.parseInt(questions[i])) % 2 == 0) ? "yes" : "no";
        }

        Engine.game(questions, correctAnswers, task);
    }
}
