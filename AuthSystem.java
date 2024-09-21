import java.awt.*;
import java.awt.event.*;

public class AuthSystem extends Frame implements ActionListener {
    // Components of the GUI
    private Label userLabel;
    private Label passLabel;
    private TextField userText;
    private TextField passText;
    private Button loginButton;
    private Label messageLabel;

    public AuthSystem() {
        // Create GUI components
        userLabel = new Label("Username:");
        passLabel = new Label("Password:");
        userText = new TextField();
        passText = new TextField();
        passText.setEchoChar('*'); // Hide password input
        loginButton = new Button("Login");
        messageLabel = new Label("");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(userLabel);
        add(userText);
        add(passLabel);
        add(passText);
        add(loginButton);
        add(messageLabel);

        // Add action listener to the button
        loginButton.addActionListener(this);

        // Frame settings
        setTitle("Authentication System");
        setSize(300, 200);
        setVisible(true);
        
        // Close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passText.getText();

        // Simple authentication check
        if ("admin".equals(username) && "password123".equals(password)) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid credentials, try again.");
        }

        // Clear input fields
        userText.setText("");
        passText.setText("");
    }

    public static void main(String[] args) {
        new AuthSystem();
    }
}
