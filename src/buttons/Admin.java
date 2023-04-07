package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Admin{
	
	private JFrame frame =new JFrame("Admin Login");
	private JPanel panel =new JPanel();
	private JLabel adminlabel =new JLabel("AdminId");
	private JTextField admintxt =new JTextField();
	private JLabel adminpass =new JLabel("Password");
	private JPasswordField password =new JPasswordField();
	private JButton button =new JButton("Login");
	private JLabel success =new JLabel("");
	private JButton back =new JButton("Back");
	Admin()
	{
		frame.setSize(400,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		adminlabel.setBounds(50,50,360,20);
		panel.add(adminlabel);
		admintxt.setBounds(150,50,150,20);
		panel.add(admintxt);
		
		adminpass.setBounds(50,80,360,20);
		panel.add(adminpass);
		password.setBounds(150,80,150,20);
		panel.add(password);
		
		button.setBounds(50,110,100,20);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String adminid = admintxt.getText();
				String adpassword=password.getText();
				
//				System.out.println(adminid+","+adpassword);
//				if(adminid.equals("yash6541") && adpassword.equals ("yash123"))
//				{
//					success.setText("Login Successfully....");
//				}
//				else
//				{
//					success.setText("Invalid AdminId or Password");
//				}
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin", "root", "Sachin51@");
					Statement stm = con.createStatement();
					String sql = "Select * from adminlogin where AdminId = '" + adminid + "' and Password = '" + adpassword +"'";

					ResultSet result = stm.executeQuery(sql);

					if (result.next()) {
						success.setText("Login Successful....");
					} else {
						success.setText("Invalid username or Password");
					}

				} catch (Exception a) {
					System.out.println("Exception");
				}
			}
		});
		panel.add(button);
		
		back.setBounds(50,140,70,20);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b)
			{
				frame.setVisible(false);
				Usertype.frame.setVisible(true);
			}
		});
		panel.add(back);
		
		success.setBounds(50,170,360,20);
		panel.add(success);
		frame.setVisible(true);
	}
	
	

}
