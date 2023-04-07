package buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUpPage extends JFrame {
	protected static final String NULL = null;
	private JTextField usernametxt;
	private JTextField nametxt;
	private JPasswordField password1;
	private JPasswordField password2;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignUpPage frame = new SignUpPage();
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
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/musicsystem", "root", "Sachin51@");
	}

	public SignUpPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sachin\\Desktop\\\\Miniproject\\musicicon.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 570);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, -12, 390, 555);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(0, 10, 390, 535);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon(SignUpPage.class.getResource("/buttons/music.jpg")));

		JLabel username1 = new JLabel("USERNAME");
		username1.setFont(new Font("Calibri", Font.BOLD, 16));
		username1.setBounds(400, 55, 100, 28);
		getContentPane().add(username1);

		usernametxt = new JTextField();
		usernametxt.setBounds(400, 80, 274, 36);
		getContentPane().add(usernametxt);
		usernametxt.setColumns(10);

		nametxt = new JTextField();
		nametxt.setBounds(400, 162, 274, 36);
		getContentPane().add(nametxt);
		nametxt.setColumns(10);

		JLabel name = new JLabel("NAME");
		name.setFont(new Font("Calibri", Font.BOLD, 16));
		name.setBounds(400, 135, 113, 28);
		getContentPane().add(name);

		JLabel password = new JLabel("PASSWORD");
		password.setFont(new Font("Calibri", Font.BOLD, 16));
		password.setBounds(400, 218, 100, 28);
		getContentPane().add(password);

		password1 = new JPasswordField();
		password1.setBounds(400, 242, 274, 36);
		getContentPane().add(password1);
		password1.setColumns(10);

		JLabel r_password = new JLabel("REPEAT PASSWORD");
		r_password.setFont(new Font("Calibri", Font.BOLD, 16));
		r_password.setBounds(400, 298, 217, 28);
		getContentPane().add(r_password);

		password2 = new JPasswordField();
		password2.setBounds(400, 322, 274, 36);
		getContentPane().add(password2);
		password2.setColumns(10);

		final JLabel success1 = new JLabel("");
		success1.setFont(new Font("Tahoma", Font.BOLD, 14));
		success1.setBounds(400, 448, 274, 42);
		getContentPane().add(success1);

//		final JLabel success = new JLabel("");
//		success.setBounds(400,500,300,70);
//		getContentPane().add(success);

		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernametxt.getText();
				String name = nametxt.getText();
				String password = password1.getText();
				String repeat_password = password2.getText();
				String insert_to_database = null;

				if (password.equals("") || username.equals("")) {
					success1.setText("Enter valid Username and Password");
				} else {
					if (password.equals(repeat_password)) {

						try {
							Connection con = getConnection();
							Statement stm = con.createStatement();
							insert_to_database = "insert into customer (username,customer_passkey,customer_name) values('"
									+ username + "',sha1('" + password + "'),'" + name + "');";

							String user_exist = "select username from customer where username = '" + username + "';";

							ResultSet exist = stm.executeQuery(user_exist);

							if (exist.next()) {

								success1.setText("Username Exists try again");

								// setVisible(false);
							} else {

								int insert = stm.executeUpdate(insert_to_database);
								// JOptionPane.showMessageDialog(getContentPane(), "");
								User1 u = new User1();
								setVisible(false);

							}

						} catch (Exception a) {
							System.out.println("Exception");
						}
					} else {
						success1.setText("Password not Matched");
					}
				}
			}
		});

		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setBackground(new Color(241, 57, 83));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(400, 383, 274, 36);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("SIGN UP");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(400, 10, 156, 35);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homePage a = new homePage();
				setVisible(false);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(SignUpPage.class.getResource("/buttons/icons8-back-arrow-28.png")));
		lblNewLabel.setBounds(658, 10, 28, 35);
		getContentPane().add(lblNewLabel);

		setVisible(true);
	}
}
