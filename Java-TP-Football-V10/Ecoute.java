package visuel;
import java.awt.event.MouseListener;
import java.awt.event.*;
import java.awt.*;
import visuel.*;
import football.*;
import vivant.*;

public abstract class Ecoute implements MouseMotionListener,MouseListener
{
	
	Terrain terrain;
	Joueur[] home;
	Joueur[] away;
	public Ecoute(Terrain t,Joueur[] h,Joueur[] a)
	{
		terrain=t;
		home=h;
		away=a;

	}
	 
	 public void mousePressed(MouseEvent e) 
	{

		/*if(e.getX()==this.home[0].getXJoueurHome(this.terrain.getWidth()) && e.getY()==this.home[1].getYJoueur(this.terrain.getHeight()) 
			|| e.getX()==this.away[0].getXJoueurHome(this.terrain.getHeight()) && e.getY()==this.away[1].getYJoueur(this.terrain.getHeight())) 
		{
			System.out.println("Yup");
		}*/
	}
	
	 


}