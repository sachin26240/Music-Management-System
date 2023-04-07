package buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class User1 extends JFrame {

	private JPanel contentPane;
	private JTextField usertext;
	private JPasswordField passtext;
	
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

	public User1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sachin\\Desktop\\Miniproject\\musicicon.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 638, 370);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel usertxt = new JPanel();
		usertxt.setBackground(new Color(0, 128, 128));
		usertxt.setBounds(56, 26, 239, 322);
		panel.add(usertxt);
		usertxt.setLayout(null);
		
		JLabel Logintitle = new JLabel("USER LOGIN ");
		Logintitle.setFont(new Font("Times New Roman", Font.BOLD, 21));
		Logintitle.setBounds(53, 29, 137, 32);
		usertxt.add(Logintitle);
		
		JLabel userlabel = new JLabel("USERNAME");
		userlabel.setBackground(new Color(169, 169, 169));
		userlabel.setForeground(new Color(255, 255, 0));
		userlabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 14));
		userlabel.setBounds(22, 86, 78, 22);
		usertxt.add(userlabel);
		
		usertext = new JTextField();
		usertext.setBounds(22, 108, 165, 32);
		usertxt.add(usertext);
		usertext.setColumns(10);
		
		JLabel passwordlabel = new JLabel("PASSWORD");
		passwordlabel.setForeground(new Color(255, 255, 0));
		passwordlabel.setFont(new Font("Berlin Sans FB", Font.BOLD, 14));
		passwordlabel.setBounds(22, 150, 92, 22);
		usertxt.add(passwordlabel);
		
		final JLabel success = new JLabel("");
		success.setFont(new Font("Tahoma", Font.BOLD, 10));
		success.setBounds(35, 282, 165, 40);
		usertxt.add(success);
		
		passtext = new JPasswordField();
		passtext.setBounds(22, 173, 165, 32);
		usertxt.add(passtext);
		
		JButton loginbutton = new JButton("LOGIN");
		loginbutton.setForeground(new Color(192, 192, 192));
		loginbutton.setBackground(new Color(210, 105, 30));
		loginbutton.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginbutton.setBounds(53, 215, 92, 22);
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String user = usertext.getText();
				String passwordtxt = passtext.getText();
				
				try {
//					Class.forName("com.mysql.jdbc.Driver");
//					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/musicsystem", "root", "");
					Connection con=getConnection();
					Statement stm = con.createStatement();
					String sql = "Select * from customer where username = '" + user + "' and customer_passkey = sha1('" + passwordtxt+"')";

					ResultSet result = stm.executeQuery(sql);

					if (result.next()) {
						//success.setText("Login Successfully.....");
						String name1= result.getString("customer_name");
						JOptionPane.showMessageDialog(contentPane, "Login Successful....");
						mainPage m =new mainPage(name1);
						setVisible(false);
					} else {
						//success.setText("Invalid username or Password");
						 JOptionPane.showMessageDialog(contentPane, "Invalid Username or Password");  
						 usertext.setText("");
						 passtext.setText("");
					}
					con.close();
				} catch (Exception a) {
					System.out.println("Exception");
				}
				Toolkit.getDefaultToolkit().beep();
			}
			
		});
		usertxt.add(loginbutton);
		
		JButton createnew = new JButton("CREATE NEW");
		createnew.setFont(new Font("Tahoma", Font.BOLD, 9));
		createnew.setHorizontalAlignment(SwingConstants.LEFT);
		createnew.setBounds(55, 261, 90, 22);
		createnew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SignUpPage s = new SignUpPage();
				setVisible(false);
			}
			
		});
		usertxt.add(createnew);
		
		JLabel lblNewLabel = new JLabel("OR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(86, 239, 45, 22);
		usertxt.add(lblNewLabel);
		
		JLabel backarrow = new JLabel("");
		backarrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homePage a = new homePage();
				setVisible(false);
			}
		});
		backarrow.setIcon(new ImageIcon(User1.class.getResource("/buttons/icons8-back-arrow-28.png")));
		backarrow.setBounds(10, 10, 34, 32);
		usertxt.add(backarrow);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(User1.class.getResource("/buttons/musiclogin.jpg")));
		image.setBounds(-12, 0, 640, 370);
		panel.add(image);
		
		setVisible(true);
	}
}
