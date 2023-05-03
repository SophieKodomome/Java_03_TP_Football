package vivant;

public class Joueur extends Olona
{
	double salaire;
	int poste;
	String numero;
	int efficacite;
	int x;
	int y;

	public Joueur()
	{}

	public Joueur(double s, String n, int p,int e)
	{
		super.setNom();
		
		this.setSalaire(s);
		this.setPoste(p);
		this.setNumero(n);
		this.setEfficacite(e);
	}

	public void setSalaire(double s){
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

}