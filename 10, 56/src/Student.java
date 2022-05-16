import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Student extends JFrame {

	private JPanel contentPane;
	public static JLabel lblab;
	public static JProgressBar progressBar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		con = (Connection) DB.dbconnect();
		
		
		
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 774, 769);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome, Roll no :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel.setBounds(27, 26, 260, 40);
		contentPane.add(lblNewLabel);
		
		lblab = new JLabel("");
		lblab.setForeground(Color.WHITE);
		lblab.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblab.setBounds(292, 26, 169, 40);
		contentPane.add(lblab);
		
		JLabel lblNewLabel_1 = new JLabel("List of Subjects :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Papyrus", Font.BOLD, 22));
		lblNewLabel_1.setBounds(27, 151, 191, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Batch : 20CS");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(27, 89, 144, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Semester : 3rd");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1_1.setBounds(358, 89, 154, 38);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Object Oriented Programming  :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(27, 227, 321, 25);
		contentPane.add(lblNewLabel_2);
		
		
		progressBar = new JProgressBar();
		progressBar.setSize(new Dimension(2, 2));
		progressBar.setStringPainted(true);
		if (First.foop>=75) {
		progressBar.setForeground(new Color(0, 100, 0));}
		else if (First.foop<=50){
		progressBar.setForeground(Color.RED);}
		else 
		progressBar.setForeground(Color.ORANGE);
		progressBar.setBounds(358, 230, 287, 25);
		contentPane.add(progressBar);
		progressBar.setValue(First.foop);
		

		JLabel lblNewLabel_2_1 = new JLabel("Differential Equations :");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(27, 299, 299, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Computer Graphics  :");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_2.setBounds(27, 361, 299, 25);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Electrical Circuits  :");
		lblNewLabel_2_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_3_1_1.setBounds(27, 495, 299, 25);
		contentPane.add(lblNewLabel_2_3_1_1);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setStringPainted(true);
		progressBar_1.setBounds(358, 299, 287, 25);
		if (First.fde>=75) {
			progressBar_1.setForeground(new Color(0, 100, 0));}
			else if (First.fde<=50){
			progressBar_1.setForeground(Color.RED);}
			else 
			progressBar_1.setForeground(Color.ORANGE);
		contentPane.add(progressBar_1);
		progressBar_1.setValue(First.fde);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setStringPainted(true);
		if (First.fcg>=75) {
			progressBar_2.setForeground(new Color(0, 100, 0));}
			else if (First.fcg<=50){
			progressBar_2.setForeground(Color.RED);}
			else 
			progressBar_2.setForeground(Color.ORANGE);
		progressBar_2.setBounds(358, 361, 287, 25);
		contentPane.add(progressBar_2);
		progressBar_2.setValue(First.fcg);
		
		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setStringPainted(true);
		if (First.felckt>=75) {
			progressBar_5.setForeground(new Color(0, 100, 0));}
			else if (First.felckt<=50){
			progressBar_5.setForeground(Color.RED);}
			else 
			progressBar_5.setForeground(Color.ORANGE);
		progressBar_5.setBounds(358, 498, 287, 25);
		contentPane.add(progressBar_5);
		progressBar_5.setValue(First.felckt);
		
		
		JButton btnNewButton = new JButton("Back to Main Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				First fr03 = new First();
				fr03.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(27, 673, 144, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Computer Architecture & Assembly Programming :");
		lblNewLabel_2_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2_2_1_2.setBounds(27, 427, 321, 25);
		contentPane.add(lblNewLabel_2_2_1_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setStringPainted(true);
		if (First.fcaap>=75) {
			progressBar_3.setForeground(new Color(0, 100, 0));}
			else if (First.fcaap<=50){
			progressBar_3.setForeground(Color.RED);}
			else 
			progressBar_3.setForeground(Color.ORANGE);
		progressBar_3.setBounds(358, 427, 287, 25);
		contentPane.add(progressBar_3);
		progressBar_3.setValue(First.fcaap);
		
		JLabel lblNewLabel_4 = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("1122.png"));
		lblNewLabel_4.setIcon(img);
		lblNewLabel_4.setBounds(0, -100, 785, 941);
		contentPane.add(lblNewLabel_4);
		
	}
	
}
