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
		this.setX(x);
		this.setY(y);
	}

	public void setX(int x)
	{
		this.x=x/2;
	}

	public void setY(int y)
	{
		this.y=y/2;
	}

	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}


	public int getxDirection()
	{
		return this.xdirection;
	}


	public int getYDirection()
	{
		return this.ydirection;
	}

	public int inverseXDirection()
	{
		this.xdirection=this.xdirection * -1;
		return this.xdirection;
	}

	public int updateX()
	{
		this.x=this.x+this.xdirection;
		return this.x;
	}

	public int inverseYDirection()
	{
		this.ydirection=this.ydirection * -1;
		return this.ydirection;
	}

	public int updateY()
	{
		this.y=this.y+this.ydirection;
		return this.y;
	}
}