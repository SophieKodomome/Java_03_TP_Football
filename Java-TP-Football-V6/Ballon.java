package football;

public class Ballon
{
	int x;
	int y;
	int xdirection=1;
	int ydirection=1;
	public Ballon(){}
	public Ballon(int x,int y)
	{
		this.setx(x);
		this.sety(y);
	}

	public void setx(int x)
	{
		this.x=x/2;
	}

	public void sety(int y)
	{
		this.y=y/2;
	}

	public int getx()
	{
		return this.x;
	}

	public int gety()
	{
		return this.y;
	}


	public int getxdirection()
	{
		return this.xdirection;
	}


	public int getydirection()
	{
		return this.ydirection;
	}

	public int inversexdirection()
	{
		this.xdirection=this.xdirection * -1;
		return this.xdirection;
	}

	public int updatex()
	{
		this.x=this.x+this.xdirection;
		return this.x;
	}

	public int inverseydirection()
	{
		this.ydirection=this.ydirection * -1;
		return this.ydirection;
	}

	public int updatey()
	{
		this.y=this.y+this.ydirection;
		return this.y;
	}
}