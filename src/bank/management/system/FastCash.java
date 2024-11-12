package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    FastCash(String pin){
        this.pin = pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1450,690, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1450,690);
        add(l3);

        JLabel label1=new JLabel("SELECT WITHDRAWL AMOUNT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,20));
        label1.setBounds(425,140,350,45);
        l3.add(label1);

        b1=new JButton("RS. 100");
        b1.setBounds(385,228,150,26);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b3=new JButton("Rs. 1000");
        b3.setBounds(385,264,150,26);
        b3.setBackground(new Color(65,125,128));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        l3.add(b3);

        b5=new JButton("Rs. 5000");
        b5.setBounds(385,302,150,26);
        b5.setBackground(new Color(65,125,128));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        l3.add(b5);

        b7=new JButton("BACK");
        b7.setBounds(645,340,150,26);
        b7.setBackground(new Color(65,125,128));
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        l3.add(b7);

        b2=new JButton("Rs. 500");
        b2.setBounds(645,228,150,26);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        b4=new JButton("Rs. 2000");
        b4.setBounds(645,264,150,26);
        b4.setBackground(new Color(65,125,128));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        l3.add(b4);

        b6=new JButton("Rs. 10,000");
        b6.setBounds(645,302,150,26);
        b6.setBackground(new Color(65,125,128));
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        l3.add(b6);





        setLayout(null);
        setSize(1550,800);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            setVisible(false);
            new main_Class(pin);

        }else{
            String amount= ((JButton)e.getSource()).getText().substring(4);
            Connect c=new Connect();
            Date date=new Date();
            try{
                ResultSet resultset=c.statement.executeQuery("select * from bank when");
                int balance=0;
                while(resultset.next()){
                    if(resultset.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(resultset.getString("amount"));

                    }else{
                        balance-=Integer.parseInt(resultset.getString("amount"));
                    }

                }

                if (e.getSource()!=b7&&balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                Connect.statement.executeUpdate("inset into bank values('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+"Debited Successfully");
            }catch(Exception E){
                E.printStackTrace();
            }
        }

    }
    public static void main(String args[]){
        new FastCash("");

    }


}
