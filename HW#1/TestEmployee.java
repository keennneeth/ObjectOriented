import javax.swing.JOptionPane; 



public class TestEmployee 

{
    public static void main(String[] args)  
{

String tempname, temppos, tempID;

tempname = JOptionPane.showInputDialog("What is your name?");



tempID = JOptionPane.showInputDialog("What is your ID?");
int tempID2 = Integer.parseInt(tempID);


temppos = JOptionPane.showInputDialog("What is your Position?");


Employee e1 = new Employee (tempname, tempID2, temppos);
JOptionPane.showMessageDialog(null, "Employee Name: " + e1.Name + "\nEmployee ID: " + e1.Number + "\nEmployee Position: " + e1.Position);



tempname = JOptionPane.showInputDialog("What is your name?");



tempID = JOptionPane.showInputDialog("What is your ID?");
int tempID3 = Integer.parseInt(tempID);


temppos = JOptionPane.showInputDialog("What is your Position?");



Employee e2 = new Employee (tempname, tempID3, temppos);
JOptionPane.showMessageDialog(null, "Employee Name: " + e2.Name + "\nEmployee ID: " + e2.Number + "\nEmployee Position: " + e2.Position);



tempname = JOptionPane.showInputDialog("What is your name?");



tempID = JOptionPane.showInputDialog("What is your ID?");
int tempID4 = Integer.parseInt(tempID);


temppos = JOptionPane.showInputDialog("What is your Position?");



Employee e3 = new Employee (tempname, tempID4, temppos);
JOptionPane.showMessageDialog(null, "Employee Name: " + e3.Name + "\nEmployee ID: " + e3.Number + "\nEmployee Position: " + e3.Position);




JOptionPane.showMessageDialog(null,"Employee 1: " + e1.Name +  "     Employee ID: " + e1.Number + "     Employee Position: " + e1.Position + "\nEmployee 2: " + e2.Name + "     Employee ID: " + e2.Number + "     Employee Position: " + e2.Position + "\nEmployee 3: " + e3.Name + "     Employee ID: " + e3.Number + "     Employee Position: " + e3.Position);
}
}
