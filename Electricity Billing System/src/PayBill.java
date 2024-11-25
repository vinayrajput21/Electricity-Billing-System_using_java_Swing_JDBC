import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.*;

public class PayBill extends JFrame {
    PayBill() {
        setTitle("Pay Bill Options");
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // FlowLayout with centered alignment and spacing
       
        
        // Heading
        JLabel heading = new JLabel("Choose any media to pay bill", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 20));
        add(heading);
        
        // Button 1
        JButton button1 = new JButton("Paytm");
        button1.setPreferredSize(new Dimension(200, 50));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://paytm.com/electricity-bill-payment");
            }
        });
        add(button1);
        
        // Button 2
        JButton button2 = new JButton("SBI MOPS");
        button2.setPreferredSize(new Dimension(200, 50));
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebpage("https://www.onlinesbi.sbi/");
            }
        });
        add(button2);
        
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }
    
    public void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new PayBill().setVisible(true); 
    }
}
