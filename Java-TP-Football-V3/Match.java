package  evenement;
import vivant.*;
import java.util.*;

public class Match
{
	Equipe home;
	Equipe away;
	GregorianCalendar date;
	Olona arbitre;
	int scorehome;
	int scoreaway;

	public Match(){}
	public Match(Equipe h, Equipe a, GregorianCalendar d, Olona a,int sh,int sa)
	{
		this.setHome(h);
		this.setAway(a);
		this.setDate(d);
		this.setArbitre(a);
		this.setScore(sh,0);
		this.setScore(sa,1);
	}

	public void setHome(Equipe h)
	{
		if(h==this.away)
		{
			System.out.println("Meme equipe");
		}
		else
		{
			this.away=a;			
		}

	}

	public void setDate(GregorianCalendar d)
	{
		this.date=d;
	}

	public void setArbitre(Olona a)
	{
		this.arbitre=a;
	}

	public int setScore(int s, int equipe)
	{
		if(equipe==0)
		{
			this.scoreHome=s;
		}
		else(equipe==1)
		{
			this.scoreAway=s;
		}
	}
}