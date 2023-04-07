package buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class adminUI extends JFrame {

	private JPanel contentPane;
	private JTable editUsertable;
	private JTabbedPane tabbedPane;
	private JSplitPane splitPane;
	private JPanel sidePanel;
	private JPanel addSongpanel;
	private JLabel addSonglabel;
	private JPanel updateSongpanel;
	private JLabel updateSonglabel;
	private JPanel deleteSongpanel;
	private JLabel deleteSonglabel;
	private JPanel removeUserpanel;
	private JLabel removeUserlabel;
	private JPanel signoutpanel;
	private JLabel signoutLabel;
	private JButton removeButton;
	private JPanel updateSongtab;
	private JPanel deleteSongtab;
	private JTextField addSongname;
	private JTextField addDuration;
	private JTextField addYear;
	private JComboBox<String> addArtist;
	private JTextField addLanguage;
	private JComboBox addMovie;
	private JPanel addMoviepanel;
	private JLabel lblAddMovie;
	private JPanel addArtistpanel;
	private JLabel lblAddArtist;
	private JPanel addArtisttab;
	private JPanel addMovietab;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField addArtistnametxt;
	private JLabel lblNewLabel_4;
	private JTable removeArtisttable;
	private JButton btnNewButton;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField addMovienametxt;
	private JLabel lblNewLabel_9;
	private JTable removeMovietable;
	private JButton removeMoviebutton;
	private JLabel lblNewLabel_10;
	private JTable deleteSongtable;
	private JTable updateSongtable;
	private JTextField updateSongnametxt;
	private JTextField updateDurationtxt;
	private JTextField updateLanguagetxt;
	private JTextField updateYeartxt;
	private JPanel suggestionPanel;
	private JTable suggestionTable;
	private JTabbedPane suggestionTabbedpane;
	private JLabel descriptionTitle;
	private JTextArea descriptionBody;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminUI frame = new adminUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
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

	/**
	 * Create the frame.
	 */
	public adminUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(adminUI.class.getResource("/buttons/musicicon.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setResizeWeight(0.18);
		splitPane.setBounds(5, -24, 693, 554);
		contentPane.add(splitPane);

		sidePanel = new JPanel();
		sidePanel.setBackground(new Color(32, 178, 170));
		splitPane.setLeftComponent(sidePanel);
		sidePanel.setLayout(null);
		
		//tabbedPane.setSelectedIndex(5);

		addSongpanel = new JPanel();
		addSongpanel.setBackground(new Color(32, 178, 170));
		addSongpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);

				addSongpanel.setBackground(new Color(176, 224, 230));
				updateSongpanel.setBackground(new Color(32, 178, 170));
				deleteSongpanel.setBackground(new Color(32, 178, 170));
				removeUserpanel.setBackground(new Color(32, 178, 170));
				addArtistpanel.setBackground(new Color(32, 178, 170));
				addMoviepanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
			}
		});
		addSongpanel.setBounds(0, 204, 117, 30);
		sidePanel.add(addSongpanel);
		addSongpanel.setLayout(null);

		addSonglabel = new JLabel("Add Song");
		addSonglabel.setBounds(22, 5, 62, 15);
		addSonglabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		addSongpanel.add(addSonglabel);

		updateSongpanel = new JPanel();
		updateSongpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);

				addSongpanel.setBackground(new Color(32, 178, 170));
				updateSongpanel.setBackground(new Color(176, 224, 230));
				deleteSongpanel.setBackground(new Color(32, 178, 170));
				removeUserpanel.setBackground(new Color(32, 178, 170));
				addArtistpanel.setBackground(new Color(32, 178, 170));
				addMoviepanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
			}
		});
		updateSongpanel.setBackground(new Color(32, 178, 170));
		updateSongpanel.setBounds(0, 244, 117, 30);
		sidePanel.add(updateSongpanel);
		updateSongpanel.setLayout(null);

		updateSonglabel = new JLabel("Update Song");
		updateSonglabel.setBounds(19, 5, 75, 15);
		updateSonglabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		updateSongpanel.add(updateSonglabel);

		deleteSongpanel = new JPanel();
		deleteSongpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);

				addSongpanel.setBackground(new Color(32, 178, 170));
				updateSongpanel.setBackground(new Color(32, 178, 170));
				deleteSongpanel.setBackground(new Color(176, 224, 230));
				removeUserpanel.setBackground(new Color(32, 178, 170));
				addArtistpanel.setBackground(new Color(32, 178, 170));
				addMoviepanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
			}
		});
		deleteSongpanel.setBackground(new Color(32, 178, 170));
		deleteSongpanel.setBounds(0, 284, 117, 30);
		sidePanel.add(deleteSongpanel);
		deleteSongpanel.setLayout(null);

		deleteSonglabel = new JLabel("Delete Song");
		deleteSonglabel.setBounds(21, 5, 86, 15);
		deleteSonglabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		deleteSongpanel.add(deleteSonglabel);

		removeUserpanel = new JPanel();
		removeUserpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(5);

				addSongpanel.setBackground(new Color(32, 178, 170));
				updateSongpanel.setBackground(new Color(32, 178, 170));
				deleteSongpanel.setBackground(new Color(32, 178, 170));
				removeUserpanel.setBackground(new Color(176, 224, 230));
				addArtistpanel.setBackground(new Color(32, 178, 170));
				addMoviepanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
			}
		});
		removeUserpanel.setBackground(new Color(32, 178, 170));
		removeUserpanel.setBounds(0, 324, 117, 30);
		sidePanel.add(removeUserpanel);

		removeUserlabel = new JLabel("Remove User");
		removeUserlabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		removeUserpanel.add(removeUserlabel);

		signoutpanel = new JPanel();
		signoutpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				addSongpanel.setBackground(new Color(32, 178, 170));
				updateSongpanel.setBackground(new Color(32, 178, 170));
				deleteSongpanel.setBackground(new Color(32, 178, 170));
				removeUserpanel.setBackground(new Color(32, 178, 170));
				addArtistpanel.setBackground(new Color(32, 178, 170));
				addMoviepanel.setBackground(new Color(32, 178, 170));
				signoutpanel.setBackground(new Color(176, 224, 230));
				suggestionPanel.setBackground(new Color(32, 178, 170));
				JOptionPane.showMessageDialog(contentPane, "Sign Out");
				homePage a =new homePage();
				setVisible(false);
			}
		});
		signoutpanel.setBackground(new Color(32, 178, 170));
		signoutpanel.setBounds(0, 402, 117, 30);
		sidePanel.add(signoutpanel);
		signoutpanel.setLayout(null);

		signoutLabel = new JLabel("Sign Out");
		signoutLabel.setBounds(33, 5, 59, 15);
		signoutLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		signoutpanel.add(signoutLabel);
		
		addMoviepanel = new JPanel();
		addMoviepanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);

				addSongpanel.setBackground(new Color(32, 178, 170));
				updateSongpanel.setBackground(new Color(32, 178, 170));
				deleteSongpanel.setBackground(new Color(32, 178, 170));
				removeUserpanel.setBackground(new Color(32, 178, 170));
				addArtistpanel.setBackground(new Color(32, 178, 170));
				addMoviepanel.setBackground(new Color(176, 224, 230));
				suggestionPanel.setBackground(new Color(32, 178, 170));
			}
		});
		addMoviepanel.setLayout(null);
		addMoviepanel.setBackground(new Color(32, 178, 170));
		addMoviepanel.setBounds(0, 164, 117, 30);
		sidePanel.add(addMoviepanel);
		
		lblAddMovie = new JLabel("Edit Movie");
		lblAddMovie.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddMovie.setBounds(22, 5, 62, 15);
		addMoviepanel.add(lblAddMovie);
		
		addArtistpanel = new JPanel();
		addArtistpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);

				addSongpanel.setBackground(new Color(32, 178, 170));
				updateSongpanel.setBackground(new Color(32, 178, 170));
				deleteSongpanel.setBackground(new Color(32, 178, 170));
				removeUserpanel.setBackground(new Color(32, 178, 170));
				addArtistpanel.setBackground(new Color(176, 224, 230));
				addMoviepanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(32, 178, 170));
			}
		});
		addArtistpanel.setLayout(null);
		addArtistpanel.setBackground(new Color(176, 224, 230));
		addArtistpanel.setBounds(0, 124, 117, 30);
		sidePanel.add(addArtistpanel);
		
		lblAddArtist = new JLabel("Edit Artist");
		lblAddArtist.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddArtist.setBounds(20, 10, 74, 15);
		addArtistpanel.add(lblAddArtist);
		
		suggestionPanel = new JPanel();
		suggestionPanel.setLayout(null);
		suggestionPanel.setBackground(new Color(32, 178, 170));
		suggestionPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(6);
				suggestionTabbedpane.setSelectedIndex(0);

				addSongpanel.setBackground(new Color(32, 178, 170));
				updateSongpanel.setBackground(new Color(32, 178, 170));
				deleteSongpanel.setBackground(new Color(32, 178, 170));
				removeUserpanel.setBackground(new Color(32, 178, 170));
				addArtistpanel.setBackground(new Color(32, 178, 170));
				addMoviepanel.setBackground(new Color(32, 178, 170));
				suggestionPanel.setBackground(new Color(176, 224, 230));
			}
		});
		suggestionPanel.setBounds(0, 362, 117, 30);
		sidePanel.add(suggestionPanel);
		
		JLabel suggestion = new JLabel("Suggestion");
		suggestion.setFont(new Font("Tahoma", Font.BOLD, 12));
		suggestion.setBounds(20, 5, 87, 15);
		suggestionPanel.add(suggestion);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		splitPane.setRightComponent(tabbedPane);
		
		addArtisttab = new JPanel();
		tabbedPane.addTab("New tab", null, addArtisttab, null);
		addArtisttab.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Edit Artist");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 10, 140, 45);
		addArtisttab.add(lblNewLabel_2);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 67, 567, 458);
		addArtisttab.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_4 = new JLabel("Remove Artist");
		lblNewLabel_4.setBounds(10, 132, 160, 30);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 172, 323, 264);
		panel.add(scrollPane_1);
		
		removeArtisttable = new JTable();
		removeArtisttable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		removeArtisttable.setFont(new Font("Tahoma", Font.ITALIC, 12));
		removeArtisttable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Artist Id", "Artist Name"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		removeArtisttable.getColumnModel().getColumn(0).setResizable(false);
		removeArtisttable.getColumnModel().getColumn(0).setPreferredWidth(51);
		removeArtisttable.getColumnModel().getColumn(1).setResizable(false);
		removeArtisttable.getColumnModel().getColumn(1).setPreferredWidth(275);
		removeArtisttable();
		scrollPane_1.setViewportView(removeArtisttable);
		
		JButton addArtistbutton = new JButton("ADD");
		addArtistbutton.setBounds(10, 101, 101, 21);
		panel.add(addArtistbutton);
		
		addArtistnametxt = new JTextField();
		addArtistnametxt.setBounds(10, 49, 191, 30);
		panel.add(addArtistnametxt);
		addArtistnametxt.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Add Artist Name");
		lblNewLabel_3.setBounds(10, 10, 160, 30);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnNewButton = new JButton("REMOVE");
		btnNewButton.setBounds(382, 393, 121, 35);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = removeArtisttable.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) removeArtisttable.getModel();
				String artist_id = tblModel.getValueAt(row, 0).toString();

				try {
//					Class.forName("com.mysql.jdbc.Driver");
//					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/musicsystem", "root",
//							"Sachin51@");
					Connection con =getConnection();
					Statement stm = con.createStatement();
					String sql = "delete from artist where artist_id =" + artist_id + ";";
					int result = stm.executeUpdate(sql);

					tblModel.setRowCount(0);
					removeArtisttable();

				} catch (Exception a) {
					System.out.println(a);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		addArtistbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String artistname=addArtistnametxt.getText();
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					//Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/musicsystem", "root",
					//		"Sachin51@");
					Connection con = getConnection();
					Statement stm = con.createStatement();
					String sql = "insert into artist (artist_name) values ('"+artistname+"');";
					int result = stm.executeUpdate(sql);
				}
				catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
		
		addMovietab = new JPanel();
		tabbedPane.addTab("New tab", null, addMovietab, null);
		addMovietab.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Edit Movie");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_7.setBounds(10, 10, 164, 48);
		addMovietab.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Add Movie Name");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(10, 69, 149, 40);
		addMovietab.add(lblNewLabel_8);
		
		addMovienametxt = new JTextField();
		addMovienametxt.setBounds(10, 107, 203, 31);
		addMovietab.add(addMovienametxt);
		addMovienametxt.setColumns(10);
		
		JButton addMoviebutton = new JButton("ADD");
		addMoviebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String moviename=addMovienametxt.getText();
				try {
					Connection con = getConnection();
					Statement stm = con.createStatement();
					String sql = "insert into movie (movie_name) values ('"+moviename+"');";
					int result = stm.executeUpdate(sql);
				}
				catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
		addMoviebutton.setFont(new Font("Tahoma", Font.BOLD, 10));
		addMoviebutton.setBounds(10, 158, 99, 21);
		addMovietab.add(addMoviebutton);
		
		lblNewLabel_9 = new JLabel("Remove Movie");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(10, 211, 164, 40);
		addMovietab.add(lblNewLabel_9);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 260, 328, 244);
		addMovietab.add(scrollPane_2);
		
		removeMovietable = new JTable();
		removeMovietable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Movie Id", "Movie"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		removeMovietable.getColumnModel().getColumn(0).setResizable(false);
		removeMovietable.getColumnModel().getColumn(0).setPreferredWidth(49);
		removeMovietable.getColumnModel().getColumn(1).setResizable(false);
		removeMovietable.getColumnModel().getColumn(1).setPreferredWidth(275);
		removeMovietable();
		scrollPane_2.setViewportView(removeMovietable);
		
		removeMoviebutton = new JButton("REMOVE");
		removeMoviebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int row = removeMovietable.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) removeMovietable.getModel();
				String movie_id = tblModel.getValueAt(row, 0).toString();

				try {
					Connection con =getConnection();
					Statement stm = con.createStatement();
					String sql = "delete from movie where movie_id =" + movie_id + ";";
					int result = stm.executeUpdate(sql);

					tblModel.setRowCount(0);
					removeArtisttable();

				} catch (Exception a) {
					System.out.println(a);
				}
			}
		});
		removeMoviebutton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		removeMoviebutton.setBounds(376, 465, 121, 31);
		addMovietab.add(removeMoviebutton);

		JPanel addSongtab = new JPanel();
		tabbedPane.addTab("New tab", null, addSongtab, null);
		addSongtab.setLayout(null);

		JLabel lblNewLabel = new JLabel("Song Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 101, 96, 29);
		addSongtab.add(lblNewLabel);
		
		addSongname = new JTextField();
		addSongname.setBounds(10, 140, 253, 29);
		addSongtab.add(addSongname);
		addSongname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Duration");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 179, 96, 29);
		addSongtab.add(lblNewLabel_1);
		
		addDuration = new JTextField();
		addDuration.setColumns(10);
		addDuration.setBounds(10, 205, 96, 29);
		addSongtab.add(addDuration);
		
		JLabel lblNewLabel_1_1 = new JLabel("Language");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(224, 179, 96, 29);
		addSongtab.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Year");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 310, 45, 29);
		addSongtab.add(lblNewLabel_1_2);
		
		addYear = new JTextField();
		addYear.setColumns(10);
		addYear.setBounds(10, 344, 96, 29);
		addSongtab.add(addYear);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Artist");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 244, 96, 29);
		addSongtab.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Movie");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(224, 244, 96, 29);
		addSongtab.add(lblNewLabel_1_1_2);
		
		addArtist = new JComboBox();
		addArtist.setBounds(10, 271, 162, 29);
		addArtist();
		addSongtab.add(addArtist);
		
		addLanguage = new JTextField();
		addLanguage.setColumns(10);
		addLanguage.setBounds(224, 205, 96, 29);
		addSongtab.add(addLanguage);
		
		addMovie = new JComboBox();
		addMovie.setBounds(224, 271, 162, 29);
		addMovie();
		addSongtab.add(addMovie);
		
		lblNewLabel_5 = new JLabel("Add Song");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 10, 217, 55);
		addSongtab.add(lblNewLabel_5);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String song = addSongname.getText();
				String duration=addDuration.getText();
				String year=addYear.getText();
				String language=addLanguage.getText();
				String artist=(String) addArtist.getSelectedItem();
				String movie=(String) addMovie.getSelectedItem();
				try {
					Connection con =getConnection();
					Statement stm =con.createStatement();
					String insert ="insert into song (song_name,song_duration,song_language,y_id) values ('"+song+"','"+duration+"','"+language+"',"+year+");";
					int result = stm.executeUpdate(insert);
					String insert1 ="update song set m_id = (select movie_id from movie where movie_name ='"+movie+"') where song_name ='"+song+"';";
					int result1 = stm.executeUpdate(insert1);
					String sql ="select * from song where song_name ='"+song+"';";
					ResultSet result2 = stm.executeQuery(sql);
					if(result2.next())
					{
						String song_id = result2.getString("song_id");
						String sql1="select * from artist where artist_name ='"+artist+"';";
						ResultSet result3 = stm.executeQuery(sql1);
						if(result3.next())
						{
							String artist_id = result3.getString("artist_id");
							String insert2 ="insert into artist_song values ("+artist_id+","+song_id+");";
							int result4 = stm.executeUpdate(insert2);
						}
					}
				}catch(Exception a)
				{
					System.out.println(a);
				}
				addSongname.setText("");
				addDuration.setText("");
				addYear.setText("");
				addLanguage.setText("");
				
			}
		});
		addButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		addButton.setBounds(238, 435, 104, 34);
		addSongtab.add(addButton);

		updateSongtab = new JPanel();
		tabbedPane.addTab("New tab", null, updateSongtab, null);
		updateSongtab.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 10, 547, 268);
		updateSongtab.add(scrollPane_4);
		
		updateSongtable = new JTable();
		updateSongtable.setFont(new Font("Tahoma", Font.ITALIC, 12));
		updateSongtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		updateSongtable.setModel(new DefaultTableModel(
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
		updateSongtable.getColumnModel().getColumn(0).setResizable(false);
		updateSongtable.getColumnModel().getColumn(0).setPreferredWidth(30);
		updateSongtable.getColumnModel().getColumn(1).setResizable(false);
		updateSongtable.getColumnModel().getColumn(1).setPreferredWidth(375);
		updateSongtable.getColumnModel().getColumn(2).setResizable(false);
		updateSongtable.getColumnModel().getColumn(3).setResizable(false);
		updateSongtable.getColumnModel().getColumn(4).setResizable(false);
		updateSongtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row= updateSongtable.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) updateSongtable.getModel();
				String song_id = tblModel.getValueAt(row, 0).toString();
				try {
					Connection con =getConnection();
					Statement stm =con.createStatement();
					
					String sql = "select * from song where song_id ="+song_id+";";
					ResultSet result = stm.executeQuery(sql);
					if(result.next())
					{
						String song = result.getString("song_name");
						String duration = result.getString("song_duration");
						String language = result.getString("song_language");
						String year = result.getString("y_id");
						updateSongnametxt.setText(song);
						updateDurationtxt.setText(duration);
						updateLanguagetxt.setText(language);
						updateYeartxt.setText(year);
					}
//					//con.close();
//					String sql1 ="select * from artist where artist_id in (select art_id from artist_song where s_id ="+song_id+");";
//					ResultSet result1 =stm.executeQuery(sql1);
//					if(result1.next())
//					{
//						String artist = result1.getString("artist_name");
//						//updateArtisttxt;
//					}
//					String sql2 ="select * from movie where movie_id =(select m_id from song where song_id ="+song_id+");";
//					ResultSet result2 =stm.executeQuery(sql2);
//					if(result2.next())
//					{
//						String movie =result2.getString("movie_name");
//						updateMovietxt.setText(movie);
//					}
					con.close();
				}catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
		//Songtable();
		scrollPane_4.setViewportView(updateSongtable);
		
		JLabel lblNewLabel_11 = new JLabel("Song Name");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(10, 299, 78, 25);
		updateSongtab.add(lblNewLabel_11);
		
		updateSongnametxt = new JTextField();
		updateSongnametxt.setBounds(98, 303, 195, 21);
		updateSongtab.add(updateSongnametxt);
		updateSongnametxt.setColumns(10);
		
		JLabel lblNewLabel_11_1 = new JLabel("Duration");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11_1.setBounds(10, 334, 78, 25);
		updateSongtab.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_11_2 = new JLabel("Language");
		lblNewLabel_11_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11_2.setBounds(10, 369, 78, 25);
		updateSongtab.add(lblNewLabel_11_2);
		
		updateDurationtxt = new JTextField();
		updateDurationtxt.setColumns(10);
		updateDurationtxt.setBounds(98, 338, 78, 21);
		updateSongtab.add(updateDurationtxt);
		
		updateLanguagetxt = new JTextField();
		updateLanguagetxt.setColumns(10);
		updateLanguagetxt.setBounds(98, 373, 78, 21);
		updateSongtab.add(updateLanguagetxt);
		
		updateYeartxt = new JTextField();
		updateYeartxt.setColumns(10);
		updateYeartxt.setBounds(98, 407, 78, 21);
		updateSongtab.add(updateYeartxt);
		
		JLabel lblNewLabel_11_2_1 = new JLabel("Year");
		lblNewLabel_11_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11_2_1.setBounds(10, 404, 78, 25);
		updateSongtab.add(lblNewLabel_11_2_1);
		
		JButton updateButton = new JButton("Update");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row= updateSongtable.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) updateSongtable.getModel();
				String song_id = tblModel.getValueAt(row, 0).toString();
				String song = updateSongnametxt.getText();
				String duration = updateDurationtxt.getText();
				String language = updateLanguagetxt.getText();
				String year = updateYeartxt.getText();
				try {
					Connection con =getConnection();
					Statement stm =con.createStatement();
					
					String sql = "update song set song_name = '"+song+"',song_duration = '"+duration+"',song_language='"+language+"',y_id="+year+" where song_id ="+song_id+";";
					int result = stm.executeUpdate(sql);
					
					DefaultTableModel tblModel1 = (DefaultTableModel) updateSongtable.getModel();
					tblModel1.setRowCount(0);
					Songtable();
				}catch(Exception a)
				{
					System.out.println(a);
				}
			}
		});
		updateButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		updateButton.setBounds(315, 463, 125, 34);
		updateSongtab.add(updateButton);
		addArtist();

		deleteSongtab = new JPanel();
		tabbedPane.addTab("New tab", null, deleteSongtab, null);
		deleteSongtab.setLayout(null);
		
		lblNewLabel_10 = new JLabel("Delete Song");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_10.setBounds(10, 10, 128, 46);
		deleteSongtab.add(lblNewLabel_10);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 53, 547, 413);
		deleteSongtab.add(scrollPane_3);
		
		deleteSongtable = new JTable();
		deleteSongtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		deleteSongtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Song", "Duration", "Language", "Year"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		deleteSongtable.getColumnModel().getColumn(0).setResizable(false);
		deleteSongtable.getColumnModel().getColumn(0).setPreferredWidth(30);
		deleteSongtable.getColumnModel().getColumn(1).setResizable(false);
		deleteSongtable.getColumnModel().getColumn(1).setPreferredWidth(375);
		deleteSongtable.getColumnModel().getColumn(2).setResizable(false);
		deleteSongtable.getColumnModel().getColumn(3).setResizable(false);
		deleteSongtable.getColumnModel().getColumn(4).setResizable(false);
		Songtable();
		scrollPane_3.setViewportView(deleteSongtable);
		
		JButton deleteSongbutton = new JButton("DELETE");
		deleteSongbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = deleteSongtable.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) deleteSongtable.getModel();
				String song_id = tblModel.getValueAt(row, 0).toString();

				try {
					Connection con =getConnection();
					Statement stm = con.createStatement();
					String sql = "delete from song where song_id =" + song_id + ";";
					int result = stm.executeUpdate(sql);

					tblModel.setRowCount(0);
					Songtable();
					
					String sql1 ="delete from artist_song where s_id ="+song_id+";";
					int result1= stm.executeUpdate(sql1);

				} catch (Exception a) {
					System.out.println(a);
				}
			}
		});
		deleteSongbutton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		deleteSongbutton.setBounds(429, 479, 128, 25);
		deleteSongtab.add(deleteSongbutton);

		JPanel userEdittab = new JPanel();
		tabbedPane.addTab("New tab", null, userEdittab, null);
		userEdittab.setLayout(null);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 547, 414);
		userEdittab.add(scrollPane);

		editUsertable = new JTable();
		editUsertable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		editUsertable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id", "Username", "Customer Name", "Customer Password" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		editUsertable.getColumnModel().getColumn(0).setResizable(false);
		editUsertable.getColumnModel().getColumn(0).setPreferredWidth(31);
		editUsertable.getColumnModel().getColumn(1).setResizable(false);
		editUsertable.getColumnModel().getColumn(1).setPreferredWidth(162);
		editUsertable.getColumnModel().getColumn(2).setResizable(false);
		editUsertable.getColumnModel().getColumn(2).setPreferredWidth(174);
		editUsertable.getColumnModel().getColumn(3).setResizable(false);
		editUsertable.getColumnModel().getColumn(3).setPreferredWidth(175);
		editUsertable();
		scrollPane.setViewportView(editUsertable);

		removeButton = new JButton("REMOVE");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = editUsertable.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) editUsertable.getModel();
				String customer_id = tblModel.getValueAt(row, 0).toString();

				try {
//					Class.forName("com.mysql.jdbc.Driver");
//					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/musicsystem", "root",
//							"");
					Connection con =getConnection();
					Statement stm = con.createStatement();
					String sql = "delete from customer where customer_id =" + customer_id + ";";
					int result = stm.executeUpdate(sql);

					tblModel.setRowCount(0);
					editUsertable();

				} catch (Exception a) {
					System.out.println(a);
				}
			}
		});
		removeButton.setBounds(10, 485, 109, 30);
		userEdittab.add(removeButton);
		
		lblNewLabel_6 = new JLabel("Remove User");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(10, 10, 180, 51);
		userEdittab.add(lblNewLabel_6);
		
		JPanel suggestionTab = new JPanel();
		tabbedPane.addTab("New tab", null, suggestionTab, null);
		suggestionTab.setLayout(null);
		
		suggestionTabbedpane = new JTabbedPane(JTabbedPane.TOP);
		suggestionTabbedpane.setBounds(0, -26, 567, 551);
		suggestionTab.add(suggestionTabbedpane);
		
		JPanel suggestionTilte = new JPanel();
		suggestionTabbedpane.addTab("New tab", null, suggestionTilte, null);
		suggestionTilte.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 10, 542, 504);
		suggestionTilte.add(scrollPane_5);
		
		suggestionTable = new JTable();
		suggestionTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				suggestionTabbedpane.setSelectedIndex(1);
				int row= suggestionTable.getSelectedRow();
				DefaultTableModel tblModel = (DefaultTableModel) suggestionTable.getModel();
				String customer_id = tblModel.getValueAt(row, 0).toString();
				String title1 = tblModel.getValueAt(row, 1).toString();
				try {
					Connection con =getConnection();
					Statement stm =con.createStatement();
					
					String sql = "select * from suggestion where customer_id ="+customer_id+" and title ='"+title1+"';";
					ResultSet result = stm.executeQuery(sql);
					if(result.next()) {
						String title = result.getString("title");
						String description = result.getString("description");
						descriptionTitle.setText(title);
						descriptionBody.setText(description);
					}
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		suggestionTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Customer Id", "Suggestion Title"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		suggestionTable.getColumnModel().getColumn(0).setResizable(false);
		suggestionTable.getColumnModel().getColumn(1).setResizable(false);
		suggestionTable.getColumnModel().getColumn(1).setPreferredWidth(475);
		suggestionTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		suggestionTable();
		scrollPane_5.setViewportView(suggestionTable);
		
		JPanel description = new JPanel();
		suggestionTabbedpane.addTab("New tab", null, description, null);
		description.setLayout(null);
		
		descriptionTitle = new JLabel("");
		descriptionTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		descriptionTitle.setBounds(10, 10, 542, 49);
		description.add(descriptionTitle);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 78, 542, 436);
		description.add(scrollPane_6);
		
		descriptionBody = new JTextArea();
		descriptionBody.setEditable(false);
		descriptionBody.setLineWrap(true);
		descriptionBody.setWrapStyleWord(true);
		scrollPane_6.setViewportView(descriptionBody);
		setVisible(true);
	}

	public void editUsertable() {
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/musicsystem", "root",
//					"");
			Connection con =getConnection();
			Statement stm = con.createStatement();
			String sql = "Select * from customer;";
			ResultSet result = stm.executeQuery(sql);

			while (result.next()) {
				String id = result.getString("customer_id");
				String username = result.getString("username");
				String customer_name = result.getString("customer_name");
				String password = result.getString("customer_passkey");

				String tbData[] = { id, username, customer_name, password };
				DefaultTableModel tblModel = (DefaultTableModel) editUsertable.getModel();
				tblModel.addRow(tbData);
			}
			con.close();
		} catch (Exception a) {
			System.out.println(a);
		}
	}
	
	public void addArtist()
	{
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/musicsystem", "root",
//					"");
			Connection con =getConnection();
			Statement stm = con.createStatement();
			String sql = "Select * from artist;";
			ResultSet result = stm.executeQuery(sql);
			
			while (result.next()) {
				String artist=result.getString("artist_name");
				addArtist.addItem(artist);
			}
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
	}
	
	public void addMovie()
	{
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/musicsystem", "root",
//					"");
			Connection con =getConnection();
			Statement stm = con.createStatement();
			String sql = "Select * from movie;";
			ResultSet result = stm.executeQuery(sql);
			
			while (result.next()) {
				String movie=result.getString("movie_name");
				addMovie.addItem(movie);
			}
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
	}
	
	public void removeArtisttable()
	{
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/musicsystem", "root",
//					"");
			Connection con =getConnection();
			Statement stm = con.createStatement();
			String sql = "Select * from artist;";
			ResultSet result = stm.executeQuery(sql);
			
			while (result.next()) {
				String id = result.getString("artist_id");
				String artist = result.getString("artist_name");

				String tbData[] = { id, artist};
				DefaultTableModel tblModel = (DefaultTableModel) removeArtisttable.getModel();
				tblModel.addRow(tbData);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void removeMovietable()
	{
		try {
			Connection con =getConnection();
			Statement stm = con.createStatement();
			String sql = "Select * from movie;";
			ResultSet result = stm.executeQuery(sql);
			
			while (result.next()) {
				String id = result.getString("movie_id");
				String movie = result.getString("movie_name");

				String tbData[] = { id, movie};
				DefaultTableModel tblModel = (DefaultTableModel) removeMovietable.getModel();
				tblModel.addRow(tbData);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void Songtable()
	{
		try {
			Connection con =getConnection();
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
				DefaultTableModel tblModel = (DefaultTableModel) deleteSongtable.getModel();
				DefaultTableModel tblModel1 = (DefaultTableModel) updateSongtable.getModel();
				tblModel.addRow(tbData);
				tblModel1.addRow(tbData);
			}
			con.close();
		} catch (Exception a) {
			System.out.println(a);
		}
	}
	
	public void suggestionTable() {
		try {
			Connection con =getConnection();
			Statement stm = con.createStatement();
			String sql = "Select * from suggestion;";
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next())
			{
				String id = result.getString("customer_id");
				String title = result.getString("title");
				
				String tbData[] = {id, title};
				DefaultTableModel tblModel = (DefaultTableModel) suggestionTable.getModel();
				tblModel.addRow(tbData);
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
