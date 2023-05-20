package football;

import java.util.*;

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

	public int getx()
	{
		return this.x;
	}

	public int gety()
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

	public int aleatoireXDirection(int min,int max)
	{
		Random aleatoire=new Random(System.currentTimeMillis());
		return aleatoire.nextInt((max-min)+1)+min;
	}

	public int aleatoireYDirection(int min,int max)
	{
		Random aleatoire=new Random(System.currentTimeMillis());
		return aleatoire.nextInt(max-min);
	}


	public int inverseXDirection()
	{
		this.xdirection=this.xdirection * -1;
		return this.xdirection;
	}

	public double inverseYDirection()
	{
		this.ydirection=this.ydirection * -1;
		return this.ydirection;
	}

	/*public int changeXDirection()
	{
		this.xdirection=this.xdirection * aleatoireXDirection(-1,1);
		return this.xdirection;
	}

	public double changeYDirection()
	{
		this.ydirection=this.ydirection * aleatoireYDirection(-1,1);
		return this.ydirection;
	}*/


	public int updateX()
	{
		this.x=this.x+this.xdirection;
		return this.x;
	}

	public int updateY()
	{
		this.y=this.y+this.ydirection;
		return this.y;
	}

}