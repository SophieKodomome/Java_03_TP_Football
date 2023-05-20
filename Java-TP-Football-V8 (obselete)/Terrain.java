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

	public boolean ConditionUpdateXDirection(Joueur[] equipeHome,Joueur[] equipeAway)
	{
		boolean collision=true;
		if(ballon.getX()==getWidth()-100 || ballon.getX()==100)
		{
			collision=true;
		}
		else
		{
			collision=false;
		}
		return collision;
	}

	public void paint(Graphics gP)
	{
		
		Graphics2D ballgraph = (Graphics2D) gP;
		Graphics2D but1= (Graphics2D) gP;
		Graphics2D but2= (Graphics2D) gP;
		Graphics2D terrain= (Graphics2D) gP;
		Graphics2D joueurs= (Graphics2D) gP;
		// 
		terrain.setColor(Color.GREEN);
		terrain.fillRect(100,100,getWidth()-200,getHeight());
		but1.setColor(Color.BLACK);
		but2.setColor(Color.BLACK);
		but1.fillRect(100,(getHeight()/2)-100,10,300);
		but2.fillRect(getWidth()-100,(getHeight()/2)-100,10,300);

		Joueur[] equipeHome=new Joueur[11];
		Joueur[] equipeAway=new Joueur[11];
		equipeHome = (Joueur[]) match.getHome().getListeOlona();
		equipeAway = (Joueur[]) match.getAway().getListeOlona(); 
		for (int i=0;i<equipeHome.length;i++ ) 
		{
			joueurs.setColor(Color.BLUE);
			joueurs.fillOval(equipeHome[i].getXJoueurHome(getWidth()),equipeHome[i].getYJoueur(getHeight()),40,40);

		}
		for (int i=0;i<equipeAway.length;i++ ) 
		{
			joueurs.setColor(Color.RED);
			joueurs.fillOval(equipeAway[i].getXJoueurAway(getWidth()),equipeHome[i].getYJoueur(getHeight()),40,40);

		}
		super.paint(ballgraph);

		ballgraph.setColor(Color.BLACK);
		ballgraph.fillOval(ballon.getX(),ballon.getY(), 30, 30);
		repaint();

		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
				
		}

		;
		if(ConditionUpdateXDirection()==true)
		{
			ballon.inverseXDirection();
		}
			ballon.updateX();
		if(ballon.getY()==getHeight() || ballon.getY()==100)
		{
			ballon.inverseYDirection();
		}
			ballon.updateY();
		//
	}
}

