import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Theory {
Theory(){
	Frame f=new Frame();
	Label headText=new Label("OBE Weightage Calculator", Label.CENTER);
	Label headsubText=new Label("For Theory", Label.CENTER);
	
	Label clo1=new Label("CLO-1");
	Label clo2=new Label("CLO-2");
	Label clo3=new Label("CLO-3");
	
	Label mid=new Label("Mid", Label.CENTER);
	Label sess=new Label("Sessional", Label.CENTER);
	Label fin=new Label("Final", Label.CENTER);
	Label tmarks=new Label("Total", Label.CENTER);
	
	Label psess1=new Label("", Label.CENTER);
	Label pmid1=new Label("", Label.CENTER);
	Label pfin1=new Label("", Label.CENTER);
	
	Label psess2=new Label("", Label.CENTER);
	Label pmid2=new Label("", Label.CENTER);
	Label pfin2=new Label("", Label.CENTER);
	
	Label psess3=new Label("", Label.CENTER);
	Label pmid3=new Label("", Label.CENTER);
	Label pfin3=new Label("", Label.CENTER);
	
	TextField mid1=new TextField();
	TextField sess1=new TextField();
	TextField fin1=new TextField();
	TextField tmarks1=new TextField();
	
	TextField mid2=new TextField();
	TextField sess2=new TextField();
	TextField fin2=new TextField();
	TextField tmarks2=new TextField();
	
	TextField mid3=new TextField();
	TextField sess3=new TextField();
	TextField fin3=new TextField();
	TextField tmarks3=new TextField();
	
	Font myFont = new Font("Arial",Font.PLAIN,18);
	headText.setBounds(0,50,680,50);
	headText.setFont(new Font("Arial",Font.PLAIN,34));
	headsubText.setBounds(0,90,680,50);
	headsubText.setFont(new Font("Arial",Font.PLAIN,24));
	
	clo1.setBounds(90,200,80,20);
	clo2.setBounds(90,280,80,20);
	clo3.setBounds(90,360,80,20);
	clo1.setFont(myFont);
	clo2.setFont(myFont);
	clo3.setFont(myFont);
	
	sess.setBounds(178,160,80,20);
	mid.setBounds(270,160,80,20);
	fin.setBounds(360,160,80,20);
	tmarks.setBounds(500,160,80,20);
	sess.setFont(myFont);
	mid.setFont(myFont);
	fin.setFont(myFont);
	tmarks.setFont(myFont);
	
	sess1.setBounds(180,200,80,20);
	mid1.setBounds(270,200,80,20);
	fin1.setBounds(360,200,80,20);
	psess1.setBounds(180,230,80,20);
	pmid1.setBounds(270,230,80,20);
	pfin1.setBounds(360,230,80,20);
	tmarks1.setBounds(500,200,80,20);
	
	sess2.setBounds(180,280,80,20);
	mid2.setBounds(270,280,80,20);
	fin2.setBounds(360,280,80,20);
	psess2.setBounds(180,310,80,20);
	pmid2.setBounds(270,310,80,20);
	pfin2.setBounds(360,310,80,20);
	tmarks2.setBounds(500,280,80,20);
	
	sess3.setBounds(180,360,80,20);
	mid3.setBounds(270,360,80,20);
	fin3.setBounds(360,360,80,20);
	psess3.setBounds(180,390,80,20);
	pmid3.setBounds(270,390,80,20);
	pfin3.setBounds(360,390,80,20);
	tmarks3.setBounds(500,360,80,20);
	
	//Checking OBE
	Button checkOBE=new Button("Check OBE Weightage");
	checkOBE.setBounds(230,420,220,40);
	checkOBE.setFont(new Font("Arial",Font.PLAIN,15));
	checkOBE.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//CLO-1
			if(!tmarks1.getText().equals("")) {
				float total1=Integer.parseInt(tmarks1.getText());
				if(total1>0){
					if(!sess1.getText().equals("")) {
					float sessMarks1=Integer.parseInt(sess1.getText());
					double a=Math.round((sessMarks1/total1)*100);
						psess1.setText(Double.toString(a) + " %");
					}
					if(!mid1.getText().equals("")) {
						float midMarks1=Integer.parseInt(mid1.getText());
						double a=Math.round((midMarks1/total1)*100);
						pmid1.setText(Double.toString(a) + " %");
					}
					if(!fin1.getText().equals("")) {
						float finMarks1=Integer.parseInt(fin1.getText());
						double a=Math.round((finMarks1/total1)*100);
						pfin1.setText(Double.toString(a) + " %");
					}
				};
			}
			//CLO-2
			if(!tmarks2.getText().equals("")) {
				float total2=Integer.parseInt(tmarks2.getText());
				if(total2>0){
					if(!sess2.getText().equals("")) {
					float sessMarks2=Integer.parseInt(sess2.getText());
					double a=Math.round((sessMarks2/total2)*100);
						psess2.setText(Double.toString(a) + " %");
					}
					if(!mid2.getText().equals("")) {
						float midMarks2=Integer.parseInt(mid2.getText());
						double a=Math.round((midMarks2/total2)*100);
						pmid2.setText(Double.toString(a) + " %");
					}
					if(!fin2.getText().equals("")) {
						float finMarks2=Integer.parseInt(fin2.getText());
						double a=Math.round((finMarks2/total2)*100);
						pfin2.setText(Double.toString(a) + " %");
					}
				};
			}
			//CLO-3
			if(!tmarks3.getText().equals("")) {
				float total3=Integer.parseInt(tmarks3.getText());
				if(total3>0){
					if(!sess3.getText().equals("")) {
					float sessMarks3=Integer.parseInt(sess3.getText());
					double a=Math.round((sessMarks3/total3)*100);
						psess3.setText(Double.toString(a) + " %");
					}
					if(!mid3.getText().equals("")) {
						float midMarks3=Integer.parseInt(mid3.getText());
						double a=Math.round((midMarks3/total3)*100);
						pmid3.setText(Double.toString(a) + " %");
					}
					if(!fin3.getText().equals("")) {
						float finMarks3=Integer.parseInt(fin3.getText());
						double a=Math.round((finMarks3/total3)*100);
						pfin3.setText(Double.toString(a) + " %");
					}
				};
			}
			
		}
	});;
	
	//Back Button
			Button backBtn=new Button("Back");
			backBtn.setBounds(40,420,100,40);
			backBtn.setFont(new Font("Arial",Font.PLAIN,15));
			backBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				f.dispose();
				Main ob=new Main();
				}});
		
	/*Labels*/
	f.add(headText);
	f.add(headsubText);
	f.add(clo1);
	f.add(clo2);
	f.add(clo3);
	
	f.add(sess);
	f.add(mid);
	f.add(fin);
	f.add(tmarks);
	
	/*Textfields*/
	
	f.add(sess1);
	f.add(mid1);
	f.add(fin1);
	f.add(tmarks1);
	
	f.add(sess2);
	f.add(mid2);
	f.add(fin2);
	f.add(tmarks2);
	
	f.add(sess3);
	f.add(mid3);
	f.add(fin3);
	f.add(tmarks3);
	//Percentages Label
	f.add(psess1);
	f.add(pmid1);
	f.add(pfin1);
	f.add(psess2);
	f.add(pmid2);
	f.add(pfin2);
	f.add(psess3);
	f.add(pmid3);
	f.add(pfin3);
	
	f.add(checkOBE);
	checkOBE.setFocusable(false);
	f.add(backBtn);
	backBtn.setFocusable(false);
	
	//Colors
	sess1.setBackground(Color.LIGHT_GRAY);
	mid1.setBackground(Color.LIGHT_GRAY);
	fin1.setBackground(Color.LIGHT_GRAY);
	tmarks1.setBackground(Color.LIGHT_GRAY);
	sess2.setBackground(Color.LIGHT_GRAY);
	mid2.setBackground(Color.LIGHT_GRAY);
	fin2.setBackground(Color.LIGHT_GRAY);
	tmarks2.setBackground(Color.LIGHT_GRAY);
	sess3.setBackground(Color.LIGHT_GRAY);
	mid3.setBackground(Color.LIGHT_GRAY);
	fin3.setBackground(Color.LIGHT_GRAY);
	tmarks3.setBackground(Color.LIGHT_GRAY);
	
	//Percentage Colors
//	psess1.setForeground(Color.black);
//	pmid1.setForeground(Color.blue);
//	pfin1.setForeground(Color.blue);
//	psess2.setForeground(Color.blue);
//	pmid2.setForeground(Color.blue);
//	pfin2.setForeground(Color.blue);
//	psess3.setForeground(Color.blue);
//	pmid3.setForeground(Color.blue);
//	pfin3.setForeground(Color.blue);
	
	Font pFont = new Font("Arial",Font.BOLD,14);
	//Percentage Font
	psess1.setFont(pFont);
	pmid1.setFont(pFont);
	pfin1.setFont(pFont);
	psess2.setFont(pFont);
	pmid2.setFont(pFont);
	pfin2.setFont(pFont);
	psess3.setFont(pFont);
	pmid3.setFont(pFont);
	pfin3.setFont(pFont);
	
	
	checkOBE.setBackground(Color.LIGHT_GRAY);
	backBtn.setBackground(Color.LIGHT_GRAY);
	
	f.setBackground(Color.LIGHT_GRAY);
	
	f.setSize(680,500);
	f.setLayout(null);
	f.setVisible(true);
	
	//Making Close Button Work
	f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            f.dispose();}});
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Theory();
	}

}
