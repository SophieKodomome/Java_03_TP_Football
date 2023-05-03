import vivant.*;
public class Function
{
	public void show_team(Equipe team)
	{
		for(int i=0; i<team.listeOlona.length; i++)
		{
			if (team.listeOlona[i] instanceof Joueur) 
			{
				System.out.println(team.listeOlona[i].getNom);
			}
		}
	}
}