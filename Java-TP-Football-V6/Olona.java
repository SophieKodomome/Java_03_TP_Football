package vivant;
public class Olona
{
	String nom;
	int age;
	char sex;

	public Olona(){}

	public Olona(String n, int a, char s)
	{
		this.setNom(n);
		this.setAge(a);
		this.setSex(s);
	}

	public void setNom(String n){
		this.nom = n;
	}

	public void setAge(int a){
		if(age<0){
			System.out.println("Aiz e! Mbola ts teraka v less d efa adalainlah le...");
		}
		else{
			this.age = a;
		}
	}

	public void setSex(char s)
	{
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