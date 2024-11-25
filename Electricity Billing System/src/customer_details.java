import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class customer_details extends JFrame {

    
        JButton check;
        JPanel p1, p2;
        JLabel meter_no;
        JTextField t1;
        GridBagConstraints cons;
        GridBagLayout gbag;
    
        customer_details(){
            super("customer details");
            setSize(800, 500);
            setLocation(400, 100);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            gbag = new GridBagLayout();
            cons = new GridBagConstraints();

            p1 = new JPanel();
            p1.setLayout(gbag);
            meter_no=new JLabel("Meter No.");
            t1=new JTextField();
            p1.add(meter_no);
            p1.add(t1);
            check=new JButton("check");
            p1.add(check);

            add(p1,BorderLayout.WEST);
            setVisible(true);
        }
        // private void initializeFormComponents() {
        //     details = new JLabel("                     Details for Registration");
        //     details.setFont(new Font("Arial", Font.PLAIN, 18));
        //     name = new JLabel("Name : ");
        //     fathername = new JLabel("Father's name : ");
        //     age = new JLabel("Age : ");
        //     contact = new JLabel("Contact No. : ");
        //     emailId = new JLabel("Email Id : ");
        //     address = new JLabel("Address : ");
    
        //     t1 = new JTextField(20);
        //     t2 = new JTextField(20);
        //     t3 = new JTextField(20);
        //     t4 = new JTextField(20);
        //     t5 = new JTextField(20);
    
        //     submit = new JButton("Submit");
        //     submit.addActionListener(this);
        // }
        // private void initializeFormComponents2()
        // {
        //     details = new JLabel("                     Fill Login Credentials");
        //     details.setFont(new Font("Arial", Font.PLAIN, 18));
        //     name = new JLabel("Name : ");
        //     meter_no = new JLabel("Meter No. : ");
        //     t6 = new JTextField(20);
        //     t7 = new JTextField(20);
        //     login = new JButton("Login");
        //     login.addActionListener(this);
        // }
        // public void switchPanel() {
        //     if (p2 != null) {
        //         remove(p2);
        //     }
        // }
    
        // public void actionPerformed(ActionEvent ae){
        //     if(ae.getSource()==neww)
        //     {
    
        //         // switchPanel();
        //         // initializeFormComponents();
                
        //     p2 = new JPanel();
        //     p2.setLayout(gbag);
    
        //     cons.insets = new Insets(10, 10, 10, 10);
        //     cons.gridx = 0;
        //     cons.gridy = 0;
        
        //     gbag.setConstraints(details, cons);
        //     p2.add(details);
            
        //     cons.gridwidth = 1;
        //     cons.gridx = 0;
        //     cons.gridy = 1;
        //     cons.ipadx=100;
        //     gbag.setConstraints(name, cons);
        //     p2.add(name);
            
        //     cons.gridx = 1;
        //     cons.gridy = 1;
        //     gbag.setConstraints(t1, cons);
        //     p2.add(t1);
            
        //     cons.gridx = 0;
        //     cons.gridy = 2;
        //     gbag.setConstraints(fathername, cons);
        //     cons.ipadx=100;
        //     p2.add(fathername);
            
        //     cons.gridx = 1;
        //     cons.gridy = 2;
        //     gbag.setConstraints(t2, cons);
        //     p2.add(t2);
            
        //     cons.gridx = 0;
        //     cons.gridy = 3;
        //     gbag.setConstraints(age, cons);
        //     cons.ipadx=100;
        //     p2.add(age);
            
        //     cons.gridx = 1;
        //     cons.gridy = 3;
        //     gbag.setConstraints(t3, cons);
        //     p2.add(t3);
            
        //     cons.gridx = 0;
        //     cons.gridy = 4;
        //     gbag.setConstraints(contact, cons);
        //     cons.ipadx=100;
        //     p2.add(contact);
            
        //     cons.gridx = 1;
        //     cons.gridy = 4;
        //     gbag.setConstraints(t4, cons);
        //     p2.add(t4);
            
        //     cons.gridx = 0;
        //     cons.gridy = 5;
        //     gbag.setConstraints(emailId, cons);
        //     cons.ipadx=100;
        //     cons.weighty=0.8;
        //     p2.add(emailId);
            
        //     cons.gridx = 1;
        //     cons.gridy = 5;
        //     gbag.setConstraints(t5, cons);
        //     p2.add(t5);
            
        //     cons.gridx=1;
        //     cons.gridy=7;
        //     cons.ipadx=50;
        //     gbag.setConstraints(submit,cons);
        //     p2.add(submit);
            
        //     add(p2, BorderLayout.CENTER);   
        //     revalidate();
        //     repaint();
        // }
        //    else if(ae.getSource()==old)
        //     {
              
        //         // switchPanel();
        //         // initializeFormComponents2();
    
        //         p2 = new JPanel();
        //         p2.setLayout(gbag);
        
        //         cons.insets = new Insets(10, 10, 10, 10);
        //         cons.gridx = 0;
        //         cons.gridy = 0;
            
        //         gbag.setConstraints(details, cons);
        //         p2.add(details);
                
        //         cons.gridwidth = 1;
        //         cons.gridx = 0;
        //         cons.gridy = 1;
        //         cons.ipadx=100;
        //         gbag.setConstraints(name, cons);
        //         p2.add(name);
                
        //         cons.gridx = 1;
        //         cons.gridy = 1;
        //         gbag.setConstraints(t6, cons);
        //         p2.add(t6);
        
        //         cons.gridx = 0;
        //         cons.gridy = 2;
        //         gbag.setConstraints(meter_no, cons);
        //         cons.ipadx=100;
        //         p2.add(meter_no);
                
        //         cons.gridx = 1;
        //         cons.gridy = 2;
        //         cons.weighty=0.8;
        //         gbag.setConstraints(t7, cons);
        //         p2.add(t7);
    
        //         cons.gridx=1;
        //         cons.gridy=4;
        //         cons.ipadx=50;
        //         gbag.setConstraints(login,cons);
        //         p2.add(login);
    
        //         add(p2, BorderLayout.CENTER);   
        //         revalidate();
        //         repaint();
        //     }
        //     else if(ae.getSource()==submit)
        //     {
        //         if(t1.getText().isEmpty()||t2.getText().isEmpty()||t3.getText().isEmpty()||t4.getText().isEmpty()||t5.getText().isEmpty())
        //         {
        //             JOptionPane.showMessageDialog(submit, "please fill all the details " );
        //         }
        //         else{
    
        //             submit.setEnabled(true);
        //             String name1 = name.getText();
        //             String fathername1 = fathername.getText();
        //             String age1 = age.getText();
        //             String contact1 = contact.getText();
        //             String emailId1 = emailId.getText();
        //             String url = "jdbc:mysql://localhost:3306/db";
        //             String userName = "root";
        //             String password = "Maggi&ananya789";
        //             try {
        //                 Class.forName("com.mysql.cj.jdbc.Driver");
        //                 Connection con = DriverManager.getConnection(url, userName, password);
        //                 System.out.println("Connection established");
        //                 String query = "INSERT INTO registredData (name1,fathername1,age1,contact1,emailId1) VALUES (?, ?, ?, ?, ?)";
        //                 PreparedStatement prepareStmt = con.prepareStatement(query);
        //                 prepareStmt.setString(1, name1);
        //                 prepareStmt.setString(2, fathername1);
        //                 prepareStmt.setString(3, age1);
        //                 prepareStmt.setString(4, contact1);
        //                 prepareStmt.setString(5, emailId1);
    
        //                 prepareStmt.executeUpdate();
        //                 JOptionPane.showMessageDialog(submit, "Data Saved Successfully");
        
        //                 con.close();
                        
        //             } catch (Exception e) {
        //                 System.out.println(e);
        //                 JOptionPane.showMessageDialog(submit, "Error: " + e.getMessage());
        //             }
        //         }
        //     }
        //     else if(ae.getSource()==login)
        //     {        
        //         if(t6.getText().isEmpty()||t7.getText().isEmpty())
        //         {
        //             JOptionPane.showMessageDialog(submit, "please fill all the details " );
        //         }
        //         else{
        //             new Project().setVisible(true);
        //             this.setVisible(false);
        //         }
        //         //invalidLogin
        //     }
    
        // }
    public static void main(String[] args){
        new customer_details().setVisible(true);
    }

}