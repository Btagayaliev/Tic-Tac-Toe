package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter cells:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        printDashes();
        printBody(input);
        printDashes();
    }

    public static void printDashes() {
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
    }

    public static void printBody(String string) {
            System.out.print(
                    "\n| " + string.charAt(0) + " " +
                    string.charAt(1) + " " +
                    string.charAt(2) + " |\n" +
                    "| " + string.charAt(3) + " " +
                    string.charAt(4) + " " +
                    string.charAt(5) + " |\n" +
                    "| " + string.charAt(6) + " " +
                    string.charAt(7) + " " +
                    string.charAt(8) + " |\n"
                    );
    }
}
