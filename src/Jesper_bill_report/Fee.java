package Jesper_bill_report;
import Jesper_bill_report.Print;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


class Fee extends JFrame { 
        Connection conn;
        Statement st;
         void getConnection() {  
             try {    
                 Class.forName("com.mysql.jdbc.Driver");  
                 conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/project_i","root","");
                 st=conn.createStatement(); 
             } catch (Exception e) {   
                 JOptionPane.showMessageDialog(null, e); 
             }   
         }   
        
       
    Fee(){
         getConnection();
         setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
                JPanel ss1=new JPanel();
        ss1.setBounds(0,0,1300,670);
//    ss1.setBounds(15,20,900,570);
    //ss1.setBorder(title2);
    ss1.setLayout(null);
    ss1.setBackground(new Color(51, 51, 153));
    add(ss1);
    
        
        JLabel l1= new JLabel("--------------------------------------------------------------------------------------------------------------------------------------");
      l1.setFont(new Font("Bahnschrift",Font.BOLD,10));
      l1.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
      l1.setBounds(0,2,1300,10);
      ss1.add(l1);
            JLabel l2= new JLabel("-------------------------------------------------------------------------------------------------------------------------------------");
      l2.setFont(new Font("Bahnschrift",Font.BOLD,10));
      l2.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
      l2.setBounds(0,30,1300,10);
      ss1.add(l2);
        JLabel l9=new JLabel("Bill Date : ");
        l9.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
      l9.setBounds(40,10,120,20);
      l9.setFont(new Font("Bahnschrift",Font.BOLD,18));
      //l9.setForeground(Color.blue);
       ss1.add(l9);
     JComboBox<Integer> year =new JComboBox<Integer>();
      year.setBounds(170, 10, 70, 25);
      for(int y=2076;y<3000;y++){
          year.addItem(y);  
      }
       ss1.add(year);
      
      JComboBox<Integer> month =new JComboBox<Integer>();
      month.setBounds(260, 10, 70, 25);
      for(int y=1;y<13;y++){
          month.addItem(y);  
      }
       ss1.add(month);
      
      JComboBox<Integer> day =new JComboBox<Integer>();
      day.setBounds(350, 10, 70, 25);
      for(int y=1;y<33;y++){
          day.addItem(y);  
      }
      ss1.add(day);
     
     JLabel no= new JLabel("Stu. No:");
      no.setFont(new Font("Bahnschrift",Font.BOLD,18));
      no.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
      no.setBounds(500,10,130,20);
      ss1.add(no);
       JTextField no1=new JTextField();
      no1.setBounds(590, 10, 100, 25);
       ss1.add(no1);
      
      JButton b1=new JButton("OK");
      b1.setBounds(700,10,60,25);
       ss1.add(b1);
      
      
    JCheckBox add0 = new JCheckBox("1.Admission Fee:"); 
      add0.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add0.setForeground(Color.WHITE);
      add0.setBackground(new Color(51, 51, 153));
      add0.setBounds(30,50,150,15);
       ss1.add(add0);
      setVisible(true);
      JTextField user0=new JTextField("0");
      user0.setBounds(190, 45, 160, 25);
      user0.setEnabled(false);
       ss1.add(user0);
      
      add0.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add0.isSelected()){
                        user0.setEnabled(true);
                    }
                    else{
                        user0.setEnabled(false);
                    } 
                }
            });
      
      JCheckBox add=new JCheckBox("2. Reg Fee:");
      add.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add.setForeground(Color.WHITE);
      add.setBackground(new Color(51, 51, 153));
      add.setBounds(30,85,150,15);
       ss1.add(add);
      setVisible(true);
        
      JTextField user=new JTextField("0");
      user.setBounds(190, 75, 160, 25);
      user.setEnabled(false);
       ss1.add(user);
      add.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add.isSelected()){
                        user.setEnabled(true);
                    }
                    else{
                        user.setEnabled(false);
                    } 
                }
            });
     
      JCheckBox add1=new JCheckBox("3. Tuition Fee:");
      add1.setForeground(Color.WHITE);
      add1.setBackground(new Color(51, 51, 153));
      add1.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add1.setBounds(30,115,150,15);
       ss1.add(add1);
      setVisible(true);
      
        
      JTextField user1=new JTextField("0");
      user1.setBounds(190, 105,160, 25);
      user1.setEnabled(false);
       ss1.add(user1);
      add1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add1.isSelected()){
                        user1.setEnabled(true);
                    }
                    else{
                        user1.setEnabled(false);
                    } 
                }
            });
      
       JCheckBox add2=new JCheckBox("4.Identity Card Fee :");
      add2.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add2.setForeground(Color.WHITE);
      add2.setBackground(new Color(51, 51, 153));
      add2.setBounds(30,140,150,15);
       ss1.add(add2);
      setVisible(true);
      JTextField user2=new JTextField("0");
      user2.setBounds(190, 135, 160, 25);
      user2.setEnabled(false);
       ss1.add(user2);
      add2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add2.isSelected()){
                        user2.setEnabled(true);
                    }
                    else{
                        user2.setEnabled(false);
                    } 
                }
            });
      
       JCheckBox add3=new JCheckBox("5. Labtory Fee:");
      add3.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add3.setForeground(Color.WHITE);
      add3.setBackground(new Color(51, 51, 153));
      add3.setBounds(30,170,150,15);
       ss1.add(add3);
      JTextField user3=new JTextField("0");
      user3.setBounds(190, 165, 160, 25);
      user3.setEnabled(false);
       ss1.add(user3);
      add3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add3.isSelected()){
                        user3.setEnabled(true);
                    }
                    else{
                        user3.setEnabled(false);
                    } 
                }
            });
      
      
      JCheckBox add4=new JCheckBox("6. Library Fee:");
      add4.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add4.setForeground(Color.WHITE);
      add4.setBackground(new Color(51, 51, 153));
      add4.setBounds(30,200,150,15);
       ss1.add(add4);
      JTextField user4=new JTextField ("0");
      user4.setBounds(190, 195, 160, 25);
      user4.setEnabled(false);
       ss1.add(user4);
      add4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add4.isSelected()){
                        user4.setEnabled(true);
                    }
                    else{
                        user4.setEnabled(false);
                    } 
                }
            });
      
       JCheckBox add5=new JCheckBox("7. Sports Fee:");
      add5.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add5.setForeground(Color.WHITE);
      add5.setBackground(new Color(51, 51, 153));
      add5.setBounds(30,230,150,15);
       ss1.add(add5);
      JTextField  user5=new JTextField ("0");
      user5.setBounds(190, 225, 160, 25);
      user5.setEnabled(false);
       ss1.add(user5);
      add5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add5.isSelected()){
                        user5.setEnabled(true);
                    }
                    else{
                        user5.setEnabled(false);
                    } 
                }
            });
      
       JCheckBox add6=new JCheckBox("8. Exam Fee:");
      add6.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add6.setForeground(Color.WHITE);
      add6.setBackground(new Color(51, 51, 153));
      add6.setBounds(30,260,150,15);
       ss1.add(add6);
      JTextField user6=new JTextField("0");
      user6.setBounds(190, 255, 160, 25);
      user6.setEnabled(false);
       ss1.add(user6);
      add6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add6.isSelected()){
                        user6.setEnabled(true);
                    }
                    else{
                        user6.setEnabled(false);
                    } 
                }
            });
      
       JCheckBox add7=new JCheckBox("9. Hostel Fee:");
      add7.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add7.setForeground(Color.WHITE);
      add7.setBackground(new Color(51, 51, 153));
      add7.setBounds(30,290,150,15);
       ss1.add(add7);
      JTextField user7=new JTextField("0");
      user7.setBounds(190, 285,160, 25);
      user7.setEnabled(false);
       ss1.add(user7);
      add7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add7.isSelected()){
                        user7.setEnabled(true);
                    }
                    else{
                        user7.setEnabled(false);
                    } 
                }
            });
        
       JCheckBox due =new JCheckBox("10. Due Amount:");
      due.setFont(new Font("Bahnschrift",Font.BOLD,15));
      due.setForeground(Color.WHITE);
      due.setBackground(new Color(51, 51, 153));
     due.setBounds(30,320,150,15);
       ss1.add(due);
      JTextField due1=new JTextField("0");
      due1.setBounds(190, 315,160, 25);
      due1.setEnabled(false);
       ss1.add(due1);
      due.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(due.isSelected()){
                        due1.setEnabled(true);
                    }
                    else{
                        due1.setEnabled(false);
                    } 
                }
            });
      
      JCheckBox add10=new JCheckBox(" 11.Miscelleneous Fee:");
      add10.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add10.setForeground(Color.WHITE);
      add10.setBackground(new Color(51, 51, 153));
      add10.setBounds(395,45,200,15);
       ss1.add(add10);
      setVisible(true);
      
      JTextField user10=new JTextField("0");
      user10.setBounds(600, 40, 160, 25);
      user10.setEnabled(false);
       ss1.add(user10);
      add10.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add10.isSelected()){
                        user10.setEnabled(true);
                    }
                    else{
                        user10.setEnabled(false);
                    } 
                }
            });
     
      JCheckBox add11=new JCheckBox(" 12.Uniform Fee:");
      add11.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add11.setForeground(Color.WHITE);
      add11.setBackground(new Color(51, 51, 153));
      add11.setBounds(395,75,150,15);
       ss1.add(add11);
      setVisible(true);
        
      JTextField user11=new JTextField("0");
      user11.setBounds(600, 70, 160, 25);
      user11.setEnabled(false);
       ss1.add(user11);
      add11.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add11.isSelected()){
                        user11.setEnabled(true);
                    }
                    else{
                        user11.setEnabled(false);
                    } 
                }
            });
    
      JCheckBox add12=new JCheckBox("13. Fine/Late Fee:");
      add12.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add12.setForeground(Color.WHITE);
      add12.setBackground(new Color(51, 51, 153));
      add12.setBounds(398,105,150,15);
       ss1.add(add12);
      setVisible(true); 
      JTextField user12=new JTextField("0");
      user12.setBounds(600, 100, 160, 25);
      user12.setEnabled(false);
       ss1.add(user12);
      add12.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add12.isSelected()){
                        user12.setEnabled(true);
                    }
                    else{
                        user12.setEnabled(false);
                    } 
                }
            });
      
      JCheckBox add13=new JCheckBox("14.Monthly Fee:");
       add13.setFont(new Font("Bahnschrift",Font.BOLD,15));
       add13.setForeground(Color.WHITE);
      add13.setBackground(new Color(51, 51, 153));
      add13.setBounds(398, 135, 190, 15);
       ss1.add(add13);
      JTextField use13=new JTextField("0");
      use13.setBounds(600, 130, 160, 25);
      use13.setEnabled(false);
       ss1.add(use13);
      add13.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add13.isSelected()){
                        use13.setEnabled(true);
                    }
                    else{
                        use13.setEnabled(false);
                    } 
                }
            });
      
     JCheckBox add14=new JCheckBox("15.Insurance:");
      add14.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add14.setForeground(Color.WHITE);
      add14.setBackground(new Color(51, 51, 153));
      add14.setBounds(398, 165, 190, 15);
       ss1.add(add14);
      JTextField use14=new JTextField("0");
      use14.setBounds(600, 160, 160, 25);
       use14.setEnabled(false);
       ss1.add(use14);
      add14.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add14.isSelected()){
                        use14.setEnabled(true);
                    }
                    else{
                        use14.setEnabled(false);
                    } 
                }
            });
      
      
       JCheckBox add15=new JCheckBox("16.School Devlopment Fee:");
        add15.setFont(new Font("Bahnschrift",Font.BOLD,15));
        add15.setForeground(Color.WHITE);
      add15.setBackground(new Color(51, 51, 153));
      add15.setBounds(398, 195, 190, 15);
       ss1.add(add15);
      JTextField use15=new JTextField("0");
      use15.setBounds(600, 190, 160, 25);
       use15.setEnabled(false);
       ss1.add(use15);
      add15.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add15.isSelected()){
                        use15.setEnabled(true);
                    }
                    else{
                        use15.setEnabled(false);
                    } 
                }
            });
      
      
       JCheckBox add16=new JCheckBox("17.Copy & Books:");
        add16.setFont(new Font("Bahnschrift",Font.BOLD,15));
        add16.setForeground(Color.WHITE);
      add16.setBackground(new Color(51, 51, 153));
      add16.setBounds(398, 225, 190, 15);
       ss1.add(add16);
      JTextField use16=new JTextField("0");
      use16.setBounds(600, 220, 160, 25);
       use16.setEnabled(false);
       ss1.add(use16);
      add16.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add16.isSelected()){
                        use16.setEnabled(true);
                    }
                    else{
                        use16.setEnabled(false);
                    } 
                }
            });
      
       JCheckBox add17=new JCheckBox("18.Student Union Fee:");
        add17.setFont(new Font("Bahnschrift",Font.BOLD,15));
        add17.setForeground(Color.WHITE);
      add17.setBackground(new Color(51, 51, 153));
      add17.setBounds(398, 255, 190, 15);
       ss1.add(add17);
      JTextField use17=new JTextField("0");
      use17.setBounds(600, 250, 160, 25);
       use17.setEnabled(false);
       ss1.add(use17);
      add17.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add17.isSelected()){
                        use17.setEnabled(true);
                    }
                    else{
                        use17.setEnabled(false);
                    } 
                }
            });
      
       JCheckBox add18=new JCheckBox("19.Bus Fare:");
       add18.setForeground(Color.WHITE);
      add18.setBackground(new Color(51, 51, 153));
        add18.setFont(new Font("Bahnschrift",Font.BOLD,15));
      add18.setBounds(398, 285, 190, 15);
       ss1.add(add18);
      JTextField use18=new JTextField("0");
      use18.setBounds(600, 280, 160, 25);
       use18.setEnabled(false);
       ss1.add(use18);
      add18.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add18.isSelected()){
                        use18.setEnabled(true);
                    }
                    else{
                        use18.setEnabled(false);
                    } 
                }
            });
      
       JCheckBox add19=new JCheckBox("20.Other Fee:");
        add19.setFont(new Font("Bahnschrift",Font.BOLD,15));
        add19.setForeground(Color.WHITE);
      add19.setBackground(new Color(51, 51, 153));
      add19.setBounds(398, 315, 190, 15);
       ss1.add(add19);
      JTextField use19=new JTextField("0");
      use19.setBounds(600, 310, 160, 25);
       use19.setEnabled(false);
       ss1.add(use19);
      add19.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    if(add19.isSelected()){
                        use19.setEnabled(true);
                    }
                    else{
                        use19.setEnabled(false);
                    } 
                }
            });
   JCheckBox five=new JCheckBox("5% Discount");
        five.setFont(new Font("Bahnschrift",Font.BOLD,15));
        five.setForeground(Color.WHITE);
      five.setBackground(new Color(51, 51, 153));
      five.setBounds(20, 350, 130, 15);
       ss1.add(five);
      JCheckBox ten=new JCheckBox("10% Discount");
        ten.setFont(new Font("Bahnschrift",Font.BOLD,15));
        ten.setForeground(Color.WHITE);
      ten.setBackground(new Color(51, 51, 153));
      ten.setBounds(150, 350, 130, 15);
       ss1.add(ten);
      JCheckBox fifteen=new JCheckBox("15% Discount");
        fifteen.setFont(new Font("Bahnschrift",Font.BOLD,15));
        fifteen.setForeground(Color.WHITE);
      fifteen.setBackground(new Color(51, 51, 153));
      fifteen.setBounds(300, 350, 130, 15);
       ss1.add(fifteen);
      JCheckBox fifty=new JCheckBox("50% Discount");
        fifty.setFont(new Font("Bahnschrift",Font.BOLD,15));
        fifty.setForeground(Color.WHITE);
      fifty.setBackground(new Color(51, 51, 153));
      fifty.setBounds(450, 350, 140, 15);
       ss1.add(fifty);
      JCheckBox full=new JCheckBox("100% Discount");
        full.setFont(new Font("Bahnschrift",Font.BOLD,15));
        full.setForeground(Color.WHITE);
      full.setBackground(new Color(51, 51, 153));
      full.setBounds(600, 350, 140, 15);
       ss1.add(full);
      
      
      
      
         JButton btn1=new JButton("Back");
      btn1.setBounds(100, 500, 150, 40);
      btn1.setBackground(Color.black);
      btn1.setForeground(Color.white);      
       ss1.add(btn1);
      btn1.addActionListener((ActionEvent e) -> {
          new Student_info();
         dispose();
       });
      
//       JButton btn3=new JButton("Clear");
//      btn3.setBounds(300, 500, 150, 40);
//      btn3.setBackground(Color.black);
//      btn3.setForeground(Color.white);      
//      add(btn3);
      
     
        JButton btn2=new JButton("Next");
      btn2.setBounds(500, 500, 150, 40);
      btn2.setBackground(Color.black);
      btn2.setForeground(Color.white);      
       ss1.add(btn2);
       
             JLabel sum=new JLabel("Sum:");
      sum.setFont(new Font("Bahnschrift",Font.BOLD,20));
      sum.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
       sum.setBounds(100, 370, 150, 25);
       ss1.add(sum);
        JLabel dis=new JLabel("Discount:");
      dis.setFont(new Font("Bahnschrift",Font.BOLD,20));
      dis.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
       dis.setBounds(100, 405, 150, 25);
       ss1.add(dis);
        JLabel tot=new JLabel("Total:");
      tot.setFont(new Font("Bahnschrift",Font.BOLD,20));
      tot.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
       tot.setBounds(100, 440, 150, 25);
       ss1.add(tot);
      
      JButton calc=new JButton("=");
       calc.setBounds(470, 445, 50,30);
      calc.setBackground(Color.yellow);
      calc.setForeground(Color.black);      
       ss1.add(calc);
       JTextField tot1=new JTextField("0.0000");
      tot1.setBounds(210, 375, 160,25);
       ss1.add(tot1);
       JTextField dis1=new JTextField("0.0000");
      dis1.setBounds(210, 410, 160,25);
       ss1.add(dis1);
      JTextField tot2=new JTextField("0.0000");
      tot2.setBounds(210, 440, 160,25);
       ss1.add(tot2);
      
      JLabel paid1=new JLabel("Paid :");
      paid1.setFont(new Font("Bahnschrift",Font.BOLD,20));
      paid1.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
       paid1.setBounds(400, 370, 150, 25);
       ss1.add(paid1);
        JLabel due4=new JLabel("Due :");
      due4.setFont(new Font("Bahnschrift",Font.BOLD,20));
      due4.setForeground(Color.WHITE);
//      ck.setBackground(new Color(51, 51, 153));
       due4.setBounds(400, 405, 150, 25);
       ss1.add(due4);
     JTextField paid=new JTextField("0");
      paid.setBounds(495, 375, 160,25);
       ss1.add(paid);
       JTextField due3=new JTextField("0.0000");
      due3.setBounds(495, 410, 160,25);
       ss1.add(due3);
                       
        
        
    calc.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){ 
            
              String stu=no1.getText();  
              String admission =user0.getText();  
            String reg=user.getText(); 
            String tution=user1.getText();     
            String id=user2.getText();   
            String lab=user3.getText(); 
            String library=user4.getText();   
            String sport=user5.getText(); 
            String exam=user6.getText();     
            String hostl=user7.getText();  
            String miscelleneous=user10.getText(); 
            String uniform=user11.getText();   
            String fine=user12.getText(); 
            String monthly=use13.getText();     
            String insurence=use14.getText();   
            String school_development=use15.getText(); 
            String books=use16.getText();   
            String student_union=use17.getText(); 
            String bus=use18.getText();     
            String other=use19.getText();
             String olddue=due1.getText();
            String total= tot1.getText();   
              String dtotal= tot2.getText();
                String dis= dis1.getText();
                    String gtotal= tot2.getText();
                     String paidamt= paid.getText();
                      String dueamt= due3.getText();
                      
              try{
                 if(stu.length()==0||admission.length()==0||reg.length()==0||tution.length()==0||id.length()==0||lab.length()==0||library.length()==0||sport.length()==0||exam.length()==0||                      hostl.length()==0||miscelleneous.length()==0||uniform.length()==0||fine.length()==0||monthly.length()==0||insurence.length()==0||school_development.length()==0||books.length()==0||student_union.length()==0||bus.length()==0||                      other.length()==0||olddue.length()==0||total.length()==0||dtotal.length()==0||dis.length()==0||gtotal.length()==0||paidamt.length()==0||dueamt.length()==0){
                     JOptionPane.showMessageDialog(null, "Fields Cannot Be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(!validate.compare(stu, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Student Number","ERROR",JOptionPane.ERROR_MESSAGE);
                               no1.requestFocus();  
                 }
                     
                else if(!validate.compare(admission, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Admission Amount","ERROR",JOptionPane.ERROR_MESSAGE);
                               user0.requestFocus();     
                 }
                                else if(!validate.compare(reg, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Reg. Amount","ERROR",JOptionPane.ERROR_MESSAGE);
                               user.requestFocus();     
                 }              
                      
                     if(!validate.compare(tution, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Tution Fee   ","ERROR",JOptionPane.ERROR_MESSAGE);
                               user1.requestFocus();     
                 }
                    else if(!validate.compare(id , "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid ID Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               user2.requestFocus();     
                 }
                    else if(!validate.compare(lab, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid lab Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               user3.requestFocus();     
                 }
                     else if(!validate.compare(library, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Library Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               user4.requestFocus();     
                 }
                    else if(!validate.compare(sport, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Sport Fee ","ERROR",JOptionPane.ERROR_MESSAGE);
                               user5.requestFocus();     
                 }
                 else if(!validate.compare(exam, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid exam fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               user6.requestFocus();     
                 }
                     else if(!validate.compare(hostl, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Hostel  Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               user7.requestFocus();     
                 }
                       else if(!validate.compare(miscelleneous, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Miscellenous Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               user10.requestFocus();     
                 }
                     else if(!validate.compare(uniform, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid  Uniform Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               user11.requestFocus();     
                 }
                      else if(!validate.compare(fine, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Fine Amount","ERROR",JOptionPane.ERROR_MESSAGE);
                               user12.requestFocus();     
                 }
                        else if(!validate.compare(monthly, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Monthly Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               use13.requestFocus();     
                 }
                     else if(!validate.compare(insurence, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Insurence Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               use14.requestFocus();     
                 }
                     else if(!validate.compare(school_development, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid School Development Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               use15.requestFocus();     
                 }
                        else if(!validate.compare(books, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Copy and Books Amount","ERROR",JOptionPane.ERROR_MESSAGE);
                               use16.requestFocus();     
                 }
                      else if(!validate.compare(student_union, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Student Union Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               use17.requestFocus();     
                 }
                       else if(!validate.compare(bus, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Bus Fare","ERROR",JOptionPane.ERROR_MESSAGE);
                               use18.requestFocus();     
                 }
                        else if(!validate.compare(other, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Other Fee","ERROR",JOptionPane.ERROR_MESSAGE);
                               use19.requestFocus();     
                 }
                         else if(!validate.compare(olddue, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Old Due","ERROR",JOptionPane.ERROR_MESSAGE);
                               due1.requestFocus();     
                 }
//                       else if(!validate.compare(total, "N")){
//                     JOptionPane.showMessageDialog(null, "Invalid Total","ERROR",JOptionPane.ERROR_MESSAGE);
//                               tot1.requestFocus();     
//                 }
//                     else if(!validate.compare(dis, "N")){
//                     JOptionPane.showMessageDialog(null, "Invalid Discount ","ERROR",JOptionPane.ERROR_MESSAGE);
//                               dis1.requestFocus();     
//                 }
//                       else if(!validate.compare(gtotal, "N")){
//                     JOptionPane.showMessageDialog(null, "Invalid Grand Total","ERROR",JOptionPane.ERROR_MESSAGE);
//                               tot2.requestFocus();     
//                 }
                      else if(!validate.compare(paidamt, "N")){
                     JOptionPane.showMessageDialog(null, "Invalid Received Amount","ERROR",JOptionPane.ERROR_MESSAGE);
                               paid.requestFocus();     
                 }
//                       else if(!validate.compare(dueamt, "N")){
//                     JOptionPane.showMessageDialog(null, "Invalid Due Amount","ERROR",JOptionPane.ERROR_MESSAGE);
//                               due3.requestFocus();     
//                 }
                
           
           
           

           }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e); 
            } 
              
              
            double a=Double.parseDouble(user0.getText());
            double b=Double.parseDouble(user.getText());
            double c=Double.parseDouble(user1.getText());
            double d1=Double.parseDouble(user2.getText());
            double ee=Double.parseDouble(user3.getText());
            double f=Double.parseDouble(user4.getText());
            double g=Double.parseDouble(user5.getText());
            double h=Double.parseDouble(user6.getText());
            double i=Double.parseDouble(user7.getText());
            double j=Double.parseDouble(user10.getText());
            double k=Double.parseDouble(user11.getText());
            double l=Double.parseDouble(user12.getText());
            double m=Double.parseDouble(use13.getText());
            double n=Double.parseDouble(use14.getText());
            double o=Double.parseDouble(use15.getText());
            double p=Double.parseDouble(use16.getText());
            double q=Double.parseDouble(use17.getText());
            double r=Double.parseDouble(use18.getText());
            double s=Double.parseDouble(use19.getText());
            double t=Double.parseDouble(paid.getText());
            double v=Double.parseDouble(due1.getText());
            double sum0=a+b+c+d1+ee+f+g+h+i+j+k+l+m+n+o+p+q+r+s+v;
            String ans=String.valueOf(sum0);      
        tot1.setText(ans);
        
           if(five.isSelected()){
               double dis2 =(sum0/100)*5;
                String discount=String.valueOf(dis2);
                 dis1.setText(discount); 
           double Total =sum0-dis2;
           String gtot=String.valueOf(Total);
           tot2.setText(gtot);
            ten.setEnabled(false);
                  fifteen.setEnabled(false);
                   fifty.setEnabled(false);
                    full.setEnabled(false);
                     double u=Total-t;
                     String paid1=String.valueOf(u);
                      due3.setText(paid1);
           }

           else if(ten.isSelected()){
               double dis2 =(sum0/100)*10;
                String discount=String.valueOf(dis2);
                 dis1.setText(discount);
                 double Total =sum0-dis2;
           String gtot=String.valueOf(Total);
           tot2.setText(gtot);
                  five.setEnabled(false);
                  fifteen.setEnabled(false);
                   fifty.setEnabled(false);
                    full.setEnabled(false);
                    double u=Total-t;
                     String paid1=String.valueOf(u);
                      due3.setText(paid1);
           } 

          else if(fifteen.isSelected()){
               double dis2 =(sum0/100)*15;
                String discount=String.valueOf(dis2);
                 dis1.setText(discount); 
                 double Total =sum0-dis2;
           String gtot=String.valueOf(Total);
           tot2.setText(gtot);
            five.setEnabled(false);
                  ten.setEnabled(false);
                   fifty.setEnabled(false);
                    full.setEnabled(false);
                                        double u=Total-t;
                     String paid1=String.valueOf(u);
                      due3.setText(paid1);
           } 

          else if(fifty.isSelected()){
               double dis2 =(sum0/100)*50;
                String discount=String.valueOf(dis2);
                 dis1.setText(discount); 
                 double Total =sum0-dis2;
           String gtot=String.valueOf(Total);
           tot2.setText(gtot);
            five.setEnabled(false);
                  fifteen.setEnabled(false);
                   ten.setEnabled(false);
                    full.setEnabled(false);
                                        double u=Total-t;
                     String paid1=String.valueOf(u);
                      due3.setText(paid1);
           } 
          else if(full.isSelected()){
               double dis2 =(sum0/100)*100;
                String discount=String.valueOf(dis2);
                 dis1.setText(discount);
                 double Total =sum0-dis2;
           String gtot=String.valueOf(Total);
           tot2.setText(gtot);
            five.setEnabled(false);
                  fifteen.setEnabled(false);
                   fifty.setEnabled(false);
                    ten.setEnabled(false);
                                        double u=Total-t;
                     String paid1=String.valueOf(u);
                      due3.setText(paid1);
           } 
          else{
              double Total=sum0;
               dis1.setText("0.0"); 
                tot2.setText(ans);
                      due3.setText("0.000");
                   
                 five.setEnabled(true);
                  fifteen.setEnabled(true);
                   fifty.setEnabled(true);
                    full.setEnabled(true);
                      ten.setEnabled(true);
                      
                          double u=Total-t;
                     String paid1=String.valueOf(u);
                      due3.setText(paid1);
           }
           
       
          
        }
    } );
    
     btn2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
//              String s="-";
//              String dob=String.valueOf(year.getSelectedItem());
//              String dob1=String.valueOf(month.getSelectedItem());
//              String dob2=String.valueOf(day.getSelectedItem());
//              String date1=dob.concat(s).concat(dob1).concat(s).concat(dob2);
//              String stu=no1.getText(); 
//
//              int admission = Integer.parseInt(user0.getText());  
//            int reg=Integer.parseInt(user.getText()); 
//            int tution=Integer.parseInt(user1.getText());     
//            int id=Integer.parseInt(user2.getText());   
//            int lab=Integer.parseInt(user3.getText()); 
//            int library=Integer.parseInt(user4.getText());   
//            int sport=Integer.parseInt(user5.getText()); 
//            int exam=Integer.parseInt(user6.getText());     
//            int hostl=Integer.parseInt(user7.getText());   
//            int miscelleneous=Integer.parseInt(user10.getText()); 
//            int uniform=Integer.parseInt(user11.getText());   
//            int fine=Integer.parseInt(user12.getText()); 
//            int monthly=Integer.parseInt(use13.getText());     
//            int insurence=Integer.parseInt(use14.getText());   
//            int school_development=Integer.parseInt(use15.getText()); 
//            int books=Integer.parseInt(use16.getText());   
//            int student_union=Integer.parseInt(use17.getText()); 
//            int bus=Integer.parseInt(use18.getText());     
//            int other=Integer.parseInt(use19.getText());
//             int olddue=Integer.parseInt(due1.getText());
//            double total= Double.parseDouble(tot1.getText());   
//              double dtotal= Double.parseDouble(tot2.getText());
//                double dis= Double.parseDouble(dis1.getText());
//                    double gtotal= Double.parseDouble(tot2.getText());
//                     double Paidamt= Double.parseDouble(paid.getText());
//                      double dueamt= Double.parseDouble(due3.getText());
          
              String s="-";
              String dob=String.valueOf(year.getSelectedItem());
              String dob1=String.valueOf(month.getSelectedItem());
              String dob2=String.valueOf(day.getSelectedItem());
              String date1=dob.concat(s).concat(dob1).concat(s).concat(dob2);
              String stu=no1.getText();  
              
              String admission =user0.getText();  
            String reg=user.getText(); 
            String tution=user1.getText();     
            String id=user2.getText();   
            String lab=user3.getText(); 
            String library=user4.getText();   
            String sport=user5.getText(); 
            String exam=user6.getText();     
            String hostl=user7.getText();  
            String miscelleneous=user10.getText(); 
            String uniform=user11.getText();   
            String fine=user12.getText(); 
            String monthly=use13.getText();     
            String insurence=use14.getText();   
            String school_development=use15.getText(); 
            String books=use16.getText();   
            String student_union=use17.getText(); 
            String bus=use18.getText();     
            String other=use19.getText();
             String olddue=due1.getText();
            String total= tot1.getText();   
              String dtotal= tot2.getText();
                String dis= dis1.getText();
                    String gtotal= tot2.getText();
                     String paidamt= paid.getText();
                      String dueamt= due3.getText();
                      
               try{
                String sql="INSERT INTO `fee_info`(`Bill_Date`,`Admission`, `Reg`, `Tuition`, `id card`, `lab`, `library`, `sport`, `exam`, `hostel`, `miscelleneous`, `Uniform`, `Fine`, `monthly`, `insurance`, `School devlopment`, `copy_books`, `student union`, `bus`, `other`, `Due Amount`,`Total`, `Discount`, `Grand_Total`,`Paid`, `new_due`,`S_Nof`) VALUES"
                     +"('"+date1+"','"+admission+"','"+reg+"','"+tution+"','"+id+"','"+lab+"','"+library+"','"+sport+"','"+exam+"','"+hostl+"','"+miscelleneous+"','"+uniform+"','"+fine+"','"+monthly+"','"+insurence+"','"+school_development+"','"+books+"','"+student_union+"','"+bus+"','"+other+"','"+other+"','"+dtotal+"','"+dis+"','"+gtotal+"','"+paidamt+"','"+dueamt+"','"+stu+"')";
                st.execute(sql); 
                new Print();
                dispose();
                // JOptionPane.showMessageDialog(null,"Inserted Successfully");
                        
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"Student Number Could Not Found."); 
            }
         
                     

      
          }});
     
     b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){ 
            
            String id=no1.getText().toString();        
               if(!validate.compare(id, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Student No.","ERROR",JOptionPane.ERROR_MESSAGE);
                               no1.requestFocus();
               } 
               else{
            try{
               String sql="SELECT * FROM Fee_info WHERE `S_Nof`='"+id+"'";
               ResultSet rs=st.executeQuery(sql);
               if(rs.next()){
               do{
                   String newdue=rs.getString(27);
                   due1.setText(newdue);
                   
            }while(rs.next());
               }
               else{
                   due1.setText("0");
               }
            }catch(SQLException ss){
                
            }
            
        }
        }
     });
        }
    }
   
