package ticTacToe.model;

import java.util.Arrays;
import java.util.Observable;

public class Board extends Observable {
    private final int dim;
    private TicTac [][] data;

    public Board() {
        this.dim = 3;           // w zasadzie może być też dim = 3, ale jeśli kiedyś dojdzie parametr w konstruktorze to w przypadku this dalej będzie działać;
        this.data = new TicTac[getDim()][getDim()];
        reset();
    }

    public void reset() {
        for (TicTac[] row : data) {
            Arrays.fill(row, TicTac.EMPTY);     // tutaj jest użycie metody klasy Arrays: wypełniamy rząd tablicy
            setChanged();
            notifyObservers();
            }
        }

    public int getDim() {
        return dim;
    }

    public TicTac[][] getData() {
        return data;
    }

    public TicTac getData(int x, int y) {
        return data[x][y];
    }

    public void setData(int x, int y, TicTac val) {
        this.data[x][y] = val;
        setChanged();       // ifnormacja, że się zmieniłem
        notifyObservers();  // wysłanie informacji do widoku
}
}