/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nepali;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Front_page {
    Front_page(){
        //frame section
       JFrame frame1=new JFrame("Billing System (Mechi Multiple Campus) ");
       frame1.setSize(800,600);
       frame1.setLocationRelativeTo(null);
       frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame1.setLayout(null);
       frame1.setVisible(true);
       frame1.setResizable(false);
       
       
       
       //image section (background)
      ImageIcon img =new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\scl.jpeg\\").getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT));
     JLabel background= new JLabel(img);
      background.setBounds(0,0,800,600);
      background.setLayout(null);
      background.validate();
      frame1.add(background);
     
      
      //Language section
       JLabel jl=new JLabel("<html><head><title></title></head><body><font style='color:white; '>Choose Language:</font></body></html>");
       jl.setBounds(430,3,200,30);
        jl.setFont(new Font("serif",Font.BOLD,20));
       background.add(jl); 
       String language[] ={"<html><head><title></title></head><body><font style='color:green; '>English</font></body></html>","<html><head><title></title></head><body><font style='color:green;  background-color:pink;'>नेपालि</font></body></html>"};
       JComboBox jc= new JComboBox(language);
       jc.setBounds(600,3,100,30);
       background.add(jc);
      
       
      // Button Section <Enter Billing>
      JButton jb=new JButton("Get Started ");
       jb.setBounds(300,470,150,50);
       jb.setVisible(true);
       jb.setBackground(new java.awt.Color(243, 242, 123));
      jb.setForeground(Color.BLUE);
  //     jb.setBorder(new RoundedBorder(50));
       background.add(jb);
       
       
       //Heaer Section
       JLabel j2=new JLabel("<html><head><title></title></head><body><font style='color:#F5F4B3; text-decoration:underline;'>Billing System of College/School</font></body></html>");
       j2.setBounds(85,40,800,50);
       j2.setFont(new Font("06",Font.BOLD,40));
       background.add(j2); 
       /*JLabel j7=new JLabel("<html><head><title></title></head><body><font style='color:#F5F4B3; text-decoration:underline;'>Welcome To</font></body></html>");
       j7.setBounds(250,20,800,50);
       j7.setFont(new Font("06",Font.BOLD,40));
       background.add(j7);*/
       //Image icon or logo section
       ImageIcon icon2=new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\bill.png\\").getImage().getScaledInstance(350,350,Image.SCALE_DEFAULT));
       JLabel l4=new JLabel(icon2);
       l4.setBounds(215,90,350,350);
       background.add(l4);
         
        /* ImageIcon icon3=new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\arrow.png\\").getImage().getScaledInstance(50,100,Image.SCALE_DEFAULT));
       JLabel l8=new JLabel(icon3);
       l8.setBounds(440,475,95,40);
       background.add(l8);*/
        
        
       
       JLabel l5=new JLabel("This  billing system desktop application which can store information about verious student and can also print the fee bill.    Thank You :) ");
       l5.setBounds(7, 540,800, 20);
       l5.setForeground(Color.white);
       Panel p1=new Panel();
        p1.setBounds(0,540, 800, 25);
        p1.setBackground(Color.red);
        p1.add(l5);
        background.add(p1);
       
      /* JLabel l6=new JLabel("<html><body><p style='text-decoration:underline;'>Developed by:- Girija Pd. Bhattarai && Documented By:- Nischal Khatiwada. </p></body></html> ");
       l6.setBounds(7, 7,800, 20);
       l6.setBackground(Color.red);
       l6.setForeground(Color.white);
       background.add(l6);
       */
        
      jb.addActionListener((ActionEvent e) -> {
          new login();
          frame1.dispose();
       });
    }
   public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Front_page();
            }
        }
        
      );
   }

}


   
