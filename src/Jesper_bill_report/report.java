

    package Jesper_bill_report;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JButton;
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

public class report extends JFrame{
     java.sql.Connection conn;
        java.sql.Statement st;
         void getConnection() {  
             try {    
                 Class.forName("com.mysql.jdbc.Driver");  
                 conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/project_i","root","");
                 st=conn.createStatement(); 

             } catch (Exception e) {   
                 JOptionPane.showMessageDialog(null, e); 
             }   
         }   
        
       
    report(){

         getConnection();   
         setSize(380,250);
         setVisible(true);
         setLayout(null);
         setLocationRelativeTo(null);
         setResizable(false);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
                 
                 JPanel ss1=new JPanel();
        ss1.setBounds(0,0,1300,670);
//    ss1.setBounds(15,20,900,570);
    //ss1.setBorder(title2);
    ss1.setLayout(null);
    ss1.setBackground(new Color(51, 51, 153));
    add(ss1);
      
     JLabel ask=new JLabel("Do You Want to Print Report ?");
      ask.setFont(new Font("Bahnschrift",Font.BOLD,15));
      ask.setForeground(Color.white);
     ask.setBounds(80,20,400,25);
     ss1.add(ask);
     
     JLabel l9=new JLabel("Date: ");
      l9.setBounds(40,60,70,15);
      l9.setFont(new Font("Bahnschrift",Font.BOLD,15));
      l9.setForeground(Color.white);
      ss1.add(l9);
     JComboBox<Integer> year =new JComboBox<Integer>();
      year.setBounds(90, 60, 60, 20);
      for(int y=2076;y<3000;y++){
          year.addItem(y);  
      }
      ss1.add(year);
      
      JComboBox<Integer> month =new JComboBox<Integer>();
      month.setBounds(170, 60, 60, 20);
      for(int y=1;y<13;y++){
          month.addItem(y);  
      }
      ss1.add(month);
      
      JComboBox<Integer> day =new JComboBox<Integer>();
      day.setBounds(250, 60, 60, 20);
      for(int y=1;y<33;y++){
          day.addItem(y);  
      }
     ss1.add(day);
     
//     JLabel no= new JLabel("Stu. No:");
//     no.setFont(new Font("Bahnschrift",Font.BOLD,15));
//      no.setForeground(Color.blue);
//      no.setBounds(40,100,130,20);
//     add(no);
//       JTextField fild=new JTextField();
//      fild.setBounds(115, 100, 70, 25);
//      add(fild);
      
      JButton yes=new JButton("YES");
      JButton noo= new JButton("No");
      
      yes.setBounds(40,150,80,30);
        yes.setBackground(Color.black);
      yes.setForeground(Color.white);  
            noo.setBounds(250,150,80,30);
              noo.setBackground(Color.black);
      noo.setForeground(Color.white);  
            
            ss1.add(yes);
            ss1.add(noo);
            
            try{
                 String sql1="SELECT * FROM fee_info";
                 ResultSet rs=st.executeQuery(sql1);
                 rs.afterLast();
                 while(rs.previous()){
//                 int a=rs.getInt(28);
//                  String aa=Integer.toString(a);
//                  fild.setText(aa);                  
            
                   String date2=rs.getString(2);
                        String[] date2_str=date2.split("-",3);
                        String ddd = date2_str[2];
                        String mmm=date2_str[1];
                        String yyy=date2_str[1];
                     year.setSelectedItem(Integer.parseInt(yyy));
                     month.setSelectedItem(Integer.parseInt(mmm));
                     day.setSelectedItem(Integer.parseInt(ddd));

                  break;
              }
                
            }catch(SQLException ex){
                
            }

       yes.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){   
               
                  String s="-";
              String dob=String.valueOf(year.getSelectedItem());
              String dob1=String.valueOf(month.getSelectedItem());
              String dob2=String.valueOf(day.getSelectedItem());
              String date1=dob+s+dob1+s+dob2;
//               String stu=fild.getText(); 
                     try {
                         // JOptionPane.showMessageDialog(null,date1); 
       InputStream in = new FileInputStream(new File("D:\\Help\\Fourth Sem\\project i\\project with java i\\src\\apk_program\\full report.jrxml"));
       JasperDesign jd=JRXmlLoader.load(in);   
       JasperReport jr=JasperCompileManager.compileReport(jd);
       HashMap param=new HashMap(); 
       
      param.put("sid","SELECT stu_info.`S_No`, `Name`,`Address`,`Phone`,`Faculty`, `Semester`, `Year`, `Class`, `Roll no`, `Section`,`Sn_No`, `Bill_Date`,`Total`, `Discount`, `Grand_Total`, `Paid`, `new_due`, fee_info.`S_Nof` FROM `fee_info`,`stu_info` WHERE fee_info.S_Nof=stu_info.S_No AND  fee_info.Bill_Date='"+date1+"'");
       String sql2="SELECT `School` FROM `register`";
       param.put("date",date1);
       ResultSet rs=st.executeQuery(sql2);
         while(rs.next()){
            param.put("school",rs.getString(1));
         }
       JasperPrint j=JasperFillManager.fillReport(jr, param,conn);
       JasperViewer.viewReport(j, false);
     } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, ex); 
       }
           }
       });
      
       noo.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){ 
               new Home();
              dispose(); 
           }
       });
           }
     
         }
  