package visuel;

import javax.swing.*;
import java.awt.*;

public class But extends JComponent
{
	int x;
	int y;

	public But(){}

	public But(int x, int y)
	{
		this.setBut(x,y);
	}

	public void setBut(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public void paint(Graphics gP)
	{
		Graphics2D but = (Graphics2D) gP;
		super.paint(but);

		but.setColor(Color.BLACK);
		but.drawLine(x+10,y,x+10,y+300);
	}
}