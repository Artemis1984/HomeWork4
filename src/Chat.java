import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame {

    public Chat(){

        setTitle("Chat");
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JTextField textField = new JTextField();
        JButton button = new JButton("Отправить");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea.setText(textArea.getText() + "\n" + "You: " + textField.getText());

                textField.setText("");
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea.setText(textArea.getText() + "\n" + "You: " + textField.getText());

                textField.setText("");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        panel.add(textField);
        panel.add(button);
        add(scrollPane,BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        Chat chat = new Chat();
    }

}
