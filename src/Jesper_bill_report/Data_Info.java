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
public class Data_Info extends JFrame {
           Connection conn;
        Statement st;
        JScrollPane sp;
         void getConnection() {  
             try {    
                 Class.forName("com.mysql.jdbc.Driver");  
                 conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/project_i","root","");
                 st=conn.createStatement(); 

             } catch (Exception e) {   
                 JOptionPane.showMessageDialog(null, e); 
             }   
         }   
        
    Data_Info() throws SQLException{
        getConnection();
       setTitle("All Student Data");
       setSize(1300,670);
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
        
     JButton back=new JButton("Back");
     back.setBackground(Color.black);
     back.setForeground(Color.white);
      back.setBounds(400,580,150,40);
      ss1.add(back);
//       JButton delet=new JButton("Delete");
//      delet.setBounds(800,580,100,30);
//      add(delet);
      
      JButton view=new JButton("View");
       view.setBackground(Color.black);
       view.setForeground(Color.white);
      view.setBounds(800,580,150,40);
      ss1.add(view);
      
       
//       JLabel l1= new JLabel("---------------------------------------------------------------------------------------------------------------------------------");
//      l1.setFont(new Font("Bahnschrift",Font.BOLD,18));
//      l1.setBounds(0,5,1300,20);
//      l1.setForeground(Color.red); 
//     ss1.add(l1);
//            JLabel l2= new JLabel("---------------------------------------------------------------------------------------------------------------------------------");
//      l2.setFont(new Font("Bahnschrift",Font.BOLD,18));
//      l2.setBounds(0,55,1300,20);
//      l2.setForeground(Color.red); 
//     ss1.add(l2);
      JLabel no= new JLabel("Search By (ID,Name):");
      no.setFont(new Font("Bahnschrift",Font.BOLD,18));
      no.setForeground(Color.white); 
      no.setBounds(100,30,230,20);
     ss1.add(no);
     
//     String [] search  ={"Student No.","Name","Bill Date","D.O.B"};
//       JComboBox no1=new JComboBox(search);
//      no1.setBounds(220, 30, 250, 25);
//      add(no1);

       JTextField no11=new JTextField();
      no11.setBounds(300,30,295,25);
      ss1.add(no11);
      
//      JButton b=new JButton("Search");
//      b.setBounds(800,30,100,25);
//      add(b);
      
      String[] Coloum={"Bill No","Bill Date","Student No","Name","D.O.B","Total","Discount","Grand Total","Paid","Due Amount"};
      JTable tb=new JTable();
      DefaultTableModel model = new DefaultTableModel(); 
      tb.setModel(model);
      ss1.add(tb);
     
      model.setColumnIdentifiers(Coloum);
      try{
          
          String sql ="SELECT stu_info.S_No,"
                  + "stu_info.Name,"
                  + "stu_info.Date_of_birth,"
                  + "fee_info.Sn_No,"
                  + "fee_info.Bill_Date,"
                  + "fee_info.Total,"
                  + "fee_info.Discount,"
                  + "fee_info.Grand_Total,"
                  + "fee_info.Paid,"
                  + "fee_info.new_due "
                  + "FROM fee_info,stu_info "
                  + "WHERE stu_info.S_No=fee_info.S_Nof";
          
          ResultSet rs=st.executeQuery(sql);
          while(rs.next()){
 
//              int studentno = rs.getInt("S_No");
//              String name = rs.getString("Name");
//              String dateofbirth = rs.getString("Date_of_birth");
//              
//              
//              String sno = rs.getString("Sn_No");
//              String bill= rs.getString("Bill_Date");
//              String total = rs.getString("Total");
//              String discount = rs.getString("Discount");
//              String grandtotal = rs.getString("Grand_Total");
//              String paid = rs.getString("Paid");
//              String dueamount = rs.getString("new_due");
              String studentno = rs.getString(1);
              String name = rs.getString(2);
              String dateofbirth = rs.getString(3);
              
              
              String sno = rs.getString(4);
              String bill= rs.getString(5);
              String total = rs.getString(6);
              String discount = rs.getString(7);
              String grandtotal = rs.getString(8);
              String paid = rs.getString(9);
              String dueamount = rs.getString(10);
              
              
             
              model.addRow(new
                      String[]{sno,bill,studentno,name,dateofbirth,total,discount,grandtotal,paid,dueamount}
              );
              
              
              
          }
          
           sp=new JScrollPane(tb);  
          sp.setBounds(10, 68, 1265, 450);   
          ss1.add(sp); 
      
      }catch(SQLException ae){
          JOptionPane.showMessageDialog(null,ae);
      }  
        back.addActionListener((ActionEvent e) -> {
          new Home();
         dispose();
       });
        
        
        no11.addKeyListener(new KeyAdapter(){
               public void keyReleased(KeyEvent e){
               try { 
                   
                   String searchh =no11.getText().toString();
                    String sql2 ="SELECT stu_info.S_No,stu_info.Name,stu_info.Date_of_birth,fee_info.Sn_No,fee_info.Bill_Date,fee_info.Total,fee_info.Discount,fee_info.Grand_Total,fee_info.Paid,fee_info.new_due FROM fee_info,stu_info WHERE stu_info.S_No=fee_info.S_Nof AND stu_info.S_No LIKE '%"+searchh+"%' || stu_info.S_No=fee_info.S_Nof AND stu_info.Name LIKE '%"+searchh+"%'";

//"SELECT stu_info.S_No,"
//                  + "stu_info.Name,"
//                  + "stu_info.Date_of_birth,"
//                  + "fee_info.Sn_No,"
//                  + "fee_info.Bill_Date,"
//                  + "fee_info.Total,"
//                  + "fee_info.Discount,"
//                  + "fee_info.Grand_Total,"
//                  + "fee_info.Paid,"
//                  + "fee_info.new_due "
//                  + "FROM fee_info,stu_info "
//                  + "WHERE stu_info.S_No=fee_info.S_No AND stu_info.S_No LIKE '%"+searchh+"%' ||  stu_info.Name LIKE '%"+searchh+"%'";
//                   // String sql="SELECT * FROM Stu_info WHERE `S_No` LIKE '%"+searchh+"%' ||  `Name` LIKE '%"+searchh+"%' || `Phone` LIKE '%"+searchh+"%' || `Email` LIKE '%"+searchh+"%'";
                 System.out.println(sql2);
            
                 PreparedStatement pst=conn.prepareStatement(sql2);
                ResultSet rs=pst.executeQuery();
              sp.repaint();
              model.getDataVector().removeAllElements();
            
           while(rs.next()){
              String studentno = rs.getString(1);
              String name = rs.getString(2);
              String dateofbirth = rs.getString(3);
              
              
              String sno = rs.getString(4);
              String bill= rs.getString(5);
              String total = rs.getString(6);
              String discount = rs.getString(7);
              String grandtotal = rs.getString(8);
              String paid = rs.getString(9);
              String dueamount = rs.getString(10);
              
              
             
              model.addRow(new
                      String[]{sno,bill,studentno,name,dateofbirth,total,discount,grandtotal,paid,dueamount}
              );
              
              
          }
              
              
               }
               catch(Exception ex) {    
                  ex.printStackTrace();
                   JOptionPane.showMessageDialog(null, ex);  
               }         
           }    
       });
         view.addActionListener((ActionEvent e) -> {
         
             int row=tb.getSelectedRow();
             String S_No=tb.getValueAt(row,2).toString();
             new Full_fee(S_No);
         dispose();
       });
     }  
    
    
}
              
   
   
 
