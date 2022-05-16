import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Teacher_01 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lbl;
	private JCheckBox c02;
	public static JLabel lblAbc;
	public static JLabel lblNewLabel_1_1_1_1;
	
	String TeacherName ;
	private JCheckBox c06;
	private JCheckBox c08;
	private JCheckBox c10;
	private JCheckBox c12;
	private JCheckBox c14;
	private JCheckBox c16;
	private JCheckBox c18;
	private JCheckBox c20;
	private JCheckBox c22;
	private JCheckBox c24;
	private JCheckBox c26;
	private JCheckBox c28;
	private JCheckBox c30;
	
	
	int state02=1;
	int state06=1;
	int state08=1;
	int state10=1;
	int state12=1;
	int state14=1;
	int state16=1;
	int state18=1;
	int state20=1;
	int state22=1;
	int state24=1;
	int state26=1;
	int state28=1;
	int state30=1;
	private JLabel lblNewLabel_2;
	
	static int prev_toop;
	static int prev_oop;
	static int prev_tde;
	static int prev_de;
	static int prev_telckt;
	static int prev_elckt;
	static int prev_tcg;
	static int prev_cg;
	static int prev_tcaap;
	static int prev_caap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teacher_01 frame = new Teacher_01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void prevdata(String a) {
		
		try {
		String rollno = a;
		
		PreparedStatement pstt = (PreparedStatement) conn.prepareStatement("select totaloop,oop,totalde,de,totalelckt,elckt,totalcaap,caap,totalcg,cg from student_sign_in where rollno=?");
		pstt.setString(1, rollno);
		
		ResultSet r = pstt.executeQuery();
		if (r.next()) {
		prev_toop = r.getInt("totaloop");
		prev_oop = r.getInt("oop");
		prev_tde = r.getInt("totalde");
		prev_de = r.getInt("de");
		prev_telckt = r.getInt("totalelckt");
		prev_elckt = r.getInt("elckt");
		prev_tcg = r.getInt("totalcg");
		prev_cg = r.getInt("cg");
		prev_caap = r.getInt("caap");
		prev_tcaap = r.getInt("totalcaap");
		
		}
			else {
				JOptionPane.showMessageDialog(null, "failed");
			}
	
		
		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		}
	
		}
	
	public static void updatedata_oop(String b, int a1) {
		if(First.Name.equals("OOP")) {
		try {
			
			int a=1;			
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement("UPDATE student_sign_in SET totaloop = ?,oop =? WHERE rollno = ?");
			
			pst.setString(3, b);
			pst.setInt(2, a1+prev_oop);
			pst.setInt(1, a+prev_toop);
			pst.executeUpdate();
		//	System.out.print(First.Name);
				
						
			}
			catch (SQLException e1) {              
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "ERROR");
			}
	}
	}
	
	public static void updatedata_de(String b, int a1) {
		if(First.Name.equals("DE")) {
		try {
			
			int a=1;			
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement("UPDATE student_sign_in SET totalde = ?,de =? WHERE rollno = ?");
			
			pst.setString(3, b);
			pst.setInt(2, a1+prev_de);
			pst.setInt(1, a+prev_tde);
			pst.executeUpdate();
			//System.out.print(First.Name);
			
						
			}
			catch (SQLException e1) {              
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "ERROR");
			}
	}
	}
	
	public static void updatedata_elckt(String b, int a1) {
		if(First.Name.equals("ELCKT")) {
		try {
			
			int a=1;			
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement("UPDATE student_sign_in SET totalelckt = ?, elckt =? WHERE rollno = ?");
			
			pst.setString(3, b);
			pst.setInt(2, a1+prev_elckt);
			pst.setInt(1, a+prev_telckt);
			pst.executeUpdate();
			//System.out.print(First.Name);
			
						
			}
			catch (SQLException e1) {              
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "ERROR");
			}
	}
	}
	
	
	public static void updatedata_cg(String b, int a1) {
		if(First.Name.equals("CG")) {
		try {
			
			int a=1;			
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement("UPDATE student_sign_in SET totalcg = ?, cg =? WHERE rollno = ?");
			
			pst.setString(3, b);
			pst.setInt(2, a1+prev_cg);
			pst.setInt(1, a+prev_tcg);
			pst.executeUpdate();
			//System.out.print(First.Name);
			
						
			}
			catch (SQLException e1) {              
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "ERROR");
			}
	}
	}
	
	
	public static void updatedata_caap(String b, int a1) {
		if(First.Name.equals("CAAP")) {
		try {
			
			int a=1;			
			PreparedStatement pst = (PreparedStatement) conn.prepareStatement("UPDATE student_sign_in SET totalcaap = ?, caap =? WHERE rollno = ?");
			
			pst.setString(3, b);
			pst.setInt(2, a1+prev_caap);
			pst.setInt(1, a+prev_tcaap);
			pst.executeUpdate();
			//System.out.print(First.Name);
			
						
			}
			catch (SQLException e1) {              
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "ERROR");
			}
	}
	}
	/**
	 * Create the frame.
	 */
	static Connection conn = null;
	public Teacher_01() {
		conn = (Connection) DB.dbconnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 774, 769);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Welcome, Mr");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(20, 21, 251, 64);
		contentPane.add(lblNewLabel);
		
		lblAbc = new JLabel("");
		lblAbc.setForeground(Color.WHITE);
		lblAbc.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblAbc.setBounds(263, 21, 485, 64);
		contentPane.add(lblAbc);
		lblAbc.setText(TeacherName);
		
		
		lblNewLabel_1 = new JLabel("List of Students :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Papyrus", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 145, 154, 38);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Batch : 20CS");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(20, 94, 241, 38);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_1_1 = new JLabel("Subject :");
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1_1.setBounds(396, 94, 97, 38);
		contentPane.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setText("Subject:");
		lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1_1_1.setBounds(493, 94, 255, 38);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		c02 = new JCheckBox("20CS002");
		c02.setForeground(Color.WHITE);
		c02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c02.isSelected())
					state02 = 0;
				
			}
			
		});
		c02.setBackground(Color.DARK_GRAY);
		c02.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c02.setBounds(108, 195, 97, 38);
		contentPane.add(c02);		
		
			
		
		
		
		c06 = new JCheckBox("20CS006");
		c06.setForeground(Color.WHITE);
		c06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c06.isSelected())
					state06 = 0;
			}
		});
		c06.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c06.setBackground(Color.DARK_GRAY);
		c06.setBounds(108, 234, 97, 38);
		contentPane.add(c06);
		
		
		c08 = new JCheckBox("20CS008");
		c08.setForeground(Color.WHITE);
		c08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c08.isSelected())
					state08 = 0;
			}
		});
		c08.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c08.setBackground(Color.DARK_GRAY);
		c08.setBounds(108, 273, 97, 38);
		contentPane.add(c08);
		
		
		c10 = new JCheckBox("20CS010");
		c10.setForeground(Color.WHITE);
		c10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c10.isSelected())
					state10 = 0;
			}
		});
		c10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c10.setBackground(Color.DARK_GRAY);
		c10.setBounds(108, 312, 97, 38);
		contentPane.add(c10);
		
		
		c12 = new JCheckBox("20CS012");
		c12.setForeground(Color.WHITE);
		c12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c12.isSelected())
					state12 = 0;
			}
		});
		c12.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c12.setBackground(Color.DARK_GRAY);
		c12.setBounds(108, 350, 97, 38);
		contentPane.add(c12);
		
		
		c14 = new JCheckBox("20CS014");
		c14.setForeground(Color.WHITE);
		c14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c14.isSelected())
					state14 = 0;
			}
		});
		c14.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c14.setBackground(Color.DARK_GRAY);
		c14.setBounds(108, 389, 97, 38);
		contentPane.add(c14);
		if(c14.isSelected())
			state14 = 0;
		
		c16 = new JCheckBox("20CS016");
		c16.setForeground(Color.WHITE);
		c16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c16.isSelected())
					state16 = 0;
			}
		});
		c16.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c16.setBackground(Color.DARK_GRAY);
		c16.setBounds(108, 428, 97, 38);
		contentPane.add(c16);
		
		
		c18 = new JCheckBox("20CS018");
		c18.setForeground(Color.WHITE);
		c18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c18.isSelected())
					state18 = 0;
			}
		});
		c18.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c18.setBackground(Color.DARK_GRAY);
		c18.setBounds(108, 468, 97, 38);
		contentPane.add(c18);
		
		
		c20 = new JCheckBox("20CS020");
		c20.setForeground(Color.WHITE);
		c20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c20.isSelected())
					state20 = 0;
			}
		});
		c20.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c20.setBackground(Color.DARK_GRAY);
		c20.setBounds(108, 507, 97, 38);
		contentPane.add(c20);
		
		c22 = new JCheckBox("20CS022");
		c22.setForeground(Color.WHITE);
		c22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c22.isSelected())
					state22 = 0;
			}
		});
		c22.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c22.setBackground(Color.DARK_GRAY);
		c22.setBounds(108, 545, 97, 38);
		contentPane.add(c22);
		
		c24 = new JCheckBox("20CS024");
		c24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c24.isSelected())
				state24=0;
			}
		});
		c24.setForeground(Color.WHITE);
		c24.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c24.setBackground(Color.DARK_GRAY);
		c24.setBounds(308, 195, 97, 38);
		contentPane.add(c24);
		
		c26 = new JCheckBox("20CS026");
		c26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c26.isSelected())
				state26=0;
			}
		});
		c26.setForeground(Color.WHITE);
		c26.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c26.setBackground(Color.DARK_GRAY);
		c26.setBounds(308, 234, 97, 38);
		contentPane.add(c26);
		
		c28 = new JCheckBox("20CS028");
		c28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c28.isSelected())
				state28=0;
			}
		});
		c28.setForeground(Color.WHITE);
		c28.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c28.setBackground(Color.DARK_GRAY);
		c28.setBounds(308, 273, 97, 38);
		contentPane.add(c28);
		
		c30 = new JCheckBox("20CS030");
		c30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c30.isSelected())
				state30=0;
			}
		});
		c30.setForeground(Color.WHITE);
		c30.setFont(new Font("Times New Roman", Font.BOLD, 18));
		c30.setBackground(Color.DARK_GRAY);
		c30.setBounds(308, 312, 97, 38);
		contentPane.add(c30);
		
		
		lblNewLabel_2 = new JLabel("Note :Mark the Absentees !");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(396, 143, 241, 27);
		contentPane.add(lblNewLabel_2);

		Teacher_01.prevdata(c02.getText());
		Teacher_01.prevdata(c06.getText());
		Teacher_01.prevdata(c08.getText());
		Teacher_01.prevdata(c10.getText());
		Teacher_01.prevdata(c12.getText());
		Teacher_01.prevdata(c14.getText());
		Teacher_01.prevdata(c16.getText());
		Teacher_01.prevdata(c18.getText());
		Teacher_01.prevdata(c20.getText());
		Teacher_01.prevdata(c22.getText());
		Teacher_01.prevdata(c24.getText());
		Teacher_01.prevdata(c26.getText());
		Teacher_01.prevdata(c28.getText());
		Teacher_01.prevdata(c30.getText());
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Teacher_01.updatedata_oop(c02.getText(), state02);
				Teacher_01.updatedata_oop(c06.getText(), state06);
				Teacher_01.updatedata_oop(c20.getText(), state20);
				Teacher_01.updatedata_oop(c08.getText(), state08);
				Teacher_01.updatedata_oop(c10.getText(), state10);
				Teacher_01.updatedata_oop(c12.getText(), state12);
				Teacher_01.updatedata_oop(c14.getText(), state14);
				Teacher_01.updatedata_oop(c16.getText(), state16);
				Teacher_01.updatedata_oop(c18.getText(), state18);
				Teacher_01.updatedata_oop(c22.getText(), state22);
				Teacher_01.updatedata_oop(c24.getText(), state22);
				Teacher_01.updatedata_oop(c26.getText(), state22);
				Teacher_01.updatedata_oop(c28.getText(), state22);
				Teacher_01.updatedata_oop(c30.getText(), state22);
			
		
				Teacher_01.updatedata_de(c02.getText(), state02);
				Teacher_01.updatedata_de(c06.getText(), state06);
				Teacher_01.updatedata_de(c20.getText(), state20);
				Teacher_01.updatedata_de(c08.getText(), state08);
				Teacher_01.updatedata_de(c10.getText(), state10);
				Teacher_01.updatedata_de(c12.getText(), state12);
				Teacher_01.updatedata_de(c14.getText(), state14);
				Teacher_01.updatedata_de(c16.getText(), state16);
				Teacher_01.updatedata_de(c18.getText(), state18);
				Teacher_01.updatedata_de(c22.getText(), state22);
				Teacher_01.updatedata_de(c24.getText(), state14);
				Teacher_01.updatedata_de(c26.getText(), state16);
				Teacher_01.updatedata_de(c28.getText(), state18);
				Teacher_01.updatedata_de(c30.getText(), state22);
				
				
				Teacher_01.updatedata_elckt(c02.getText(), state02);
				Teacher_01.updatedata_elckt(c06.getText(), state06);
				Teacher_01.updatedata_elckt(c20.getText(), state20);
				Teacher_01.updatedata_elckt(c08.getText(), state08);
				Teacher_01.updatedata_elckt(c10.getText(), state10);
				Teacher_01.updatedata_elckt(c12.getText(), state12);
				Teacher_01.updatedata_elckt(c14.getText(), state14);
				Teacher_01.updatedata_elckt(c16.getText(), state16);
				Teacher_01.updatedata_elckt(c18.getText(), state18);
				Teacher_01.updatedata_elckt(c22.getText(), state22);
				Teacher_01.updatedata_elckt(c24.getText(), state14);
				Teacher_01.updatedata_elckt(c26.getText(), state16);
				Teacher_01.updatedata_elckt(c28.getText(), state18);
				Teacher_01.updatedata_elckt(c30.getText(), state22);
				
				
				Teacher_01.updatedata_cg(c02.getText(), state02);
				Teacher_01.updatedata_cg(c06.getText(), state06);
				Teacher_01.updatedata_cg(c20.getText(), state20);
				Teacher_01.updatedata_cg(c08.getText(), state08);
				Teacher_01.updatedata_cg(c10.getText(), state10);
				Teacher_01.updatedata_cg(c12.getText(), state12);
				Teacher_01.updatedata_cg(c14.getText(), state14);
				Teacher_01.updatedata_cg(c16.getText(), state16);
				Teacher_01.updatedata_cg(c18.getText(), state18);
				Teacher_01.updatedata_cg(c22.getText(), state22);
				Teacher_01.updatedata_cg(c24.getText(), state14);
				Teacher_01.updatedata_cg(c26.getText(), state16);
				Teacher_01.updatedata_cg(c28.getText(), state18);
				Teacher_01.updatedata_cg(c30.getText(), state22);
				
				Teacher_01.updatedata_caap(c02.getText(), state02);
				Teacher_01.updatedata_caap(c06.getText(), state06);
				Teacher_01.updatedata_caap(c20.getText(), state20);
				Teacher_01.updatedata_caap(c08.getText(), state08);
				Teacher_01.updatedata_caap(c10.getText(), state10);
				Teacher_01.updatedata_caap(c12.getText(), state12);
				Teacher_01.updatedata_caap(c14.getText(), state14);
				Teacher_01.updatedata_caap(c16.getText(), state16);
				Teacher_01.updatedata_caap(c18.getText(), state18);
				Teacher_01.updatedata_caap(c22.getText(), state22);
				Teacher_01.updatedata_caap(c24.getText(), state14);
				Teacher_01.updatedata_caap(c26.getText(), state16);
				Teacher_01.updatedata_caap(c28.getText(), state18);
				Teacher_01.updatedata_caap(c30.getText(), state22);
				
				JOptionPane.showMessageDialog(null, "Attendance Updated Succesfully");
					
				}
		
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(476, 617, 131, 44);
		contentPane.add(btnNewButton);
		
		JButton btnBackToMain = new JButton("Back to Main");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First ob= new First();
				ob.setVisible(true);
				dispose();
			}
		});
		btnBackToMain.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBackToMain.setBounds(108, 618, 131, 44);
		contentPane.add(btnBackToMain);
		
		JLabel lblNewLabel_4 = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("1122.png"));
		lblNewLabel_4.setIcon(img);
		lblNewLabel_4.setBounds(0, -111, 785, 941);
		contentPane.add(lblNewLabel_4);
		
		
	}
}
