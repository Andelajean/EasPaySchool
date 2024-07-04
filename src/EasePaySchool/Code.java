package EasePaySchool;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Code {

    private JFrame frmEasepayschool;
    private JTextField textField;
    private JPanel panel;
    private JPanel panel_1;
    private Timer timer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Code window = new Code();
                    window.frmEasepayschool.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Code() {
        initialize();
        startConnectionChecker();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmEasepayschool = new JFrame();
        frmEasepayschool.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HACKER\\eclipse-workspace\\Payschool\\src\\EasePaySchool\\IMG\\Logo Coach Sportif Nominatif Typographique Moderne Minimaliste Noir Jaune_20240611_073743_0000.png"));
        frmEasepayschool.setTitle("EasePaySchool");
        frmEasepayschool.setResizable(false);
        frmEasepayschool.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frmEasepayschool.getContentPane().setBackground(new Color(128, 0, 255));
        frmEasepayschool.getContentPane().setLayout(null);

        panel_1 = new JPanel();
        panel_1.setBackground(new Color(128, 0, 255));
        panel_1.setBounds(10, 11, 731, 397);
        frmEasepayschool.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        panel.setBackground(new Color(128, 0, 255));
        panel.setBounds(22, 11, 706, 379);
        frmEasepayschool.getContentPane().add(panel);
        panel.setLayout(null);

        textField = new JTextField();
        textField.setBounds(159, 158, 425, 40);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        textField.setColumns(10);
        panel.add(textField);

        JLabel lblEntrezVotreIdentifiant = new JLabel("Entrez votre Identifiant pour Continuer");
        lblEntrezVotreIdentifiant.setBounds(240, 100, 281, 21);
        lblEntrezVotreIdentifiant.setHorizontalAlignment(SwingConstants.CENTER);
        lblEntrezVotreIdentifiant.setForeground(Color.WHITE);
        lblEntrezVotreIdentifiant.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblEntrezVotreIdentifiant.setBackground(Color.WHITE);
        panel.add(lblEntrezVotreIdentifiant);

        JButton btnNewButton = new JButton("Chercher");
        btnNewButton.setBounds(271, 250, 205, 29);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        btnNewButton.setBackground(Color.BLACK);
        panel.add(btnNewButton);

        JLabel lblNewLabel = new JLabel("Bienvenue Dans EasePaySchool !!!");
        lblNewLabel.setBounds(235, 22, 257, 21);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel.setBackground(Color.WHITE);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HACKER\\eclipse-workspace\\Payschool\\src\\EasePaySchool\\IMG\\OIP.jfif"));
        lblNewLabel_1.setBounds(37, 22, 617, 238);
        panel_1.add(lblNewLabel_1);

        JLabel lblAucuneConnexionInternet = new JLabel("Aucune Connexion Internet! Veuillez Vous Connectez et Ressayez.");
        lblAucuneConnexionInternet.setHorizontalAlignment(SwingConstants.CENTER);
        lblAucuneConnexionInternet.setForeground(Color.WHITE);
        lblAucuneConnexionInternet.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblAucuneConnexionInternet.setBackground(Color.WHITE);
        lblAucuneConnexionInternet.setBounds(59, 286, 595, 29);
        panel_1.add(lblAucuneConnexionInternet);
        
        JButton btnNewButton_1 = new JButton("Actualiser");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		checkInternetConnection();
        	}
        	
        });
        btnNewButton_1.setBackground(new Color(0, 0, 0));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        btnNewButton_1.setBounds(222, 326, 205, 36);
        panel_1.add(btnNewButton_1);

        frmEasepayschool.setBounds(100, 100, 767, 458);
        frmEasepayschool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Start a timer to check the internet connection status periodically.
     */
    private void startConnectionChecker() {
        timer = new Timer(true);
        timer.schedule(new TimerTask() {
            public void run() {
                checkInternetConnection();
            }
        }, 0, 5000); // Check every 5 seconds
    }

    /**
     * Check internet connection and show the appropriate panel.
     */
    private void checkInternetConnection() {
        if (isConnectedToInternet()) {
            panel.setVisible(true);
            panel_1.setVisible(false);
        } else {
            panel.setVisible(false);
            panel_1.setVisible(true);
        }
    }

    /**
     * Method to check if connected to the internet.
     */
    private boolean isConnectedToInternet() {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            return address.isReachable(2000); // Timeout in milliseconds
        } catch (Exception e) {
            return false;
        }
    }
}
