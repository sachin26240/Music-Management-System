package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class User implements ActionListener {
	private JFrame frame = new JFrame("Login Page");
	private JPanel panel = new JPanel();
	private JLabel userlabel = new JLabel("Username");
	private JTextField txt = new JTextField();
	private JLabel passLabel = new JLabel("Password");
	private JPasswordField password = new JPasswordField();
	private JButton button = new JButton("Login");
	private JLabel success = new JLabel("");
	private JButton back = new JButton("Back");

	User() {
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);

		userlabel.setBounds(50, 50, 350, 20);
		panel.add(userlabel);
		txt.setBounds(50, 80, 150, 20);
		//JHintingTextField ad=new JHintingTextField("Username",txt);
		panel.add(txt);

		passLabel.setBounds(50, 120, 350, 20);
		panel.add(passLabel);
		password.setBounds(50, 150, 150, 20);
		panel.add(password);

		button.setBounds(50, 190, 80, 20);
		button.addActionListener(this);
		panel.add(button);

		back.setBounds(50, 220, 70, 20);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				frame.setVisible(false);
				Usertype.frame.setVisible(true);
			}
		});
		panel.add(back);

		success.setBounds(50, 260, 380, 20);
		panel.add(success);

		frame.setVisible(true);
	}

	 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = txt.getText();
		String passwordtxt = password.getText();
//		System.out.println(user + "," + passwordtxt);
//		if (user.equals("sachin26240") && passwordtxt.equals("sachin123")) {
//			success.setText("Login Successfully.....");
//		} else {
//			success.setText("Invalid username or Password");
//		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin", "root", "Sachin51@");
			Statement stm = con.createStatement();
			String sql = "Select * from userlogin where LoginId = '" + user + "' and Password = '" + passwordtxt+"'";

			ResultSet result = stm.executeQuery(sql);

			if (result.next()) {
				success.setText("Login Successfully.....");
			} else {
				success.setText("Invalid username or Password");
			}

		} catch (Exception a) {
			System.out.println("Exception");
		}

	}
}
