package visuel;

import javax.swing.*;
import java.awt.*;

public class Terrain extends JPanel
{
	int hauteur;
	int largeur;
	Ballon ball;
	But but1; 
	But but2;


	public Terrain(){}

	public Terrain(int h, int l, Ballon b,But b1, But b2)
	{
		this.setLayout(new GridLayout());
		this.setHauteur(h);
		this.setLargeur(l);
		//this.setSize(this.getHauteur(), this.getLargeur());
		//
		this.setBut1(b1);
		this.setBut2(b2);
		this.setBall(b);
		//add
		this.add(this.getBut1());
		//this.add(this.getBut2());
		this.add(this.getBall());
		//this.setBackground(Color.GREEN);

		this.setVisible(true);

	}

	public void setBall(Ballon b){
		this.ball=b;
	}

	public void setBut1(But b1)
	{
		this.but1=b1;
	}

	public void setBut2(But b2)
	{
		this.but2=b2;
	}

	public void setHauteur(int h){
		this.hauteur=h;
	}

	public void setLargeur(int l){
		this.largeur=l;
	}

	public Ballon getBall(){
		return this.ball;
	}

	public But getBut1()
	{
		return this.but1;
	}

	public But getBut2()
	{
		return this.but2;
	}

	public int getHauteur(){
		return this.hauteur;
	}

	public int getLargeur(){
		return this.largeur;
	}
}