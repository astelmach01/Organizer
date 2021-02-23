import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class Organizer {
    static List<String> userInput;
    public static void main(String[] args) {
        Ask ask = new Ask();
        JFrame frame = new JFrame("Organizer");
        frame.setContentPane(ask.contentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {

                userInput = ask.getUserInput();
                System.out.println(userInput.toString());
            }
        });
    }

    // TODO: ask user what they want to do in the day
    // TODO: create list of tasks
    // TODO: dynamically update list based on times entered
    // TODO: send desktop notifications
    // TODO: update list depending on what user clicked on notif
    // TODO: add personal schedule of classes so the scheduler works around it

}
