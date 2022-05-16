import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class numpuzzle
{
    static int arrH[]={80,150,220,80,150,220,80,150};
    static int arrV[]={70,70,70,140,140,140,210,210};
    static int X=220,Y=210;
    static int j=0,move=0;
    static String st= "MOVE = ";
    public static void main(String args[])
    {
        JFrame frame1=new JFrame();
        frame1.setVisible(true);
        frame1.setLocation(350,100);
        frame1.setSize(500,500);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pn1=new JPanel();
        frame1.add(pn1);
        pn1.setBackground(Color.BLACK);
        pn1.setLayout(null);
        JLabel wc=new JLabel();
        pn1.add(wc);
        wc.setBounds(110,50,300,60);
        wc.setText("WELCOME");
        wc.setForeground(Color.RED);
        wc.setFont(new Font("ITALIC",Font.BOLD,50));

        JLabel lb=new JLabel();
        pn1.add(lb);
        lb.setBounds(10,150,500,40);
        lb.setForeground(Color.GREEN);
        lb.setFont(new Font("ITALIC",Font.BOLD,30));
        lb.setText("PROJECT :     NUMPUZZLE");


        JLabel lb2=new JLabel();
        pn1.add(lb2);
        lb2.setBounds(200,210,500,40);
        lb2.setForeground(Color.YELLOW);
        lb2.setFont(new Font("ITALIC",Font.BOLD,30));
        lb2.setText("By");

        JLabel lb3=new JLabel();
        pn1.add(lb3);
        lb3.setBounds(20,270,500,40);
        lb3.setForeground(Color.WHITE);
        lb3.setFont(new Font("ITALIC",Font.BOLD,30));
        lb3.setText("Amir Ali  20CS078 ");

        JButton btS=new JButton("START");
        pn1.add(btS);
        btS.setBounds(160,330,150,60);
        btS.setFont(new Font("ITALIC",Font.BOLD,30));
        btS.setBackground(Color.RED);
        btS.setForeground(Color.YELLOW);

        JFrame frame2=new JFrame();
        frame2.setLocation(400,100);
        frame2.setSize(400,400);
        JPanel pn=new JPanel();
        pn.setLayout(null);

        frame2.add(pn);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setResizable(false);
        pn.setBackground(Color.BLACK);
        JLabel mv=new JLabel();
        pn.add(mv);
        mv.setBounds(120,10,220,40);
        mv.setForeground(Color.RED);

        mv.setFont(new Font("ITALIC",Font.BOLD,30));
        mv.setText("MOVE = 0");

        JFrame frame3=new JFrame();
        frame3.setLocation(400,100);
        frame3.setSize(400,400);
        JPanel pnF=new JPanel();
        pnF.setLayout(null);

        frame3.add(pnF);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setResizable(false);


        JLabel v=new JLabel();
        pnF.add(v);
        v.setBounds(90,70,400,40);
        v.setForeground(Color.RED);

        v.setFont(new Font("ITALIC",Font.BOLD,40));
        v.setText("YOU WON");

        JLabel mvR=new JLabel();
        pnF.add(mvR);
        mvR.setBounds(40,200,400,40);
        mvR.setForeground(Color.BLACK);

        mvR.setFont(new Font("ITALIC",Font.BOLD,30));

        btS.addActionListener(new ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      frame1.setVisible(false);
                                      frame2.setVisible(true);
                                  }
                              }
        );

        ImageIcon img1=new ImageIcon("F:/five.png");
        JLabel bt1=new JLabel(img1);
        bt1.setBounds(arrH[0],arrV[0],img1.getIconWidth(),img1.getIconHeight());
        pn.add(bt1);

        ImageIcon img2=new ImageIcon("F:/three.png");
        JLabel bt2=new JLabel(img2);
        bt2.setBounds(arrH[1],arrV[1],img2.getIconWidth(),img2.getIconHeight());
        pn.add(bt2);

        ImageIcon img3=new ImageIcon("F:/eight.png");
        JLabel bt3=new JLabel(img3);
        bt3.setBounds(arrH[2],arrV[2],img3.getIconWidth(),img3.getIconHeight());
        pn.add(bt3);

        ImageIcon img4=new ImageIcon("F:/seven.png");
        JLabel bt4=new JLabel(img4);
        bt4.setBounds(arrH[3],arrV[3],img4.getIconWidth(),img4.getIconHeight());
        pn.add(bt4);

        ImageIcon img5=new ImageIcon("F:/two.png");
        JLabel bt5=new JLabel(img5);
        bt5.setBounds(arrH[4],arrV[4],img5.getIconWidth(),img5.getIconHeight());
        pn.add(bt5);

        ImageIcon img6=new ImageIcon("F:/four.png");
        JLabel bt6=new JLabel(img6);
        bt6.setBounds(arrH[5],arrV[5],img6.getIconWidth(),img6.getIconHeight());
        pn.add(bt6);

        ImageIcon img7=new ImageIcon("F:/sixx.png");
        JLabel bt7=new JLabel(img7);
        bt7.setBounds(arrH[6],arrV[6],img7.getIconWidth(),img7.getIconHeight());
        pn.add(bt7);

        ImageIcon img8=new ImageIcon("F:/one.png");
        JLabel bt8=new JLabel(img8);
        bt8.setBounds(arrH[7],arrV[7],img8.getIconWidth(),img8.getIconHeight());
        pn.add(bt8);

        ImageIcon img9=new ImageIcon("F:/zero.png");
        JLabel bt9=new JLabel(img9);
        bt9.setBounds(X,Y,img9.getIconWidth(),img9.getIconHeight());
        pn.add(bt9);

        frame2.addKeyListener(new KeyListener() {

                                  public void keyPressed(KeyEvent e)
                                  {
                                      if(e.getKeyCode()==KeyEvent.VK_UP && Y<=140 )
                                      {
                                          Y+=70;
                                          j=0;
                                          while(j<8)
                                          {
                                              if(X==arrH[j] && Y==arrV[j])
                                              {
                                                  arrV[j]=Y-70;
                                                  j=8;
                                              }
                                              j++;
                                          }
                                          move++;
                                          mv.setText("MOVE = " +move);
                                      }
                                      else if(e.getKeyCode()==KeyEvent.VK_DOWN && Y>=140)
                                      {
                                          Y-=70;
                                          j=0;
                                          while(j<8)
                                          {
                                              if(X==arrH[j] && Y==arrV[j])
                                              {
                                                  arrV[j]=Y+70;
                                                  j=8;
                                              }
                                              j++;
                                          }
                                          move++;
                                          mv.setText("MOVE = " +move);
                                      }
                                      else if(e.getKeyCode()==KeyEvent.VK_LEFT && X<=150)
                                      {
                                          X+=70;
                                          j=0;
                                          while(j<8)
                                          {
                                              if(X==arrH[j] && Y==arrV[j])
                                              {
                                                  arrH[j]=X-70;
                                                  j=8;
                                              }
                                              j++;
                                          }
                                          move++;
                                          mv.setText("MOVE = " +move);
                                      }
                                      else if(e.getKeyCode()==KeyEvent.VK_RIGHT && X>=150)
                                      {
                                          X-=70;
                                          j=0;
                                          while(j<8)
                                          {
                                              if(X==arrH[j] && Y==arrV[j])
                                              {
                                                  arrH[j]=X+70;
                                                  j=8;
                                              }
                                              j++;
                                          }
                                          move++;
                                          mv.setText("MOVE = " +move);
                                      }
                                      bt1.setBounds(arrH[0],arrV[0],img1.getIconWidth(),img1.getIconHeight());
                                      bt2.setBounds(arrH[1],arrV[1],img2.getIconWidth(),img2.getIconHeight());
                                      bt3.setBounds(arrH[2],arrV[2],img3.getIconWidth(),img3.getIconHeight());
                                      bt4.setBounds(arrH[3],arrV[3],img4.getIconWidth(),img4.getIconHeight());
                                      bt5.setBounds(arrH[4],arrV[4],img5.getIconWidth(),img5.getIconHeight());
                                      bt6.setBounds(arrH[5],arrV[5],img6.getIconWidth(),img6.getIconHeight());
                                      bt7.setBounds(arrH[6],arrV[6],img7.getIconWidth(),img7.getIconHeight());
                                      bt8.setBounds(arrH[7],arrV[7],img8.getIconWidth(),img8.getIconHeight());
                                      bt9.setBounds(X,Y,img9.getIconWidth(),img9.getIconHeight());
                                      if(arrH[7]==80 && arrV[7]==70)
                                      {
                                          if(arrH[4]==150 && arrV[4]==70)
                                          {
                                              if(arrH[1]==220 && arrV[1]==70)
                                              {
                                                  if(arrH[5]==80 && arrV[5]==140)
                                                  {
                                                      if(arrH[0]==150 && arrV[0]==140)
                                                      {
                                                          if(arrH[6]==220 && arrV[6]==140)
                                                          {
                                                              if(arrH[3]==80 && arrV[3]==210)
                                                              {
                                                                  if(arrH[2]==150 && arrV[2]==210)
                                                                  {
                                                                      frame2.setVisible(false);
                                                                      frame3.setVisible(true);
                                                                      pnF.setBackground(Color.GREEN);
                                                                      mvR.setText("MOVES TAKEN = "+move);
                                                                  }
                                                              }
                                                          }
                                                      }
                                                  }
                                              }
                                          }
                                      }
                                  }
                                  public void keyReleased(KeyEvent e)
                                  {
                                  }
                                  public void keyTyped(KeyEvent e)
                                  {
                                  }
                              }
        );
    }
}