package homework.ticTacToe.controllers;

import homework.ticTacToe.model.Board;
import homework.ticTacToe.model.TicTac;

import java.util.Scanner;

public class ControllerHuman implements IStrategy {

    @Override
    public boolean makeMove(Board board, TicTac playerSymbol) {
        System.out.println("Grasz: " + playerSymbol);

        int row = 0;
        int col = 0;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wiersz?");
                row = scanner.nextInt();
                System.out.println("Kolumna?");
                col = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Nie bangla.");
            }
            if (board.getData(row, col) == TicTac.EMPTY) {
                board.setData(row, col, playerSymbol);
                return true;
            }
        }
    }
}
