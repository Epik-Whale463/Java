import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main1 implements ActionListener {


    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField userPassword;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args){

        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        //username
        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText  = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // password
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        userPassword  = new JPasswordField(20);
        userPassword.setBounds(100, 50,165,25);
        panel.add(userPassword);

        //button
         button = new JButton("Login");
        button.setBounds(140,80,80,25);
        panel.add(button);
        button.addActionListener(new main1());

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String user = userText.getText();
        String password  = userPassword.getText();
        System.out.println(user + " , " + password);


    }
}
