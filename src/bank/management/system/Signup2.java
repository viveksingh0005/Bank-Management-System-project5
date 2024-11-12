package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox combobox,combobox2,combobox3,combobox4,combobox5;
    JTextField pan,adr;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM:");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,10,100,100);
        add(image);
        this.formno=formno;

        JLabel l1=new JLabel("Page 2 :");
        l1.setFont(new Font("Ralway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details:");
        l2.setFont(new Font("Ralway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion:");
        l3.setFont(new Font("Ralway",Font.BOLD,18));
        l3.setBounds(100,140,100,30);
        add(l3);

        String religion[]={"Hindu","Sikh","Muslim","Christian","Other"};
        combobox = new JComboBox(religion);
        combobox.setBackground(new Color(252,208,76));
        combobox.setFont(new Font("Ralway",Font.BOLD,14));
        combobox.setBounds(350,140,210,30);
        add(combobox);

        JLabel l4=new JLabel("Category:");
        l4.setFont(new Font("Ralway",Font.BOLD,18));
        l4.setBounds(100,190,100,30);
        add(l4);

        String category[]={"General","OBC","SC","ST"};
        combobox2 = new JComboBox(category);
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setFont(new Font("Ralway",Font.BOLD,14));
        combobox2.setBounds(350,190,210,30);
        add(combobox2);

        JLabel l5=new JLabel("Income:");
        l5.setFont(new Font("Ralway",Font.BOLD,18));
        l5.setBounds(100,240,100,30);
        add(l5);

        String income[]={"null","<1,50,000","<2,50,000","<5,00,000",">5,00,000"};
        combobox3 = new JComboBox(income);
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setFont(new Font("Ralway",Font.BOLD,14));
        combobox3.setBounds(350,240,210,30);
        add(combobox3);

        JLabel l6=new JLabel("Education");
        l6.setFont(new Font("Ralway",Font.BOLD,18));
        l6.setBounds(100,290,100,30);
        add(l6);

        String education[]={"non-graduate","gaduate","post-graduate","Doctorate","Others"};
        combobox4 = new JComboBox(education);
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setFont(new Font("Ralway",Font.BOLD,14));
        combobox4.setBounds(350,290,210,30);
        add(combobox4);

        JLabel l7=new JLabel("Occupation:");
        l7.setFont(new Font("Ralway",Font.BOLD,18));
        l7.setBounds(100,340,100,30);
        add(l7);

        String occupation[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        combobox5 = new JComboBox(occupation);
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setFont(new Font("Ralway",Font.BOLD,14));
        combobox5.setBounds(350,340,210,30);
        add(combobox5);

        JLabel l8=new JLabel("PAN number:");
        l8.setFont(new Font("Ralway",Font.BOLD,18));
        l8.setBounds(100,390,200,30);
        add(l8);

        pan=new JTextField();
        pan.setFont(new Font("Ralway",Font.BOLD,18));
        pan.setBounds(350,390,210,30);
        add(pan);

        JLabel l9=new JLabel("Aadhar number:");
        l9.setFont(new Font("Ralway",Font.BOLD,18));
        l9.setBounds(100,440,200,30);
        add(l9);

        adr=new JTextField();
        adr.setFont(new Font("Ralway",Font.BOLD,18));
        adr.setBounds(350,440,210,30);
        add(adr);

        JLabel l10=new JLabel("Senior Citizen:");
        l10.setFont(new Font("Ralway",Font.BOLD,18));
        l10.setBounds(100,490,200,30);
        add(l10);

        r1=new JRadioButton("yes");
        r1.setFont(new Font("Ralway",Font.BOLD,18));
        r1.setBounds(350,490,100,30);
        r1.setBackground(new Color(252,208,76));
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Ralway",Font.BOLD,18));
        r2.setBounds(460,490,100,30);
        r2.setBackground(new Color(252,208,76));
        add(r2);

        JLabel l11=new JLabel("Existing Account:");
        l11.setFont(new Font("Ralway",Font.BOLD,18));
        l11.setBounds(100,540,200,30);
        add(l11);

        r3=new JRadioButton("yes");
        r3.setFont(new Font("Ralway",Font.BOLD,18));
        r3.setBounds(350,540,100,30);
        r3.setBackground(new Color(252,208,76));
        add(r3);

        r4=new JRadioButton("No");
        r4.setFont(new Font("Ralway",Font.BOLD,18));
        r4.setBounds(460,540,100,30);
        r4.setBackground(new Color(252,208,76));
        add(r4);

        JLabel l12=new JLabel("Form N0:");
        l12.setFont(new Font("Ralway",Font.BOLD,18));
        l12.setBounds(620,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Ralway",Font.BOLD,18));
        l13.setBounds(700,10,80,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBounds(700,600,100,30);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,740);
        setLocation(360,10);
        getContentPane().setBackground(new Color(180, 162, 119));
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String) combobox.getSelectedItem();
        String cate=(String) combobox2.getSelectedItem();
        String inc=(String) combobox3.getSelectedItem();
        String edu=(String) combobox4.getSelectedItem();
        String occ=(String) combobox5.getSelectedItem();

        String pa=pan.getText();
        String ad=adr.getText();
        String cit=" ";
        if((r1.isSelected())){
            cit="Yes";
        }else if(r2.isSelected()){
            cit="No";
        }
        String eac=" ";
        if((r3.isSelected())){
            eac="Yes";
        }else if(r4.isSelected()){
            eac="no";
        }

        try{
            if(pan.getText().equals("")||adr.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the details");
            }
            else{
                Connect c1=new Connect();
                String q1="insert into signuptwo values ('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pa+"','"+ad+"','"+cit+"','"+eac+"')";
                c1.statement.executeUpdate(q1);
                new Signup3(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }
    public static void main(String args[]){
        new Signup2("");
    }


}
