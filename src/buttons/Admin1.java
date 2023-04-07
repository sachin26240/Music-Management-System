package buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import a.a.a.e;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;

public class Admin1 extends JFrame {

	private JPanel contentPane;
	private JTextField adminIdtxt;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Admin1 frame = new Admin1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException es) {
			// TODO Auto-generated catch block
			es.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/musicsystem" , "root", "Sachin51@");
	}
	
	public Admin1() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Admin1.class.getResource("/buttons/musicicon.jpg")));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homePage a = new homePage();
				setVisible(false);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Admin1.class.getResource("/buttons/icons8-back-40.png")));
		lblNewLabel_2.setBounds(10, 10, 54, 48);
		contentPane.add(lblNewLabel_2);
		
		JPanel admin_login = new JPanel();
		admin_login.setBackground(Color.LIGHT_GRAY);
		admin_login.setBounds(202, 68, 344, 339);
		admin_login.setBackground(new Color(255,255,255,125));
		contentPane.add(admin_login);
		admin_login.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(105, 10, 134, 40);
		admin_login.add(lblNewLabel_1);
		
		JLabel adminIdL = new JLabel("ADMIN ID");
		adminIdL.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		adminIdL.setBounds(10, 63, 92, 40);
		admin_login.add(adminIdL);
		
		adminIdtxt = new JTextField();
		adminIdtxt.setFont(new Font("RomanT", Font.BOLD, 14));
		adminIdtxt.setBounds(10, 96, 229, 40);
		admin_login.add(adminIdtxt);
		adminIdtxt.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("PASSWORD");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2_1.setBounds(10, 133, 121, 40);
		admin_login.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
//					Class.forName("com.mysql.jdbc.Driver");
//					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/musicsystem", "root", "");
					Connection con = getConnection();
					Statement stm = con.createStatement();
					String sql = "select * from admin where admin_name = '" + adminIdtxt.getText() + "' && passkey = '" + passwordField.getText() +"';";

					ResultSet result = stm.executeQuery(sql);

					if (result.next()) {
						//success.setText("Login Successful....");
						JOptionPane.showMessageDialog(contentPane, "Login Successful....");
						
						adminUI a =new adminUI();
						setVisible(false);
					} 
						else {
						//success.setText("Invalid username or Password");
						JOptionPane.showMessageDialog(contentPane, "Invalid Username and Password");
						adminIdtxt.setText("");
						passwordField.setText("");
					}

				} catch (Exception a) {
					System.out.println(a);
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(10, 232, 121, 34);
		admin_login.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 169, 229, 40);
		admin_login.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin1.class.getResource("/buttons/space_admin.jpg")));
		lblNewLabel.setBounds(-46, 0, 1092, 723);
		contentPane.add(lblNewLabel);
		
		//keyPressed(null);
		setVisible(true);
	}
	
}
