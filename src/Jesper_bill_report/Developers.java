package Jesper_bill_report;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Developers extends JFrame{
    Developers(){
       setSize(610,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setTitle("About Developers");
        setResizable(false);
                JPanel ss1=new JPanel();
        ss1.setBounds(0,0,610,500);
        ss1.setLayout(null);
        ss1.setBackground(new Color(51, 51, 153));
        add(ss1);
       
      JLabel l9=new JLabel("Developers !");
      l9.setBounds(165,20,400,50);
      l9.setFont(new Font("Algerian",Font.BOLD,30));
      l9.setForeground(Color.white);
      ss1.add(l9);

        ImageIcon img =new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\g.jpg\\").getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
       JButton jb=new JButton(img);
       jb.setBounds(80,70,200,200);
       ss1.add(jb);
       
   
       ImageIcon img1 =new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\n.jpg\\").getImage().getScaledInstance(220,220,Image.SCALE_DEFAULT));
       JButton jb1=new JButton(img1);
       jb1.setBounds(340,70,200,200);
       ss1.add(jb1);
       
    JLabel g=new JLabel("Girija Prasad Bhattarai");
       g.setBounds(60,200,230,200);
      g.setFont(new Font("Times New Romen",Font.BOLD,22));
      g.setForeground(Color.white);
      ss1.add(g);
      
       JLabel g2=new JLabel("(BCA) Mechi Multiple Calpus.");
       g2.setBounds(50,230,290,200);
      g2.setFont(new Font("Times New Romen",Font.BOLD,17));
      g2.setForeground(Color.white);
      ss1.add(g2);
      
      JLabel g1=new JLabel("Nischal Khatiwada");
       g1.setBounds(345,200,200,200);
      g1.setFont(new Font("Times New Romen",Font.BOLD,22));
      g1.setForeground(Color.white);
      ss1.add(g1);
      
       JLabel g3=new JLabel("(BCA) Mechi Multiple Calpus.");
       g3.setBounds(330,230,290,200);
      g3.setFont(new Font("Times New Romen",Font.BOLD,17));
      g3.setForeground(Color.white);
      ss1.add(g3);
      
      
//      JButton btn1=new JButton("ok");
//      btn1.setBounds(200, 500, 50, 40);
//      btn1.setBackground(Color.black);
//      btn1.setForeground(Color.white);      
//      ss1.add(btn1);
      
      
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
