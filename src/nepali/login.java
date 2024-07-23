package nepali;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login  extends JFrame{  
    ResultSet rs;
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
         
        
    login(){
        getConnection();
      setTitle("सुरूवात गर ");
      setSize(500,400);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setBackground(new Color(141, 98, 240));
//    setBackground(new java.awt.Color(204, 255, 255));
      setBackground(Color.MAGENTA);
      setLayout(null);
      setVisible(true);
      setResizable(false);
      
//      Panel panel=new Panel();
//      panel.setBounds(0,0,500,400);
//       panel.setBackground(new Color(2, 25, 255));
//       add(panel);
      
    
      JLabel l9=new JLabel("लग इन कक्ष");
      l9.setBounds(170,20,200,50);
      l9.setFont(new Font("Algerian",Font.BOLD,30));
      l9.setForeground(Color.blue);
      add(l9);
    
      
      JLabel add=new JLabel("प्याेग नान:");
      add.setFont(new Font("Bahnschrift",Font.BOLD,20));
      
      add.setBounds(50,100,150,20);
      add(add);
      setVisible(true);
        
      JTextField user=new JTextField();
      user.setBounds(170, 95, 250, 35);
      add(user);
      
      JLabel add1=new JLabel("Password :");
      add1.setFont(new Font("Bahnschrift",Font.BOLD,20));
      add1.setBounds(50,160,150,20);
      add(add1);
      setVisible(true);
      JPasswordField user1=new JPasswordField();
      user1.setBounds(170, 160, 250, 35);
      add(user1);
       
     JCheckBox ck=new JCheckBox("Show Password");
     ck.setBounds(170,200,260,20);
     ck.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
          if(ck.isSelected()){
              user1.setEchoChar((char)0);
          }else
          {
               user1.setEchoChar('*'); 
          }
      }            
    });
     add(ck);
     
     
     
     
      JButton btn=new JButton("LOG IN");
      btn.setBounds(160, 225, 200, 40);
      btn.setBackground(Color.GRAY);
      btn.setForeground(Color.white);
     // btn.setBorder(new RoundedBorder(10));
      add(btn);
       JButton btn1=new JButton("REGISTER");
      btn1.setBounds(160, 280, 200, 40);
      btn1.setBackground(Color.GRAY);
      btn1.setForeground(Color.white);      
      add(btn1);
      JLabel add3=new JLabel("Forgot Password ???");
       add3.setFont(new Font("Bahnschrift",Font.BOLD,13));
      add3.setBounds(180, 330, 200,20);
      add(add3);
      
      
        btn.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
      try{
          String username= user.getText().toString();
           String pass=new String(user1.getPassword());
           String Q ="SELECT Username,Password FROM register WHERE Username = '"+username+"' AND Password = '"+pass+"'";
         ResultSet rs=st.executeQuery(Q);
         if(rs.next()){
           //  new Print();
        // new  report();
              // new Home();
                 dispose();
             }
             else{
             JOptionPane.showMessageDialog(new JFrame(), "Incorrect Username And Password", "Error", JOptionPane.ERROR_MESSAGE);
                 //JOptionPane.showMessageDialog(null,"Incorrect Username And Password");
                 
             }
      }       catch (SQLException ex) {
                  Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                  JOptionPane.showMessageDialog(null,ex);
              }
      
    }
        } );
 
       
       
      
        btn1.addActionListener((ActionEvent e)->{
         dispose();
         //   new register_db();
         
        });
                }
    
        }
   
      
