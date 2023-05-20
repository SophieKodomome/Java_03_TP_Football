package vivant;

public class Coach extends Olona
{
	int experience;
	double salaire;

	public Coach()
	{
		super();
	}

	public Coach(int e,double s)
	{
		super();
		this.setExperience(e);
		this.setSalaire(s);
	}

	public void setSalaire(double s)
	{
		this.salaire = s;
	}

	public void setExperience(int exp){ 
		this.experience = exp;
	}

	public int getExp()
	{
		return this.experience;
	}


	public double getSalaire()
	{
		return this.salaire;
	}
}