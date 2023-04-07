package buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Usertype implements ActionListener {

	public static JFrame frame = new JFrame("User Login");
	private JPanel panel =new JPanel();
	private JLabel usertypelabel = new JLabel("Usertype");
	private String usertype []= {"Admin","User"};
	private JComboBox ch =new JComboBox(usertype);
	private JButton button =new JButton("Proceed");
	Usertype()
	{
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		usertypelabel.setBounds(50,20,350,20);
		panel.add(usertypelabel);
		ch.setBounds(150,20,150,20);
		panel.add(ch);
		
		button.setBounds(50,70,100,20);
		button.addActionListener(this);
		panel.add(button);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Usertype b = new Usertype();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String data=(String) ch.getSelectedItem();
		if(data == "User")
		{
			User1 u =new User1();
			frame.setVisible(false);
		}
		else if(data == "Admin")
		{
			Admin a1 =new Admin();
			frame.setVisible(false);
		}
	}
}


