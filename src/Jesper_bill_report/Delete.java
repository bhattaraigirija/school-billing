package Jesper_bill_report;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Delete extends JFrame {
    
  Connection conn;
  Statement st;
    
  void getConnection() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/project_i","root","");
                 st=conn.createStatement(); 
            
        }catch(SQLException ex){
            
        }
    
  }
    Delete() throws ClassNotFoundException{
        getConnection();
    setSize(380,250);
    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setLocationRelativeTo(null);
    setTitle("Delete Student");
    
            JPanel ss1=new JPanel();
        ss1.setBounds(0,0,380,250);
//    ss1.setBounds(15,20,900,570);
    //ss1.setBorder(title2);
    ss1.setLayout(null);
    ss1.setBackground(new Color(51, 51, 153));
    add(ss1);
    
        JLabel add=new JLabel("Enter Student Number To Delete");
       // btn2.setBackground(Color.black);
      add.setForeground(Color.white);  
      add.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add.setBounds(20,20,350,20);
      ss1.add(add);
      setVisible(true);
        
      JTextField user=new JTextField();
      user.setBounds(40, 50, 280, 35);
      ss1.add(user);
    
    JButton back=new JButton("Back");
    back.setBackground(Color.black);
      back.setForeground(Color.white);  
    back.setBounds(50,120,100,30);
    ss1.add(back);
    
    JButton delet=new JButton("OK");
    delet.setBackground(Color.black);
      delet.setForeground(Color.white);  
    delet.setBounds(220,120,100,30);
    ss1.add(delet);
    
    
    
    delet.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
              int id=Integer.parseInt(user.getText());
              
        try{
        String sql="DELETE FROM `stu_info` WHERE `S_No`='"+id+"' ";
        st.execute(sql);
         JOptionPane.showMessageDialog(null, "Successfully Deleted Student "+id);
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Sorry ! There is not that student number or It Cannot be Deleted");  
        }
                
          new Home();
          dispose();
        }
         
    });
    back.addActionListener((ActionEvent e) -> {
        new Home();
        dispose();
    });
    
    
    
    }
}
