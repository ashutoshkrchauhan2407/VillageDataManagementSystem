
package village.data.management.system;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import com.toedter.calendar.JDateChooser;
 import java.util.*;

public class AddVillagers extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(99999999);
    JTextField tfname,tflname,tffname,tfhname,tfoname,tfpname,tfename,tfaaname;
    JDateChooser dcdob;
    JComboBox tfgname,tfbname,tfhename,tfmname;
    JButton add,back;
    JLabel lbleinname;
    
    AddVillagers(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Villagers Details");
        heading.setBounds(290, 30, 810,50);
        heading.setFont(new Font("serif", Font.PLAIN,40));
        heading.setForeground(Color.red);
        add(heading);
        
        JLabel lblname = new JLabel("First Name :-");
        lblname.setBounds(50,120,150,30);
        lblname.setFont(new Font("serif", Font.PLAIN,20));
        add(lblname);
        tfname = new JTextField();
        tfname.setBounds(200, 120, 150, 30);
        add(tfname);
        
        JLabel lbllname = new JLabel("Last Name :-");
        lbllname.setBounds(420,120,150,30);
        lbllname.setFont(new Font("serif", Font.PLAIN,20));
        add(lbllname);
        tflname = new JTextField();
        tflname.setBounds(590, 120, 150, 30);
        add(tflname);
        
        
        JLabel lblfname = new JLabel("Father's N :-");
        lblfname.setBounds(50,170,150,30);
        lblfname.setFont(new Font("serif", Font.PLAIN,20));
        add(lblfname);
        tffname = new JTextField();
        tffname.setBounds(200, 170, 150, 30);
        add(tffname);
        
        JLabel lbldname = new JLabel("Date of Birth :-");
        lbldname.setBounds(420,170,150,30);
        lbldname.setFont(new Font("serif", Font.PLAIN,20));
        add(lbldname);
//        JTextField tfdname = new JTextField();
//        tfdname.setBounds(590, 120, 150, 30);
//        add(tfdname);
        dcdob = new JDateChooser();
        dcdob.setBackground(Color.white);
        dcdob.setBounds(590, 170, 150, 30);
        add(dcdob);

        
        
        JLabel lblgname = new JLabel("Gender :-");
        lblgname.setBounds(50,220,150,30);
        lblgname.setFont(new Font("serif", Font.PLAIN,20));
        add(lblgname);
        String gender[] = {"", "FEMALE", "MALE","OTHER"};
        tfgname = new JComboBox(gender);
        tfgname.setBackground(Color.white);
        tfgname.setBounds(200, 220, 150, 30);
        add(tfgname);
//        
        JLabel lblbname = new JLabel("Blood Group :-");
        lblbname.setBounds(420,220,150,30);
        lblbname.setFont(new Font("serif", Font.PLAIN,20));
        add(lblbname);
        String blood[] = {"", "A+", "A-","B+","B-","O+","O-","AB+","AB-"};
        tfbname = new JComboBox(blood);
        tfbname.setBackground(Color.white);
        tfbname.setBounds(590, 220, 150, 30);
        add(tfbname);
//        
//        
        JLabel lblhname = new JLabel("House No. :-");
        lblhname.setBounds(50,270,150,30);
        lblhname.setFont(new Font("serif", Font.PLAIN,20));
        add(lblhname);
        tfhname = new JTextField();
        tfhname.setBounds(200, 270, 150, 30);
        add(tfhname);
//        
        JLabel lblpname = new JLabel("Phone No. :-");
        lblpname.setBounds(420,270,150,30);
        lblpname.setFont(new Font("serif", Font.PLAIN,20));
        add(lblpname);
        tfpname = new JTextField();
        tfpname.setBounds(590, 270, 150, 30);
        add(tfpname);
        
//        
//        
        JLabel lblename = new JLabel("Email Id :-");
        lblename.setBounds(50,320,150,30);
        lblename.setFont(new Font("serif", Font.PLAIN,20));
        add(lblename);
        tfename = new JTextField();
        tfename.setBounds(200, 320, 150, 30);
        add(tfename);
//        
        JLabel lblhename = new JLabel("Highest Edu :-");
        lblhename.setBounds(420,320,150,30);
        lblhename.setFont(new Font("serif", Font.PLAIN,20));
        add(lblhename);
//        JTextField tfhename = new JTextField();
//        tfhename.setBounds(590, 320, 150, 30);
//        add(tfhename);
        String courses[] = {"", "HIGH-SCHOOL", "INTERMEDIATE", "BBA", "BCA", "BA", "B.COM", "BTECH", "MBA","MCA", "MTECH","MBBS", "MSC", "PHD","OTHER"};
        tfhename = new JComboBox(courses);
        tfhename.setBackground(Color.white);
        tfhename.setBounds(590, 320, 150, 30);
        add(tfhename);
//        
//        
//        
        JLabel lblmname = new JLabel("Marital Status :-");
        lblmname.setBounds(50,370,150,30);
        lblmname.setFont(new Font("serif", Font.PLAIN,20));
        add(lblmname);
        String marr[] = {"","MARRIED","UNMARRIED","OTHER"};
        tfmname = new JComboBox(marr);
        tfmname.setBackground(Color.white);
        tfmname.setBounds(200, 370, 150, 30);
        add(tfmname);
//        
        JLabel lbloname = new JLabel("Occupation :-");
        lbloname.setBounds(420,370,150,30);
        lbloname.setFont(new Font("serif", Font.PLAIN,20));
        add(lbloname);
        tfoname = new JTextField();
        tfoname.setBounds(590, 370, 150, 30);
        add(tfoname);
        
        
        
        JLabel lblaaname = new JLabel("Aadhar No. :-");
        lblaaname.setBounds(50,420,150,30);
        lblaaname.setFont(new Font("serif", Font.PLAIN,20));
        add(lblaaname);
        tfaaname = new JTextField();
        tfaaname.setBounds(200, 420, 150, 30);
        add(tfaaname);
//        
//        
//        
        JLabel lbleiname = new JLabel("Villager Id :-");
        lbleiname.setBounds(50,470,150,30);
        lbleiname.setFont(new Font("serif", Font.PLAIN,20));
        add(lbleiname);
        
        lbleinname = new JLabel("" + number);
        lbleinname.setBounds(200,470,150,30);
        lbleinname.setFont(new Font("serif", Font.PLAIN,20));
        add(lbleinname);
//        JTextField tfeiname = new JTextField();
//        tfeiname.setBounds(200, 470, 150, 30);
//        add(tfeiname);
//        
         add = new JButton("Add Details");
        add.setBounds(270, 550, 100, 30);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);
        
         back = new JButton("Back");
        back.setBounds(480, 550, 100, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        
        
        setSize(900, 700);
        setLocation(250,30);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==add){
         String firstname = tfname.getText();
         String lastname  = tflname.getText();
         String fathername = tffname.getText();
         String dob       = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
         String gender    = (String) tfgname.getSelectedItem();
         String bloodgrp  = (String) tfbname.getSelectedItem();
         String houseno   = tfhname.getText();
         String phoneno   = tfpname.getText();
         String emailid   = tfename.getText();
         String highesteducation = (String) tfhename.getSelectedItem();
         String maritalstatus = (String) tfmname.getSelectedItem();
         String occupation= tfoname.getText();
         String aadhar    = tfaaname.getText();
         String villagerid     = lbleinname.getText();
         
         try{
             Conn conn = new Conn();             
              String query = "insert into villager values('"+firstname+"','"+lastname+"','"+fathername+"','"+dob+"','"+gender+"','"+bloodgrp+"','"+houseno+"','"+phoneno+"','"+emailid+"','"+highesteducation+"','"+maritalstatus+"','"+occupation+"','"+aadhar+"','"+villagerid+"')";
               conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null,"Details added successfully");
             setVisible(false);
             new Home();
         }
         catch(Exception e){
             e.printStackTrace();
         }
        }   
        else{
            setVisible(false);
            new Home();
        }

    }
    
    public static void main(String[] args){
        new AddVillagers();
    }
}
