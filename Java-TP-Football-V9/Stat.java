package visuel;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import football.*;

public class Stat extends JComponent
{
	int millisecond=0;
	int second;
	int scoreHome;
	int scoreAway;

	public Stat(Match match)
	{
		this.setScoreHome(match);
		this.setScoreAway(match);
	}

	public void setScoreHome(Match m)
	{
		if(m.getScoreHome()<0)
		{
			this.scoreHome=0;
		}
		else
		{
			this.scoreHome=m.getScoreHome();
		}
	}

	public void setScoreAway(Match m)
	{
		if(m.getScoreAway()<0)
		{
			this.scoreAway=0;
		}
		else
		{
			this.scoreAway=m.getScoreAway();
		}
	}
	public void paint(Graphics g)
	{
		millisecond++;
		if(millisecond==100)
		{
			millisecond=0;
			second++;
		}
		Graphics2D chronograph=(Graphics2D) g;
		Graphics2D score=(Graphics2D) g;
		repaint();
		chronograph.setColor(Color.BLACK);
		chronograph.drawString(""+second,10,45);
		chronograph.setColor(Color.BLACK);
		chronograph.drawString("Chrono",10,20);

		score.setColor(Color.BLACK);
		score.drawString("Score",10,90);
		score.drawString("Home",10,110);
		score.drawString(""+this.scoreHome,60,110);
		score.drawString("Away",10,130);
		score.drawString(""+this.scoreAway,60,130);
		super.paint(chronograph);
		super.paint(score);
	}
}