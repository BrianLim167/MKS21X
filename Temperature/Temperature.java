import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Temperature extends JFrame implements ActionListener{
    private Container pane;
    private JLabel fLabel,cLabel;
    private JTextField f,c;
    
    public Temperature() {
        this.setTitle("Temperature Converter");
        this.setSize(450,70);
        this.setLocation(600,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	fLabel = new JLabel("Fahrenheit: ");
	f = new JTextField(12);
	f.addActionListener(this);
	cLabel = new JLabel("Celsius: ");
	c = new JTextField(12);
	c.addActionListener(this);

	pane.add(fLabel);
	pane.add(f);
	pane.add(cLabel);
	pane.add(c);
    }

    public static double CtoF(double t){
	return (9.0/5.0)*t+32.0; 
    }
    public static double FtoC(double t){
	return (5.0/9.0)*(t-32.0);
    }

    public void actionPerformed(ActionEvent evt){
	try {
	    if (evt.getSource().equals(f)){
		double value = Double.parseDouble(f.getText());
		c.setText(Double.toString(FtoC(value)));
	    }
	    if (evt.getSource().equals(c)){
		double value = Double.parseDouble(c.getText());
		f.setText(Double.toString(CtoF(value)));
	    }
	}catch (NumberFormatException exc){
	    f.setText("");
	    c.setText("");
	}
    }
    public static void main(String[] args) {
        Temperature g = new Temperature();
        g.setVisible(true);
    }
}
