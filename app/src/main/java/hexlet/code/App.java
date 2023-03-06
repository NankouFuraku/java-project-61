package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;
class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
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
                GameGCD.GCD();
                break;
            case "5":
                GameProgression.progression();
                break;
            case "6":
                GamePrime.prime();
                break;
        }
    }
}
