import javax.swing.*;

public class Organizer {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Organizer");
        frame.setContentPane(new Ask().contentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    // TODO: ask user what they want to do in the day
    // TODO: create list of tasks
    // TODO: dynamically update list based on times entered
    // TODO: send desktop notifications
    // TODO: update list depending on what user clicked on notif
    // TODO: add personal schedule of classes so the scheduler works around it

}
