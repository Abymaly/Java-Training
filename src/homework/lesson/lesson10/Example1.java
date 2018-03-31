package homework.lesson.lesson10;

import Action.FSMAction;
import FSM.FSM;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example1 {
    public static void testFSM() throws IOException, SAXException, ParserConfigurationException {
        try {
            FSM f = new FSM("C:\\Users\\Ada\\Desktop\\Java Training\\resource\\config.xml", new FSMAction() {
                @Override
                public boolean action(String curState, String message, String nextState, Object args) {
                    javax.swing.JOptionPane.showMessageDialog(null, curState + ":" + message + " : " + nextState);
                    /*
                     * Here we can implement our login of how we wish to handle
                     * an action
                     */
                    return true;
                }
            });
            System.out.println(f.getCurrentState());
            f.ProcessFSM("MOVELEFT");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("MOVE");
            System.out.println(f.getCurrentState());
            f.ProcessFSM("MOVERIGHT");
            System.out.println(f.getCurrentState());
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        try {
            testFSM();
        } catch (Exception ex) {
            Logger.getLogger(Example1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}