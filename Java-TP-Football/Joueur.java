package vivant;
import vivant.Olona;

public class Joueur extends Olona
{
	double salaire;
	String poste;
	int numero;

	public Joueur(double s, String p, int n)
	{
		this.salaire=s;
		this.poste=p;
		this.numero=n;
	}

	public void setJoueur(double s, String p, int n)
	{
		this.salaire=s;
		this.poste=p;
		this.numero=n;
	}

	public double getSalaire()
	{
		return this.salaire;
	}

	public String getPoste()
	{
		return this.poste;
	}

	public double getNumero()
	{
		return this.numero;
	}

}