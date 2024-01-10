
import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame{
	
	Dashboard() {
		setBounds(0, 0, 1550, 1000);
		
		setLayout(null);
		
		ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
		Image i2 = il.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 1550, 1000);
		add(image);
		
		JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU");
		text.setBounds(400, 80, 1000, 50);
		image.add(text);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Dashboard();
	}
}
