package homework.ticTacToe.controllers;

import homework.ticTacToe.model.Board;
import homework.ticTacToe.model.TicTac;

public interface IStrategy {
    boolean makeMove(Board board, TicTac ticTac);
}
