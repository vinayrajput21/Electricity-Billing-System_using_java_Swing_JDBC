import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class NewMeterConnection extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1, b2;
    Random rand = new Random();

    NewMeterConnection() {
        super("Add Customer");
        setLocation(350, 200);
        setSize(650, 600);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(9, 2, 10, 10));
        p.setBackground(Color.WHITE);

        l1 = new JLabel("Name");
        t1 = new JTextField();
        p.add(l1);
        p.add(t1);
        l2 = new JLabel("Father's Name");
        t2 = new JTextField();
        p.add(l2);
        p.add(t2);
        l3 = new JLabel("Address");
        t3 = new JTextField();
        p.add(l3);
        p.add(t3);
        l4 = new JLabel("City");
        t4 = new JTextField();
        p.add(l4);
        p.add(t4);
        l5 = new JLabel("State");
        t5 = new JTextField();
        p.add(l5);
        p.add(t5);
        l6 = new JLabel("Email");
        t6 = new JTextField();
        p.add(l6);
        p.add(t6);
        l7 = new JLabel("Phone Number");
        t7 = new JTextField();
        p.add(l7);
        p.add(t7);

        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        p.add(b1);
        p.add(b2);
        setLayout(new BorderLayout());
        add(p, "Center");

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("images/hicon1.jpg"));
        Image i3 = ic1.getImage().getScaledInstance(150, 280, Image.SCALE_DEFAULT);
        ImageIcon ic2 = new ImageIcon(i3);
        l8 = new JLabel(ic2);
        add(l8, "West");

        getContentPane().setBackground(Color.WHITE);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            b1.setEnabled(true);
            String name = t1.getText();
            String meterNo = Integer.toString(rand.nextInt(10000 - 1000 + 1) + 1000);
            String fatherName = t2.getText();
            String address = t3.getText();
            String city = t4.getText();
            String state = t5.getText();
            String email = t6.getText();
            String phoneNumber = t7.getText();

            // Validate inputs
            if (name.isEmpty() || fatherName.isEmpty() || address.isEmpty() || city.isEmpty() ||
                state.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!");
                return;
            }

            String url = "";
            String userName = "root";
            String password = "";
            Connection con = null;
            PreparedStatement prepareStmt = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, userName, password);
                System.out.println("Connection established");
                String query = "INSERT INTO newCustomer (name,father_name, address, city, state, email_id, contact_no, meterno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                prepareStmt = con.prepareStatement(query);
                prepareStmt.setString(1, name);
                prepareStmt.setString(2, fatherName);
                prepareStmt.setString(3, address);
                prepareStmt.setString(4, city);
                prepareStmt.setString(5, state);
                prepareStmt.setString(6, email);
                prepareStmt.setString(7, phoneNumber);
                prepareStmt.setString(8, meterNo);

                prepareStmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Thanks, your meter no. is: " + meterNo);
                this.setVisible(false);
            } catch (Exception ee) {
                ee.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + ee.getMessage());
            } finally {
                try {
                    if (prepareStmt != null) prepareStmt.close();
                    if (con != null) con.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NewMeterConnection().setVisible(true);
    }
}
