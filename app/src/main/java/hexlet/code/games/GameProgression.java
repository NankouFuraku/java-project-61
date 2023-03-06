package hexlet.code.games;

import hexlet.code.Engine;

public class GameProgression {
    public static void generateProgression(String[] numbers) {
        var nextStep = 1 + (int) (Math.random() * 5);
        var stepSize = 1 + (int) (Math.random() * 5);
        numbers[0] = Integer.toString(nextStep);

        for (var i = 1; i < 10; i++) {
            nextStep = nextStep + stepSize;
            numbers[i] = Integer.toString(nextStep);
        }
    }
    public static void progression() {
        var task = "What number is missing in the progression?";
        String[] questions = new String[3];
        String[] correctAnswers = new String[3];

        for (var i = 0; i < 3; i++) {
            String[] numbers = new String[10];
            generateProgression(numbers);

            var replacementIndex = 1 + (int) (Math.random() * 9);
            correctAnswers[i] = numbers[replacementIndex];
            numbers[replacementIndex] = "..";

            var result = "";
            for (var counter = 0; counter < 10; counter++) {
                result = result + numbers[counter] + " ";
            }
            questions[i] = result;
        }

        Engine.game(questions, correctAnswers, task);
    }
}
