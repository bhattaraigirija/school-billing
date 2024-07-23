package Jesper_bill_report;
import javax.swing.JFrame;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

 


 class register_db extends JFrame { 
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
         register_db(){
        getConnection();
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
                JPanel ss1=new JPanel();
        ss1.setBounds(0,0,500,600);
//    ss1.setBounds(15,20,900,570);
    //ss1.setBorder(title2);
    ss1.setLayout(null);
    ss1.setBackground(new Color(51, 51, 153));
    add(ss1);
        
        JLabel l9=new JLabel("REGISTER");
      l9.setBounds(170,20,200,50);
      l9.setFont(new Font("Algerian",Font.BOLD,30));
      l9.setForeground(Color.white);
      ss1.add(l9);
    
      JLabel add0=new JLabel("University :");
      add0.setFont(new Font("Bahnschrift",Font.BOLD,18));
       add0.setForeground(Color.white);     
      add0.setBounds(50,95,150,18);
      ss1.add(add0);
      JTextField user11=new JTextField();
      user11.setBounds(170, 90, 250, 30);
      ss1.add(user11);
      
      
      JLabel add=new JLabel("School Name:");
       add.setForeground(Color.white);     
      add.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add.setBounds(50,135,150,18);
      ss1.add(add);
     
        
      JTextField user=new JTextField();
      user.setBounds(170, 130, 250, 30);
      ss1.add(user);
      
      JLabel add1=new JLabel("Address :");
      add1.setFont(new Font("Bahnschrift",Font.BOLD,18));
       add1.setForeground(Color.white);     
      add1.setBounds(50,175,150,18);
      ss1.add(add1);
      setVisible(true);
      
        
      JTextField user1=new JTextField();
      user1.setBounds(170, 170, 250, 30);
      ss1.add(user1);
      
       JLabel add2=new JLabel("Email :");
        add2.setForeground(Color.white);     
      add2.setFont(new Font("Bahnschrift",Font.BOLD,18));
      add2.setBounds(50,215,150,18);
      ss1.add(add2);
      setVisible(true);
      JTextField user2=new JTextField();
      user2.setBounds(170, 210, 250, 30);
      ss1.add(user2);
      
       JLabel add3=new JLabel("Phone :");
      add3.setFont(new Font("Bahnschrift",Font.BOLD,18));
       add3.setForeground(Color.white);     
      add3.setBounds(50,255,150,18);
      ss1.add(add3);
      JTextField user3=new JTextField();
      user3.setBounds(170, 250, 250, 30);
      ss1.add(user3);
      
        JLabel add4=new JLabel("Website :");
      add4.setFont(new Font("Bahnschrift",Font.BOLD,18));
       add4.setForeground(Color.white);     
      add4.setBounds(50,295,150,18);
      ss1.add(add4);
      JTextField user4=new JTextField();
      user4.setBounds(170, 290, 250, 30);
      ss1.add(user4);
      
       JLabel add5=new JLabel("Username :");
      add5.setFont(new Font("Bahnschrift",Font.BOLD,18));
       add5.setForeground(Color.white);     
      add5.setBounds(50,335,150,18);
      ss1.add(add5);
      JTextField user5=new JTextField();
      user5.setBounds(170, 330, 250, 30);
      ss1.add(user5);
      
       JLabel add6=new JLabel("Password :");
      add6.setFont(new Font("Bahnschrift",Font.BOLD,18));
       add6.setForeground(Color.white);     
      add6.setBounds(50,375,150,18);
      ss1.add(add6);
      JPasswordField user6=new JPasswordField();
      user6.setBounds(170, 370, 250, 30);
      ss1.add(user6);
      
        JCheckBox ck=new JCheckBox("Show Password");
        ck.setForeground(Color.WHITE);
      ck.setBackground(new Color(51, 51, 153));
        ck.setBounds(170,400,260,20);
        ck.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
          if(ck.isSelected()){
              user6.setEchoChar((char)0);
          }else
          {
               user6.setEchoChar('*'); 
          }
      }            
    });
     ss1.add(ck);
       
       
     
       JButton btn1=new JButton("Save");
      btn1.setBounds(100, 480, 150, 40);
      btn1.setBackground(Color.black);
      btn1.setForeground(Color.white);      
      ss1.add(btn1);
     /* btn1.addActionListener(new ActionListener(){
        public void actionPerformed(e){
            if(btn1.isSelected()){
                JOptionPane.showMassegeDialog(this,"Registred Successfully");
            }
        }});*/
     
        JButton btn2=new JButton("Cancel");
      btn2.setBounds(300, 480, 150, 40);
      btn2.setBackground(Color.black);
      btn2.setForeground(Color.white);      
      ss1.add(btn2);
      
      btn1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
          
            String univer=user11.getText();
            String school_name=user.getText();     
            String address=user1.getText();   
            String email=user2.getText(); 
           String phone=user3.getText();     
            String website=user4.getText();   
            String username=user5.getText(); 
            String password=new String(user6.getPassword());
            
            try{
                 if(univer.length()==0||school_name.length()==0||address.length()==0||email.length()==0||phone.length()==0||website.length()==0||username.length()==0||password.length()==0){
                      JOptionPane.showMessageDialog(null, "fields cannot be empty","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(!validate.compare(email, "E")){
                                  JOptionPane.showMessageDialog(null, "please enter a valid Email","ERROR",JOptionPane.ERROR_MESSAGE);
                               user2.requestFocus();
                 } 
	
                else if(!validate.compare(phone, "N") || phone.length()!=10){
                     JOptionPane.showMessageDialog(null, "please enter a valid phone number","ERROR",JOptionPane.ERROR_MESSAGE);
                               user3.requestFocus();
                     
                 }
                
                else if(!validate.compare(univer, "Aas")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Name","ERROR",JOptionPane.ERROR_MESSAGE);
                               user11.requestFocus();
                }
                else if(!validate.compare(school_name, "Aas")){
                     JOptionPane.showMessageDialog(null, "please enter a valid Name","ERROR",JOptionPane.ERROR_MESSAGE);
                               user.requestFocus();
                }
                 else{
                String sql="INSERT INTO `register`(`University`, `School`, `Address`, `Email`, `Phone`, `Website`, `Username`, `Password`) VALUES"
                     +"( '"+univer+"','"+school_name+"','"+address+"','"+email+"','"+phone+"','"+website+"','"+username+"','"+password+"')";
                st.execute(sql); 
                 JOptionPane.showMessageDialog(null,"Registered Successfully");
                  dispose();
                  new login();
        
                 }
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e); 
            }
//          new login();
//         dispose();
          }
          });
      
      
      btn2.addActionListener((ActionEvent e) -> {
          new login();
         dispose();
       });
    }
        
    }
  