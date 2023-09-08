
package n1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login  extends JFrame implements ActionListener{
    
            
        JLabel n1,n2;
        JButton b1;
        JButton b2;
        JTextField t1;
        
    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // set image
        
        ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("icon/nm.jpg"));
        JLabel image =  new JLabel(m1);
        image.setBounds(0,0,600,600);
        add(image);
        
        // add text 
        
        n1 = new JLabel("CODE   CLARM");
        n1.setBounds(700,30,400,50);
        n1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        n1.setForeground(Color.BLUE);
        add(n1);
        
        
                // add another text 
        
        n2 = new JLabel("ENTER YOUR NAME ");
        n2.setBounds(750,120,400,40);
        n2.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        n2.setForeground(Color.BLUE);
        add(n2);
        
        // add a text field
        t1 = new JTextField();
        t1.setBounds(720,220,250,25);
        t1.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(t1);
        
        // add buttens 
        b1 = new JButton("Rules");
        b1.setBounds(650, 300, 120, 30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Times New Roman",Font.BOLD,18));
        b1.addActionListener(this);
        add(b1);
        
        
        // add  another buttens 
       
        b2 = new JButton("Back");
        b2.setBounds(920, 300, 120, 30);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Times New Roman",Font.BOLD,18));
        b2.addActionListener(this);
        add(b2);
        
        // set the open widow box seting 
        
        setSize(1200,600);
        setLocation(150,120);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== b1){
            setVisible(false);
            String name = t1.getText();
            new Rules(name);
        }else if(ae.getSource() == b2 ){
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Login();
    }
    
}
