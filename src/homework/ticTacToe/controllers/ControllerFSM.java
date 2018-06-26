package homework.ticTacToe.controllers;

import Action.FSMAction;
import FSM.FSM;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerFSM {

    private String _configFileName = "resource/configFSM.xml";

    @Test
    public void testFSM() throws org.xml.sax.SAXException {
        try {
            FSM fsm = new FSM(this.getClass().getClassLoader().getResourceAsStream(_configFileName), new FSMAction() {

                @Override
                public boolean action(String curState, String message, String nextState, Object args) {
                    System.out.println("Action: " + curState + ":" + message + " : " + nextState);
                    return true;
                }
            });

            fsm.setAction("START", "MOVELEFT", new FSMAction() {

                @Override
                public boolean action(String curState, String message, String nextState, Object args) {
                    System.out.println("Customized moveLeft!");
                    return true;
                }
            });

            System.out.println(fsm.getCurrentState());
            fsm.ProcessFSM("GO");
            System.out.println(fsm.getCurrentState());
            fsm.ProcessFSM("MOVE");
            System.out.println(fsm.getCurrentState());
            fsm.ProcessFSM("MOVE");
            System.out.println(fsm.getCurrentState());
            fsm.ProcessFSM("MOVE");
            System.out.println(fsm.getCurrentState());
            fsm.ProcessFSM("FULL");
            System.out.println(fsm.getCurrentState());
            fsm.ProcessFSM("RESTART");

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(homework.lesson.lesson10.Example4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(homework.lesson.lesson10.Example4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}