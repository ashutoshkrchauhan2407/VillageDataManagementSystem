
package village.data.management.system;
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
//import java.sql.*;


public class Home extends JFrame implements ActionListener{
      
    JButton add, view, update, remove;
    Home(){
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,667, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 667);
        add(image);
        
        JLabel heading = new JLabel("VILLAGE DATA MANAGEMENT SYSTEM");
        heading.setBounds(420, 30, 550,40);
        heading.setFont(new Font("serif", Font.BOLD,25));
        heading.setForeground(Color.red);
        image.add(heading);
        
         add = new JButton("Add Villagers");
        add.setBounds(490, 80, 150, 40);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.addActionListener(this);
        image.add(add);
        
         view = new JButton("View Villagers");
        view.setBounds(720, 80, 150, 40);
        view.setBackground(Color.black);
        view.setForeground(Color.white);
        view.addActionListener(this);
        image.add(view);
        
         update = new JButton("Update Villagers");
        update.setBounds(490, 150, 150, 40);
        update.setBackground(Color.black);
        update.setForeground(Color.white);
        update.addActionListener(this);
        image.add(update);
        
         remove = new JButton("Remove Villagers");
        remove.setBounds(720, 150, 150, 40);
        remove.setBackground(Color.black);
        remove.setForeground(Color.white);
        remove.addActionListener(this);
        image.add(remove);
        
        
        setSize(1000, 667);
        setLocation(200, 70);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== add){
          setVisible(false);
          new AddVillagers();
        }
        else if(ae.getSource()== view){
          setVisible(false);
          new ViewVillagers();
        }
        else if(ae.getSource()== update){
          setVisible(false);
          new ViewVillagers();  
        }
        else{
            setVisible(false);
            new RemoveVillager();
        }
//       setVisible(false);
//       new Login();
    }
    public static void main(String[] args){
      new Home();  
    }
}
