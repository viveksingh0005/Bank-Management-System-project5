package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel label2;

    JButton b1;
    BalanceEnquiry(String pin){
        this.pin=pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1450,690, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1450,690);
        add(l3);

        JLabel label1=new JLabel("Your current Balance is Rs");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(440,110,330,45);
        l3.add(label1);

        JLabel label2=new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(440,140,330,45);
        l3.add(label2);

        b1=new JButton("BACK");
        b1.setBounds(645,340,150,26);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        int balance=0;
        try{
            Connect c= new Connect();
            ResultSet resultset=c.statement.executeQuery("Select* from bank where pin='"+pin+"'");
            while(resultset.next()){
                if(resultset.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultset.getString("amount"));
                }else{
                    balance-=Integer.parseInt(resultset.getString("amount"));
                }
            }
        }catch(Exception E){
            E.printStackTrace();
        }
        label2.setText(""+balance);
        setLayout(null);
        setSize(1550,800);
        setLocation(0,0);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);

    }
    public static void main(String args[]){
        new BalanceEnquiry("");
    }


}
