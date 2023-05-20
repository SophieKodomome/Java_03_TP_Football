package visuel;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.MouseListener;
import java.awt.event.*;
import vivant.*;
import football.*;
import java.util.concurrent.TimeUnit;

public class DessinMatch extends JComponent
{
	Ballon ballon;
	Match match;
	boolean[] collision;
	boolean possessionJoueur;
	int desactiveJoueur;
	int pause;

	public DessinMatch( Ballon b, Match match,Stat stat)
	{
		this.setBallon(b);
		this.setMatch(match);
		this.addKeyListener(new Clavier(this,stat));
		this.setFocusable(true);
		this.setCollision();
		this.setDesactiveJoueur();
		this.setPause();
	}

	public void setBallon(Ballon b){
		this.ballon=b;}
	public void setCollision(){
		this.collision=new boolean[24];}
	public void setDesactiveJoueur(){
		this.desactiveJoueur=1;
	}
	public void setPause(){
		this.pause=1;
	}
	public void setMatch(Match match){
		this.match=match;}
	public boolean[] getCollision(){
		return this.collision;}
	public boolean getPossessionJoueur(){
		return this.possessionJoueur;}
	public int getDesactiveJoueur(){
		return this.desactiveJoueur;
	}
	public Ballon getBallon(){
		return this.ballon;}
	public Match getMatch(){
		return this.match;}


	public void paint(Graphics gP){ 
		Graphics2D ballgraph = (Graphics2D) gP;

		Graphics2D but1= (Graphics2D) gP;
		Graphics2D but2= (Graphics2D) gP;
		Graphics2D terrain= (Graphics2D) gP;
		Graphics2D joueurs= (Graphics2D) gP;
		Rectangle hitbox= new Rectangle();
		Rectangle ballhitbox= new Rectangle(ballon.getx(),ballon.gety(),ballon.getTailleBallon(),ballon.getTailleBallon());
		Rectangle corneredge1= new Rectangle(getWidth()/2-100,100,10,getHeight()-200);
		Rectangle corneredge2= new Rectangle((getWidth()/2-100)+200,100,10,getHeight()-200);
		// 
		Color green = new Color(6, 214, 160);
		Color blue= new Color(17, 138, 178);
		Color cyan= new Color(7, 59, 76);
		Color red= new Color(239, 71, 111);
		terrain.setColor(green);
		terrain.fillRect(100,100,getWidth()-200,getHeight()-200);

		but1.setColor(cyan);
		but2.setColor(cyan);
		but1.fillRect(getWidth()/2-200,90,400,10);
		but2.fillRect(getWidth()/2-200,getHeight()-100,400,10);
		Rectangle hitbut1= new Rectangle(getWidth()/2-200,95,400,10);
		Rectangle hitbut2= new Rectangle(getWidth()/2-200,getHeight()-100,400,10);

		Joueur[] joueurHome=new Joueur[11];
		Joueur[] joueurAway=new Joueur[11]; 
		joueurHome = (Joueur[]) match.getHome().getListeOlona();
		joueurAway = (Joueur[]) match.getAway().getListeOlona();
		collision[22]= hitbut1.intersects(ballhitbox);
		collision[23]= hitbut2.intersects(ballhitbox);
		int j=0;
		int taillejoueur=25;
		for (int i=0;i<joueurHome.length;i++) {
			joueurs.setColor(blue);
			joueurs.fillRect(joueurHome[i].getXJoueur(getWidth()),joueurHome[i].getYJoueurHome(getHeight()),taillejoueur,taillejoueur);
			joueurs.drawString(joueurHome[i].getNom(),joueurHome[i].getXJoueur(getWidth()-5), joueurHome[i].getYJoueurHome(getHeight())+40);
			hitbox.setFrame(joueurHome[i].getXJoueur(getWidth()),joueurHome[i].getYJoueurHome(getHeight()),taillejoueur,taillejoueur);
			collision[i]= hitbox.intersects(ballhitbox);
			j=i+1;

		}
		for (int i=0;i<joueurAway.length;i++){
			joueurs.setColor(red);
			joueurs.fillRect(joueurAway[i].getXJoueur(getWidth()),joueurHome[i].getYJoueurAway(getHeight()-100),taillejoueur,taillejoueur);
			joueurs.drawString(joueurAway[i].getNom(),joueurAway[i].getXJoueur(getWidth()-5), joueurAway[i].getYJoueurAway(getHeight())-20);
			hitbox.setFrame(joueurAway[i].getXJoueur(getWidth()),joueurHome[i].getYJoueurAway(getHeight()-100),taillejoueur,taillejoueur);
			collision[j]= hitbox.intersects(ballhitbox);
			j++;
		}
		if(pause>0){
			repaint();
		}
		ballgraph.setColor(cyan);
		ballgraph.fillOval(ballon.getx(),ballon.gety(), ballon.getTailleBallon(), ballon.getTailleBallon());
		super.paint(ballgraph);
		if(pause>0){
		ballon.updateX();
		ballon.updateY();	
		}

		try{
			Thread.sleep(10);
		}catch(Exception e){}
		if(this.desactiveJoueur==1){

			//collision Joueur
			if(checkCollisionX(collision)==true && checkCollisionY(collision)==true){
				this.possessionJoueur=true;
				if(this.possessionJoueur==true){
				ballon.intercept();
				}
			}
		}
		else{
			if(ballon.getx()>=getWidth()/2-200 || ballon.getx()<=400)
			{
				if(corneredge1.intersects(ballhitbox)==true || corneredge2.intersects(ballhitbox)==true)
				{
					ballon.inverseXDirection();
				}
			}
		}
					//collision terrain
		if(ballon.getx()==getWidth()-100|| ballon.getx()==100){
			ballon.inverseXDirection();
		}
		if(ballon.gety()==getHeight()-100 || ballon.gety()==100){
			ballon.inverseYDirection();
		}
		if(collision[22]==true)
		{
			ballon.setX(getWidth());
			ballon.setY(getHeight());
			ballon.setDirection();
			this.match.addScoreHome();
			this.desactiverJoueur();
		}
		if(collision[23]==true)
		{
			ballon.setX(getWidth());
			ballon.setY(getHeight());
			ballon.setDirection();
			this.match.addScoreAway();
			this.desactiverJoueur();
		}
	}
	public boolean checkCollisionX(boolean[] collision){
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
	public boolean checkCollisionY(boolean[] collision){
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
	public boolean getFalsePossessionJoueur(){
		return this.possessionJoueur=false;
	}
	public int desactiverJoueur(){
		return this.desactiveJoueur=this.desactiveJoueur*-1;
	}
	public int pause(){
		return this.pause=this.pause*-1;
	}
}

