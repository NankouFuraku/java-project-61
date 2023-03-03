package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;

import java.util.Scanner;
class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        String gameOption = scanner.next();


        switch (gameOption) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                GameEven.even();
                break;
            case "3":
                GameCalc.calc();
                break;
            case "4":

                break;
            case "5":

                break;
        }
    }
}
