import java.awt.*;  
import javax.swing.*;  
class Picture extends JFrame  
{  
  public Picture()  
  {  
	  
	  
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
    JPanel p = new JPanel(new BorderLayout());  
    JTextField tf = new JTextField(5);  
    JLabel label = new JLabel(new ImageIcon("Eagle.png"));  
    label.setOpaque(true);  
    label.setBackground(tf.getBackground());  
    label.setPreferredSize(new Dimension(label.getPreferredSize().width,tf.getPreferredSize().height));  
    p.setBorder(tf.getBorder());  
    tf.setBorder(null);  
    p.add(label,BorderLayout.WEST);  
    p.add(tf,BorderLayout.CENTER);  
    JPanel p1 = new JPanel();  
    p1.add(p);  
    getContentPane().add(p1);  
    pack();  
    setLocationRelativeTo(null);  
  }  
  public static void main(String[] args){new Picture().setVisible(true);}  
  
  
} 