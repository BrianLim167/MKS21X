import javax.swing.*;
import java.awt.*;
public class Temperature extends JFrame{
    public Window() {
        this.setTitle("Temperature Converter");
        this.setSize(600,400);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	f = new JTextField()
    }

    public static void main(String[] args) {
        Window g = new Window();
        g.setVisible(true);
    }

    public static double CtoF(double t){
	return (9.0/5.0)*t+32.0; 
    }
    public static double FtoC(double t){
	return (5.0/9.0)*(t-32.0);
    }
}
