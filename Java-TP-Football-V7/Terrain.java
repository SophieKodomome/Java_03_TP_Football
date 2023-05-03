package visuel;

import javax.swing.*;
import java.awt.*;
import vivant.*;
import football.*;

public class Terrain extends JComponent
{
	Ballon ballon;
	Match match;


	public Terrain( Ballon b, Match match)
	{
		this.setBallon(b);
		this.setMatch(match);
	}

	public void setBallon(Ballon b)
	{
		this.ballon=b;
	}

	public void setMatch(Match match)
	{
		this.match=match;
	}

	public void paint(Graphics gP)
	{
		
		Graphics2D ballgraph = (Graphics2D) gP;
		Graphics2D but1= (Graphics2D) gP;
		Graphics2D but2= (Graphics2D) gP;
		Graphics2D equipe= (Graphics2D) gP;
		// 
		but1.setColor(Color.BLACK);
		but2.setColor(Color.BLACK);
		but1.fillRect(200,(getHeight()/2)-100,10,300);
		but2.fillRect(getWidth()-200,(getHeight()/2)-100,10,300);
		Joueur joueurtest= (Joueur) match.getHome().getOneOlona(0);

		equipe.setColor(Color.BLUE);
		equipe.fillOval(joueurtest.getXJoueur(),joueurtest.getYJoueur(),40,40);
		super.paint(ballgraph);

		ballgraph.setColor(Color.BLACK);
		ballgraph.fillOval(ballon.getx(),ballon.gety(), 30, 30);
		repaint();

		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
				
		}

		if(ballon.getx()==getWidth()-200 || ballon.getx()==200)
		{
			ballon.inversexdirection();
		}
			ballon.updatex();
		if(ballon.gety()==getHeight()-100 || ballon.gety()==100)
		{
			ballon.inverseydirection();
		}
			ballon.updatey();
		//
		System.out.println(ballon.getx()+" "+ballon.gety());
	}
}

