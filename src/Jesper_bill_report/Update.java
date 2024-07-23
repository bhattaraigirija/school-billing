package Jesper_bill_report;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class Update extends JFrame {
    
    Connection conn;
    Statement st;
    void getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
                 conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/project_i","root","");
                 st=conn.createStatement(); 
           //  JOptionPane.showMessageDialog(null,"Connected");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    Update(){
        
    getConnection();
        setSize(970,670);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Update Student");
        

//    TitledBorder title;
//    Border blackline = BorderFactory.createLineBorder(Color.BLACK);
//    title = BorderFactory.createTitledBorder(blackline,"Update Entry Form ");
//    title.setTitleJustification(TitledBorder.CENTER);
//    JPanel ss=new JPanel();
//    ss.setBounds(10,10,930,605);
//    ss.setBorder(title);
//    ss.setLayout(null);
//    add(ss);
//    
//   LineBorder title2;
//    Border b = BorderFactory.createLineBorder(Color.BLACK);
//   title2 = (LineBorder) BorderFactory.createLineBorder(Color.BLACK);
//    //title2.setLineJustification(LineBorder.CENTER);
//    JPanel ss1=new JPanel();
//    ss1.setBounds(15,20,900,570);
//    ss1.setBorder(title2);
//    ss1.setLayout(null);
//    ss1.setBackground(Color.PINK);
//    ss.add(ss1);
//    
 TitledBorder title;
    Border blackline = BorderFactory.createLineBorder(Color.BLACK);
   // title = BorderFactory.createTitledBorder(blackline,"Student Entry Form ");
 //   title.setTitleJustification(TitledBorder.CENTER);
    JPanel ss=new JPanel();
    ss.setBounds(0,0,970,670);
  //  ss.setBorder(title);
    ss.setLayout(null);
    add(ss);
    
   LineBorder title2;
    Border b = BorderFactory.createLineBorder(Color.BLACK);
   title2 = (LineBorder) BorderFactory.createLineBorder(Color.BLACK);
    //title2.setLineJustification(LineBorder.CENTER);
    JPanel ss1=new JPanel();
        ss1.setBounds(0,0,970,670);
//    ss1.setBounds(15,20,900,570);
    ss1.setBorder(title2);
    ss1.setLayout(null);
    ss1.setBackground(new Color(51, 51, 153));
    ss.add(ss1);
    
    
      JLabel sno=new JLabel("Student No:");
      sno.setFont(new Font("Bahnschrift",Font.BOLD,18));
       sno.setForeground(Color.WHITE);
      sno.setBounds(50,50,150,18);
     ss1. add(sno);
           JTextField sno2=new JTextField();
      sno2.setBounds(180, 50, 200, 25);
      ss1.add(sno2);
     // sno1.setEnabled(false);
     JButton ok = new JButton("OK");    
     ok.setBounds(400, 50, 70,25);
      ss1.add(ok);
      JLabel add=new JLabel("Name:");
      add.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add.setBounds(50,90,150,18);
      //add.setForeground(Color.BLUE);
      add.setForeground(Color.WHITE);
     ss1. add(add);
  
        
      JTextField first=new JTextField();
      first.setBounds(180, 90, 200, 25);
      ss1.add(first);
      
      JTextField middle=new JTextField();
      middle.setBounds(385, 90, 200, 25);
      ss1.add(middle);
      
      JTextField last=new JTextField();
      last.setBounds(590, 90, 200, 25);
      ss1.add(last);
    
      JLabel dob=new JLabel("Date Of Birth:");
      dob.setFont(new Font("Bahnschrift",Font.BOLD,18));
      dob.setForeground(Color.WHITE);
      dob.setBounds(50,130,150,18);
      ss1.add(dob);
      
      JComboBox<Integer> year =new JComboBox<Integer>();
      year.setBounds(180, 130, 70, 25);
      for(int y=2045;y<3000;y++){
          year.addItem(y);  
      }
      ss1.add(year);
      
      JComboBox<Integer> month =new JComboBox<Integer>();
      month.setBounds(270, 130, 70, 25);
      for(int y=1;y<13;y++){
          month.addItem(y);  
      }
      ss1.add(month);
      
      JComboBox<Integer> day =new JComboBox<Integer>();
      day.setBounds(360, 130, 70, 25);
      for(int y=1;y<33;y++){
          day.addItem(y);  
      }
      ss1.add(day);
      
      JLabel add2=new JLabel("Email :");
      add2.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add2.setForeground(Color.WHITE);
      add2.setBounds(50,170,150,18);
     ss1. add(add2);
      setVisible(true);
      JTextField user2=new JTextField();
      user2.setBounds(180, 170, 250, 25);
      ss1.add(user2);
      
      JLabel add3=new JLabel("Phone:");
      add3.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add3.setForeground(Color.WHITE);
      add3.setBounds(470,130,150,18);
      ss1. add(add3);
      JTextField user3=new JTextField();
      user3.setBounds(600, 130, 250, 25);
      ss1.add(user3);
      
  
      JLabel add1=new JLabel("Gender :");
      add1.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add1.setForeground(Color.WHITE);
      add1.setBounds(50,210,80,18);
      ss1.add(add1);
      
      ButtonGroup g1=new ButtonGroup();
      JRadioButton r1=new JRadioButton("Male",true);  
      r1.setBounds(180,210,70,20);
       r1.setForeground(Color.WHITE);
      r1.setBackground(new Color(51, 51, 153));
      ss1.add(r1);
      g1.add(r1);
     JRadioButton r2=new JRadioButton("Female");
      r2.setBounds(260,210,70,20);
       r2.setForeground(Color.WHITE);
      r2.setBackground(new Color(51, 51, 153));
     ss1.add(r2);
      g1.add(r2);
     JRadioButton r3=new JRadioButton("Other");
     r3.setBounds(360,210,70,20);
      r3.setForeground(Color.WHITE);
      r3.setBackground(new Color(51, 51, 153));
     ss1.add(r3);
     g1.add(r3);
    
    
     
      JLabel address=new JLabel("Address :");
      address.setBounds(470,170,150,18);
      address.setFont(new Font("Bahnschrift",Font.BOLD,18));
      address.setForeground(Color.WHITE);
      ss1.add(address);  
      JTextField user1=new JTextField();
      user1.setBounds(600, 170, 250, 25);
      ss1.add(user1);
      
       JLabel fa=new JLabel("Mother Name :");
       fa.setForeground(Color.WHITE);
      fa.setBounds(50,250,150,18);
      fa.setFont(new Font("Bahnschrift",Font.BOLD,18));
      ss1.add(fa);  
      JTextField father =new JTextField();
      father.setBounds(180, 250, 250, 25);
      ss1.add(father);
       JLabel mo=new JLabel("Father Name:");
       mo.setForeground(Color.WHITE);
      mo.setBounds(470,210,150,18);
      mo.setFont(new Font("Bahnschrift",Font.BOLD,18));
      ss1.add(mo);  
      JTextField mother1=new JTextField();
      mother1.setBounds(600, 210, 250, 25);
      ss1.add(mother1);
    
    
      JLabel add4=new JLabel("Faculty:");
      add4.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add4.setBounds(470,250,150,18);
      add4.setForeground(Color.WHITE);
      ss1.add(add4);
      String Faculty []={"***","BCA","BBA","BBA","BA","BSc","BSc CSIT","MBS","TTM"};
      JComboBox cb=new JComboBox(Faculty);
      cb.setBounds(600, 250, 250, 25);
      ss1.add(cb);
      
      JLabel add9=new JLabel("Semester:");
      add9.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add9.setBounds(50,290,150,18);
      add9.setForeground(Color.WHITE);
      ss1.add(add9);
      String sem []={"***","1","2","3","4","5","6 ","7","8"};
      JComboBox cb_sem=new JComboBox(sem);
      cb_sem.setBounds(180, 290, 250, 25);
      ss1.add(cb_sem);
      
      JLabel add0=new JLabel("Year:");
      add0.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add0.setBounds(50,330,150,18);
      add0.setForeground(Color.WHITE);
      ss1.add(add0);
      String year1 []={"***","1","2","3","4"};
      JComboBox cb_y=new JComboBox(year1);
      cb_y.setBounds(180, 330, 250, 25);
      ss1.add(cb_y);
      
       JLabel add5=new JLabel("Class:");
      add5.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add5.setBounds(470,290,150,18);
      add5.setForeground(Color.WHITE);
     ss1.add(add5);
      String class1 []={ "***","1","2","3","4","5","6","7","8","8","10","11","12"};
      JComboBox cb1=new JComboBox(class1);
      cb1.setBounds(600, 290, 250, 25);
      ss1.add(cb1);
      
       JLabel add6=new JLabel("Roll No.:");
      add6.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add6.setBounds(50,370,150,18);
      add6.setForeground(Color.WHITE);
      ss1.add(add6);
      JTextField user6=new JTextField();
      user6.setBounds(180, 370, 250, 25);
      ss1.add(user6);
      
       JLabel add7=new JLabel("Section :");
      add7.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add7.setBounds(470,330,150,20);
      add7.setForeground(Color.WHITE);
      ss1.add(add7);
  
      JTextField user7=new JTextField();
      user7.setBounds(600, 330, 250, 25);
      ss1.add(user7);
       
      
      JLabel reg=new JLabel("Reg. Date:");
      reg.setFont(new Font("Bahnschrift",Font.BOLD,18));
      reg.setBounds(470,370,150,18);
      reg.setForeground(Color.WHITE);
      ss1.add(reg);
      
      JComboBox<Integer> yea2 =new JComboBox<Integer>();
      yea2.setBounds(600, 370, 70, 25);
      for(int y=2076;y<3000;y++){
          yea2.addItem(y);  
      }
      ss1.add(yea2);
      
      JComboBox<Integer> month1 =new JComboBox<Integer>();
      month1.setBounds(690, 370, 70, 25);
      for(int y=1;y<13;y++){
          month1.addItem(y);  
      }
      ss1.add(month1);
      
      JComboBox<Integer> day1 =new JComboBox<Integer>();
      day1.setBounds(780, 370, 70, 25);
      for(int y=1;y<33;y++){
          day1.addItem(y);  
      }
      ss1.add(day1);
     
      
       JButton btn1=new JButton("Back");
      btn1.setBounds(200, 500, 150, 40);
      btn1.setBackground(Color.black);
      btn1.setForeground(Color.white);      
      ss1.add(btn1);
       JButton btn2=new JButton("Submit");
      btn2.setBounds(600, 500, 150, 40);
      btn2.setBackground(Color.black);
      btn2.setForeground(Color.white);      
      ss1.add(btn2);
      
      ok.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
         try{
                String sno1=sno2.getText();
             
               if(!validate.compare(sno1, "N")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Student No.","ERROR",JOptionPane.ERROR_MESSAGE);
                               sno2.requestFocus();
                      
               }
               else{
               
            int          student=Integer.parseInt(sno1.toString());
            String sql="SELECT * FROM Stu_info WHERE `S_No`='"+student+"' ";
            ResultSet rs=st.executeQuery(sql);
                    while(rs.next()){
                        
                        String name=rs.getString(3);
                        
                       String[] name_str=name.split(" ",3);
                        String third = name_str[2];
                        String second=name_str[1];
                        String first1=name_str[0];
                      first.setText(first1);
                      middle.setText(second);
                      last.setText(third);
                        
                        
                        String date=rs.getString(2);
                        String[] date_str=date.split("-",3);
                        String dd = date_str[2];
                        String mm=date_str[1];
                        String yy=date_str[0];
                     yea2.setSelectedItem(Integer.parseInt(yy));
                     month1.setSelectedItem(Integer.parseInt(mm));
                     day1.setSelectedItem(Integer.parseInt(dd));
                     String gender=rs.getString(8);
                    
                     
                     if(gender.equals("Female")){
                         r2.setSelected(true);
                     }
                     
                     else if(gender.equals("Male")){
                         r1.setSelected(true);
                     }
                     else{
                         r3.setSelected(true);
                     }
//                     
                     
//                     
//                     String name=rs.getString("Name");
//                        String[] name_str=date.split(" ",3);
//                        String third = name_str[2];
//                        String second=name_str[1];
//                        String first1=name_str[0];
//                      first.setText(first1);
//                      middle.setText(second);
//                      last.setText(third);
//                      System.out.println(dd + mm+yy);
//                      
                      String date2=rs.getString(4);
                        String[] date2_str=date.split("-",3);
                        String ddd = date2_str[2];
                        String mmm=date2_str[1];
                        String yyy=date2_str[1];
                     year.setSelectedItem(Integer.parseInt(yyy));
                     month.setSelectedItem(Integer.parseInt(mmm));
                     day.setSelectedItem(Integer.parseInt(ddd));
//                      
//                 
                     String email=rs.getString(6);
                     user2.setText(email);
                     String phone=rs.getString(7);
                     user3.setText(phone);
                     String address1=rs.getString(5);
                      user1.setText(address1);
                     
                    
                    
                      
                      
                    String faculty=rs.getString(9);
                    cb.setSelectedItem(faculty);
                    String semester=rs.getString(10);
                     cb_sem.setSelectedItem(semester);
                    String mother=rs.getString(16);
                     father.setText(mother);
                    String father=rs.getString(15);
                     mother1.setText(father);
                    String barsa=rs.getString(11);
                     cb_y.setSelectedItem(barsa);
                    String class1=rs.getString(12);
                     cb1.setSelectedItem(class1);
                    String roll=rs.getString(13);
                     user6.setText(roll);
                    String secc=rs.getString(14);
                     user7.setText(secc);
//                    
                    
                    }
                    
                    }
            
         }catch(SQLException ex){
             
             JOptionPane.showMessageDialog(null,"No Student Found With That Number");
         }  
        }        
    });
    
            
       
      btn2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
            int student=Integer.parseInt(sno2.getText().toString());        
String s="-";
String s1=" ";
String sno=sno2.getText();
String name=first.getText();
String name1=middle.getText(); 
String name2=last.getText();
String name3=name.concat(s1).concat(name1).concat(s1).concat(name2);
String dob=String.valueOf(year.getSelectedItem());
String dob1=String.valueOf(month.getSelectedItem());
String dob2=String.valueOf(day.getSelectedItem());
String date1=dob.concat(s).concat(dob1).concat(s).concat(dob2);

String address=user1.getText();            
String email=user2.getText();         
String phone=user3.getText();  
String radiotext="";
if(r1.isSelected()){
  radiotext=r1.getText();
}
 if(r2.isSelected()){
  radiotext=r2.getText();
}
if(r3.isSelected()){
  radiotext=r3.getText();
}

String mother=father.getText();
String father2=mother1.getText ();
String faculty=String.valueOf(cb.getSelectedItem());   
String semester=String.valueOf(cb_sem.getSelectedItem());
String year1=String.valueOf(cb_y.getSelectedItem());
String clas =String.valueOf(cb1.getSelectedItem());
String roll=user6.getText();            
String sec=user7.getText();
String dob3=String.valueOf(yea2.getSelectedItem());
String dob4=String.valueOf(month1.getSelectedItem());
String dob5=String.valueOf(day1.getSelectedItem());
String date2=dob3.concat(s).concat(dob4).concat(s).concat(dob5);
  
            try{
                
            
                 if(name.length()==0||name2.length()==0||address.length()==0||email.length()==0||phone.length()==0||mother.length()==0||father2.length()==0||roll.length()==0||sec.length()==0){
                      JOptionPane.showMessageDialog(null, "fields cannot be empty","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(!validate.compare(name, "Aa")){
                     JOptionPane.showMessageDialog(null, "please enter a valid First Name","ERROR",JOptionPane.ERROR_MESSAGE);
                               first.requestFocus();
                     
                 }
                 // else if(name1.length()!=0){
                     else if(!validate.compare(name1, "Aa") && name1.length()!=0){
                     JOptionPane.showMessageDialog(null, "please enter a valid Middle Name","ERROR",JOptionPane.ERROR_MESSAGE);
                               middle.requestFocus();
                      
                      }
               //  }
                   else if(!validate.compare(name2, "Aa")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Last Name","ERROR",JOptionPane.ERROR_MESSAGE);
                               last.requestFocus();
                     
                 }
                 else if(!validate.compare(email, "E")){
                                  JOptionPane.showMessageDialog(null, "please enter a valid Email","ERROR",JOptionPane.ERROR_MESSAGE);
                               user2.requestFocus();
                 } 
	
                else if(!validate.compare(phone, "N") || phone.length()!=10){
                     JOptionPane.showMessageDialog(null, "please enter a valid phone number","ERROR",JOptionPane.ERROR_MESSAGE);
                               user3.requestFocus();
                     
                 }
                
                else if(!validate.compare(mother, "Aas")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Mother Name","ERROR",JOptionPane.ERROR_MESSAGE);
                               father.requestFocus();
                }
                else if(!validate.compare(father2, "Aas")){
                     JOptionPane.showMessageDialog(null, "please enter a valid  Father Name","ERROR",JOptionPane.ERROR_MESSAGE);
                               mother1.requestFocus();
                }
                else if(!validate.compare(roll, "N") || roll.length()>3){
                     JOptionPane.showMessageDialog(null, "please enter a valid Roll No","ERROR",JOptionPane.ERROR_MESSAGE);
                               user6.requestFocus();
                     
                 }
                    else if(!validate.compare(sec, "Aa")|| sec.length()!=1){
                     JOptionPane.showMessageDialog(null, "please enter a valid Section","ERROR",JOptionPane.ERROR_MESSAGE);
                               user7.requestFocus();
                     
                 }      
                else{
                String sql="UPDATE `stu_info` SET `Date`='"+date2+"', `Name`='"+name3+"', `Date_of_birth`='"+date1+"', `Address`='"+address+"', `Email`='"+email+"',"
                        + " `Phone`='"+phone+"', `Gender`='"+radiotext+"', `Faculty`='"+faculty+"', `Semester`='"+semester+"', `Year`='"+year1+"', `Class`='"+clas+"',"
                        + " `Roll no`='"+roll+"', `Section`='"+sec+"', `Father Name`='"+mother+"', `Mother name`='"+father2+"' WHERE `S_No`='"+student+"' ";             
                st.execute(sql);
              JOptionPane.showMessageDialog(null,"Updated Successfully");
               new Home();
         dispose();
                    }
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e); 
            }
     
       
    }
});
      
       btn1.addActionListener((ActionEvent e) -> {
          new Home();
         dispose();
       });
     
    }}
