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


	public int getXDirection()
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
		this.xdirection=1;
		this.xdirection=this.xdirection * -1;
		return this.xdirection;
	}

	public int inverseYDirection()
	{
		this.ydirection=1;
		this.ydirection=this.ydirection * -1;
		return this.ydirection;
	}

	public void intercept()
	{
		this.ydirection=0;
		this.xdirection=0;
		System.out.println("intercept");
	}
	public int changeXDirection()
	{
		this.xdirection=aleatoireXDirection(-1,1);
		this.xdirection=this.xdirection * -1;
		return this.xdirection;
	}

	public double changeYDirection()
	{
		this.ydirection=aleatoireYDirection(-1,1);
		this.ydirection=this.ydirection * -1;
		return this.ydirection;
	}


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