import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("Electricity Billing System");

        setSize(1500,800);

        /* Adding background image */
        ImageIcon ic =  new ImageIcon("images/house.jpg");
        Image i3 = ic.getImage().getScaledInstance(1400,700,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);

        /* First Column */
        JMenuBar mb  = new JMenuBar();
        JMenu home = new JMenu("Home");//master
        JMenuItem h1 = new JMenuItem("New Meter Connection");//New Customer
        JMenuItem h2 = new JMenuItem("Check Customer Details");//Customer Details
        home.setForeground(Color.BLUE);


        /* ---- New customer ---- */
        h1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("images/icon2.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        h1.setIcon(new ImageIcon(image1));
        h1.setMnemonic('D');
        h1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        h1.setBackground(Color.WHITE);

        /* ---- Customer Details ---- */
        h2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("images/icon1.jpg"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        h2.setIcon(new ImageIcon(image2));
        h2.setMnemonic('M');
        h2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_DOWN_MASK));
        h2.setBackground(Color.WHITE);

        h1.addActionListener(this);
        h2.addActionListener(this);

        // --------------------------------------------------------------------------------------------


        /* Second Column */
        JMenu billing = new JMenu("Billing");
        JMenuItem b1 = new JMenuItem("Pay Bill");
        JMenuItem b2 = new JMenuItem("Calculate Bill");
        JMenuItem b3 = new JMenuItem("Generate E-Bill");
        billing.setForeground(Color.RED);

        /* ---- Pay Bill ---- */
        b1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("images/icon4.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image4));
        b1.setMnemonic('P');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        b1.setBackground(Color.WHITE);

        /* ---- Calculate Bill ---- */
        b2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("images/icon5.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(image5));
        b2.setMnemonic('B');
        b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        b2.setBackground(Color.WHITE);

        // --------------------------------------------------------------------------------------------- 

        /* Third Column*/
        JMenu customcare = new JMenu("Customer Care");
        JMenuItem c1 = new JMenuItem("Complaint");
        JMenuItem c2 = new JMenuItem("Helpline No.");
        customcare.setForeground(Color.BLUE);

        /* ---- customer care ---- */
        c1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("images/icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image7));
        c1.setMnemonic('R');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);

        c2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("images/iconphone.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image3));
        c2.setMnemonic('B');
        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        c2.setBackground(Color.WHITE);
        
        c1.addActionListener(this);
        c2.addActionListener(this);
        // -----------------------------------------------------------------------------------------------

        /* Fourth Column*/
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);

        /* ---- Calender ---- */
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("images/icon12.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);

        /* ---- Calculator ---- */
        ut2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("images/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);

        /* ---- Web Browser ---- */
        ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("images/icon10.png"));
        Image image10 = icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);


        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);

        // ---------------------------------------------------------------------------------------

        /*Fifth Column */
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLUE);

        /* ---- Exit ---- */
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("images/icon11.png"));
        Image image11 = icon11.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);


        // here add all the menu items
        home.add(h1);
        home.add(h2);

        billing.add(b1);
        billing.add(b2);

        customcare.add(c1);
        customcare.add(c2);

        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);

        exit.add(ex);

        mb.add(home);
        mb.add(billing);
        mb.add(customcare);
        mb.add(utility);
        mb.add(exit);

        setJMenuBar(mb);

        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("Check Customer Details")){
            new generate_bill().setVisible(true);

        }else if(msg.equals("New Meter Connection")){
            new NewMeterConnection().setVisible(true);

        }else if(msg.equals("Calculate Bill")){
            new calculate_bill().setVisible(true);

        }else if(msg.equals("Pay Bill")){
            new PayBill().setVisible(true);

        }else if(msg.equals("Complaint")){
            new complaint().setVisible(true);
           
        }else if(msg.equals("Helpline No.")){
            JOptionPane.showMessageDialog(null,"Helpline No. : +91 93067 63879");
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }

        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }

        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            }catch(Exception e){ }

        }else if(msg.equals("Exit")){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new Project().setVisible(true);
    }

}