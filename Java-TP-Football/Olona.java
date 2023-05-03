package vivant;
public class Olona
{
	String nom;
	int age;
	char sex;

	public Olona(String n, int a, char s)
	{
		this.nom= n;
		this.age= a;
		this.sex= s;
	}

	public void setOlona(String n, int a, char s)
	{
		this.nom= n;
		this.age= a;
		this.sex= s;
	}

	public String getNom()
	{
		return this.nom;
	}


	public int getAge()
	{
		return this.age;
	}

	public char getSex()
	{
		return this.sex;
	}
}