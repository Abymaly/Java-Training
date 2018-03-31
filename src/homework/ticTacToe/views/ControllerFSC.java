package homework.ticTacToe.views;

import Action.FSMAction;
import FSM.FSM;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerFSC {

    private String _configFileName = "resource/configFSC.xml";

    @Test
    public void testFSM() throws org.xml.sax.SAXException {
        try {
            FSM f = new FSM(this.getClass().getClassLoader().getResourceAsStream(_configFileName), new FSMAction() {

                @Override
                public boolean action(String curState, String message, String nextState, Object args) {
                    System.out.println("Action: " + curState + ":" + message + " : " + nextState);
                    return true;
                }
            });

            f.setAction("START", "MOVELEFT", new FSMAction() {

                @Override
                public boolean action(String curState, String message, String nextState, Object args) {
                    System.out.println("Customized moveLeft!");
                    return true;
                }
            });

            System.out.println(f.getCurrentState());
            f.ProcessFSM("GO");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("MOVE");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("MOVE");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("MOVE");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("FULL");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("RESTART");

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(homework.lesson.lesson10.Example4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(homework.lesson.lesson10.Example4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}