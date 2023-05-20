package visuel;

import java.awt.event.KeyListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Clavier implements KeyListener
{
	Terrain champdaction;

	public Clavier(Terrain t)
	{
		this.setChampdaction(t);
	}

	public void setChampdaction(Terrain t)
	{
		this.champdaction=t;
	}

	public void keyTyped(KeyEvent touche)
	{
		char toucheclavier=touche.getKeyChar();
		if (toucheclavier=='t' && this.champdaction.checkCollisionX(this.champdaction.getCollision())==true && this.champdaction.checkCollisionY(this.champdaction.getCollision())==true)
		{
			this.champdaction.getBallon().inverseYDirection();
			System.out.println(toucheclavier);
		}
	}

		public void keyPressed(KeyEvent k)
		{

		}
	public void keyReleased(KeyEvent k)
	{
	}
}