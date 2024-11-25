import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class generate_bill extends JFrame implements ActionListener {
    JLabel l1;
    JTextArea t1;
    JTextField tf1;
    JButton b1;
    JPanel p1;

    generate_bill() {
        setSize(500, 900);
        setLayout(new BorderLayout());

        p1 = new JPanel();

        l1 = new JLabel("Meter No.");
        tf1 = new JTextField(20);

        t1 = new JTextArea(50, 15);
        JScrollPane jsp = new JScrollPane(t1);
        t1.setFont(new Font("Senserif", Font.ITALIC, 18));
        t1.setEditable(false); // To make the text area read-only

        b1 = new JButton("Check Details");

        p1.add(l1);
        p1.add(tf1);
        add(p1, "North");

        add(jsp, "Center");
        add(b1, "South");

        b1.addActionListener(this);

        setLocation(350, 40);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close the application properly
    }

    public void actionPerformed(ActionEvent ae) {
        String url = "";
        String userName = "root";
        String password = "";
        try {
            String meterno = tf1.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, userName, password);

            String query = "SELECT * FROM newCustomer WHERE meterno = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, meterno);
            ResultSet rs = pstmt.executeQuery();

            t1.setText(""); // Clear previous text

            while (rs.next()) {
                t1.append("Name " + rs.getString(1) + "\n");
                t1.append("father name: " + rs.getString(2) + "\n");
                t1.append("Address: " + rs.getString(3) + "\n");
                t1.append("City: " + rs.getString(4) + "\n");
                t1.append("State: " + rs.getString(5) + "\n");
                t1.append("Email: " + rs.getString(6) + "\n");
                t1.append("Phone: " + rs.getString(7) + "\n");
                t1.append("Meter No: " + rs.getString(8) + "\n");
            }

            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new generate_bill().setVisible(true);
        });
    }
}
