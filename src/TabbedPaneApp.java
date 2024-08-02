import javax.swing.*;
import java.awt.*;

public class TabbedPaneApp extends JFrame {
	public TabbedPaneApp() {
        
        setTitle("TabbedPane Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

     
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel homePanel = new JPanel();
        homePanel.add(new JLabel("Welcome to the Home Tab!"));
        tabbedPane.addTab("Home", homePanel);

    
        JPanel profilePanel = new JPanel(new GridLayout(2, 2)); 

        
        profilePanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        profilePanel.add(nameField);
        
        profilePanel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        profilePanel.add(emailField);

        tabbedPane.addTab("Profile", profilePanel);

    
        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new FlowLayout()); 

        settingsPanel.add(new JLabel("Settings Options"));
        JButton settingsButton = new JButton("Save Settings");
        settingsPanel.add(settingsButton);

        tabbedPane.addTab("Settings", settingsPanel);

        
        add(tabbedPane, BorderLayout.CENTER);

       
        setVisible(true);
    }

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(() -> new TabbedPaneApp());
    }
}
