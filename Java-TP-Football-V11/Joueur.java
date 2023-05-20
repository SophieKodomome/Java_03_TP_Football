package vivant;

public class Joueur extends Olona
{
	double salaire;
	int poste;
	String numero;
	int efficacite;

	public Joueur()
	{
	}

	public Joueur(String nom,double s, String n, int p,int e){
		super.setNom(nom);
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

	public int getYJoueurHome(int profondeurduterrain)
	{
		int y=0;
		if(this.poste==1)
		{
			y=(profondeurduterrain/9)+20;
		}

		if(this.poste>1 && this.poste<6)
		{
			y=(profondeurduterrain/9)*2;
		}

		if(this.poste>5 && this.poste<10)
		{
			y=(profondeurduterrain/9)*3;
		}
		if(this.poste>9)
		{
			y=(profondeurduterrain/9)*4;
		}
		return y;
	}

	public int getYJoueurAway(int profondeurduterrain)
	{
		int y=0;
		if(this.poste==1)
		{
			y=(profondeurduterrain/9)*8;
		}

		if(this.poste>1 && this.poste<6)
		{
			y=(profondeurduterrain/9)*7;
		}

		if(this.poste>5 && this.poste<10)
		{
			y=(profondeurduterrain/9)*6;
		}
		if(this.poste>9)
		{
			y=(profondeurduterrain/9)*5;
		}
		return y;
	}

	public int getXJoueur(int largeurduterrain)
	{
		int x=0;
		if(this.poste==1)
		{
			x=largeurduterrain/2;
		}
		if(this.poste==2 || this.poste==6)
		{
			x=largeurduterrain/5;
		}
		if(this.poste==3 || this.poste==7)
		{
			x=(largeurduterrain/5)*2;
		}
		if(this.poste==4 || this.poste==8)
		{
			x=(largeurduterrain/5)*3;
		}
		if(this.poste==5 || this.poste==9)
		{
			x=(largeurduterrain/5)*4;
		}
		if(this.poste==10)
		{
			x=largeurduterrain/3;
		}
		if(this.poste==11
	)
		{
			x=(largeurduterrain/3)*2;
		}
		return x;
	}

}