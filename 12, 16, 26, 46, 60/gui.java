
package GUI;



import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.awt.event.KeyListener;
import java.util.Calendar;

public class converter 
 extends JFrame {
		JLabel jl1,jl2,jl3,jl4;
		JComboBox tcb1, tcb2;
		JTextField jt1,jt2;
		JButton jb,bdot,bac,bbs,bpm,bpn;
		JButton jb0,jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
		
		public converter(String s)
		{
			super(s);
		}
		
		public void setComp()
		{
			String arr1[] = {"Celsius","Fahrenheit","Kelvin"};
			String arr2[] = {"Celsius","Fahrenheit","Kelvin"};
			jl1 = new JLabel("To");
			jl2 = new JLabel("Enter the Value:");
			jl3 = new JLabel("Converted Value:");
			jl4 = new JLabel("From");
			tcb1 = new JComboBox(arr1);
			tcb2 = new JComboBox(arr2);
			jt1 = new JTextField();
			jt2 = new JTextField();
			jb = new JButton("Convert");
			bdot = new JButton(".");
			bpm = new JButton("+");
                        bpn=new JButton("-");
			bbs = new JButton("<--");
			bac = new JButton("AC");
			jb0 = new JButton("0");
			jb1 = new JButton("1");
			jb2 = new JButton("2");
			jb3 = new JButton("3");
			jb4 = new JButton("4");
			jb5 = new JButton("5");
			jb6 = new JButton("6");
			jb7 = new JButton("7");
			jb8 = new JButton("8");
			jb9 = new JButton("9");
			setLayout(null);
			tcb1.setBounds(75,50,100,20);
			jt1.setBounds(200,50,100,20);
			jl1.setBounds(100,75,50,20);
			jl4.setBounds(90,25,50,20);
			jl2.setBounds(200,35,100,20);
			jl3.setBounds(200,85,100,20);
			tcb2.setBounds(75,100,100,20);
			jt2.setBounds(200,100,100,20);
			jb.setBounds(138,150,100,20);
			bac.setBounds(238,200,50,100);
			bpm.setBounds(238,350,50,50);
			bbs.setBounds(238,300,50,50);
			bdot.setBounds(188,350,50,50);
			jb0.setBounds(88,350,50,50);
                        bpn.setBounds(138, 350, 50, 50);
			jb1.setBounds(88,200,50,50);
			jb2.setBounds(138,200,50,50);
			jb3.setBounds(188,200,50,50);
			jb4.setBounds(88,250,50,50);
			jb5.setBounds(138,250,50,50);
			jb6.setBounds(188,250,50,50);
			jb7.setBounds(88,300,50,50);
			jb8.setBounds(138,300,50,50);
			jb9.setBounds(188,300,50,50);
			jb.addActionListener(new Handler());
			bac.addActionListener(new Handler());
			bpm.addActionListener(new Handler());
			bpn.addActionListener(new Handler());
                        bbs.addActionListener(new Handler());
			bdot.addActionListener(new Handler());
			jb0.addActionListener(new Handler());
			jb1.addActionListener(new Handler());
			jb2.addActionListener(new Handler());
			jb3.addActionListener(new Handler());
			jb4.addActionListener(new Handler());
			jb5.addActionListener(new Handler());
			jb6.addActionListener(new Handler());
			jb7.addActionListener(new Handler());
			jb8.addActionListener(new Handler());
			jb9.addActionListener(new Handler());
			add(tcb1);
			add(tcb2);
			add(jl1);
			add(jl2);
			add(jl3);
			add(jl4);
			add(jt1);
			add(jt2);
			add(jb);
			add(bac);
			add(bdot);
			add(bpm);
			add(bpn);
                        add(bbs);
			add(jb0);
			add(jb1);
			add(jb2);
			add(jb3);
			add(jb4);
			add(jb5);
			add(jb6);
			add(jb7);
			add(jb8);
			add(jb9);
			jt2.setEditable(false);
		}
		
		class Handler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String x,y;
				x = (String)tcb1.getSelectedItem();
				y = (String)tcb2.getSelectedItem();
				
				if(e.getSource()==jb0)
					jt1.setText(jt1.getText() + "0");
				if(e.getSource()==jb1)
					jt1.setText(jt1.getText() + "1");
				if(e.getSource()==jb2)
					jt1.setText(jt1.getText() + "2");
				if(e.getSource()==jb3)
					jt1.setText(jt1.getText() + "3");
				if(e.getSource()==jb4)
					jt1.setText(jt1.getText() + "4");
				if(e.getSource()==jb5)
					jt1.setText(jt1.getText() + "5");
				if(e.getSource()==jb6)
					jt1.setText(jt1.getText() + "6");
				if(e.getSource()==jb7)
					jt1.setText(jt1.getText() + "7");
				if(e.getSource()==jb8)
					jt1.setText(jt1.getText() + "8");
				if(e.getSource()==jb9)
					jt1.setText(jt1.getText() + "9");
				if(e.getSource()==bdot)
					jt1.setText(jt1.getText() + ".");
				if(e.getSource()==bac)
				{
					jt1.setText("");
					jt2.setText("");
				}
				if(e.getSource()==bpm)
				{
					String spm = new String();
					spm = jt1.getText();
				       jt1.setText("+");}
                                if(e.getSource()==bpn)
                                {       String spm = new String();
					spm = jt1.getText();
                                        jt1.setText("-" + jt1.getText());
					}
				if(e.getSource()==bbs)
				{
					int n;
					String bsp = new String();
					bsp = jt1.getText();
					n = bsp.length();
					jt1.setText("" + bsp.substring(0,n-1));
				}
				if(e.getSource()==jb)
				{
					//Both are same.......................
					if(x=="Celsius" && y=="Celsius")
					{
						jt2.setText(""+jt1.getText());
					}
					else if(x=="Fahrenheit" && y=="Fahrenheit")
					{
						jt2.setText(""+jt1.getText());
					}
					else if(x=="Kelvin" && y=="Kelvin")
					{
						jt2.setText(""+jt1.getText());
					}
					
					
					//Celsius to others.........................
					else if(x=="Celsius" && y=="Fahrenheit")
					{
						String s = jt1.getText();
						float a = Float.parseFloat(s);
						float b = (float)((a+32)*9/5);
						jt2.setText(""+b);
					}
					else if(x=="Celsius" && y=="Kelvin")
					{
						String s = jt1.getText();
						float a = Float.parseFloat(s);
						float b = (float)(a + 273.15);
						jt2.setText(""+b);
					}
					
					
					//Fahrenheit to others......................
					else if(x=="Fahrenheit" && y=="Celsius")
					{
						String s = jt1.getText();
						float a = Float.parseFloat(s);
						float b = (float)((a-32)*5/9);
						jt2.setText(""+b);
					}
					else if(x=="Fahrenheit" && y=="Kelvin")
					{
						String s = jt1.getText();
						float a = Float.parseFloat(s);
						float b = (float)((a - 32) * 5/9 + 273.15);
						jt2.setText(""+b);
					}
						else if(x=="Kelvin" && y=="Celsius")
					{
						String s = jt1.getText();
						float a = Float.parseFloat(s);
						float b = (float)(a - 273.15);
						jt2.setText(""+b);
					}
					else if(x=="Kelvin" && y=="Fahrenheit")
					{
						String s = jt1.getText();
						float a = Float.parseFloat(s);
						float b = (float)((a - 273.15) * 9/5 + 32);
						jt2.setText(""+b);
					}
                                }
			}
		}
		
		public static void main(String[] args)
		{
			converter jf = new converter("Temperature Converter");
			jf.setComp();
			jf.setSize(400,500);
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

    
}
