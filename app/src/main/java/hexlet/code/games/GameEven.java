package hexlet.code.games;

import hexlet.code.Engine;
public class GameEven {
    public static void even() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final var gameRounds = 3;
        String[] questions = new String[gameRounds];
        String[] correctAnswers = new String[gameRounds];
        final var maxNumber = 100;

        for (var i = 0; i < gameRounds; i++) {
            questions[i] = "" + (1 + (int) (Math.random() * maxNumber));
            correctAnswers[i] = ((Integer.parseInt(questions[i])) % 2 == 0) ? "yes" : "no";
        }

        Engine.game(questions, correctAnswers, task);
    }
}
