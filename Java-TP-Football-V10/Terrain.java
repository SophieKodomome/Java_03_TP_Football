package visuel;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.MouseListener;
import java.awt.event.*;
import vivant.*;
import football.*;
import java.util.concurrent.TimeUnit;

public class Terrain extends JComponent
{
	Ballon ballon;
	Match match;
	boolean[] collision;

	public Terrain( Ballon b, Match match)
	{
		this.setBallon(b);
		this.setMatch(match);
		this.addKeyListener(new Clavier(this));
		this.setFocusable(true);
		collision= new boolean[24];
	}

	public void setBallon(Ballon b)
	{
		this.ballon=b;
	}
	public boolean[] getCollision()
	{
		return this.collision;
	}
	public Ballon getBallon()
	{
		return this.ballon;
	}
	public Match getMatch()
	{
		return this.match;
	}

	public void setMatch(Match match)
	{
		this.match=match;
	}

	public void paint(Graphics gP)
	{ 	int tailleballon=20;
		Graphics2D ballgraph = (Graphics2D) gP;

		Graphics2D but1= (Graphics2D) gP;
		Graphics2D but2= (Graphics2D) gP;
		Graphics2D terrain= (Graphics2D) gP;
		Graphics2D joueurs= (Graphics2D) gP;
		Rectangle hitbox= new Rectangle();
		Rectangle ballhitbox= new Rectangle(ballon.getx(),ballon.gety(),tailleballon,tailleballon);
		// 
		Color green = new Color(6, 214, 160);
		Color blue= new Color(17, 138, 178);
		Color cyan= new Color(7, 59, 76);
		Color red= new Color(239, 71, 111);
		terrain.setColor(green);
		terrain.fillRect(100,100,getWidth()-200,getHeight()-200);

		but1.setColor(cyan);
		but2.setColor(cyan);
		but1.fillRect(getWidth()/2-100,90,200,10);
		but2.fillRect(getWidth()/2-100,getHeight()-100,200,10);
		Rectangle hitbut1= new Rectangle(100,getWidth()/2-100,200,10);
		Rectangle hitbut2= new Rectangle(getWidth()/2-100,getHeight()-100,200,10);

		Joueur[] joueurHome=new Joueur[11];
		Joueur[] joueurAway=new Joueur[11];
		joueurHome = (Joueur[]) match.getHome().getListeOlona();
		joueurAway = (Joueur[]) match.getAway().getListeOlona();
		collision[22]= hitbut1.intersects(ballhitbox);
		collision[23]= hitbut2.intersects(ballhitbox);
		int j=0;
		int taillejoueur=25;
		for (int i=0;i<joueurHome.length;i++ ) 
		{
			joueurs.setColor(blue);
			joueurs.fillRect(joueurHome[i].getXJoueur(getWidth()),joueurHome[i].getYJoueurHome(getHeight()),taillejoueur,taillejoueur);
			joueurs.drawString(joueurHome[i].getNom(),joueurHome[i].getXJoueur(getWidth()-5), joueurHome[i].getYJoueurHome(getHeight())+40);
			hitbox.setFrame(joueurHome[i].getXJoueur(getWidth()),joueurHome[i].getYJoueurHome(getHeight()),taillejoueur,taillejoueur);
			collision[i]= hitbox.intersects(ballhitbox);
			j=i+1;

		}
		for (int i=0;i<joueurAway.length;i++ )
		{
			joueurs.setColor(red);
			joueurs.fillRect(joueurAway[i].getXJoueur(getWidth()),joueurHome[i].getYJoueurAway(getHeight()-100),taillejoueur,taillejoueur);
			joueurs.drawString(joueurAway[i].getNom(),joueurAway[i].getXJoueur(getWidth()-5), joueurAway[i].getYJoueurAway(getHeight())-20);
			hitbox.setFrame(joueurAway[i].getXJoueur(getWidth()),joueurHome[i].getYJoueurAway(getHeight()-100),taillejoueur,taillejoueur);
			collision[j]= hitbox.intersects(ballhitbox);
			j++;
		}
		repaint();
		ballgraph.setColor(cyan);
		ballgraph.fillOval(ballon.getx(),ballon.gety(), tailleballon, tailleballon);
		super.paint(ballgraph);
		ballon.updateX();
		ballon.updateY();

		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{

		}
		//collision terrain
		if(ballon.getx()==getWidth()-100|| ballon.getx()==100)
		{
			ballon.inverseXDirection();
		}
		if(ballon.gety()==getHeight()-100 || ballon.gety()==100)
		{
			ballon.inverseYDirection();
		}

		//collision Joueur
		if(checkCollisionX(collision)==true && checkCollisionY(collision)==true)
		{
			ballon.intercept();
		}

		/*if(checkBut(collision)==true)
		{
			ballon.setX(getWidth());
			ballon.setY(getHeight());
		}*/

	/*public void mousePressed(MouseEvent e) 
	{

		if(e.getX()==this.home[0].getXJoueurHome(this.terrain.getWidth()) && e.getY()==this.home[1].getYJoueur(this.terrain.getHeight()) 
			|| e.getX()==this.away[0].getXJoueurHome(this.terrain.getHeight()) && e.getY()==this.away[1].getYJoueur(this.terrain.getHeight())) 
		{
			System.out.println("Yup");
		}
	
	}*/
	}
	public boolean checkBut(boolean[] collision)
	{
		boolean butCheck= false;
		if(collision[22]==true || collision[23]==true)
		{
			butCheck= true;
		}
		return butCheck;
	}
	public boolean checkCollisionX(boolean[] collision)
	{
		boolean xCollisionCheck= false;
		if( collision[0]==true || collision[1]==true || collision[2]==true || collision[3]==true || collision[4]==true
			|| collision[5]==true || collision[6]==true || collision[7]==true || collision[8]==true || collision[9]==true 
			|| collision[10]==true|| collision[11]==true || collision[12]==true || collision[13]==true || collision[14]==true 
			|| collision[15]==true || collision[16]==true || collision[17]==true || collision[18]==true || collision[19]==true 
			|| collision[20]==true || collision[21]==true)
			{
				xCollisionCheck= true;
			}
		return xCollisionCheck;
	}

	public boolean checkCollisionY(boolean[] collision)
	{
		boolean yCollisionCheck= false;
		if( collision[0]==true || collision[1]==true || collision[2]==true || collision[3]==true || collision[4]==true
			|| collision[5]==true || collision[6]==true || collision[7]==true || collision[8]==true || collision[9]==true 
			|| collision[10]==true|| collision[11]==true || collision[12]==true || collision[13]==true || collision[14]==true 
			|| collision[15]==true || collision[16]==true || collision[17]==true || collision[18]==true || collision[19]==true 
			|| collision[20]==true || collision[21]==true)
			{
				yCollisionCheck= true;
			}
		return yCollisionCheck;
	}
}

