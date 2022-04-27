import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Supplier

{
    public static void main(String[] args) {
        createWindow();
     }
  
     private static void createWindow() {    
        JFrame frame = new JFrame("Supplier account creator (Project 2)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(900, 300);      
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
     }
  
     private static void createUI(final JFrame frame){  
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();  
        panel.setLayout(layout);       
  
        
        JButton button = new JButton("Create Supplier Account");
        final JLabel label = new JLabel();
        button.addActionListener(new ActionListener() {
         
           public void actionPerformed(ActionEvent e) {
              String[] options = {"8123 69th Street, Lubbock TX 79424", "3290 99th Street, Lubbock TX 79409", "8666 55th Place, Lubbock TX 79419"}; 
              int result = JOptionPane.showOptionDialog(
                 frame,
                 "CHOOSE A PROPERTY TO SEE ITS OWNER, ASSESSED VALUE, AND PROPERTY TAX", 
                 "Swing Tester",            
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE,
                 null,     
                 options, 
                 options[0] 
              );
              if(result == JOptionPane.YES_OPTION){    
                 label.setText("THE OWNER OF 8123 69th Street " + "Lubbock TX 79424 IS JOHN SMITH, " + "THE ASSESSED VALUE IS $120,000 AND THE " + "PROPERTY TAX IS $768");
              }else if (result == JOptionPane.NO_OPTION){
                 label.setText("THE OWNER OF 3290 99th Street, Lubbock TX 79409 " + "IS TOMMY JOHNSON, " + "THE ASSESSED VALUE IS $270,000 AND THE " + "PROPERTY TAX IS $1,728");
              }else {
                 label.setText("THE OWNER OF 8666 55th Place, Lubbock TX 79419 " + "IS SUSAN WILLIAMS, " + "THE ASSESSED VALUE IS $180,000 AND THE " + "PROPERTY TAX IS $1,152");
              }
           }
        });
  
        panel.add(button);
        panel.add(label);
        frame.getContentPane().add(panel, BorderLayout.CENTER);    
     }  
  } 