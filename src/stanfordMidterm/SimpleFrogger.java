package stanfordMidterm;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class SimpleFrogger extends GraphicsProgram{
	
	private static final int SQUARE_SIZE = 75;
	private static final int NROWS = 4;
	private static final int NCOLUMNS = 7;
	public static final int APPLICATION_WIDTH = NCOLUMNS * SQUARE_SIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQUARE_SIZE;
	GImage frog;
	private double frogX; 
	private double frogY; 
	
	public void run() {
		 frog = new GImage("frog.gif");
		 frogY = (NROWS - 0.5) * SQUARE_SIZE;
		 frogX = (NCOLUMNS / 2 + 0.5) * SQUARE_SIZE;
		 add(frog, frogX - frog.getWidth() / 2,
		  frogY - frog.getHeight() / 2);
		 addMouseListeners();
	}
	public void MouseClicked(MouseEvent e) {
		double y = e.getY();
		double x = e.getX();
		
	
		
		if(Math.abs(x - frogX) > Math.abs(y-frogY)) {
			if (x <= frogX) {
				moveF(-SQUARE_SIZE, 0);
			} else {
				moveF(SQUARE_SIZE, 0);
			}
		} else {
			if (y <= frogY) {
				moveF(0 , -SQUARE_SIZE);
			} else {
				moveF(0, SQUARE_SIZE);
			}
		}
	}
	
	public boolean checkMove(double x, double y) {
		if  (x >= 0 && x <= NCOLUMNS * SQUARE_SIZE && y >= 0 && y <= NROWS * SQUARE_SIZE);{
			return true;
		} 
	}
	public void moveF(double x, double y) {
		if (checkMove(frogX + x, frogY + y)) {
			frogX += x;
			frogY += y;
			frog.move(x, y);
			}
	}
	
	
	
	
}
