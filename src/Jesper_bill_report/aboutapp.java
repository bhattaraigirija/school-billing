
package Jesper_bill_report;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class aboutapp extends JFrame {
     aboutapp(){
         setResizable(false);
       setSize(610,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setTitle("About Application");
        
          JPanel ss1=new JPanel();
        ss1.setBounds(0,0,610,500);
        ss1.setLayout(null);
        ss1.setBackground(new Color(51, 51, 153));
        add(ss1);
         JLabel l9=new JLabel("About App !");
      l9.setBounds(180,20,400,50);
      l9.setFont(new Font("Algerian",Font.BOLD,30));
      l9.setForeground(Color.white);
      ss1.add(l9);
      JLabel g=new JLabel("<html><body><p style='color:white;'> Billing system for schools and colleges, project's main idea is to implement a software application for school and colleges for maintaining easy billing system. Data is maintained in database, Mysql is used as database in this project.<br> <br>\n" +
"In existing system transactions and student's information is maintained in the form of manual records. In such system, data is not accurate there are chances of losing data and retrieving old records is not possible.<br><br> \n" +
"In this system, schools and colleges will be provided with the platform to store the students' information in the database so that it would be easy to retrieve it while creating bills.</p></body></html>");
      g.setBounds(25,5,580,420);
      g.setFont(new Font("Times New Romen",Font.BOLD,18));
      g.setForeground(Color.white);
      ss1.add(g);
      
      
      JButton btn1=new JButton("0k");
       btn1.setBounds(275,420,70,40);
       btn1.setBackground(Color.black);
      btn1.setForeground(Color.white);
       ss1.add(btn1);
       btn1.addActionListener((ActionEvent e) -> {
          new Home();
         dispose();
       });
     }
}
