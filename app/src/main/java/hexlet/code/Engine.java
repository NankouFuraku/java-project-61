package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void game(String[] questions, String[] answers, String task) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(task);

        var i = 0;
        final var gameRounds = 3;

        while (i < gameRounds) {
            System.out.print("Question: ");
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();

            if (answers[i].equals(playerAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
