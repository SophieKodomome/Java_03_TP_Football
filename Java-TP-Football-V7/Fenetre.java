package visuel;

import javax.swing.*;
import java.awt.*;
import football.*;

public class Fenetre extends JFrame
{
	public Fenetre(Match match)
	{
		setTitle("Football");
		setSize(800,600);
		this.setLayout(new GridLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.getContentPane().setLayout(new FlowLayout());
		Terrain terrain= new Terrain(new Ballon(getWidth(),getHeight()),match);

		add(terrain);
		setVisible(true);
	}
}