package Jesper_bill_report;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class View extends JFrame {
    JScrollPane sp;
        JTable tb;
    

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
        
    View() throws SQLException{
        
        getConnection();
       setTitle("All Student Data");
       setSize(1300,670);
       setVisible(true);
          setLocationRelativeTo(null);
      //  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
                JPanel ss1=new JPanel();
        ss1.setBounds(0,0,1300,670);
//    ss1.setBounds(15,20,900,570);
    //ss1.setBorder(title2);
    ss1.setLayout(null);
    ss1.setBackground(new Color(51, 51, 153));
    add(ss1);
        
        
     JButton back=new JButton("Back");
      back.setBounds(530,580,150,40);
      back.setBackground(Color.black);
      back.setForeground(Color.white); 
       ss1.add(back);
//       JButton delet=new JButton("Delete");
//      delet.setBounds(800,580,100,30);
//      add(delet);
      
       
//       JLabel l1= new JLabel("---------------------------------------------------------------------------------------------------------------------------------");
//      l1.setFont(new Font("Bahnschrift",Font.BOLD,18));
//      l1.setBounds(0,5,1300,20);
//      ss1.add(l1);
//            JLabel l2= new JLabel("---------------------------------------------------------------------------------------------------------------------------------");
//      l2.setFont(new Font("Bahnschrift",Font.BOLD,18));
//      l2.setBounds(0,55,1300,20);
//      ss1.add(l2);
      JLabel no= new JLabel("Search (Id,Name,Phone,Email)");
      no.setFont(new Font("Bahnschrift",Font.BOLD,18));
//      btn2.setBackground(Color.black);
      no.setForeground(Color.white); 
      no.setBounds(100,30,330,20);
      ss1.add(no);
     
    // String [] search1  ={"S_No","Name","Date_of_birth","Faculty","Email","Phone"};
//       JComboBox no1=new JComboBox(search1);
//      no1.setBounds(220, 30, 250, 25);
//      add(no1);

       JTextField search=new JTextField();
      search.setBounds(500,30,295,25);
       ss1.add(search);
      
//      JButton b=new JButton("Search");
//      b.setBounds(800,30,100,25);
//      add(b);
      
      String[] Coloum={"S.No","Name","D.O.B","Gender","Address","Faculty","Semester","Year","Class","Section","Roll No.","Phone","Email","Reg. Date"};
       tb=new JTable();
      tb.setEnabled(false);
      DefaultTableModel model = new DefaultTableModel(); 
      tb.setModel(model);
       ss1.add(tb);
     
      model.setColumnIdentifiers(Coloum);
      
      try{
          String sql ="SELECT * FROM stu_info";
          ResultSet rs=st.executeQuery(sql);
          while(rs.next()){
              
              String sno = rs.getString(1);
              String name = rs.getString(3);
              String dob = rs.getString(4);
              String gender = rs.getString(8);
              String address = rs.getString(5);
              String Faculty = rs.getString(9);
              String Semester = rs.getString(10);
              String year = rs.getString(11);
              String Class = rs.getString(12);
              String section = rs.getString(14);
              String roll = rs.getString(13);
              String phone = rs.getString(7);
              String email = rs.getString(6);
              String reg = rs.getString(2);
              model.addRow(new
                      String[]{sno,name,dob,gender,address,Faculty,Semester,year,Class,section,roll,phone,email,reg}
              );
              
              
          }
           sp=new JScrollPane(tb);  
          sp.setBounds(10, 68, 1265, 450);   
          ss1.add(sp); 
      
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null,e);
      }
      

       search.addKeyListener(new KeyAdapter(){
               public void keyReleased(KeyEvent e){
               try { 
                   
                   String searchh =search.getText().toString();
                    String sql="SELECT * FROM Stu_info WHERE `S_No` LIKE '%"+searchh+"%' ||  `Name` LIKE '%"+searchh+"%' || `Phone` LIKE '%"+searchh+"%' || `Email` LIKE '%"+searchh+"%'";
                 System.out.println(sql);
            
                 PreparedStatement pst=conn.prepareStatement(sql);
                   ResultSet rs=pst.executeQuery();
              sp.repaint();
              model.getDataVector().removeAllElements();
            
          while(rs.next()){
              
              String sno = rs.getString(1);
              String name = rs.getString(3);
              String dob = rs.getString(4);
              String gender = rs.getString(8);
              String address = rs.getString(5);
              String Faculty = rs.getString(9);
              String Semester = rs.getString(10);
              String year = rs.getString(11);
              String Class = rs.getString(12);
              String section = rs.getString(14);
              String roll = rs.getString(13);
              String phone = rs.getString(7);
              String email = rs.getString(6);
              String reg = rs.getString(2);
              model.addRow(new
                      String[]{sno,name,dob,gender,address,Faculty,Semester,year,Class,section,roll,phone,email,reg}
              );
              
              
          }
              
              
               }
               catch(Exception ex) {    
                  ex.printStackTrace();
                   JOptionPane.showMessageDialog(null, ex);  
               }         
           }    
       });
      
        back.addActionListener((ActionEvent e) -> {
          new Home();
         dispose();
       });
     }  
    
}
              
   
   
    
 
