import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Compare interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right -1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;
		
		//Paint the background
		g.setColor(Color.black);
		g.fillRect(x1, y1, width + 1, height + 1);
		
//		//Draw a border
//		g.setColor(Color.YELLOW);
//		g.drawRect(x1, y1, width, height);
//		
//		//Draw border 2
//		g.setColor(Color.gray);
//		g.drawRect(x1 + 15, y1 + 15, width - 30, height - 30);
//		
//		//Drawing lines and ovals
//		g.setColor(Color.WHITE);
//		g.drawLine(x1, y1, x2, y2);
//		
//		g.setColor(Color.GREEN);
//		g.drawLine(x2, y1, x1, y2);
		
//		g.setColor(Color.LIGHT_GRAY);
//		g.fillOval(x1 + this.getWidth()/2 - 27, y1 + this.getHeight()/2 - 27, 55, 55);
//	
//		Polygon p = new Polygon();
//         p.addPoint(x1 + 5, y1 + 25);
//         p.addPoint(x1 + 20, y1 + 10);
//         p.addPoint(x1 + 35, y1 + 25);
//         p.addPoint(x1 + 25, y1 + 25);
//         p.addPoint(x1 + 25, y1 + 45);
//         p.addPoint(x1 + 15, y1 + 45);
//         p.addPoint(x1 + 15, y1 + 25);
//         g.setColor(Color.YELLOW);
//         g.fillPolygon(p);
//		
//		 Polygon p2 = new Polygon();
//         p2.addPoint(x1 + 25, y1 + 73);
//         p2.addPoint(x1 + 41, y1 + 73);
//         p2.addPoint(x1 + 47, y1 + 58);
//         p2.addPoint(x1 + 53, y1 + 73);
//         p2.addPoint(x1 + 69, y1 + 73);
//         p2.addPoint(x1 + 56, y1 + 83);
//         p2.addPoint(x1 + 61, y1 + 98);
//         p2.addPoint(x1 + 47, y1 + 88);
//         p2.addPoint(x1 + 34, y1 + 98);
//         p2.addPoint(x1 + 38, y1 + 83);
//         g.setColor(Color.WHITE);
//         g.drawPolygon(p2);
		
		// Create Rectangles
		g.setColor(Color.red);
		g.fillRect(50,50, 300, 200);
		g.setColor(Color.WHITE);
		g.fillRect(50, 90, 300, 40);
		g.fillRect(50, 170, 300, 40);
		
		//Create Triangle
		Polygon triangulo = new Polygon();
			triangulo.addPoint(50, 50);
			triangulo.addPoint(200, 150);
			triangulo.addPoint(50, 250);
			g.setColor(Color.blue);
			g.fillPolygon(triangulo);
			
		//Create Star
		 Polygon estrella = new Polygon();
		 estrella.addPoint(x1 + 25, y1 + 73);
		 estrella.addPoint(x1 + 41, y1 + 73);
		 estrella.addPoint(x1 + 47, y1 + 58);
		 estrella.addPoint(x1 + 53, y1 + 73);
		 estrella.addPoint(x1 + 69, y1 + 73);
		 estrella.addPoint(x1 + 56, y1 + 83);
		 estrella.addPoint(x1 + 61, y1 + 98);
		 estrella.addPoint(x1 + 47, y1 + 88);
		 estrella.addPoint(x1 + 34, y1 + 98);
		 estrella.addPoint(x1 + 38, y1 + 83);
		 estrella.translate(60, 60);
		 g.setColor(Color.WHITE);
		 g.fillPolygon(estrella);
	}
}
