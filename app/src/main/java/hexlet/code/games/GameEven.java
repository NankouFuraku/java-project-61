package hexlet.code.games;

import hexlet.code.Engine;
public class GameEven {
    public static void even() {
        var task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (var i = 0; i < 3; i++) {
            questions[i] = "" + (1 + (int) (Math.random() * 100));
            correctAnswers[i] = ((Integer.parseInt(questions[i])) % 2 == 0) ? "yes" : "no";
        }

        Engine.game(questions, correctAnswers, task);
    }
}
