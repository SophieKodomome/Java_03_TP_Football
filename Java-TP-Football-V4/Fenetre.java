package visuel;

import javax.swing.*;
import java.awt.*;


public class Fenetre extends JFrame
{
	public Fenetre()
	{
		setTitle("Football");
		setSize(800,600);
		this.setLayout(new GridLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.getContentPane().setLayout(new FlowLayout());
		Terrain terrain= new Terrain(100,100, new Ballon(),new But(10,300),new But(getWidth(),300));

		add(terrain);
		setVisible(true);
	}
}