package buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class mainPage1 extends JFrame {

	private JPanel contentPane;
	final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JPanel song = new JPanel();
	JPanel album = new JPanel();
	JPanel artist = new JPanel();
	JPanel language = new JPanel();
	JPanel movie = new JPanel();
	JPanel panel_3 = new JPanel();
	JPanel playlist = new JPanel();
	JPanel songTab = new JPanel();
	JButton songBtm = new JButton("SONGS");
	JPanel albumTab = new JPanel();
	JButton albumBtm = new JButton("ALBUMS");
	JPanel artistTab = new JPanel();
	JButton artistBtm = new JButton("ARTIST");
	JPanel languageTab = new JPanel();
	JButton languageBtm = new JButton("LANGUAGE");
	JPanel moviesTab = new JPanel();
	JButton moviesBtm = new JButton("MOVIES");
	JPanel playlistTab = new JPanel();
	JButton playlistBtm = new JButton("PLAYLIST");
	JPanel signoutTab = new JPanel();
	JButton signoutBtm = new JButton("SIGNOUT");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage1 frame = new mainPage1();
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
	public mainPage1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sachin\\Desktop\\Miniproject\\musicicon.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1019, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(0, 0, 180, 599);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		songTab.setBackground(new Color(250, 250, 210));
		songTab.setBounds(0, 192, 180, 41);
		panel_3.add(songTab);
		
		songBtm.setBackground(new Color(0, 139, 139));
		songBtm.setForeground(new Color(139, 0, 0));
		songBtm.setHorizontalAlignment(SwingConstants.TRAILING);
		songBtm.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		songBtm.setBounds(0, 0, 180, 41);
		songBtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				
				songBtm.setBackground(new Color(176,224,230));
				albumBtm.setBackground(new Color(0, 139, 139));
				artistBtm.setBackground(new Color(0, 139, 139));
				languageBtm.setBackground(new Color(0, 139, 139));
				moviesBtm.setBackground(new Color(0, 139, 139));
				playlistBtm.setBackground(new Color(0, 139, 139));
				signoutBtm.setBackground(new Color(0, 139, 139));
			}
		});
		songTab.setLayout(null);
		songTab.add(songBtm);
		
		albumTab.setBackground(new Color(250, 250, 210));
		albumTab.setBounds(0, 243, 180, 41);
		panel_3.add(albumTab);
		albumTab.setLayout(null);
		
		albumBtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				
				songBtm.setBackground(new Color(0, 139, 139));
				albumBtm.setBackground(new Color(176,224,230));
				artistBtm.setBackground(new Color(0, 139, 139));
				languageBtm.setBackground(new Color(0, 139, 139));
				moviesBtm.setBackground(new Color(0, 139, 139));
				playlistBtm.setBackground(new Color(0, 139, 139));
				signoutBtm.setBackground(new Color(0, 139, 139));
			}
		});
		albumBtm.setHorizontalAlignment(SwingConstants.TRAILING);
		albumBtm.setForeground(new Color(139, 0, 0));
		albumBtm.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		albumBtm.setBackground(new Color(0, 128, 128));
		albumBtm.setBounds(0, 0, 180, 41);
		albumTab.add(albumBtm);
		
		artistTab.setBackground(new Color(250, 250, 210));
		artistTab.setBounds(0, 294, 180, 41);
		panel_3.add(artistTab);
		artistTab.setLayout(null);
		
		artistBtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				
				songBtm.setBackground(new Color(0, 139, 139));
				albumBtm.setBackground(new Color(0, 139, 139));
				artistBtm.setBackground(new Color(176,224,230));
				languageBtm.setBackground(new Color(0, 139, 139));
				moviesBtm.setBackground(new Color(0, 139, 139));
				playlistBtm.setBackground(new Color(0, 139, 139));
				signoutBtm.setBackground(new Color(0, 139, 139));
			}
		});
		artistBtm.setHorizontalAlignment(SwingConstants.TRAILING);
		artistBtm.setForeground(new Color(139, 0, 0));
		artistBtm.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		artistBtm.setBackground(new Color(0, 139, 139));
		artistBtm.setBounds(0, 0, 180, 41);
		artistTab.add(artistBtm);
		
		languageTab.setBackground(new Color(250, 250, 210));
		languageTab.setBounds(0, 345, 180, 41);
		panel_3.add(languageTab);
		languageTab.setLayout(null);
		
		languageBtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
				
				songBtm.setBackground(new Color(0, 139, 139));
				albumBtm.setBackground(new Color(0, 139, 139));
				artistBtm.setBackground(new Color(0, 139, 139));
				languageBtm.setBackground(new Color(176,224,230));
				moviesBtm.setBackground(new Color(0, 139, 139));
				playlistBtm.setBackground(new Color(0, 139, 139));
				signoutBtm.setBackground(new Color(0, 139, 139));
			}
		});
		languageBtm.setHorizontalAlignment(SwingConstants.TRAILING);
		languageBtm.setForeground(new Color(139, 0, 0));
		languageBtm.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		languageBtm.setBackground(new Color(0, 139, 139));
		languageBtm.setBounds(0, 0, 180, 41);
		languageTab.add(languageBtm);
		
		moviesTab.setBackground(new Color(250, 250, 210));
		moviesTab.setBounds(0, 396, 180, 41);
		panel_3.add(moviesTab);
		moviesTab.setLayout(null);
		
		moviesBtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
				
				songBtm.setBackground(new Color(0, 139, 139));
				albumBtm.setBackground(new Color(0, 139, 139));
				artistBtm.setBackground(new Color(0, 139, 139));
				languageBtm.setBackground(new Color(0, 139, 139));
				moviesBtm.setBackground(new Color(176,224,230));
				playlistBtm.setBackground(new Color(0, 139, 139));
				signoutBtm.setBackground(new Color(0, 139, 139));
			}
		});
		moviesBtm.setHorizontalAlignment(SwingConstants.TRAILING);
		moviesBtm.setForeground(new Color(139, 0, 0));
		moviesBtm.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		moviesBtm.setBackground(new Color(0, 139, 139));
		moviesBtm.setBounds(0, 0, 180, 41);
		moviesTab.add(moviesBtm);
		
		playlistTab.setBackground(new Color(250, 250, 210));
		playlistTab.setBounds(0, 447, 180, 41);
		panel_3.add(playlistTab);
		playlistTab.setLayout(null);
		
		playlistBtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
				
				songBtm.setBackground(new Color(0, 139, 139));
				albumBtm.setBackground(new Color(0, 139, 139));
				artistBtm.setBackground(new Color(0, 139, 139));
				languageBtm.setBackground(new Color(0, 139, 139));
				moviesBtm.setBackground(new Color(0, 139, 139));
				playlistBtm.setBackground(new Color(176,224,230));
				signoutBtm.setBackground(new Color(0, 139, 139));
			}
		});
		playlistBtm.setHorizontalAlignment(SwingConstants.TRAILING);
		playlistBtm.setForeground(new Color(139, 0, 0));
		playlistBtm.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		playlistBtm.setBackground(new Color(0, 139, 139));
		playlistBtm.setBounds(0, 0, 180, 41);
		playlistTab.add(playlistBtm);
		
		signoutTab.setBackground(new Color(250, 250, 210));
		signoutTab.setBounds(0, 498, 180, 41);
		panel_3.add(signoutTab);
		signoutTab.setLayout(null);
		signoutBtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				songBtm.setBackground(new Color(0, 139, 139));
				albumBtm.setBackground(new Color(0, 139, 139));
				artistBtm.setBackground(new Color(0, 139, 139));
				languageBtm.setBackground(new Color(0, 139, 139));
				moviesBtm.setBackground(new Color(0, 139, 139));
				playlistBtm.setBackground(new Color(0, 139, 139));
				signoutBtm.setBackground(new Color(176,224,230));
			}
		});
		
		signoutBtm.setHorizontalAlignment(SwingConstants.TRAILING);
		signoutBtm.setForeground(new Color(139, 0, 0));
		signoutBtm.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 20));
		signoutBtm.setBackground(new Color(0, 139, 139));
		signoutBtm.setBounds(0, 0, 180, 41);
		signoutTab.add(signoutBtm);
		
		tabbedPane.setBounds(180, -27, 825, 626);
		contentPane.add(tabbedPane);
		
		song.setBackground(new Color(175, 238, 238));
		tabbedPane.addTab("New tab", null, song, null);
		
		album.setBackground(new Color(255, 140, 0));
		tabbedPane.addTab("New tab", null, album, null);
		
		artist.setBackground(new Color(105, 105, 105));
		tabbedPane.addTab("New tab", null, artist, null);
		
		language.setBackground(Color.BLUE);
		tabbedPane.addTab("New tab", null, language, null);
		
		movie.setBackground(Color.MAGENTA);
		tabbedPane.addTab("New tab", null, movie, null);
		
		
		tabbedPane.addTab("New tab", null, playlist, null);
		
		setResizable(false);

	}
}
