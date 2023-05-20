package visuel;

import java.awt.event.KeyListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Clavier implements KeyListener
{
	DessinMatch champdaction;
	Stat stat;
	char toucheclavier;

	public Clavier(DessinMatch dessinMatch,Stat stat)
	{
		this.setChampdaction(dessinMatch);
		this.setStat(stat);
	}

	public void setChampdaction(DessinMatch dessinMatch)
	{
		this.champdaction=dessinMatch;
	}

	public void setStat(Stat stat)
	{
		this.stat=stat;
	}

	public void keyPressed(KeyEvent touche){
		boolean checkT=false;
		boolean checkM=false;
		boolean checkC=false;
		if(touche.getKeyChar()=='t')
		{
			checkT=true;
		}
		if(touche.getKeyChar()=='m')
		{
			checkM=true;
		}
		if(touche.getKeyChar()=='c')
		{
			checkC=true;
		}
		if (checkT==true && checkM==false && checkC==false && this.champdaction.getPossessionJoueur()==true)
		{
			this.champdaction.getBallon().passe(this.champdaction);
			this.champdaction.getFalsePossessionJoueur();
			this.champdaction.setDesactiveJoueur();
		}
		if(checkM==true && this.champdaction.getPossessionJoueur()==true)
		{
			this.champdaction.desactiverJoueur();
			this.champdaction.getBallon().passe(this.champdaction);
			this.champdaction.getFalsePossessionJoueur();
		}
		if(checkC==true)
		{
			this.champdaction.getBallon().setCorner();
		}
		if(touche.getKeyChar()==' ' || this.stat.getMinute()==3)
		{
			this.champdaction.pause();
			this.stat.pause();
		}
		if(touche.getKeyChar()=='x')
		{
			this.stat.reset();
			this.champdaction.getBallon().setX(this.champdaction.getWidth());
			this.champdaction.getBallon().setY(this.champdaction.getHeight());
			this.champdaction.getBallon().setDirection();
			this.champdaction.setDesactiveJoueur();
		}
	}

		public void keyTyped(KeyEvent k)
		{}
	public void keyReleased(KeyEvent touche)
	{	
		boolean checkT=false;
		boolean checkM=false;
		boolean checkC=false;
		if(touche.getKeyChar()=='t')
		{
			checkT=false;
		}
		if(touche.getKeyChar()=='m')
		{
			checkM=false;
		}
		if(touche.getKeyChar()=='c')
		{
			checkC=false;
		}
	}
}