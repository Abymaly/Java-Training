package homework.ticTacToe;

import Action.FSMAction;
import FSM.FSM;
import homework.ticTacToe.controllers.ControllerHuman;
import homework.ticTacToe.controllers.IStrategy;
import homework.ticTacToe.model.Board;
import homework.ticTacToe.views.ShowBoard;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

import static homework.ticTacToe.model.TicTac.EMPTY;
import static homework.ticTacToe.model.TicTac.TAC;
import static homework.ticTacToe.model.TicTac.TIC;

public class Main {

    public FSM getFsm() throws IOException, SAXException, ParserConfigurationException {
        String _configFileName = "resource/configFSM.xml";

        FSM fsm = new FSM(this.getClass().getClassLoader().getResourceAsStream(_configFileName), new FSMAction() {

            @Override
            public boolean action(String curState, String message, String nextState, Object args) {
//                System.out.println("Action: " + curState + ":" + message + " : " + nextState);
                return true;
            }

        });
        return fsm;
    }

    public static IStrategy playerFactory(String what) {
        if (what.equals("man")) {
            return new ControllerHuman();
        }
        return null;
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ConfigurationException {

        Board board = new Board();
        ShowBoard showBoard = new ShowBoard();

        board.addObserver(showBoard);

        File file = new File("C:\\Users\\Ada\\Desktop\\Java Training\\src\\resource\\kikConfig.properties");

        Configurations configs = new Configurations();
        Configuration config = configs.properties(file);

        IStrategy player1 = playerFactory(config.getString("player1"));
        IStrategy player2 = playerFactory(config.getString("player2"));

        Main test = new Main(); // to jest sposób na obejście statyczności main
        FSM fsm = test.getFsm();

        fsm.ProcessFSM("GO");

        for (int x = 0; x < 3; ++x) {
            for (int y = 0; y < 3; ++y) {
                board.setData(x, y, TIC);
            }
        }

        board.setData(1, 1, EMPTY);
        board.setData(2, 2, EMPTY);

        while (true) {
            switch (fsm.getCurrentState()) {
                case "P1_TURN":
                    player1.makeMove(board, TIC);
                    fsm.ProcessFSM("MOVE");
                    break;
                case "P2_TURN":
                    player2.makeMove(board, TAC);
                    fsm.ProcessFSM("MOVE");
                    break;
                case "STOP":
                    System.out.println("Game Over");
                    return;
                default:
                    System.out.println("Nie bangla, zdechło na: " + fsm.getCurrentState());
                    break;
            }
            if (!board.isMovePossible()) {
                fsm.ProcessFSM("FULL");
            }
        }
    }
}
