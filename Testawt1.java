import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
public class Testawt1 extends Frame implements ActionListener
{	Button btn =new Button("Hello world");
 Checkbox ch=new Checkbox("yes");
 public Testawt1()
 {

	
 btn.addActionListener(this);
 
 add(btn); //adding a new Button.
 

 
 add(ch); //adding a new Button.
 
 setSize(1400, 900); //setting size.
 setTitle("StudyTonight"); //setting title.
 setLayout(new FlowLayout()); //set default layout for frame.
 setVisible(true); //set frame visibilty true.
 
 
 }

 public void actionPerformed(ActionEvent e)
 {
	 System.exit(0);
	 
 }
 
 
 public static void main (String[] args) 
 {
 
 Testawt1 ta = new Testawt1(); //creating a frame.
 
 }
} 
