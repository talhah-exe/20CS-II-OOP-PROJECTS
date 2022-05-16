import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Main {
Main(){
	Frame f=new Frame();
	Label headText=new Label("OBE Weightage Calculator", Label.CENTER);
	Label headsubText=new Label("Calculate OBE weightage for theory and practical subjects", Label.CENTER);
	Label infoText=new Label("Select the type of subject for which you want to calculate OBE weightage", Label.CENTER);
	//Theory Button
			Button theoryBtn=new Button("Theory");
			theoryBtn.setBounds(215,220,100,40);
			theoryBtn.setFont(new Font("Arial",Font.PLAIN,18));
			theoryBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					f.dispose();
					Theory ob=new Theory();
				}});
		//Practical Button
			Button practicalBtn=new Button("Practical");
			practicalBtn.setBounds(365,220,100,40);
			practicalBtn.setFont(new Font("Arial",Font.PLAIN,18));
			practicalBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					f.dispose();
					Practical ob=new Practical();
				}});

	//setBounds
	headText.setBounds(0,50,680,50);
	headText.setFont(new Font("Arial",Font.PLAIN,34));
	headsubText.setBounds(0,100,680,50);
	headsubText.setFont(new Font("Arial",Font.PLAIN,18));
	infoText.setBounds(0,130,680,50);
	infoText.setFont(new Font("Arial",Font.PLAIN,16));
	
	//adding components
	f.add(headText);
	//f.add(headsubText);
	f.add(infoText);
	f.add(theoryBtn);
	f.add(practicalBtn);
	theoryBtn.setBackground(Color.LIGHT_GRAY);
	theoryBtn.setFocusable(false);
	practicalBtn.setBackground(Color.LIGHT_GRAY);
	practicalBtn.setFocusable(false);
	
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
		new Main();
	}

}
