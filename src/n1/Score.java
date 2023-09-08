package n1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    JLabel Qn,Q1;
    JButton submit;
    Score(String name,int score){

        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        // set image

        ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.gif"));
        // image Scale
        Image m2 = m1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon m3 = new ImageIcon(m2);
        JLabel image =  new JLabel(m3);
        image.setBounds(120,120,500,200);
        add(image);


        // user thank numbers

        Qn = new JLabel("Thankyou "+name+" For Playing CODE CLAME");
        Qn.setBounds(50,45,800,30);
        Qn.setFont(new Font("Tahoma",Font.BOLD,24));
        add(Qn);

        // score display

        Q1 = new JLabel("Your Score is :- "+score);
        Q1.setBounds(280,45,500,750);
        Q1.setFont(new Font("Tahoma",Font.BOLD,24));
        add(Q1);

        submit = new JButton("Play Again");
        submit.setBounds(310,350,120,30);
        submit.setFont(new Font("Dialog",Font.PLAIN,15));
        submit.setBackground(new Color(30,144,255));
        submit.addActionListener(this);
        submit.setForeground(Color.WHITE);
        add(submit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
         setVisible(false);
         new Login();
    }

    public static  void main(String[] args){
        new Score("User",0);
    }
}
