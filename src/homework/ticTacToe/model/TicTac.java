package homework.ticTacToe.model;

public enum TicTac {
    TIC ("X"),
    TAC ("O"),
    EMPTY (" ");

    private String mark;

    TicTac(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
}
