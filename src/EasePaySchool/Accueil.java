package EasePaySchool;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.net.InetAddress;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Accueil extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 
	 
	/**
	 * Create the frame.
	 */
	public Accueil() {
		
	   

		setResizable(false);
		setBackground(new Color(128, 0, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HACKER\\eclipse-workspace\\Payschool\\src\\EasePaySchool\\IMG\\Logo Coach Sportif Nominatif Typographique Moderne Minimaliste Noir Jaune_20240611_073743_0000.png"));
		setTitle("EasePaySchool");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(130, 130, 1200, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenue!!");
		lblNewLabel.setBounds(399, 5, 461, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblSuivezLaSolvabilit = new JLabel("Suivez La Solvabilité de Vos Elèves / Etudiants ici !!!");
		lblSuivezLaSolvabilit.setBounds(516, 33, 397, 30);
		lblSuivezLaSolvabilit.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuivezLaSolvabilit.setForeground(Color.WHITE);
		lblSuivezLaSolvabilit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contentPane.add(lblSuivezLaSolvabilit);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 0, 0)));
		panel.setBounds(5, 5, 300, 600);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nomu = new JLabel("Bienvenue!!");
		nomu.setBackground(new Color(0, 0, 0));
		nomu.setBounds(10, 11, 280, 30);
		panel.add(nomu);
		nomu.setForeground(new Color(0, 0, 0));
		nomu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JLabel lblListeDeTous = new JLabel("Liste de tous les Elèves /  Etudiants");
		lblListeDeTous.setForeground(Color.BLACK);
		lblListeDeTous.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblListeDeTous.setBackground(Color.BLACK);
		lblListeDeTous.setBounds(10, 98, 280, 30);
		panel.add(lblListeDeTous);
		
		JButton btnNewButton = new JButton("Afficher");
		btnNewButton.setBackground(new Color(128, 0, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(47, 139, 205, 39);
		panel.add(btnNewButton);
		
		JLabel lblListeParClasse = new JLabel("Liste Par Classe");
		lblListeParClasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeParClasse.setForeground(Color.BLACK);
		lblListeParClasse.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblListeParClasse.setBackground(Color.BLACK);
		lblListeParClasse.setBounds(10, 190, 280, 30);
		panel.add(lblListeParClasse);
		
		JLabel lblListeParNiveau = new JLabel("Liste Par Niveau");
		lblListeParNiveau.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeParNiveau.setForeground(Color.BLACK);
		lblListeParNiveau.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblListeParNiveau.setBackground(Color.BLACK);
		lblListeParNiveau.setBounds(10, 330, 280, 30);
		panel.add(lblListeParNiveau);
		
		JButton btnNewButton_2 = new JButton("Afficher");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBackground(new Color(128, 0, 255));
		btnNewButton_2.setBounds(47, 410, 205, 39);
		panel.add(btnNewButton_2);
		
		JLabel lblListeParBanque = new JLabel("Liste Par Banque");
		lblListeParBanque.setHorizontalAlignment(SwingConstants.CENTER);
		lblListeParBanque.setForeground(Color.BLACK);
		lblListeParBanque.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblListeParBanque.setBackground(Color.BLACK);
		lblListeParBanque.setBounds(10, 480, 280, 30);
		panel.add(lblListeParBanque);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(170, 231, 100, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEntrezLaClasse = new JLabel("Entrez la Classe\r\n");
		lblEntrezLaClasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrezLaClasse.setForeground(Color.BLACK);
		lblEntrezLaClasse.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEntrezLaClasse.setBackground(Color.BLACK);
		lblEntrezLaClasse.setBounds(0, 231, 150, 30);
		panel.add(lblEntrezLaClasse);
		
		JButton btnNewButton_1 = new JButton("Afficher");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(128, 0, 255));
		btnNewButton_1.setBounds(47, 272, 205, 39);
		panel.add(btnNewButton_1);
		
		JLabel lblEntrezLaClasse_1 = new JLabel("Entrez la Classe\r\n");
		lblEntrezLaClasse_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrezLaClasse_1.setForeground(Color.BLACK);
		lblEntrezLaClasse_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEntrezLaClasse_1.setBackground(Color.BLACK);
		lblEntrezLaClasse_1.setBounds(20, 370, 150, 30);
		panel.add(lblEntrezLaClasse_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(170, 365, 100, 30);
		panel.add(textField_1);
		
		JLabel lblEntrezLaClasse_1_1 = new JLabel("Choisir L Banque\r\n");
		lblEntrezLaClasse_1_1.setForeground(Color.BLACK);
		lblEntrezLaClasse_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEntrezLaClasse_1_1.setBackground(Color.BLACK);
		lblEntrezLaClasse_1_1.setBounds(5, 521, 130, 30);
		panel.add(lblEntrezLaClasse_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choisir", "Afriland First Bank", "CCA", "UBA", "SCB", "SGBC", "EcoBank", "Commercial Bank", "Atlantic Bank", "Vision Finance", "Express Union", "BGFI Bank", "Bange Bank"}));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(new Color(128, 0, 255));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox.setBounds(140, 527, 150, 35);
		panel.add(comboBox);
		
		JButton btnNewButton_2_1 = new JButton("Imprimer");
		btnNewButton_2_1.setForeground(new Color(128, 0, 255));
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2_1.setBackground(new Color(255, 255, 255));
		btnNewButton_2_1.setBounds(623, 560, 205, 39);
		contentPane.add(btnNewButton_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(320, 70, 850, 480);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
