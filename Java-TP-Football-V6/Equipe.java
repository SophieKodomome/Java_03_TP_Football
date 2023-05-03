package vivant;

public class Equipe
{
	Olona[] listeOlona;

	public Equipe(Olona [] listeOlona)
	{
		this.setlisteOlona(listeOlona);
	}

	public void setlisteOlona(Olona[] listeOlona)
	{
		this.listeOlona=listeOlona;
	}
	
	public Olona[] getListeOlona()
	{
		return this.listeOlona;
	}
	
	public Olona getOneOlona(int i)
	{
		return this.listeOlona[i];
	}
}