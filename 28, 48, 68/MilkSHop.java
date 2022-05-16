import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MilkSHop extends JFrame {
	double ppl=1.00;
	double tamt = 0;
	double rem;

	private JPanel contentPane;
	private JTextField tF1;
	private JTextField tF2;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MilkSHop frame = new MilkSHop();
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
	public MilkSHop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RS Milk Shop");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(91, 23, 281, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Total Milk:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(67, 109, 138, 23);
		contentPane.add(lblNewLabel_1);
		
		tF1 = new JTextField();
		tF1.setBounds(245, 112, 138, 20);
		contentPane.add(tF1);
		tF1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Milk Purchased:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(67, 154, 168, 20);
		contentPane.add(lblNewLabel_2);
		
		tF2 = new JTextField();
		tF2.setColumns(10);
		tF2.setBounds(245, 154, 138, 20);
		contentPane.add(tF2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Remaining Milk:");
		lblNewLabel_2_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(96, 272, 160, 20);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Amount:");
		lblNewLabel_2_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2_2_1.setBounds(96, 238, 128, 20);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Total Amount:");
		lblNewLabel_2_2_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_2_2_2.setBounds(96, 303, 128, 20);
		contentPane.add(lblNewLabel_2_2_2);
		
		JLabel lbl3 = new JLabel("$0.0");
		lbl3.setForeground(new Color(0, 0, 0));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lbl3.setBounds(245, 299, 138, 20);
		contentPane.add(lbl3);
		
		JLabel lbl1 = new JLabel("$0.0");
		lbl1.setForeground(new Color(0, 0, 0));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lbl1.setBounds(245, 238, 138, 20);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("0.0L");
		lbl2.setForeground(new Color(0, 0, 0));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lbl2.setBounds(245, 268, 138, 20);
		contentPane.add(lbl2);
		
		
		JButton btnNewButton = new JButton("\u2714");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tMilk = Double.parseDouble(tF1.getText());
				double milk2 = Double.parseDouble(tF2.getText());
				
				if (tMilk>0) {
				double amt = milk2*ppl;
				lbl1.setText("$"+Double.toString(amt));
				
				tamt +=amt;
				lbl3.setText("$"+Double.toString(tamt));
				
				tMilk-=milk2;
				tF1.setText(Double.toString(tMilk));
				lbl2.setText(Double.toString(tMilk));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Milk has Ended Now!");
					tMilk=0;
					tF1.setText(Double.toString(tMilk));
					rem=0;
					lbl2.setText(Double.toString(tMilk));
				}
				
			}
		});
		btnNewButton.setBounds(344, 197, 51, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tF1.setText("");
				tF2.setText("");
				lbl1.setText("$0.0");
				lbl2.setText("0.0L");
				lbl3.setText("$0.0");
			}
		});
		btnNewButton_1.setBounds(306, 347, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\AD Khanzada\\Downloads\\Untitled design.png"));
		lblNewLabel_3.setBounds(0, 0, 455, 395);
		contentPane.add(lblNewLabel_3);
	}
}
