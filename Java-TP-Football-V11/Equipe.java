package vivant;

public class Equipe
{
	Olona[] listeOlona;
	String pays;

	public Equipe(Olona [] listeOlona, String pays){
		this.setlisteOlona(listeOlona);
		this.setPays(pays);
	}

	public void setlisteOlona(Olona[] listeOlona){
		this.listeOlona=listeOlona;
	}

	public void setPays(String pays){
		this.pays=pays;
	}
	public String getPays(){
		return this.pays;
	}
	
	public Olona[] getListeOlona(){
		return this.listeOlona;
	}
	
	public Olona getOneOlona(int i){
		return this.listeOlona[i];
	}
}