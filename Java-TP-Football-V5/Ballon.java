package visuel;

import javax.swing.*;
import java.awt.*;

public class Ballon extends JComponent
{
	int x=400;
	int y=300;
	int xdirection=1;
	int ydirection=1;


	public void paint(Graphics gP)
	{
		
		Graphics2D ballon = (Graphics2D) gP;
		super.paint(ballon);

		ballon.setColor(Color.BLACK);
		ballon.fillOval(x, y, 30, 30);
		//g.fill(new Rectangle(80, 80, 250, 250));
		//int i=1;
		repaint();

		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			
		}

		if(x==getWidth()-200 || x==200)
		{
			xdirection= xdirection * -1;
		}
			x = x + xdirection;
		if(y==getHeight()-200 ||y==200)
		{
			ydirection= ydirection * -1;	
		}
			y=y + ydirection;
		System.out.println(x+" "+y);
	}
}

