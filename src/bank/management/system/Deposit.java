package bank.management.system;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame implements ActionListener {
    TextField tf;
    String pin;
    JButton b1,d1;
    Deposit(String pin){
        this.pin=pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1450,690, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1450,690);
        add(l3);

        JLabel label1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(440,140,330,45);
        l3.add(label1);

        tf=new TextField();
        tf.setBackground(new Color(22, 38, 38));
        tf.setForeground(Color.WHITE);
        tf.setBounds(445,190,310,25);
        tf.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(tf);

        d1=new JButton("DEPOSIT");
        d1.setBounds(645,302,150,26);
        d1.setBackground(new Color(65,125,128));
        d1.setForeground(Color.WHITE);
        d1.addActionListener(this);
        l3.add(d1);

        b1=new JButton("BACK");
        b1.setBounds(645,340,150,26);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);




        setLayout(null);
        setSize(1550,800);
        setLocation(0,0);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = tf.getText();
            Date date = new Date();
            if (e.getSource()==d1){
                if(tf.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount");
                }
                else{
                    Connect c=new Connect();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','+Deposit+','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs."+amount+"Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            }
            else if(e.getSource()==b1){
                new main_Class(pin);
                setVisible(false);
            }
        }
        catch(Exception E){

        }

    }
    public static void main(String[] args){
        new Deposit("");
    }


}
