import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwingKeyboardListener extends JFrame {
    public SwingKeyboardListener() {
        setTitle("Swing Keyboard Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        // Create a label to display the key pressed
        JLabel keyPressedLabel = new JLabel("Interact with Keyboard by Pressing any key");
        contentPane.add(keyPressedLabel);

        // Add a key listener to the content pane
        contentPane.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Ignore this event
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Update the label with the key that was pressed
                keyPressedLabel.setText("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Ignore this event
            }
        });

        // Make the content pane focusable so it can receive keyboard events
        contentPane.setFocusable(true);
        contentPane.requestFocus();

        setContentPane(contentPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SwingKeyboardListener().setVisible(true);
        });
    }
}