package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup  extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4,r5;
    JButton next;
    JTextField tn,tf,te,mr,add,cty,pn;
    JDateChooser dc;
    Random ran =new Random();
    long f4=(ran.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(f4);
    Signup(){

        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("PAGE 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        add(label3);

        JLabel ln=new JLabel("Name:");
        ln.setFont(new Font("Ralway",Font.BOLD,20));
        ln.setBounds(100,190,100,30);
        add(ln);

        tn =new JTextField();
        tn.setFont(new Font("Ralway",Font.BOLD,20));
        tn.setBounds(300,190,400,30);
        add(tn);

        JLabel lf=new JLabel("Father's Name:");
        lf.setFont(new Font("Ralway",Font.BOLD,20));
        lf.setBounds(100,240,200,30);
        add(lf);

        tf =new JTextField();
        tf.setFont(new Font("Ralway",Font.BOLD,20));

        tf.setBounds(300,240,400,30);
        add(tf);

        JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Ralway",Font.BOLD,20));
        dob.setBounds(100,340,200,30);
        add(dob);

        dc =new JDateChooser();
        dc.setForeground(new Color(105,105,105,105));
        dc.setBounds(300,340,400,30);
        add(dc);

        JLabel gen=new JLabel("Gender:");
        gen.setFont(new Font("Ralway",Font.BOLD,20));
        gen.setBounds(100,290,200,30);
        add(gen);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);



        ButtonGroup group =new ButtonGroup();
        group.add(r1);
        group.add(r2);

        JLabel le=new JLabel("Email address:");
        le.setFont(new Font("Ralway",Font.BOLD,20));
        le.setBounds(100,390,200,30);
        add(le);

        te =new JTextField();
        te.setFont(new Font("Ralway",Font.BOLD,20));
        te.setBounds(300,390,400,30);
        add(te);

        JLabel ms=new JLabel("Marital Status:");
        ms.setFont(new Font("Ralway",Font.BOLD,20));
        ms.setBounds(100,440,200,30);
        add(ms);
        r3=new JRadioButton("Married");
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,440,100,30);
        add(r3);
        r4=new JRadioButton("Unmarried");
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,440,150,30);
        add(r4);
        r5=new JRadioButton("Other");
        r5.setFont(new Font("Ralway",Font.BOLD,14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(635,440,100,30);
        add(r5);
        ButtonGroup grop =new ButtonGroup();
        grop.add(r3);
        grop.add(r4);
        grop.add(r5);


        JLabel ad=new JLabel("Address:");
        ad.setFont(new Font("Ralway",Font.BOLD,20));
        ad.setBounds(100,490,200,30);
        add(ad);
        add =new JTextField();
        add.setFont(new Font("Ralway",Font.BOLD,20));
        add.setBounds(300,490,400,30);
        add(add);


        JLabel city=new JLabel("City:");
        city.setFont(new Font("Ralway",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);
        cty =new JTextField();
        cty.setFont(new Font("Ralway",Font.BOLD,20));
        cty.setBounds(300,540,400,30);
        add(cty);


        JLabel pin=new JLabel("State:");
        pin.setFont(new Font("Ralway",Font.BOLD,20));
        pin.setBounds(100,590,200,30);
        add(pin);
        pn =new JTextField();
        pn.setFont(new Font("Ralway",Font.BOLD,20));
        pn.setBounds(300,590,400,30);
        add(pn);

        next=new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(700,620,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=tn.getText();
        String fname=tf.getText();
        String dob = ((JTextField)dc.getDateEditor().getUiComponent()).getText();
        String gen=null;
        if(r1.isSelected()){
            gen="Male";
        }
        else if(r2.isSelected()){
            gen="Female";
        }
        String email=te.getText();
        String  marital=null;
        if(r3.isSelected()){
            marital="Married";
        }
        else if(r4.isSelected()){
            marital="Unmarried";
        }
        else if(r5.isSelected()){
            marital="Other";
        }
        String address=add.getText();
        String city=cty.getText();
        String pin=pn.getText();

        try{
            if(tn.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the information");
            }else{
                Connect con1=new Connect();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gen+"','"+marital+"','"+address+"','"+city+"','"+pin+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }

        }catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String args[]){
        new Signup();
    }


}
