package buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.border.EtchedBorder;
import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import jaco.mp3.player.MP3Player;

import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;
import javax.swing.ScrollPaneConstants;
import java.lang.NullPointerException;
import java.net.URL;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class mainPage extends JFrame {

	private JPanel contentPane;
	final JPanel albumPanel = new JPanel();
	final JPanel wholePage = new JPanel();
	JPanel sidePane = new JPanel();
	final JPanel songPanel = new JPanel();
	JPanel panel_1 = new JPanel();
	JLabel songIcon = new JLabel("New label");
	JLabel songTab = new JLabel("SONGS");
	JLabel albumIcon = new JLabel("");
	JPanel panel_1_1 = new JPanel();
	JLabel albumTab = new JLabel("ALBUMS");
	private final JPanel artistPanel = new JPanel();
	private final JLabel artistIcon = new JLabel("");
	private final JPanel panel_1_1_1 = new JPanel();
	private final JLabel lblArtist = new JLabel("ARTIST");
	private final JPanel moviePanel = new JPanel();
	private final JLabel languageIcon = new JLabel("");
	private final JPanel panel_1_1_2 = new JPanel();
	private final JLabel lblLanguage = new JLabel("MOVIES");
	private final JPanel playlistPanel = new JPanel();
	private final JLabel albumIcon_3 = new JLabel("");
	private final JPanel panel_1_1_3 = new JPanel();
	private final JLabel lblPlaylist = new JLabel("PLAYLIST");
	private final JPanel signoutPanel = new JPanel();
	private final JLabel albumIcon_4 = new JLabel("");
	private final JPanel panel_1_1_4 = new JPanel();
	private final JLabel lblSignOut = new JLabel("SIGN OUT");
	private final JPanel yearPanel = new JPanel();
	private final JLabel albumIcon_4_1 = new JLabel("");
	private final JPanel panel_1_1_4_1 = new JPanel();
	private final JLabel lblMovies = new JLabel("YEAR");
	private final JPanel panel = new JPanel();
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel song = new JPanel();
	private final JPanel album = new JPanel();
	private final JPanel artist = new JPanel();
	private final JPanel playlist = new JPanel();
	private final JPanel year = new JPanel();
	private final JPanel movies = new JPanel();
	private JTable songTable;
	private JScrollPane scrollPane = new JScrollPane();
	private final JLabel lblNewLabel = new JLabel("HELLO,");
	private JTextField searchField;
	private JLabel songTitleshow;
	private JLabel movieTitleshow = new JLabel("");
	private JLabel artistTitleshow = new JLabel("");
	private JLabel languageTitleshow = new JLabel("");
	private JLabel yearTitleshow = new JLabel("");
	private JLabel lengthTitleshow = new JLabel("");
	private final JLabel songHeading = new JLabel("SONG DETAILS");
	private final JLabel lblNewLabel_2 = new JLabel("SONGS");
	private JTable albumTable;
	private JTextField albumSearchtxt;
	final JTabbedPane albumTabbedpane = new JTabbedPane(JTabbedPane.TOP);
	private JTable albumsongList;
	private JTable artistTable;
	private JTextField artistSearch;
	private JTabbedPane artistTabbedpane;
	private final JTable artistSongtable = new JTable();
	private final JScrollPane scrollPane_4 = new JScrollPane();
	private final JLabel songbyartist1 = new JLabel("");
	private JTable yearTable;
	private final JTable yearSongtable = new JTable();
	private JTable movieTable;
	private JTabbedPane movieTabbedpane ;
	private final JTable movieSongtable = new JTable();
	private final JScrollPane scrollPane_6 = new JScrollPane();
	private final JLabel songInmovie = new JLabel("");
	private final JLabel lblNewLabel_6 = new JLabel("Search");
	private JTextField movieSongsearch;
	private JLabel playListbtm ;
	private JPanel songDetail_1 ;
	private JButton play;
	private JButton pause;
	private JButton stop;
	private JTable playlistTable;
	private JTabbedPane tabbedPane_1 ;
	private final JTable editplaylistTable = new JTable();
	private final JScrollPane scrollPane_8 = new JScrollPane();
	private JLabel albumSongheading ;
	private final JLabel albumTitleshow = new JLabel("");
	private JPanel suggestionPanel ;
	private final JPanel suggestion = new JPanel();
	private JTextField titleSuggestion;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage frame = new mainPage("Tarang");
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
		
	public mainPage(final String user) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(mainPage.class.getResource("/buttons/musicicon.jpg")));
		final String customerName=user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JSplitPane splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		contentPane.add(splitPane, "name_552831445472100");
		splitPane.setResizeWeight(0.18);
		splitPane.setLeftComponent(wholePage);

		wholePage.setLayout(new CardLayout(0, 0));
		wholePage.add(sidePane, "name_552765202022000");
		sidePane.setBackground(new Color(32, 178, 170));
		songPanel.setBounds(0, 160, 1063, 42);
		songPanel.setToolTipText("Songs");
		songPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);

				songPanel.setBackground(new Color(176, 224, 230));
				albumPanel.setBackground(new Color(32, 178, 170));
				artistPanel.setBackground(new Color(32, 178, 170));
				moviePanel.setBackground(new Color(32, 178, 170));
				playlistPanel.setBackground(new Color(32, 178, 170));
				yearPanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
				signoutPanel.setBackground(new Color(32, 178, 170));

				albumPanel.setOpaque(false);
				songPanel.setOpaque(true);
				artistPanel.setOpaque(false);
				moviePanel.setOpaque(false);
				playlistPanel.setOpaque(false);
				yearPanel.setOpaque(false);
				signoutPanel.setOpaque(false);

			}

		});
		sidePane.setLayout(null);
		songPanel.setBackground(new Color(176, 224, 230));
		sidePane.add(songPanel);
		songPanel.setLayout(null);

		panel_1.setBackground(new Color(255, 215, 0));
		panel_1.setBounds(-6, 0, 10, 42);
		songPanel.add(panel_1);

		songIcon.setBounds(14, 0, 47, 42);
		songPanel.add(songIcon);
		songIcon.setIcon(new ImageIcon(mainPage.class.getResource("/buttons/icons8-music-library-48.png")));

		songTab.setBounds(83, 8, 83, 22);
		songPanel.add(songTab);
		songTab.setForeground(new Color(199, 21, 133));
		songTab.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		albumPanel.setBounds(0, 209, 1063, 42);
		albumPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				tabbedPane.setSelectedIndex(1);

				albumPanel.setBackground(new Color(176, 224, 230));
				songPanel.setBackground(new Color(32, 178, 170));
				artistPanel.setBackground(new Color(32, 178, 170));
				moviePanel.setBackground(new Color(32, 178, 170));
				playlistPanel.setBackground(new Color(32, 178, 170));
				yearPanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
				signoutPanel.setBackground(new Color(32, 178, 170));

				albumPanel.setOpaque(true);
				songPanel.setOpaque(false);
				artistPanel.setOpaque(false);
				moviePanel.setOpaque(false);
				playlistPanel.setOpaque(false);
				yearPanel.setOpaque(false);
				suggestionPanel.setOpaque(false);
				signoutPanel.setOpaque(false);

				albumTabbedpane.setSelectedIndex(0);
			}

		});
		albumPanel.setLayout(null);
		albumPanel.setBackground(new Color(32, 178, 170));
		sidePane.add(albumPanel);

		albumIcon.setIcon(new ImageIcon(mainPage.class.getResource("/buttons/albumicon1 - Copy (2).png")));
		albumIcon.setBounds(14, 0, 62, 42);
		albumPanel.add(albumIcon);

		panel_1_1.setBackground(new Color(255, 215, 0));
		panel_1_1.setBounds(-6, 0, 10, 42);
		albumPanel.add(panel_1_1);

		albumTab.setForeground(new Color(199, 21, 133));
		albumTab.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		albumTab.setBounds(86, 8, 83, 22);
		albumPanel.add(albumTab);
		artistPanel.setBounds(0, 261, 1063, 42);
		artistPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
				artistTabbedpane.setSelectedIndex(0);

				albumPanel.setBackground(new Color(32, 178, 170));
				songPanel.setBackground(new Color(32, 178, 170));
				artistPanel.setBackground(new Color(176, 224, 230));
				moviePanel.setBackground(new Color(32, 178, 170));
				playlistPanel.setBackground(new Color(32, 178, 170));
				yearPanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
				signoutPanel.setBackground(new Color(32, 178, 170));

				albumPanel.setOpaque(false);
				songPanel.setOpaque(false);
				artistPanel.setOpaque(true);
				moviePanel.setOpaque(false);
				playlistPanel.setOpaque(false);
				yearPanel.setOpaque(false);
				suggestionPanel.setOpaque(false);
				signoutPanel.setOpaque(false);

			}
		});
		artistPanel.setLayout(null);
		artistPanel.setBackground(new Color(32, 178, 170));

		sidePane.add(artistPanel);
		artistIcon.setIcon(new ImageIcon(mainPage.class.getResource("/buttons/artist_icon - Copy.png")));
		artistIcon.setBounds(14, 0, 53, 42);

		artistPanel.add(artistIcon);
		panel_1_1_1.setBackground(new Color(255, 215, 0));
		panel_1_1_1.setBounds(-6, 0, 10, 42);

		artistPanel.add(panel_1_1_1);
		lblArtist.setForeground(new Color(199, 21, 133));
		lblArtist.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblArtist.setBounds(86, 8, 83, 22);

		artistPanel.add(lblArtist);
		moviePanel.setBounds(0, 313, 1063, 42);
		moviePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				tabbedPane.setSelectedIndex(3);
				movieTabbedpane.setSelectedIndex(0);

				albumPanel.setBackground(new Color(32, 178, 170));
				songPanel.setBackground(new Color(32, 178, 170));
				artistPanel.setBackground(new Color(32, 178, 170));
				moviePanel.setBackground(new Color(176, 224, 230));
				playlistPanel.setBackground(new Color(32, 178, 170));
				yearPanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
				signoutPanel.setBackground(new Color(32, 178, 170));

				albumPanel.setOpaque(false);
				songPanel.setOpaque(false);
				artistPanel.setOpaque(false);
				moviePanel.setOpaque(true);
				playlistPanel.setOpaque(false);
				yearPanel.setOpaque(false);
				suggestionPanel.setOpaque(false);
				signoutPanel.setOpaque(false);
			}
		});
		moviePanel.setLayout(null);
		moviePanel.setBackground(new Color(32, 178, 170));

		sidePane.add(moviePanel);
		languageIcon.setIcon(new ImageIcon(mainPage.class.getResource("/buttons/movies_icon.png")));
		languageIcon.setBounds(14, 0, 62, 42);

		moviePanel.add(languageIcon);
		panel_1_1_2.setBackground(new Color(255, 215, 0));
		panel_1_1_2.setBounds(-6, 0, 10, 42);

		moviePanel.add(panel_1_1_2);
		lblLanguage.setForeground(new Color(199, 21, 133));
		lblLanguage.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblLanguage.setBounds(86, 8, 107, 22);

		moviePanel.add(lblLanguage);
		playlistPanel.setBounds(0, 365, 1063, 42);
		playlistPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				tabbedPane.setSelectedIndex(4);
				tabbedPane_1.setSelectedIndex(0);

				albumPanel.setBackground(new Color(32, 178, 170));
				songPanel.setBackground(new Color(32, 178, 170));
				artistPanel.setBackground(new Color(32, 178, 170));
				moviePanel.setBackground(new Color(32, 178, 170));
				playlistPanel.setBackground(new Color(176, 224, 230));
				yearPanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
				signoutPanel.setBackground(new Color(32, 178, 170));

				albumPanel.setOpaque(false);
				songPanel.setOpaque(false);
				artistPanel.setOpaque(false);
				moviePanel.setOpaque(false);
				playlistPanel.setOpaque(true);
				yearPanel.setOpaque(false);
				suggestionPanel.setOpaque(false);
				signoutPanel.setOpaque(false);
			}
		});
		playlistPanel.setLayout(null);
		playlistPanel.setBackground(new Color(32, 178, 170));

		sidePane.add(playlistPanel);
		albumIcon_3.setIcon(new ImageIcon(mainPage.class.getResource("/buttons/playlist_icon.png")));
		albumIcon_3.setBounds(14, 10, 48, 32);

		playlistPanel.add(albumIcon_3);
		panel_1_1_3.setBackground(new Color(255, 215, 0));
		panel_1_1_3.setBounds(-6, 0, 10, 42);

		playlistPanel.add(panel_1_1_3);
		lblPlaylist.setForeground(new Color(199, 21, 133));
		lblPlaylist.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblPlaylist.setBounds(86, 8, 83, 22);

		playlistPanel.add(lblPlaylist);
		signoutPanel.setBounds(0, 524, 1063, 42);
		signoutPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				albumPanel.setBackground(new Color(32, 178, 170));
				songPanel.setBackground(new Color(32, 178, 170));
				artistPanel.setBackground(new Color(32, 178, 170));
				moviePanel.setBackground(new Color(32, 178, 170));
				playlistPanel.setBackground(new Color(32, 178, 170));
				yearPanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
				signoutPanel.setBackground(new Color(176, 224, 230));

				albumPanel.setOpaque(false);
				songPanel.setOpaque(false);
				artistPanel.setOpaque(false);
				moviePanel.setOpaque(false);
				playlistPanel.setOpaque(false);
				yearPanel.setOpaque(false);
				suggestionPanel.setOpaque(false);
				signoutPanel.setOpaque(true);

				JOptionPane.showMessageDialog(contentPane, "Signed Out");
				setVisible(false);
				new homePage();
			}
		});
		signoutPanel.setLayout(null);
		signoutPanel.setBackground(new Color(32, 178, 170));

		sidePane.add(signoutPanel);
		albumIcon_4.setIcon(new ImageIcon(mainPage.class.getResource("/buttons/signout_icon.png")));
		albumIcon_4.setBounds(14, 0, 62, 42);

		signoutPanel.add(albumIcon_4);
		panel_1_1_4.setBackground(new Color(255, 215, 0));
		panel_1_1_4.setBounds(-6, 0, 10, 42);

		signoutPanel.add(panel_1_1_4);
		lblSignOut.setForeground(new Color(199, 21, 133));
		lblSignOut.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblSignOut.setBounds(86, 8, 83, 22);

		signoutPanel.add(lblSignOut);
		yearPanel.setBounds(0, 417, 1063, 42);
		yearPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				tabbedPane.setSelectedIndex(5);

				songPanel.setBackground(new Color(32, 178, 170));
				albumPanel.setBackground(new Color(32, 178, 170));
				artistPanel.setBackground(new Color(32, 178, 170));
				moviePanel.setBackground(new Color(32, 178, 170));
				playlistPanel.setBackground(new Color(32, 178, 170));
				yearPanel.setBackground(new Color(176, 224, 230));
				suggestionPanel.setBackground(new Color(32, 178, 170));
				signoutPanel.setBackground(new Color(32, 178, 170));

				albumPanel.setOpaque(false);
				songPanel.setOpaque(false);
				artistPanel.setOpaque(false);
				moviePanel.setOpaque(false);
				playlistPanel.setOpaque(false);
				yearPanel.setOpaque(true);
				suggestionPanel.setOpaque(false);
				signoutPanel.setOpaque(false);

			}
		});
		yearPanel.setLayout(null);
		yearPanel.setBackground(new Color(32, 178, 170));

		sidePane.add(yearPanel);
		albumIcon_4_1.setIcon(new ImageIcon(mainPage.class.getResource("/buttons/icons8-plus-1-year-40.png")));
		albumIcon_4_1.setBounds(14, 0, 62, 42);

		yearPanel.add(albumIcon_4_1);
		panel_1_1_4_1.setBackground(new Color(255, 215, 0));
		panel_1_1_4_1.setBounds(-6, 0, 10, 42);

		yearPanel.add(panel_1_1_4_1);
		lblMovies.setForeground(new Color(199, 21, 133));
		lblMovies.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
		lblMovies.setBounds(86, 8, 83, 22);

		yearPanel.add(lblMovies);

		JLabel hellouser = new JLabel("");
		hellouser.setForeground(new Color(255, 0, 0));
		hellouser.setFont(new Font("Arial", Font.BOLD, 21));
		hellouser.setBounds(21, 59, 146, 42);
		hellouser.setText(customerName);
		sidePane.add(hellouser);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 21));
		lblNewLabel.setBounds(21, 35, 113, 42);

		sidePane.add(lblNewLabel);
		
		suggestionPanel = new JPanel();
		suggestionPanel.setLayout(null);
		suggestionPanel.setBackground(new Color(32, 178, 170));
		suggestionPanel.setBounds(0, 472, 1063, 42);
		suggestionPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				tabbedPane.setSelectedIndex(7);
				albumPanel.setBackground(new Color(32, 178, 170));
				songPanel.setBackground(new Color(32, 178, 170));
				artistPanel.setBackground(new Color(32, 178, 170));
				moviePanel.setBackground(new Color(32, 178, 170));
				playlistPanel.setBackground(new Color(32, 178, 170));
				yearPanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(176, 224, 230));
				signoutPanel.setBackground(new Color(32, 178, 170));

				albumPanel.setOpaque(false);
				songPanel.setOpaque(false);
				artistPanel.setOpaque(false);
				moviePanel.setOpaque(false);
				playlistPanel.setOpaque(false);
				yearPanel.setOpaque(false);
				suggestionPanel.setOpaque(true);
				signoutPanel.setOpaque(false);

			}
		});
		sidePane.add(suggestionPanel);
		
		JLabel albumIcon_4_2 = new JLabel("");
		albumIcon_4_2.setIcon(new ImageIcon(mainPage.class.getResource("/buttons/icons8-hint-48.png")));
		albumIcon_4_2.setBounds(14, 0, 62, 42);
		suggestionPanel.add(albumIcon_4_2);
		
		JPanel panel_1_1_4_2 = new JPanel();
		panel_1_1_4_2.setBackground(new Color(255, 215, 0));
		panel_1_1_4_2.setBounds(-6, 0, 10, 42);
		suggestionPanel.add(panel_1_1_4_2);
		
		JLabel lblSuggestions = new JLabel("SUGGESTIONS");
		lblSuggestions.setForeground(new Color(199, 21, 133));
		lblSuggestions.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		lblSuggestions.setBounds(79, 8, 114, 22);
		suggestionPanel.add(lblSuggestions);
		panel.setBackground(new Color(255, 255, 0));

		splitPane.setRightComponent(panel);
		panel.setLayout(null);
		tabbedPane.setBounds(0, -31, 872, 630);

		panel.add(tabbedPane);
		song.setBackground(Color.LIGHT_GRAY);

		tabbedPane.addTab("New tab", null, song, null);
		tabbedPane.setEnabledAt(0, true);
		song.setLayout(null);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(0, 81, 867, 506);

		song.add(scrollPane);

		songTable = new JTable();
		songTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = songTable.getSelectedRow();
				TableModel tblModel = songTable.getModel();
				String data = tblModel.getValueAt(row, 1).toString();
				// songDetailTab.setText(tblModel.getValueAt(songId, 1).toString());
				songDetails(data,customerName);
				tabbedPane.setSelectedIndex(6);
			}
		});
		songTable.setFont(new Font("Tahoma", Font.ITALIC, 16));
		songTable.setFillsViewportHeight(true);
		songTable.setSurrendersFocusOnKeystroke(true);
		songTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		songTable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Song Id", "Song", "Duration", "Language", "Year" }) {
			Class[] columnTypes = new Class[] { Integer.class, String.class, String.class, String.class, Object.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		songTable.getColumnModel().getColumn(0).setPreferredWidth(15);
		songTable.getColumnModel().getColumn(0).setMinWidth(5);
		songTable.getColumnModel().getColumn(1).setPreferredWidth(482);
		songTable.getColumnModel().getColumn(2).setPreferredWidth(60);
		songTable.getColumnModel().getColumn(3).setPreferredWidth(60);
		songTable.getColumnModel().getColumn(4).setPreferredWidth(50);
		songTable();
		scrollPane.setViewportView(songTable);

		searchField = new JTextField();
//		searchField.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyReleased(KeyEvent e) {
//				//songTable.setRowSelectionInterval(0, 0);
//				DefaultTableModel tblModel = (DefaultTableModel) songTable.getModel();
//				String search = searchField.getText();
//				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tblModel);
//				songTable.setRowSorter(tr);
//				tr.setRowFilter(RowFilter.regexFilter(search));
//			}
//		});

		searchField.addKeyListener(new KeyAdapter() {

			public void keyReleased(KeyEvent e) {
				DefaultTableModel tblModel;
				tblModel = (DefaultTableModel) songTable.getModel();
				tblModel.setRowCount(0);
				String search = searchField.getText();
				try {
					Connection con = getConnection();
					Statement stm = con.createStatement();
					String sql = "Select * from SONG where song_name like '%" + search + "%' || y_id like '%" + search	+ "%';";
//						String sql ="select * from song, artist,artist_song where s_id = song_id && art_id = artist_id && (artist_name like '%"+search+"%'||song_name like '%"+search+"%' ||y_id like '%"+search+"%');";
					ResultSet result = stm.executeQuery(sql);

					while (result.next()) {
						String id = String.valueOf(result.getInt("song_id"));
						String song = result.getString("song_name");
						String duration = result.getString("song_duration");
						String language = result.getString("song_language");
						String year = result.getString("y_id");

						String tbData[] = { id, song, duration, language, year };
						// tblModel.setRowCount(0);
						tblModel.addRow(tbData);
					}
					con.close();
				} catch (Exception a) {
					System.out.println(a);
				}
			}
		});

		searchField.setBounds(491, 23, 331, 33);
		song.add(searchField);
		searchField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Search");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(436, 23, 57, 33);
		song.add(lblNewLabel_1);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 36));
		lblNewLabel_2.setBounds(10, 23, 159, 48);

		song.add(lblNewLabel_2);

		album.setBackground(Color.LIGHT_GRAY);

		tabbedPane.addTab("New tab", null, album, null);
		album.setLayout(null);

		albumTabbedpane.setBounds(0, -23, 867, 620);
		album.add(albumTabbedpane);

		JPanel albumList = new JPanel();
		albumList.setBackground(Color.LIGHT_GRAY);
		albumTabbedpane.addTab("New tab", null, albumList, null);
		albumList.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 84, 862, 509);
		albumList.add(scrollPane_1);

		albumTable = new JTable();
		albumTable.setFont(new Font("Tahoma", Font.ITALIC, 16));
		albumTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		albumTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = albumTable.getSelectedRow();
				TableModel albumtbl = albumTable.getModel();
				String s = albumtbl.getValueAt(row, 1).toString();
				
				DefaultTableModel dtm = (DefaultTableModel) albumsongList.getModel();
				dtm.setRowCount(0);
				albumSongtable(s);
				albumTabbedpane.setSelectedIndex(1);
			}
		});
		scrollPane_1.setViewportView(albumTable);
		albumTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ALBUM ID", "ALBUM NAME"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		albumTable.getColumnModel().getColumn(0).setResizable(false);
		albumTable.getColumnModel().getColumn(0).setPreferredWidth(15);
		albumTable.getColumnModel().getColumn(1).setResizable(false);
		albumTable.getColumnModel().getColumn(1).setPreferredWidth(640);

		albumSearchtxt = new JTextField();
		albumSearchtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel tblModel;
				tblModel = (DefaultTableModel) albumTable.getModel();
				tblModel.setRowCount(0);
				String search = albumSearchtxt.getText();
				try {
					Connection con = getConnection();
					Statement stm = con.createStatement();
					String sql = "Select * from ALBUM where album_name like '%" + search + "%';";
					ResultSet result = stm.executeQuery(sql);

					while (result.next()) {
						String id = String.valueOf(result.getInt("album_id"));
						String album = result.getString("album_name");
				
						String tbData[] = { id, album };
						// tblModel.setRowCount(0);
						tblModel.addRow(tbData);
					}
					con.close();
				} catch (Exception a) {
					System.out.println(a);
				}
			}
		});
		albumSearchtxt.setBounds(600, 38, 238, 27);
		albumList.add(albumSearchtxt);
		albumSearchtxt.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Search");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(547, 39, 57, 26);
		albumList.add(lblNewLabel_3);
		
		JLabel albumHeading = new JLabel("Album");
		albumHeading.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 40));
		albumHeading.setBounds(25, 31, 154, 43);
		albumList.add(albumHeading);
		albumTable();

		JPanel albumSong = new JPanel();
		albumSong.setBackground(Color.LIGHT_GRAY);
		albumTabbedpane.addTab("New tab", null, albumSong, null);
		albumSong.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 85, 862, 508);
		albumSong.add(scrollPane_2);

		albumsongList = new JTable();
		albumsongList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = albumsongList.getSelectedRow();
				TableModel tblModel = albumsongList.getModel();
				String data = tblModel.getValueAt(row, 1).toString();
				// songDetailTab.setText(tblModel.getValueAt(songId, 1).toString());
				songDetails(data,customerName);
				tabbedPane.setSelectedIndex(6);
			}
		});
		albumsongList.setFont(new Font("Tahoma", Font.ITALIC, 15));
		albumsongList.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Song Id", "Song", "Duration", "Language", "Year"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		albumsongList.getColumnModel().getColumn(0).setResizable(false);
		albumsongList.getColumnModel().getColumn(0).setPreferredWidth(34);
		albumsongList.getColumnModel().getColumn(1).setResizable(false);
		albumsongList.getColumnModel().getColumn(1).setPreferredWidth(530);
		albumsongList.getColumnModel().getColumn(2).setResizable(false);
		albumsongList.getColumnModel().getColumn(3).setResizable(false);
		albumsongList.getColumnModel().getColumn(4).setResizable(false);
		scrollPane_2.setViewportView(albumsongList);
		
		albumSongheading = new JLabel("");
		albumSongheading.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 40));
		albumSongheading.setBounds(22, 28, 830, 51);
		albumSong.add(albumSongheading);
		artist.setBackground(Color.WHITE);

		tabbedPane.addTab("New tab", null, artist, null);
		artist.setLayout(null);

		artistTabbedpane = new JTabbedPane(JTabbedPane.TOP);
		artistTabbedpane.setBounds(0, -27, 867, 624);
		artist.add(artistTabbedpane);

		JPanel artistList = new JPanel();
		artistTabbedpane.addTab("New tab", null, artistList, null);
		artistList.setLayout(null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 70, 852, 495);
		artistList.add(scrollPane_3);

		artistTable = new JTable();
		artistTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		artistTable.setFont(new Font("Tahoma", Font.ITALIC, 18));
		artistTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Artist Id", "Artist" }) {
			Class[] columnTypes = new Class[] { Object.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		artistTable.getColumnModel().getColumn(0).setPreferredWidth(15);
		artistTable.getColumnModel().getColumn(0).setMinWidth(8);
		artistTable.getColumnModel().getColumn(1).setPreferredWidth(720);
		artistTable.setRowHeight(16);
		artistTable();
		artistTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				artistTabbedpane.setSelectedIndex(1);
				int row = artistTable.getSelectedRow();
				TableModel artisttbl = artistTable.getModel();
				String a = artisttbl.getValueAt(row, 1).toString();
				// int s=(Integer) artisttbl.getValueAt(row, 0);
				DefaultTableModel dtm = (DefaultTableModel) artistSongtable.getModel();
				dtm.setRowCount(0);
				artistSong(a);
				// songDetails(s);
			}
		});
		scrollPane_3.setViewportView(artistTable);

		JLabel lblNewLabel_4 = new JLabel("ARTIST");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_4.setBounds(22, 10, 137, 50);
		artistList.add(lblNewLabel_4);

		JLabel artsearchL = new JLabel("Search");
		artsearchL.setFont(new Font("Tahoma", Font.BOLD, 16));
		artsearchL.setBounds(521, 28, 63, 26);
		artistList.add(artsearchL);

		artistSearch = new JTextField();
		artistSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		artistSearch.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyReleased(KeyEvent e) {
//				DefaultTableModel tblModel = (DefaultTableModel) artistTable.getModel();
//				String search = artistSearch.getText();
//				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tblModel);
//				artistTable.setRowSorter(tr);
//				tr.setRowFilter(RowFilter.regexFilter(search));
//			}
//		});
		artistSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel tblModel;
				tblModel = (DefaultTableModel) artistTable.getModel();
				tblModel.setRowCount(0);
				String search = artistSearch.getText();
				if (search.equals("")) {
					artistTable();
				} else {
					try {
						Connection con = getConnection();
						Statement stm = con.createStatement();
						String sql = "select * from ARTIST where artist_name like '%" + search + "%';";
						ResultSet result = stm.executeQuery(sql);

						while (result.next()) {
							String artistId = String.valueOf(result.getInt("artist_id"));
							String artistName = result.getString("artist_name");

							String tbData[] = { artistId, artistName };
							// DefaultTableModel tblModel = (DefaultTableModel) artistTable.getModel();

							tblModel.addRow(tbData);
						}
					} catch (Exception a) {
						System.out.println(a);
					}
				}
			}
		});

		artistSearch.setBounds(587, 28, 245, 31);
		artistList.add(artistSearch);
		artistSearch.setColumns(10);

		JPanel artistSong = new JPanel();
		artistTabbedpane.addTab("New tab", null, artistSong, null);
		artistSong.setLayout(null);
		scrollPane_4.setBounds(0, 110, 862, 455);

		artistSong.add(scrollPane_4);
		artistSongtable.setFont(new Font("Tahoma", Font.ITALIC, 18));
		artistSongtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = artistSongtable.getSelectedRow();
				TableModel tblModel = artistSongtable.getModel();
				String data = tblModel.getValueAt(row, 1).toString();
				// songDetailTab.setText(tblModel.getValueAt(songId, 1).toString());
				songDetails(data,customerName);
				tabbedPane.setSelectedIndex(6);
			}
		});
		artistSongtable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Song Id", "Song", "Duration", "Language", "Year" }) {
			boolean[] columnEditables = new boolean[] { false, false, true, true, true };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		artistSongtable.getColumnModel().getColumn(0).setPreferredWidth(15);
		artistSongtable.getColumnModel().getColumn(1).setPreferredWidth(365);
		artistSongtable.setRowHeight(16);
		scrollPane_4.setViewportView(artistSongtable);
		songbyartist1.setForeground(new Color(128, 0, 0));
		songbyartist1.setFont(new Font("Tahoma", Font.BOLD, 32));
		songbyartist1.setBounds(20, 22, 430, 78);

		artistSong.add(songbyartist1);
		movies.setBackground(Color.LIGHT_GRAY);

		tabbedPane.addTab("New tab", null, movies, null);
		movies.setLayout(null);
		
		movieTabbedpane = new JTabbedPane(JTabbedPane.TOP);
		movieTabbedpane.setBounds(0, -24, 867, 621);
		movies.add(movieTabbedpane);
		
		JPanel movieList = new JPanel();
		movieTabbedpane.addTab("New tab", null, movieList, null);
		movieList.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("MOVIES");
		lblNewLabel_5.setFont(new Font("Bell MT", Font.BOLD, 32));
		lblNewLabel_5.setBounds(30, 10, 319, 49);
		movieList.add(lblNewLabel_5);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 70, 842, 503);
		movieList.add(scrollPane_5);
		
		movieTable = new JTable();
		movieTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				movieTabbedpane.setSelectedIndex(1);
				
				int row = movieTable.getSelectedRow();
				TableModel movietbl = movieTable.getModel();
				String a = movietbl.getValueAt(row, 1).toString();
				// int s=(Integer) artisttbl.getValueAt(row, 0);
				DefaultTableModel dtm = (DefaultTableModel) movieSongtable.getModel();
				dtm.setRowCount(0);
				movieSong(a);
			}
		});
		movieTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		movieTable.setFont(new Font("Tahoma", Font.ITALIC, 18));
		movieTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Movie Id", "Movie Name"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		movieTable.getColumnModel().getColumn(0).setResizable(false);
		movieTable.getColumnModel().getColumn(0).setPreferredWidth(15);
		movieTable.getColumnModel().getColumn(1).setResizable(false);
		movieTable.getColumnModel().getColumn(1).setPreferredWidth(675);
		movieTable();
		scrollPane_5.setViewportView(movieTable);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(484, 25, 81, 34);
		
		movieList.add(lblNewLabel_6);
		
		movieSongsearch = new JTextField();
		movieSongsearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				DefaultTableModel tblModel;
				tblModel = (DefaultTableModel) movieTable.getModel();
				tblModel.setRowCount(0);
				String search = movieSongsearch.getText();
					try {
						Connection con = getConnection();
						Statement stm = con.createStatement();
						String sql = "select * from movie where movie_name like '%" + search + "%';";
						ResultSet result = stm.executeQuery(sql);

						while (result.next()) {
							String movieId = String.valueOf(result.getInt("movie_id"));
							String movieName = result.getString("movie_name");

							String tbData[] = { movieId, movieName };
							// DefaultTableModel tblModel = (DefaultTableModel) artistTable.getModel();

							tblModel.addRow(tbData);
						}
					} catch (Exception a) {
						System.out.println(a);
					}
				}
			
		});
		movieSongsearch.setBounds(561, 23, 270, 33);
		movieList.add(movieSongsearch);
		movieSongsearch.setColumns(10);
		
		JPanel movieSong = new JPanel();
		movieTabbedpane.addTab("New tab", null, movieSong, null);
		movieSong.setLayout(null);
		scrollPane_6.setBounds(10, 77, 842, 496);
		
		movieSong.add(scrollPane_6);
		movieSongtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = movieSongtable.getSelectedRow();
				TableModel tblModel = movieSongtable.getModel();
				String data = tblModel.getValueAt(row, 1).toString();
				// songDetailTab.setText(tblModel.getValueAt(songId, 1).toString());
				songDetails(data,customerName);
				tabbedPane.setSelectedIndex(6);
			}
		});
		movieSongtable.setFont(new Font("Tahoma", Font.ITALIC, 18));
		movieSongtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		movieSongtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Song Id", "Song", "Duration", "Language", "Year"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		movieSongtable.getColumnModel().getColumn(1).setPreferredWidth(575);
		scrollPane_6.setViewportView(movieSongtable);
		songInmovie.setForeground(new Color(128, 0, 0));
		songInmovie.setFont(new Font("Tahoma", Font.BOLD, 30));
		songInmovie.setBounds(10, 10, 380, 57);
		
		movieSong.add(songInmovie);
		playlist.setBackground(Color.LIGHT_GRAY);

		tabbedPane.addTab("New tab", null, playlist, null);
		playlist.setLayout(null);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, -17, 867, 618);
		playlist.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 76, 808, 437);
		panel_2.add(scrollPane_7);
		
		playlistTable = new JTable();
		playlistTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = playlistTable.getSelectedRow();
				TableModel tblModel = playlistTable.getModel();
				String data = tblModel.getValueAt(row, 1).toString();
				songDetails(data,customerName);
				tabbedPane.setSelectedIndex(6);
			}
		});
		playlistTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		playlistTable.setFont(new Font("Tahoma", Font.ITALIC, 16));
		playlistTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Song", "Duration", "Language", "Year"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		playlistTable.getColumnModel().getColumn(0).setResizable(false);
		playlistTable.getColumnModel().getColumn(0).setPreferredWidth(20);
		playlistTable.getColumnModel().getColumn(1).setResizable(false);
		playlistTable.getColumnModel().getColumn(1).setPreferredWidth(375);
		playlistTable.getColumnModel().getColumn(2).setResizable(false);
		playlistTable.getColumnModel().getColumn(3).setResizable(false);
		playlistTable.getColumnModel().getColumn(4).setResizable(false);
//		playlistTable(customerName);
		scrollPane_7.setViewportView(playlistTable);
		
		JLabel lblNewLabel_7 = new JLabel("Playlist");
		lblNewLabel_7.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel_7.setBounds(10, 10, 310, 56);
		panel_2.add(lblNewLabel_7);
		
		JButton editbtm = new JButton("EDIT");
		editbtm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(1);
			}
		});
		editbtm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		editbtm.setBounds(698, 523, 110, 30);
		panel_2.add(editbtm);
		
		JPanel editPanel = new JPanel();
		tabbedPane_1.addTab("New tab", null, editPanel, null);
		editPanel.setLayout(null);
		scrollPane_8.setBounds(10, 78, 815, 426);
		
		editPanel.add(scrollPane_8);
		editplaylistTable.setFont(new Font("Tahoma", Font.ITALIC, 16));
		editplaylistTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		editplaylistTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Song", "Duration", "Language", "Year"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		editplaylistTable.getColumnModel().getColumn(0).setResizable(false);
		editplaylistTable.getColumnModel().getColumn(0).setPreferredWidth(25);
		editplaylistTable.getColumnModel().getColumn(1).setResizable(false);
		editplaylistTable.getColumnModel().getColumn(1).setPreferredWidth(375);
		editplaylistTable.getColumnModel().getColumn(2).setResizable(false);
		editplaylistTable.getColumnModel().getColumn(3).setResizable(false);
		editplaylistTable.getColumnModel().getColumn(4).setResizable(false);
		playlistTable(customerName);
		scrollPane_8.setViewportView(editplaylistTable);
		
		JButton deleteplaylist = new JButton("DELETE");
		deleteplaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = editplaylistTable.getSelectedRow();
				TableModel tblModel = editplaylistTable.getModel();
				String song_id = tblModel.getValueAt(row, 0).toString();
				try {
					Connection con = getConnection();
					Statement stm = con.createStatement();
					String sql="delete from playlist where customer_id = (select customer_id from customer where customer_name='"+customerName+"') and song_id="+song_id+";";
					stm.executeUpdate(sql);
					DefaultTableModel tblModel1 = (DefaultTableModel) playlistTable.getModel();
						DefaultTableModel tblModel2 = (DefaultTableModel) editplaylistTable.getModel();
						tblModel1.setRowCount(0);
						tblModel2.setRowCount(0);
						playlistTable(customerName);
						
						tabbedPane_1.setSelectedIndex(0);
				}catch(Exception c)
				{
					c.printStackTrace();
				}
				
			}
		});
		deleteplaylist.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		deleteplaylist.setBounds(702, 514, 123, 32);
		editPanel.add(deleteplaylist);
		
		JLabel lblNewLabel_8 = new JLabel("EDIT PLAYLIST");
		lblNewLabel_8.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_8.setBounds(10, 10, 375, 55);
		editPanel.add(lblNewLabel_8);
		year.setForeground(Color.WHITE);
		year.setBackground(Color.LIGHT_GRAY);

		tabbedPane.addTab("New tab", null, year, null);
		year.setLayout(null);

		JScrollPane scrollPane_5_1 = new JScrollPane();
		scrollPane_5_1.setBounds(10, 10, 119, 562);
		year.add(scrollPane_5_1);

		yearTable = new JTable();
		yearTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		yearTable.setFont(new Font("Tahoma", Font.ITALIC, 16));
		yearTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Year" }) {
			boolean[] columnEditables = new boolean[] { false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		yearTable.setRowHeight(20);
		yearTable.setRowHeight(16);
		yearTable();
		yearTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = yearTable.getSelectedRow();
				TableModel yeartbl = yearTable.getModel();
				String a = yeartbl.getValueAt(row, 0).toString();
				DefaultTableModel dtm = (DefaultTableModel) yearSongtable.getModel();
				dtm.setRowCount(0);
				yearSongtable(a);
			}
		});

		scrollPane_5_1.setViewportView(yearTable);
		JScrollPane scrollPane_6_1 = new JScrollPane();
		scrollPane_6_1.setBounds(141, 10, 702, 563);
		year.add(scrollPane_6_1);
		yearSongtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		yearSongtable.setFont(new Font("Tahoma", Font.ITALIC, 16));
		yearSongtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = yearSongtable.getSelectedRow();
				TableModel tblModel = yearSongtable.getModel();
				String data = tblModel.getValueAt(row, 1).toString();
				// songDetailTab.setText(tblModel.getValueAt(songId, 1).toString());
				songDetails(data,customerName);
				tabbedPane.setSelectedIndex(6);
			}
		});
		yearSongtable.setModel(
				new DefaultTableModel(new Object[][] {}, new String[] { "Song Id", "Song", "Duration", "Language" }));
		yearSongtable.getColumnModel().getColumn(0).setPreferredWidth(15);
		yearSongtable.getColumnModel().getColumn(1).setPreferredWidth(375);
		yearSongtable.setRowHeight(16);
		scrollPane_6_1.setViewportView(yearSongtable);

		JPanel songDetail = new JPanel();
		songDetail.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("New tab", null, songDetail, null);
		songDetail.setLayout(null);

		songDetail_1 = new JPanel();
		songDetail_1.setBackground(SystemColor.controlHighlight);
		songDetail_1.setBounds(10, 10, 847, 581);
		songDetail.add(songDetail_1);
		songDetail_1.setLayout(null);

		songTitleshow = new JLabel("");
		songTitleshow.setBackground(new Color(255, 255, 225));
		songTitleshow.setHorizontalAlignment(SwingConstants.LEFT);
		songTitleshow.setBounds(20, 143, 806, 46);
		songDetail_1.add(songTitleshow);
		songTitleshow.setFont(new Font("RomanT", Font.BOLD, 24));
		movieTitleshow.setHorizontalAlignment(SwingConstants.LEFT);
		movieTitleshow.setFont(new Font("RomanT", Font.BOLD, 24));
		movieTitleshow.setBounds(20, 199, 806, 46);

		songDetail_1.add(movieTitleshow);
		artistTitleshow.setHorizontalAlignment(SwingConstants.LEFT);
		artistTitleshow.setFont(new Font("RomanT", Font.BOLD, 24));
		artistTitleshow.setBounds(20, 255, 806, 46);

		songDetail_1.add(artistTitleshow);
		languageTitleshow.setHorizontalAlignment(SwingConstants.LEFT);
		languageTitleshow.setFont(new Font("RomanT", Font.BOLD, 24));
		languageTitleshow.setBounds(20, 367, 806, 46);

		songDetail_1.add(languageTitleshow);
		yearTitleshow.setHorizontalAlignment(SwingConstants.LEFT);
		yearTitleshow.setFont(new Font("RomanT", Font.BOLD, 24));
		yearTitleshow.setBounds(20, 479, 627, 46);

		songDetail_1.add(yearTitleshow);
		lengthTitleshow.setBackground(Color.WHITE);
		lengthTitleshow.setFont(new Font("RomanT", Font.BOLD, 24));
		lengthTitleshow.setBounds(18, 423, 629, 46);

		songDetail_1.add(lengthTitleshow);
		songHeading.setFont(new Font("Sitka Heading", Font.BOLD, 36));
		songHeading.setBounds(20, 10, 806, 80);

		songDetail_1.add(songHeading);
		
		playListbtm = new JLabel("ADD TO PLAYLIST");
		playListbtm.setBackground(Color.BLUE);
		playListbtm.setForeground(Color.RED);
		playListbtm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		playListbtm.setBounds(632, 60, 165, 30);
		songDetail_1.add(playListbtm);
		albumTitleshow.setFont(new Font("RomanT", Font.BOLD, 24));
		albumTitleshow.setBounds(20, 311, 806, 46);
		
		songDetail_1.add(albumTitleshow);
		suggestion.setBackground(SystemColor.activeCaptionBorder);
		
		tabbedPane.addTab("New tab", null, suggestion, null);
		suggestion.setLayout(null);
		
		titleSuggestion = new JTextField("Enter a short Title",16);
		titleSuggestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				titleSuggestion.setForeground(new Color(0,0,0));
				titleSuggestion.setText("");
			}
		});
		
		titleSuggestion.setForeground(Color.GRAY);
		titleSuggestion.setFont(new Font("Tahoma", Font.ITALIC, 14));
		titleSuggestion.setBounds(10, 96, 831, 47);
		suggestion.add(titleSuggestion);
		titleSuggestion.setColumns(10);
		
		JLabel addSuggestiontxt = new JLabel("ADD SUGGESTION");
		addSuggestiontxt.setFont(new Font("Tahoma", Font.BOLD, 20));
		addSuggestiontxt.setBounds(10, 27, 218, 47);
		suggestion.add(addSuggestiontxt);
		
		final JTextArea description = new JTextArea();
		description.setWrapStyleWord(true);
		description.setLineWrap(true);
		description.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				description.setForeground(new Color(0,0,0));
				description.setText("");
			}
		});
		description.setForeground(Color.GRAY);
		description.setFont(new Font("Tahoma", Font.PLAIN, 14));
		description.setText("Description");
		description.setBounds(10, 176, 827, 312);
		suggestion.add(description);
		
		JButton btnNewButton = new JButton("Save Suggestion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = titleSuggestion.getText();
				String describe = description.getText();
				try {
					Connection con = getConnection();
					Statement stm = con.createStatement();
					String sql ="select * from customer where customer_name ='" + user + "';";
					ResultSet r1 = stm.executeQuery(sql);
					if(r1.next()){
						String cust_id =r1.getString("customer_id");
						String sql1="insert into suggestion (customer_id, title, description) values ("+cust_id+",'"+title+"','"+describe+"');";
						int s = stm.executeUpdate(sql1);
						if(s == 1 ) {
						titleSuggestion.setText("");
						description.setText("");
						JOptionPane.showMessageDialog(contentPane, "Submitted");
						}
					}
				} catch(Exception a)
				{
					a.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(681, 518, 160, 47);
		suggestion.add(btnNewButton);
		
		// songCard.setLayout(new CardLayout(0, 0));
		setResizable(false);
		setVisible(true);
	}

	public void songTable() {
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "Select * from SONG;";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = String.valueOf(result.getInt("song_id"));
				String song = result.getString("song_name");
				String duration = result.getString("song_duration");
				String language = result.getString("song_language");
				String year = result.getString("y_id");

				String tbData[] = { id, song, duration, language, year };
				DefaultTableModel tblModel = (DefaultTableModel) songTable.getModel();
				tblModel.addRow(tbData);
			}
			con.close();
		} catch (Exception a) {
			System.out.println("Exception");
		}
	}

	public void songDetails(String s,String user) {
		String songName = s;
		final String customerName=user;
		try {
			Connection con = getConnection();
			final Statement stm = con.createStatement();
			String sql = "select * from SONG where song_name ='" + songName + "';";
			String sql1 = "select movie_name from MOVIE where movie_id =(select m_id from SONG where song_name='"
					+ songName + "');";
			String sql2 = "select artist_name from artist where artist_id in (select art_id from artist_song where s_id=(select song_id from song where song_name='"
					+ songName + "'));";
			
			ResultSet result = stm.executeQuery(sql);

			if (result.next()) {
				String songid =result.getString("song_id");
				String songname = result.getString("song_name");
				String language = result.getString("song_language");
				String duration = result.getString("song_duration");
				String year = result.getString("y_id");
				songTitleshow.setText("TITLE : " + songname);
				languageTitleshow.setText("LANGUAGE : " + language);
				yearTitleshow.setText("YEAR : " + year);
				lengthTitleshow.setText("DURATION : " + duration);
		
				String sql3="select * from customer where customer_name ='"+customerName+"';";
				ResultSet result3 = stm.executeQuery(sql3);
				if(result3.next())
				{
					String cust_id =result3.getString("customer_id");
					final String sql4 = "insert into playlist values ("+cust_id+","+songid+");";
				
				playListbtm.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						try {
							stm.executeUpdate(sql4);
							DefaultTableModel tblModel = (DefaultTableModel) playlistTable.getModel();
							DefaultTableModel tblModel1 = (DefaultTableModel) editplaylistTable.getModel();
							JOptionPane.showMessageDialog(songDetail_1,"Song Added to Playlist");
							tblModel.setRowCount(0);
							tblModel1.setRowCount(0);
							playlistTable(customerName);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				});
				result3.close();
				}
				
				String sql5 = "select album_name from album where album_id = (select a_id from song where song_id ="+songid+");";
				ResultSet result5 =stm.executeQuery(sql5);
				if(result5.next())
				{
					String albumname=result5.getString("album_name");
					albumTitleshow.setText("ALBUM : "+albumname);
					result5.close();
				}
				result.close();
			}
			
			ResultSet result1 = stm.executeQuery(sql1);
			if (result1.next()) {
				String moviename = result1.getString("movie_name");
				movieTitleshow.setText("MOVIE : " + moviename);
				result1.close();
			}
			ResultSet result2 = stm.executeQuery(sql2);
			if (result2.next()) {
				String artistname = result2.getString("artist_name");
				artistTitleshow.setText("ARTIST : " + artistname);
			}
			
			
		
		} catch (Exception c) {
			System.out.println(c);
		}
	}

	public void albumTable() {
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "Select * from album;";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = String.valueOf(result.getInt("album_id"));
				String album = result.getString("album_name");
			
				String tbData[] = { id, album };
				DefaultTableModel tblModel = (DefaultTableModel) albumTable.getModel();

				tblModel.addRow(tbData);
			}
			con.close();
		} catch (Exception a) {
			System.out.println(a);
		}
	}
	
	
	public void albumSongtable(String s)
	{
		String album=s;
		albumSongheading.setText(album);
		
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from SONG where a_id= (select album_id from album where album_name='"+album+"');";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = String.valueOf(result.getInt("song_id"));
				String song = result.getString("song_name");
				String duration = result.getString("song_duration");
				String language = result.getString("song_language");
				String year = result.getString("y_id");

				String tbData[] = { id, song, duration, language, year };
				DefaultTableModel tblModel = (DefaultTableModel) albumsongList.getModel();

				tblModel.addRow(tbData);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void artistTable() {
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from ARTIST;";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String artistId = String.valueOf(result.getInt("artist_id"));
				String artistName = result.getString("artist_name");

				String tbData[] = { artistId, artistName };
				DefaultTableModel tblModel = (DefaultTableModel) artistTable.getModel();

				tblModel.addRow(tbData);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void artistSong(String a) {
		String artistName = a;
		// int artistId =s;
		songbyartist1.setText(artistName);

		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from SONG ,artist_song where song_id=s_id and art_id =(select artist_id from ARTIST where artist_name='"
					+ artistName + "');";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = String.valueOf(result.getInt("song_id"));
				String song = result.getString("song_name");
				String duration = result.getString("song_duration");
				String language = result.getString("song_language");
				String year = result.getString("y_id");

				String tbData[] = { id, song, duration, language, year };
				DefaultTableModel tblModel = (DefaultTableModel) artistSongtable.getModel();

				tblModel.addRow(tbData);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void yearTable() {
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from YEARS;";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String yearId = String.valueOf(result.getInt("year_id"));

				String tbData[] = { yearId };
				DefaultTableModel tblModel = (DefaultTableModel) yearTable.getModel();

				tblModel.addRow(tbData);
			}
		} catch (Exception e) {
			System.out.println("Singh");
		}
	}

	public void yearSongtable(String data) {
		String year = data;
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from SONG where y_id=" + year + ";";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = String.valueOf(result.getInt("song_id"));
				String song = result.getString("song_name");
				String duration = result.getString("song_duration");
				String language = result.getString("song_language");
				// String year = result.getString("y_id");

				String tbData[] = { id, song, duration, language };
				DefaultTableModel tblModel = (DefaultTableModel) yearSongtable.getModel();

				tblModel.addRow(tbData);
			}
			con.close();
		} catch (Exception e) {
			System.out.println("Sachin");
		}

	}
	
	public void movieTable()
	{
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from movie;";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String movieId = String.valueOf(result.getInt("movie_id"));
				String movieName =result.getString("movie_name");

				String tbData[] = { movieId , movieName };
				DefaultTableModel tblModel = (DefaultTableModel) movieTable.getModel();
				tblModel.addRow(tbData);
			}
		} catch (Exception e) {
			System.out.println("Exception at Movie Table");
		}
	}
	
	public void movieSong(String a) {
		String movieName = a;
		// int artistId =s;
		songInmovie.setText(movieName);

		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from SONG where m_id=(select movie_id from movie where movie_name='"
					+ movieName + "');";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = String.valueOf(result.getInt("song_id"));
				String song = result.getString("song_name");
				String duration = result.getString("song_duration");
				String language = result.getString("song_language");
				String year = result.getString("y_id");

				String tbData[] = { id, song, duration, language, year };
				DefaultTableModel tblModel = (DefaultTableModel) movieSongtable.getModel();

				tblModel.addRow(tbData);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void playlistTable(String user)
	{
		String customerName = user;
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from SONG where song_id in (select song_id from playlist where customer_id =(select customer_id from customer where customer_name = '"+customerName+"'));";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = String.valueOf(result.getInt("song_id"));
				String song = result.getString("song_name");
				String duration = result.getString("song_duration");
				String language = result.getString("song_language");
				String year = result.getString("y_id");

				String tbData[] = { id, song, duration, language, year };
				DefaultTableModel tblModel = (DefaultTableModel) playlistTable.getModel();

				tblModel.addRow(tbData);
				DefaultTableModel tblModel1 = (DefaultTableModel) editplaylistTable.getModel();

				tblModel1.addRow(tbData);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void editplaylistTable(String user)
	{
		String customerName = user;
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from SONG where song_id in (select song_id from playlist where customer_id =(select customer_id from customer where customer_name = '"+customerName+"'));";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = String.valueOf(result.getInt("song_id"));
				String song = result.getString("song_name");
				String duration = result.getString("song_duration");
				String language = result.getString("song_language");
				String year = result.getString("y_id");

				String tbData[] = { id, song, duration, language, year };
				DefaultTableModel tblModel = (DefaultTableModel) editplaylistTable.getModel();

				tblModel.addRow(tbData);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void playSong(String s_id)
	{
		String song_id = s_id;
		
		play = new JButton("PLAY");
		play.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		play.setBounds(346, 511, 120, 35);
		songDetail_1.add(play);
		
		stop = new JButton("STOP");
		stop.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		stop.setBounds(572, 511, 120, 35);
		songDetail_1.add(stop);
		
		pause = new JButton("PAUSE");
		pause.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		pause.setBounds(124, 511, 120, 35);
		songDetail_1.add(pause);
		
		try {
			Connection con = getConnection();
			Statement stm = con.createStatement();
			String sql = "select * from songlocation where song_id = "+song_id+";";
			ResultSet result = stm.executeQuery(sql);
			if(result.next())
			{
				String path = result.getString("songLocation");
				final MP3Player m=new MP3Player(new File(path));
				
				play.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							m.play();
						}
				});
				
				pause.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						m.pause();
					}
				});
				stop.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						m.stop();
						exit();
					}
				});
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void exit() {
		// TODO Auto-generated method stub
		
	}
}
