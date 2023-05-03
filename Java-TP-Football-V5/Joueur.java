package vivant;

public class Joueur extends Olona
{
	double salaire;
	int poste;
	String numero;
	int efficacite;
	int positionx;
	int positiony;

	public Joueur()
	{
		super();
	}

	public Joueur(double s, String n, int p,int e)
	{
		this.setSalaire(s);
		this.setPoste(p);
		this.setNumero(n);
		this.setEfficacite(e);
	}

	public void setSalaire(double s)
	{
		this.salaire = s;
	}

	public void setPoste(int p)
	{
		this.poste = p;
	}

	public void setNumero(String n)
	{
		this.numero = n;
	}

	public void setEfficacite(int e)
	{
		this.efficacite=e;
	}

	public double getSalaire()
	{
		return this.salaire;
	}

	public int getPoste()
	{
		return this.poste;
	}

	public String getNumero()
	{
		return this.numero;
	}

	public int getEfficacite()
	{
		return this.efficacite;
	}

	public int getx()
	{
		return this.positionx;
	}
	public void setPositionx(int x)
	{
		this.positionx=x;
	}

	public int gety()
	{
		return this.positiony;
	}
	public void setPositiony(int y)
	{
		this.positiony=y;
	}

}