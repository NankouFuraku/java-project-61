package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void game(String[][] data, String task) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(task);

        var i = 0;

        while (i < ROUNDS_COUNT) {
            System.out.print("Question: ");
            System.out.println(data[0][i]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();

            if (data[1][i].equals(playerAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + data[1][i] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
