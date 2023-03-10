package hexlet.code.games;

import hexlet.code.Engine;

public class GameProgression {
    public static void generateProgression(String[] numbers) {
        final var maxStep = 5;
        final var progressionLength = 10;
        var nextStep = 1 + (int) (Math.random() * maxStep);
        var stepSize = 1 + (int) (Math.random() * maxStep);

        numbers[0] = Integer.toString(nextStep);

        for (var i = 1; i < progressionLength; i++) {
            nextStep = nextStep + stepSize;
            numbers[i] = Integer.toString(nextStep);
        }
    }
    public static void progression() {
        var task = "What number is missing in the progression?";
        final var roundsCount = 3;
        final var progressionLength = 10;

        String[] questions = new String[roundsCount];
        String[] correctAnswers = new String[roundsCount];

        for (var i = 0; i < roundsCount; i++) {
            String[] numbers = new String[progressionLength];
            generateProgression(numbers);

            var replacementIndex = 1 + (int) (Math.random() * (progressionLength - 1));
            correctAnswers[i] = numbers[replacementIndex];
            numbers[replacementIndex] = "..";

            var result = "";
            for (var counter = 0; counter < progressionLength; counter++) {
                result = result + numbers[counter] + " ";
            }
            questions[i] = result;
        }

        Engine.game(questions, correctAnswers, task);
    }
}
