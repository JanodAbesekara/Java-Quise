
package n1;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    
     String name;
     JButton b1;
     JButton b2;
     
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel n3= new JLabel("WLCOME "+name);
        n3.setBounds(220,15,700,50);
        n3.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        n3.setForeground(new Color(0,76,153));
        add(n3);
        
        // adding rools 
        
        JLabel n4 = new JLabel();
        n4.setBounds(20,100,700,350);
        n4.setFont(new Font("Tahoma",Font.PLAIN,16));
        n4.setText(
        
        "<html>"+ 
                "1. You are trained to be a programmer answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
        "<html>"
        );
        add(n4);
        

        
        // add back buttens 
       
        b2 = new JButton("Back");
        b2.setBounds(200, 500, 120, 30);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Times New Roman",Font.BOLD,18));
        b2.addActionListener(this);
        add(b2);
        
        
                
         // add  start buttens 
         
        b1 = new JButton("Start");
        b1.setBounds(600, 500, 120, 30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Times New Roman",Font.BOLD,18));
        b1.addActionListener(this);
        add(b1);
        
        
        
        
        setSize(1000,600);
        setLocation(220,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            setVisible(false);
            new Quize(name);
            
        }else{
            
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("CODE  CLARM");
    }
    
}
