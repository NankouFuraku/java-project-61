package hexlet.code.games;

import java.util.Scanner;
public class GameEven {
    public static void even() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var i = 0;
        while (i < 3) {
            System.out.print("Question:");
            var randomNumber = 1 + (int) (Math.random() * 100);
            System.out.println(randomNumber);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();

            var correctAnswer = (randomNumber % 2 == 0) ? "yes" : "no";
            if (correctAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
