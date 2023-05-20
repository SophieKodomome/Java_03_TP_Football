package visuel;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import football.*;

public class Stat extends JComponent
{
	int millisecond=0;
	int second;
	int minute;
	DessinMatch dessinMatch;
	public Stat(){}
	public Stat(DessinMatch d)
	{
		this.setDessinMatch(d);
	}

	public void setDessinMatch(DessinMatch d){
		this.dessinMatch=d;
	}
	public void setMilliseconde(int m){
		this.millisecond=0;
	}
	public void setSeconde(int s){
		this.second=s;
	}
	public void setMinute(int m){
		this.minute=m;
	}
	public int getMinute(){
		return this.minute;
	}
	public DessinMatch getDessinMatch()
	{
		return this.dessinMatch;
	}

	public void paint(Graphics g){
		millisecond++;
		if(millisecond==50)
		{
			millisecond=0;
			second++;
		}
		if(second==60)
		{
			second=0;
			minute++;
		}
		Graphics2D chronograph=(Graphics2D) g;
		Graphics2D score=(Graphics2D) g;
		repaint();
		chronograph.setColor(Color.BLACK);
		chronograph.drawString("Seconde"+second,10,65);
		chronograph.drawString("Minute"+minute,10,45);
		chronograph.setColor(Color.BLACK);
		chronograph.drawString("Chrono",10,20);

		score.setColor(Color.BLACK);
		score.drawString("Score",10,90);
		score.drawString(""+dessinMatch.getMatch().getHome().getPays(),10,110);
		score.drawString(""+this.dessinMatch.getMatch().getScoreHome(),60,110);
		score.drawString(""+dessinMatch.getMatch().getAway().getPays(),10,130);
		score.drawString(""+this.dessinMatch.getMatch().getScoreAway(),60,130);
		super.paint(chronograph);
		super.paint(score);
	}

	public Stat reset(){
		
		this.dessinMatch.getMatch().setScoreHome(0);
		this.dessinMatch.getMatch().setScoreAway(0);
		this.setSeconde(0);
		this.setMilliseconde(0);
		this.setMinute(0);
		this.dessinMatch.getBallon().updateX();
		this.dessinMatch.getBallon().updateY();
		return this;
	}
}