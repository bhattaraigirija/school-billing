package Jesper_bill_report;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Full_fee extends JFrame {
    JScrollPane sp;
    Connection conn;
    Statement st;

    Full_fee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void getConnection(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/project_i","root","");
                 st=conn.createStatement(); 

             } catch (Exception e) {   
                 JOptionPane.showMessageDialog(null, e); 
             }   
         }  
    Full_fee(String S_No){
        
       getConnection();
       setTitle("All Fee Detail Of Student");
       setSize(1300,670);
       setVisible(true);
       setLocationRelativeTo(null);
      // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(null);
               JPanel ss1=new JPanel();
        ss1.setBounds(0,0,1300,670);
//    ss1.setBounds(15,20,900,570);
    //ss1.setBorder(title2);
    ss1.setLayout(null);
    ss1.setBackground(new Color(51, 51, 153));
    add(ss1);
       
//              JLabel l1= new JLabel("---------------------------------------------------------------------------------------------------------------------------------");
//      l1.setFont(new Font("Bahnschrift",Font.BOLD,18));
//      l1.setBounds(0,5,1300,20);
//     ss1. add(l1);
//            JLabel l2= new JLabel("---------------------------------------------------------------------------------------------------------------------------------");
//      l2.setFont(new Font("Bahnschrift",Font.BOLD,18));
//      l2.setBounds(0,55,1300,20);
//      ss1.add(l2);
      JLabel no= new JLabel("Search By Id");
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
      search.setBounds(300,30,295,25);
       ss1.add(search);
        JButton delet=new JButton("OK");
          delet.setBackground(Color.black);
      delet.setForeground(Color.white);  
      delet.setBounds(600,580,100,30);
       ss1.add(delet);
      
       String [] column ={"Stu no","Admission","Reg","Tution","ID Card","Lab","Library","Sport","Exam","Hostal","Miscelleneous","Uniform","Fine","Monthly","Insurence","School DEvelopment","Copy and Biiks","Student Union","Bus","Other","Total","Discount","Grand Total","Paid","New Due"};
       JTable full = new JTable();
       DefaultTableModel table=new DefaultTableModel();
       full.setModel(table);
        ss1.add(full);
       table.setColumnIdentifiers(column);
      try{
          String sql ="SELECT * FROM fee_info";
          ResultSet rs=st.executeQuery(sql);
          while(rs.next()){
              String id = rs.getString(28);
              String admission = rs.getString(3);
              String reg = rs.getString(4);
              String tution = rs.getString(5);
              String idcard = rs.getString(6);
              String lab = rs.getString(7);
              String library = rs.getString(8);
              String sport = rs.getString(9);
              String exam = rs.getString(10);
              String hostel = rs.getString(11);
              String micess = rs.getString(12);
              String uniform = rs.getString(13);
              String fine = rs.getString(14);
              String monthly = rs.getString(15);
              String insurence = rs.getString(16);
              String sdevelop = rs.getString(17);
              String books = rs.getString(18);
              String sunion = rs.getString(19);
              String bus = rs.getString(20);
              String other = rs.getString(21);
              String due = rs.getString(22);
              String total = rs.getString(23);
              String dis = rs.getString(24);
              String gtotal = rs.getString(25);
              String paid = rs.getString(26);
              String ndue = rs.getString(27);
              table.addRow(new
                      String[]{id,admission,reg,tution,idcard,lab,library,sport,exam,hostel,micess,uniform,fine,monthly,insurence,sdevelop,books,sunion,bus,other,due,total,dis,gtotal,paid,ndue}
              );
              
              
          }
           sp=new JScrollPane(full);  
          sp.setBounds(10, 68, 1265, 450);   
           ss1.add(sp); 
      
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null,e);
      }
          
      
          delet.addActionListener((ActionEvent e) -> {
          
           try {
               new Data_Info();
               dispose();
           } catch (SQLException ex) {
               Logger.getLogger(Full_fee.class.getName()).log(Level.SEVERE, null, ex);
           }
       });
          
          search.addKeyListener(new KeyAdapter(){
               public void keyReleased(KeyEvent e){
               try { 
                   
                   String searchh =search.getText().toString();
                    String sql="SELECT * FROM fee_info WHERE `S_Nof` LIKE '%"+searchh+"%'";
                 System.out.println(sql);
            
                 PreparedStatement pst=conn.prepareStatement(sql);
                   ResultSet rs=pst.executeQuery();
              sp.repaint();
              table.getDataVector().removeAllElements();
            
          while(rs.next()){
              
              String admission = rs.getString(3);
              String reg = rs.getString(4);
              String tution = rs.getString(5);
              String idcard = rs.getString(6);
              String lab = rs.getString(7);
              String library = rs.getString(8);
              String sport = rs.getString(9);
              String exam = rs.getString(10);
              String hostel = rs.getString(11);
              String micess = rs.getString(12);
              String uniform = rs.getString(13);
              String fine = rs.getString(14);
              String monthly = rs.getString(15);
              String insurence = rs.getString(16);
              String sdevelop1 = rs.getString(17);
              String books = rs.getString(18);
              String sunion = rs.getString(19);
              String bus = rs.getString(20);
              String other = rs.getString(21);
              String due = rs.getString(22);
              String total = rs.getString(23);
              String dis = rs.getString(24);
              String gtotal = rs.getString(25);
              String paid = rs.getString(26);
              String ndue = rs.getString(27);
               String id = rs.getString(28);
              table.addRow(new
                      String[]{id,admission,reg,tution,idcard,lab,library,sport,exam,hostel,micess,uniform,fine,monthly,insurence,sdevelop1,books,sunion,bus,other,due,total,dis,gtotal,paid,ndue}
              );
              
              
              
          }
              
              
               }
               catch(Exception ex) {    
                  ex.printStackTrace();
                   JOptionPane.showMessageDialog(null,"Please Enter Valid Number !");  
               }         
           }    
          
                  });
          
           try{
               String sql="SELECT `Sn_No`,`Admission`, `Reg`, `Tuition`, `id card`, `lab`, `library`, `sport`, `exam`, `hostel`, `miscelleneous`, `Uniform`, `Fine`, `monthly`, `insurance`, `School devlopment`, `copy and books`, `student union`, `bus`, `other`, `Due Amount`, `Total`, `Discount`, `Grand_Total`, `Paid`, `new_due`, `S_Nof` FROM `fee_info` WHERE `Sn_No`='"+S_No+"'";
           }catch(Exception e){
               
           }
    }
}
