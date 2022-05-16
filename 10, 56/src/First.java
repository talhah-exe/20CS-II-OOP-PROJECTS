import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

public class First extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField; 
	private JRadioButton rdbtnStudent;
	private JRadioButton rdbtnNewRadioButton;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	public static String Name; 
	public static String Rollno;
	
	public static int total_oop,total_cg,total_de,total_caap,total_elckt,oop,elckt,cg,de,caap;
	public static int foop,fcg,fcaap,fde,felckt;
	
	Teacher_01 cc = new Teacher_01();
	Student ss= new Student();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
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
	Connection con = null;
	public First() {
		
		con = (Connection) DB.dbconnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 774, 769);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Attendance Portal");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 46));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(182, 71, 401, 70);
		contentPane.add(lblNewLabel);
		
		rdbtnNewRadioButton = new JRadioButton("Teacher");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					rdbtnStudent.setSelected(false);
					rdbtnNewRadioButton.setSelected(true);
					lblNewLabel_2.setVisible(true);
					textField.setVisible(true);
					lblNewLabel_2_1.setVisible(true);
					passwordField.setVisible(true);
					lblNewLabel_3.setVisible(false);
					textField_1.setVisible(false);
					btnNewButton.setVisible(true);
					btnNewButton_1.setVisible(false);
					
			}}
			
		});
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(331, 230, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnStudent.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					lblNewLabel_2.setVisible(false);
					textField.setVisible(false);
					lblNewLabel_2_1.setVisible(false);
					passwordField.setVisible(false);
					lblNewLabel_3.setVisible(true);
					textField_1.setVisible(true);
					btnNewButton_1.setVisible(true);
					btnNewButton.setVisible(false);
					
					
			}
			}
		});
		rdbtnStudent.setForeground(Color.WHITE);
		rdbtnStudent.setBackground(Color.DARK_GRAY);
		rdbtnStudent.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rdbtnStudent.setBounds(472, 230, 109, 23);
		contentPane.add(rdbtnStudent);
		
		JLabel lblNewLabel_1 = new JLabel("Who is using :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Papyrus", Font.BOLD, 28));
		lblNewLabel_1.setBounds(104, 220, 205, 38);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setBounds(156, 309, 142, 32);
		lblNewLabel_2.setVisible(false);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setToolTipText("abc");
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setForeground(Color.BLACK);
		textField.setBounds(320, 309, 241, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(156, 384, 142, 32);
		contentPane.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setVisible(false);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		passwordField.setForeground(Color.BLACK);
		passwordField.setBounds(320, 384, 241, 32);
		contentPane.add(passwordField);
		passwordField.setVisible(false);
		
		btnNewButton = new JButton("Sign in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
				String user = textField.getText();
			String password = passwordField.getText();
				
				PreparedStatement pst = (PreparedStatement) con.prepareStatement("select Name,Subject from sign_up where username=? and password=?");
				pst.setString(1, user);
				pst.setString(2, password);
				
				ResultSet r = pst.executeQuery();
				if (r.next()) {
					
					Teacher_01 fr1 = new Teacher_01();
					fr1.setVisible(true);
					dispose();
					
					
				
				Teacher_01.lblAbc.setText(r.getString("name"));
				Teacher_01.lblNewLabel_1_1_1_1.setText( r.getString("Subject"));
				Name = r.getString("Subject");
					
				}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
					}
				
				
				} 
				catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				} 
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(320, 504, 127, 32);
		contentPane.add(btnNewButton);
		btnNewButton.setVisible(false);
		
		lblNewLabel_3 = new JLabel("Roll no :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_3.setBounds(156, 348, 142, 32);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(320, 348, 241, 32);
		contentPane.add(textField_1);
		textField_1.setText("20CS");
		textField_1.setVisible(false);
		
		
		
		btnNewButton_1 = new JButton("Sign in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String roll = textField_1.getText();
					
					
					PreparedStatement pst = (PreparedStatement) con.prepareStatement("select rollID from student_sign_in where rollno=?");
					pst.setString(1, roll);
					
					
					ResultSet rs = pst.executeQuery();
					if (rs.next()) {
						
						Rollno = rs.getString("rollID");
						
					}
						
					else {
						JOptionPane.showMessageDialog(null, "Incorrect Roll no");
					}
					
					} 
					
					catch (SQLException e1) {
						e1.printStackTrace();
					}
			
				try {
					 
					PreparedStatement psst = (PreparedStatement) con.prepareStatement("select totaloop,totalcg,totalde,totalcaap,totalelckt,oop,caap,elckt,de,cg from student_sign_in where rollno=?");
					psst.setString(1, Rollno);
					
					
					ResultSet r = psst.executeQuery();
					if (r.next()) {
						total_oop = r.getInt("totaloop");
						total_cg = r.getInt("totalcg");
						total_de = r.getInt("totalde");
						total_caap = r.getInt("totalcaap");
						total_elckt = r.getInt("totalelckt");
						oop = r.getInt("oop");
						caap = r.getInt("caap");
						elckt = r.getInt("elckt");
						de = r.getInt("de");
						cg = r.getInt("cg");
				
					}
					
					} 
					catch (SQLException e1) {
						e1.printStackTrace();
					}
				
				foop = (int)(100*oop/total_oop);
				fde = (int)(100*de/total_de);
				fcg = (int)(100*cg/total_cg);
				fcaap = (int)(100*caap/total_caap);
				felckt = (int)(100*elckt/total_elckt);
				
				
				try {
					String roll = textField_1.getText();
					
					
					PreparedStatement pst = (PreparedStatement) con.prepareStatement("select rollID from student_sign_in where rollno=?");
					pst.setString(1, roll);
					
					
					ResultSet rs = pst.executeQuery();
					if (rs.next()) {
						
						Student fr2 = new Student();
						fr2.setVisible(true);
						dispose();
						Student.lblab.setText(rs.getString("rollID"));
						System.out.print(fcaap);
					}
						else {
							JOptionPane.showMessageDialog(null, "Incorrect Roll no");
						}
					
					
					} 
					
					catch (SQLException e1) {
						e1.printStackTrace();
					}
			}
				
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(320, 438, 127, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFocusCycleRoot(true);
		ImageIcon img = new ImageIcon(this.getClass().getResource("1122.png"));
		lblNewLabel_4.setIcon(img);
		lblNewLabel_4.setBounds(0, -87, 785, 941);
		contentPane.add(lblNewLabel_4);
		btnNewButton_1.setVisible(false);
		
	}
}
