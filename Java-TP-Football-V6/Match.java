package  football;
import vivant.*;
import java.util.*;

public class Match
{
	Equipe home;
	Equipe away;
	GregorianCalendar date;
	Olona arbitre;
	int scoreHome;
	int scoreAway;

	public Match(){}
	public Match(Equipe h, Equipe a, GregorianCalendar d, Olona ar,int sh,int sa)
	{
		this.setHome(h);
		this.setAway(a);
		this.setDate(d);
		this.setArbitre(ar);
		this.setScore(sh,0);
		this.setScore(sa,1);
	}

	public void setHome(Equipe h)
	{
		this.home=h;			
	}

	public void setAway(Equipe a)
	{
		if(a==this.home)
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

	public void setArbitre(Olona ar)
	{
		this.arbitre=ar;
	}

	public void setScore(int s, int equipe)
	{
		if(equipe==0)
		{
			this.scoreHome=s;
		}
		if(equipe==1)
		{
			this.scoreAway=s;
		}
	}

	public Equipe getHome()
	{
		return this.home;
	}

	public Equipe getAway()
	{
		return this.away;
	}
	public int getScoreHome()
	{
		return this.scoreHome;
	}

	public int getScoreAway()
	{
		return this.scoreAway;
	}
}