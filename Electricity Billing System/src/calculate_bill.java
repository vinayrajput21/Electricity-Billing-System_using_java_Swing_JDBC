import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculate_bill extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2;
    Choice c1,c2;
    JButton b1,b2;
    JPanel p;
    calculate_bill(){

        p = new JPanel();
        p.setLayout(new GridLayout(4,2,30,30));
        p.setBackground(Color.WHITE);

        l1 = new JLabel("     Calculate Electricity Bill");
        l2 = new JLabel("Select Your Region : ");
        l3 = new JLabel("Total Bill : ");
        l5 = new JLabel("Units Consumed : ");

        t1 = new JTextField();
        t2 = new JTextField();

        c1 = new Choice();
        c1.add("North Region, Rs 5/unit");
        c1.add("South Region, Rs 3/unit");
        c1.add("West Region, Rs 4/unit");
        c1.add("East Region, Rs 6/unit");

        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/hicon2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(180, 270,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l4 = new JLabel(i3);



        l1.setFont(new Font("Senserif",Font.PLAIN,26));
        //Move the label to center
        l1.setHorizontalAlignment(JLabel.CENTER);



        p.add(l2);
        p.add(c1);
        p.add(l5);
        p.add(t2);
        p.add(l3);
        p.add(t1);
        p.add(b1);
        p.add(b2);

        setLayout(new BorderLayout(30,30));

        add(l1,"North");
        add(p,"Center");
        add(l4,"West");


        b1.addActionListener(this);
        b2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(650,500);
        setLocation(350,220);
    }
    public void actionPerformed(ActionEvent ae){
            if (ae.getSource() == b1) {
                try {
                    String region = c1.getSelectedItem();
                    int unitsConsumed = Integer.parseInt(t2.getText());
                    int ratePerUnit = 0;
    
                    switch (region) {
                        case "North Region, Rs 5/unit":
                            ratePerUnit = 5;
                            break;
                        case "South Region, Rs 3/unit":
                            ratePerUnit = 3;
                            break;
                        case "West Region, Rs 4/unit":
                            ratePerUnit = 4;
                            break;
                        case "East Region, Rs 6/unit":
                            ratePerUnit = 6;
                            break;
                    }
    
                    int billAmount = ratePerUnit * unitsConsumed;
                    t1.setText(String.valueOf(billAmount));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid number for units consumed.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
          else if (ae.getSource() == b2) {
                this.dispose();  // Close the frame
            }
        }


    public static void main(String[] args){
        new calculate_bill().setVisible(true);
    }
}