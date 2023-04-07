package buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.MouseMotionAdapter;

public class homePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					homePage frame = new homePage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		homePage frame = new homePage();
	}
	
	JLabel logIn;

	/**
	 * Create the frame.
	 */
	public homePage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(homePage.class.getResource("/buttons/songicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1176, 714);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(221, 160, 221,200));
		panel.setBounds(0, 0, 1162, 677);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 1162, 47);
		panel_2.setBackground(new Color(255, 255, 255,50));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBounds(984, 10, 62, 26);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(255, 255, 255,0));
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//panel_1.setBackground(new Color(255,255,255,1));

				User1 a= new User1();
				setVisible(false);
			}
		});
		panel_1.setLayout(null);
		
		logIn = new JLabel("Log in");
		logIn.setForeground(new Color(255, 250, 250));
		logIn.setFont(new Font("Arial", Font.BOLD, 18));
		logIn.setBounds(0, 0, 56, 22);
		panel_1.add(logIn);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignUpPage b =new SignUpPage();
				setVisible(false);
			}
		});
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(255, 255, 255, 0));
		panel_1_1.setBounds(1056, 10, 81, 26);
		panel_2.add(panel_1_1);
		
		JLabel SignUp = new JLabel("Sign up");
		SignUp.setForeground(new Color(255, 250, 250));
		SignUp.setFont(new Font("Arial", Font.BOLD, 18));
		SignUp.setBounds(0, 0, 78, 22);
		panel_1_1.add(SignUp);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Admin1 c=new Admin1();
				setVisible(false);
			}
		});
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(255, 255, 255, 0));
		panel_1_2.setBounds(910, 10, 62, 26);
		panel_2.add(panel_1_2);
		
		JLabel lblAdminLogIn = new JLabel("Admin");
		lblAdminLogIn.setForeground(new Color(255, 250, 250));
		lblAdminLogIn.setFont(new Font("Arial", Font.BOLD, 18));
		lblAdminLogIn.setBounds(0, 0, 71, 22);
		panel_1_2.add(lblAdminLogIn);
		
		JLabel lblNewLabel = new JLabel("MUSIC");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 40));
		lblNewLabel.setBounds(47, 118, 155, 65);
		panel.add(lblNewLabel);
		
		JLabel lblIsAPiece = new JLabel("IS A PIECE OF ART");
		lblIsAPiece.setForeground(new Color(255, 250, 250));
		lblIsAPiece.setFont(new Font("Eras Bold ITC", Font.BOLD, 40));
		lblIsAPiece.setBounds(194, 118, 443, 65);
		panel.add(lblIsAPiece);
		
		JLabel lblThatGoesIn = new JLabel("THAT GOES IN");
		lblThatGoesIn.setForeground(new Color(255, 250, 250));
		lblThatGoesIn.setFont(new Font("Eras Bold ITC", Font.BOLD, 40));
		lblThatGoesIn.setBounds(47, 163, 352, 65);
		panel.add(lblThatGoesIn);
		
		JLabel lblTheEars = new JLabel("THE EARS");
		lblTheEars.setForeground(new Color(255, 250, 250));
		lblTheEars.setFont(new Font("Eras Bold ITC", Font.BOLD, 40));
		lblTheEars.setBounds(47, 210, 228, 65);
		panel.add(lblTheEars);
		
		JLabel lblStraightIntoThe = new JLabel("STRAIGHT INTO THE");
		lblStraightIntoThe.setForeground(new Color(255, 250, 250));
		lblStraightIntoThe.setFont(new Font("Eras Bold ITC", Font.BOLD, 40));
		lblStraightIntoThe.setBounds(271, 210, 474, 65);
		panel.add(lblStraightIntoThe);
		
		JLabel lblHeart = new JLabel("HEART");
		lblHeart.setForeground(new Color(255, 250, 250));
		lblHeart.setFont(new Font("Eras Bold ITC", Font.BOLD, 40));
		lblHeart.setBounds(47, 257, 170, 65);
		panel.add(lblHeart);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 491, 1162, 186);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("About Us");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(514, 22, 135, 22);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to Music Management System, your number one source for all things .We're dedicated to");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBounds(166, 75, 935, 35);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("providing you the best of songs, with a focus on dependability and customer service.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(230, 102, 794, 35);
		panel_3.add(lblNewLabel_3);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon(homePage.class.getResource("/buttons/homepage.png")));
		image.setBounds(0, 0, 1162, 677);
		contentPane.add(image);
		setResizable(false);
		
		setVisible(true);
	}
}
