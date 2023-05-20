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
		setSize((screenSize.width/4)*3,screenSize.height);
		// this.setLayout(new BorderLayout());
		this.setLayout(null);
		//this.getContentPane().setLayout(new FlowLayout());
		JLabel titre= new JLabel("Football");
		//JButton stopMatch = new JButton ("Stop The Match");
		Stat stat= new Stat();
		DessinMatch dessinMatch= new DessinMatch(new Ballon(getWidth(),getHeight()),match,stat);
		stat= new Stat(dessinMatch);
		dessinMatch= new DessinMatch(new Ballon(getWidth(),getHeight()),match,stat);
		add(dessinMatch);
		add(stat);
		add(titre);
		//add(stopMatch);
		dessinMatch.setBounds(50, 0, (screenSize.width/4)*3, screenSize.height);
		//stopMatch.setBounds(0,500,150,50);
		stat.setBounds(0, 0, 100, 200);
		titre.setBounds(0, 250, 50, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}