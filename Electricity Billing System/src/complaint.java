import java.awt.*;
import javax.swing.*;

public class complaint extends JFrame {
    JLabel l1, l2, l3;
    JButton b1, b2;
    JTextField t1, t2;
    JTextArea t3;
    JPanel p1;

    complaint() {
        Container c = this.getContentPane();
        c.setLayout(null);  // Using null layout for manual positioning

        setSize(500, 600);
        setLocation(400,150);
        setTitle("Complaint Register");
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Name : ");
        l1.setBounds(20, 40, 100, 20);  
        c.add(l1);

        t1 = new JTextField();
        t1.setBounds(130, 40, 250, 20);
        c.add(t1);

        l2 = new JLabel("Meter No. : ");
        l2.setBounds(20, 80, 100, 20);
        c.add(l2);

        t2 = new JTextField();
        t2.setBounds(130, 80, 250, 20);
        c.add(t2);

        l3 = new JLabel("Complaint : ");
        l3.setBounds(20, 120, 100, 20);
        c.add(l3);

        t3 = new JTextArea();
        t3.setBounds(130, 120, 250, 250);
        c.add(t3);

        b1 = new JButton("Submit");
        b1.setBounds(130, 400, 120, 50);
        b1.setBackground(Color.BLACK);        
        b1.setForeground(Color.WHITE);        
        
        c.add(b1);
        
        b2 = new JButton("Reset");
        b2.setBounds(270, 400, 120, 50);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);        
        c.add(b2);
    }

    public static void main(String[] args) {
        new complaint().setVisible(true);
    }
}
