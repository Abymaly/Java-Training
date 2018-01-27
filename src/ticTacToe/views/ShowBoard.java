package ticTacToe.views;

import ticTacToe.model.Board;
import ticTacToe.model.TicTac;

import java.util.Observable;
import java.util.Observer;

public class ShowBoard implements Observer {

    public String boardToString(Board board) {
        StringBuilder result = new StringBuilder();
        TicTac[][] data = board.getData();
        for (TicTac[] row : data) {
            result
                    .append("\n")
                    .append("---+---+---")
                    .append("\n ");
            for (TicTac field : row) {
                result
                        .append("")
                        .append(field.getMark())
                        .append(" | ");
            }
        }
        return result.toString();
    }

    public void show(Board board) {
        System.out.println(boardToString(board));
    }

    @Override
    public void update(Observable observable /* kto przysłał */, Object o /* co przysłał */) {
     //   if (!(observable instanceof Board)) {   // to jest zabezpieczenie przed tym czy od dobregu modelu przychodzą informacje
      //      return;
      //  }
        Board board = (Board) observable;   // to jest cast (rzut); wiemy, że observable tak naprawdę jest board
        show(board);                        // model wysyła informację, że coś się zmieniło, widok pobiera wszystkie dane i rysuje od nowa
    }
}