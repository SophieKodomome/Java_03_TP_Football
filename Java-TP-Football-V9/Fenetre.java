package visuel;

import javax.swing.*;
import java.awt.*;
import football.*;

public class Fenetre extends JFrame
{
	public Fenetre(Match match)
	{
		setUndecorated(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setTitle("Football");
		setSize(screenSize.width-(screenSize.width/2),screenSize.height);
		// this.setLayout(new BorderLayout());
		this.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.getContentPane().setLayout(new FlowLayout());
		JLabel titre= new JLabel("Football");
		Stat stat= new Stat(match);
		Terrain terrain= new Terrain(new Ballon(getWidth(),getHeight()),match);
		add(terrain); //,BorderLayout.CENTER
		add(stat); //,BorderLayout.WEST
		add(titre); //,BorderLayout.SOUTH
		terrain.setBounds(50, 0, screenSize.width/2, screenSize.height);
		stat.setBounds(0, 0, 100, 150);
		titre.setBounds(0, 250, 50, 50);
		setVisible(true);
	}
}