package Jesper_bill_report;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import static javax.swing.text.html.HTML.Tag.I;
//import static sun.security.jgss.GSSUtil.login;
public class Home extends JFrame {
    Home(){
        setSize(610,500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JPanel ss1=new JPanel();
        ss1.setBounds(0,0,610,500);
//    ss1.setBounds(15,20,900,570);
    //ss1.setBorder(title2);
    ss1.setLayout(null);
    ss1.setBackground(new Color(51, 51, 153));
    add(ss1);
        
        JMenuBar menub=new JMenuBar();
        menub.setBounds(0,0,610,35);
        menub.setBackground(Color.DARK_GRAY);
         ss1.add(menub);
       JMenu menu=new JMenu("Home");
        menu.setForeground(Color.white);
        menu.setBounds(0,0,50,35);
       menub.add(menu);
       JMenuItem i1=new JMenuItem("home");
       menu.add(i1);
       
       JMenu stu=new JMenu("Student");
       
        JMenuItem stu1=new JMenuItem("Insert Student");
         JMenuItem stu3=new JMenuItem("View Student");
         JMenuItem stu2=new JMenuItem("Update Student");
         JMenuItem stu4=new JMenuItem("Delete Student");
         stu1.setMnemonic('I');
         stu1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
         
          stu2.setMnemonic('U');
         stu2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
         
          stu3.setMnemonic('V');
         stu3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
         
         stu4.setMnemonic('D');
         stu4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
         
         stu.setForeground(Color.white);
         stu.add(stu1);
          stu.add(stu2);
          stu.add(stu3);
          stu.add(stu4);
        
        menub.add(stu);
        
        JMenu bill=new JMenu("Billing");
        JMenuItem bill1=new JMenuItem("New Billing");
        JMenuItem bill2=new JMenuItem("View  Details");
        
        bill1.setMnemonic('N');
         bill1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
         
          bill2.setMnemonic('D');
         bill2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
//         JMenuItem bill3=new JMenuItem("Update  Student");
//          JMenuItem bill4=new JMenuItem("Delete  Student");
         bill.setForeground(Color.white);
         bill.add(bill1);
          bill.add(bill2);
//          stu.add(stu3);
//          stu.add(stu4);
        menub.add(bill);
        
        JMenu menu1=new JMenu("About");
        JMenuItem i2=new JMenuItem("About Application");
        JMenuItem i3=new JMenuItem("About Developer");
         menu1.setForeground(Color.white);
         menu1.add(i2);
          menu1.add(i3);
        menub.add(menu1);
        JMenu menu2=new JMenu("Help");
        JMenuItem i4=new JMenuItem("User Mannual");
        menu2.add(i4);
         menu2.setForeground(Color.white);
       menub. add(menu2);
        JMenu menu3=new JMenu("LogOut");
         JMenuItem i5=new JMenuItem("Click Here");
         menu3.add(i5);
         menu3.setForeground(Color.white);
       menub. add(menu3);
       
       i5.addActionListener((ActionEvent e) -> {
          new login();
         dispose();
       });
       
       
      JLabel l9=new JLabel("Choose One");
      l9.setBounds(240,40,200,50);
      l9.setFont(new Font("Algerian",Font.BOLD,20));
      l9.setForeground(Color.black);
      add(l9);ImageIcon img =new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\info.png\\").getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
       JButton jb=new JButton(img);
       jb.setBounds(80,100,200,200);
       ss1.add(jb);
       
   
       ImageIcon img1 =new ImageIcon(new ImageIcon("D:\\Help\\Fourth Sem\\project i\\Billing_system\\Billing_system\\src\\main\\user.png\\").getImage().getScaledInstance(220,220,Image.SCALE_DEFAULT));
       JButton jb1=new JButton(img1);
       jb1.setBounds(340,100,200,200);
       ss1.add(jb1);
       
       
     
       
       
       JLabel l8=new JLabel("Print Daily Report");
              l8.setForeground(Color.WHITE);

       l8.setBounds(95, 320, 200,35);
       l8.setFont(new Font("Bahnschrift",Font.BOLD,20));
       l8.setVisible(true);
       ss1.add(l8);
       JLabel l7=new JLabel("(Total Fee)");
       l7.setForeground(Color.WHITE);
       l7.setBounds(115, 350, 160,35);
       l7.setFont(new Font("Bahnschrift",Font.BOLD,20));
       l7.setVisible(true);
       ss1.add(l7);
       
       JLabel l6=new JLabel("Add New Student");
              l6.setForeground(Color.WHITE);

       l6.setBounds(355, 320, 200,35);
       l6.setFont(new Font("Bahnschrift",Font.BOLD,20));
       l6.setVisible(true);
       ss1.add(l6);
       JLabel l5=new JLabel("(Print Bill)");
              l5.setForeground(Color.WHITE);

       l5.setBounds(395, 350, 200,35);
       l5.setFont(new Font("Bahnschrift",Font.BOLD,20));
       l5.setVisible(true);
       ss1.add(l5);
       
       
        jb.addActionListener((ActionEvent e) -> {
        new report();
         dispose();
       });
          jb1.addActionListener((ActionEvent e) -> {
        new Student_info();
         dispose();
       });
        stu1.addActionListener((ActionEvent e) -> {
          new Student_info();
         dispose();
       });
         stu3.addActionListener((ActionEvent e) -> {
            try {
                new View();
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, ex);
            }
         dispose();
       });
         bill1.addActionListener((ActionEvent e) -> {
          new Fee();
         dispose();
       });
          stu2.addActionListener((ActionEvent e) -> {
          new Update();
         dispose();
       });
           stu4.addActionListener((ActionEvent e) -> {
            try {
                new Delete();
                dispose();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
       });
         
         bill2.addActionListener((ActionEvent e) -> {
            
            try {
                new Data_Info();
         
         dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
       });
         
        
        
        
        
    }  
}
