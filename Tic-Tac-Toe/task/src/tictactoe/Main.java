package tictactoe;

public class Main {
    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 3; i++) {
            System.out.print("O");
            for (int j = 0; j < 2; j ++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
