package homework.ticTacToe;

public class Model {

    final int size = 3;
    int x = 0;
    int y = 0;
    enum XO {TIC, TAC, EMPTY};

    XO[][] board;

    boolean isEmpty (int x, int y) {
        // TODO
        return false;
    }

    void setBoard (int x, int y, XO board) {
        // TODO
    }

    void getBoard (int x, int y, XO board) {
        // TODO
    }

    XO[][] whoIsWinner(){
        // TODO
        return null;
    }

    boolean isPlaying() {
        // TODO
        return false;
    }

    void nextOne() {
        // TODO
    }

    void changed() {
        // TODO
    }

    void reset () {
        // TODO
    }

}
