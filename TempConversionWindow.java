import javax.swing.*;
import java.awt.*;
import java.awt.event*;

public class TempConversionWindow extends JFrame implements ActionListener{ \
    private Container pane;
    private JTextField j;
       
    public TempConversionWindow(){
	this.setTitle("Temperature Conversion");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane=this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	JButton cf = new JButton("Celsius to Fahrenheit");
	cf.addActionListener(this);
	cf.setActionCommand("cf");
	JButton fc = new JButton("Fahrenheit to Celsius");
	fc.addActionListener(this);
	fc.setActionCommand("fc");
	j=new JTextField(2);
	k=new JTextField(2);
	pane.add(j);
	pane.add(cf);
	pane.add(fc);
	pane.add(k);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("Byte")){
	    String
    public static double CtoF(double t){
	return((t*9)/5)+32;
    }

    public static double FtoC(double t){
	return((t-32)*5)/9;
    }

}