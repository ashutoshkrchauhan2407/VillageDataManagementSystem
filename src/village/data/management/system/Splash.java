
package village.data.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class Splash extends JFrame implements ActionListener {
    Splash() {
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("VILLAGE DATA MANAGEMENT SYSTEM");
        heading.setBounds(90, 30, 810,50);
        heading.setFont(new Font("serif", Font.PLAIN,40));
        heading.setForeground(Color.red);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 850, 500);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(300, 400, 300, 70);
        clickhere.setBackground(Color.black);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
      setSize(970, 650);
      setLocation(200, 50);
      setVisible(true);
      
      while(true){
          heading.setVisible(false);
          try{
              Thread.sleep(500);
          }catch(Exception e){
              
          }
          heading.setVisible(true);
          try{
              Thread.sleep(500);
          }catch(Exception e){
              
          }
      }
      
}
  public static void main(String args[]){
      new Splash();
      
  }  

    
    public void actionPerformed(ActionEvent ae) {
       setVisible(false);
       new Login();
    }
}
