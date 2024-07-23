package Jesper_bill_report;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Print_save extends JFrame {
    Print_save(){
                setSize(680,700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel scl=new JLabel("SCHOOL/ COLLEGE NAME");
        scl.setBounds(120,15,700,46);
        scl.setFont(new Font("Algerian",Font.BOLD,36));
        add(scl);
        
        JLabel addr=new JLabel("Bhadrapur-6 Jhapa Nepal  ||  Tel:+977xxxxxxxxxx");
        addr.setBounds(150,39,600,50);
        addr.setFont(new Font("Bahnschrift",Font.BOLD,18));
        add(addr);
        
        JLabel email=new JLabel("Email: abc@gmail.com  ||  Website:www.abc.com.np");
        email.setBounds(140,62,500,50);
        email.setFont(new Font("Bahnschrift",Font.BOLD,18));
        add(email);
        
        JLabel s= new JLabel("--------------------------------------------------------------------------");
        s.setBounds(0,120,750,10); ///second line
        s.setFont(new Font("Bahnschrift",Font.BOLD,18));
        add(s);
         JLabel s1= new JLabel("--------------------------------------------------------------------------"); 
        s1.setBounds(0,0,750,10); ///first line
        s1.setFont(new Font("Bahnschrift",Font.BOLD,18));
        add(s1);
        
        JLabel bill= new JLabel("BILL / RECEIPT");
        bill.setBounds(250,100,750,30);
        bill.setFont(new Font("Bahnschrift",Font.BOLD,24));
        add(bill);
        
        JLabel s3= new JLabel("--------------------------------------------------------------------------");
        s3.setBounds(0,180,750,10); ///third line
        s3.setFont(new Font("Bahnschrift",Font.BOLD,18));
        add(s3);
        
         JLabel s6= new JLabel("--------------------------------------------------------------------------");
        s6.setBounds(0,210,750,10);//fourth line
        s6.setFont(new Font("Bahnschrift",Font.BOLD,18));
        add(s6);
        
           JLabel s4= new JLabel("--------------------------------------------------------------------------");
        s4.setBounds(0,540,750,10);//fifth line
        s4.setFont(new Font("Bahnschrift",Font.BOLD,18));
        add(s4);
        
        
         JLabel s5= new JLabel("--------------------------------------------------------------------------");
        s5.setBounds(0,590,750,10);//sixth line
        s5.setFont(new Font("Bahnschrift",Font.BOLD,18));
        add(s5);
        
        
        JLabel sn=new JLabel("Student Name :");
        sn.setBounds(10,130,200,20);
        sn.setFont(new Font("Calibri",Font.BOLD,18));
        add(sn);
        JLabel s7=new JLabel("Faculty :");
        s7.setBounds(10,150,200,20);
        s7.setFont(new Font("Calibri",Font.BOLD,18));
        add(s7);
        JLabel s8=new JLabel("Semester :");
        s8.setBounds(10,170,200,20);
        s8.setFont(new Font("Calibri",Font.BOLD,18));
        add(s8);
        
        JLabel s9=new JLabel("Bill No. :");
        s9.setBounds(400,130,200,20);
        s9.setFont(new Font("Calibri",Font.BOLD,18));
        add(s9);
          JLabel s0=new JLabel("Date :");
        s0.setBounds(400,150,200,20);
        s0.setFont(new Font("Calibri",Font.BOLD,18));
        add(s0);
        JLabel s10=new JLabel("Roll No. :");
        s10.setBounds(400,170,200,20);
        s10.setFont(new Font("Calibri",Font.BOLD,18));
        add(s10);
        
        JLabel s11=new JLabel("Year :");
        s11.setBounds(210,170,200,20);
        s11.setFont(new Font("Calibri",Font.BOLD,18));
        add(s11);
        
        JLabel Particular=new JLabel("Particular ");
        Particular.setBounds(48,197,200,20);
        Particular.setFont(new Font("Calibri",Font.BOLD,22));
        add(Particular);
        
         JLabel amt=new JLabel("Amount");
        amt.setBounds(470,197,200,20);
        amt.setFont(new Font("Calibri",Font.BOLD,22));
        add(amt);
        
         JLabel p1=new JLabel("1. Admission Fee::");
        p1.setBounds(40,225,200,20);
        p1.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p1);
         JLabel p2=new JLabel("2. Reg Fee::");
        p2.setBounds(40,242,200,20);
        p2.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p2);
        JLabel p3=new JLabel("3. Tuition Fee::");
        p3.setBounds(40,259,200,20);
        p3.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p3);
         JLabel p4=new JLabel("4.Identity Card Fee::");
        p4.setBounds(40,276,200,20);
        p4.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p4);
        JLabel p5=new JLabel("5. Labtory Fee::");
        p5.setBounds(40,293,200,20);
        p5.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p5);
        JLabel p6=new JLabel("6. Library Fee::");
        p6.setBounds(40,310,200,20);
        p6.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p6);
        JLabel p7=new JLabel("7. Sports Fee::");
        p7.setBounds(40,327,200,20);
        p7.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p7);
        JLabel p8=new JLabel("8. Exam Fee::");
        p8.setBounds(40,344,200,20);
        p8.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p8);
         JLabel p9=new JLabel("9. Hostel Fee::");
        p9.setBounds(40,361,200,20);
        p9.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p9);
         JLabel p10=new JLabel("10.Miscelleneous Fee::");
        p10.setBounds(40,378,200,20);
        p10.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p10);
         JLabel p11=new JLabel("12.Sports Fee::");
        p11.setBounds(40,395,200,20);
        p11.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p11);
         JLabel p12=new JLabel("13. Other Fee::");
        p12.setBounds(40,412,200,20);
        p12.setFont(new Font("Poor Richard",Font.PLAIN,18));
        add(p12);
        
        JButton btn1=new JButton("Back");
      btn1.setBounds(150, 609, 150, 40);
      btn1.setBackground(Color.GREEN);
      btn1.setForeground(Color.white);      
      add(btn1);
      btn1.addActionListener((ActionEvent e) -> {
          new Fee();
         dispose();
       });
     
        JButton btn2=new JButton("Save & Print");
      btn2.setBounds(400, 609, 150, 40);
      btn2.setBackground(Color.GREEN);
      btn2.setForeground(Color.white);      
      add(btn2);
      
      btn2.addActionListener((ActionEvent e) -> {
          new Print_save();
         dispose();
       });
    }
    
}
