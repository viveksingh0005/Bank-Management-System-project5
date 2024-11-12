package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    mini(String pin){
        this.pin=pin;

        setLayout(null);
        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);


        JLabel label1=new JLabel();
        label1.setBounds(20,140,400,20);
        add(label1);

        JLabel label2=new JLabel("Account Statement");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3=new JLabel();


        add(label3);

        JLabel label4=new JLabel();
        label4.setBounds(150,430,300,20);
        add(label4);

        try{
            Connect c=new Connect();
            ResultSet resultset = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultset.next()){
                label3.setText("Card Number:  "+ resultset.getString("card_number").substring(0,4) + "XXXXXXXX"+ resultset.getString("card_number").substring(12));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            int balance=0;
            Connect c = new Connect();
            ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultset.next()){

                label1.setText(label1.getText() + "<html>"+resultset.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("amount")+ "<br><br><html>");
                if(resultset.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultset.getString("amount"));

                }else{
                    balance-=Integer.parseInt(resultset.getString("amount"));
                }

            }
            label4.setText("your Total balance is rs"+balance);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        button=new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }
    public static void main(String args[]){

        new mini("");
    }


}
