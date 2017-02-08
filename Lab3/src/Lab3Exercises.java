import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Wirber");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension sizeofscreen = Toolkit.getDefaultToolkit().getScreenSize();
		sizeofscreen.getHeight();
		sizeofscreen.getWidth();
		myFrame.setLocation(sizeofscreen.width/2, sizeofscreen.height/2);
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
		//Cambio
	}
}