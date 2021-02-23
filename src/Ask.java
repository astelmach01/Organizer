import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.List;


public class Ask {
  private JButton submitButton;
  private JPanel panelMain;
  private JTextField textField;
  private List<String> userInput;


  public Ask() {
    textField.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);

        if (textField.getText().equals("Enter your tasks...")) textField.setText("");


      }
    });
    submitButton.addActionListener(e -> {
              userInput = Arrays.asList(textField.getText().split(","));
    });



  }

  public JPanel contentPane() {
    return this.panelMain;
  }

  public List<String> getUserInput() {
    return userInput;
  }
}
