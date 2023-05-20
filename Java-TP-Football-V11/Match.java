package  football;
import vivant.*;
import java.util.*;

public class Match
{
	Equipe home;
	Equipe away;
	GregorianCalendar date;
	Olona arbitre;
	int scoreHome=0;
	int scoreAway=0;

	public Match(){}
	public Match(Equipe h, Equipe a, GregorianCalendar d, Olona ar){
		this.setHome(h);
		this.setAway(a);
		this.setDate(d);
		this.setArbitre(ar);
	}

	public void setHome(Equipe h){
		this.home=h;			
	}

	public void setAway(Equipe a){
		if(a==this.home)
		{
			System.out.println("Meme equipe");
		}
		else
		{
			this.away=a;			
		}

	}
	public void setScoreHome(int h)
	{
		this.scoreHome=h;
	}

	public void setScoreAway(int a)
	{
		this.scoreAway=a;
	}

	public void setDate(GregorianCalendar d){
		this.date=d;
	}

	public void setArbitre(Olona ar){
		this.arbitre=ar;
	}

	public Equipe getHome(){
		return this.home;
	}

	public Equipe getAway(){
		return this.away;
	}
	public int getScoreHome(){
		return this.scoreHome;
	}

	public int getScoreAway(){
		return this.scoreAway;
	}

	public int addScoreHome(){
		this.scoreHome=this.scoreHome+1;

		return this.scoreHome;
	}


	public int addScoreAway(){
		this.scoreAway=this.scoreAway+1;

		return this.scoreAway;
	}
}