package vivant;
import vivant.Olona;

public class Coach extends Olona
{
	int experience;
	double salaire;

	public coach(int e,double s)
	{
		this.experience=e;
		this.salaire=s;
	}

	public void setCoach(int e,double s)
	{
		this.experience=e;
		this.salaire=s;
	}

	public int getExp()
	{
		return this.experience;
	}


	public int getSalaire()
	{
		return this.salaire;
	}
}