package football;

import java.util.*;
import visuel.*;

public class Ballon
{
	int x;
	int y;
	int tailleBallon;
	int xdirection=1;
	int ydirection=1;
	public Ballon(){}
	public Ballon(int x,int y){
		this.setX(x);
		this.setY(y);
		this.setTailleBallon();
		this.setDirection();
	}

	public void setX(int x){
		this.x=x/2;
	}

	public void setY(int y){
		this.y=y/2;
	}
	public void resetX(int x){
		x=0;
	}
	public void resetY(int y){
		y=0;
	}
	public void setDirection()
	{
		int aleatoireX=sensAleatoireX(-1,1);
		int aleatoireY=sensAleatoireY(-1,1);
		while(aleatoireX==0)
		{
			aleatoireX=sensAleatoireX(-1,1);
		}
		while(aleatoireY==0)
		{
			aleatoireY=sensAleatoireY(-1,1);
		}
		while(this.xdirection==0)
		{
			this.xdirection=1;
		}

		while(this.ydirection==0)
		{
			this.ydirection=1;
		}
		this.xdirection=this.xdirection*aleatoireX;
		this.ydirection=this.ydirection*aleatoireY;
	}
	public void setTailleBallon(){
		this.tailleBallon=20;
	}
	public int getx(){
		return this.x;
	}

	public int gety(){
		return this.y;
	}


	public int getXDirection(){
		return this.xdirection;
	}


	public int getYDirection(){
		return this.ydirection;
	}
	public int getTailleBallon(){
		return this.tailleBallon;
	}

	public int sensAleatoireX(int min,int max){
		Random aleatoire=new Random(System.currentTimeMillis());
		return aleatoire.nextInt((max-min)+1)+min;
	}

	public int sensAleatoireY(int min,int max){
		Random aleatoire=new Random(System.currentTimeMillis());
		return aleatoire.nextInt((max-min)+1)+min;
	}


	public int inverseXDirection(){
		this.xdirection=this.xdirection * -1;
		return this.xdirection;
	}

	public int inverseYDirection(){
		this.ydirection=this.ydirection * -1;
		return this.ydirection;
	}

	public void intercept(){
		this.ydirection=0;
		this.xdirection=0;
	}

	public void passe(DessinMatch dessinMatch){
		int aleatoireX=sensAleatoireX(-1,1);
		int aleatoireY=sensAleatoireY(-1,1);
		this.x=this.x+this.tailleBallon*aleatoireX;
		this.y=this.y+this.tailleBallon*aleatoireY;
		this.xdirection=1*aleatoireX;
		this.ydirection=1*aleatoireY;
	}
	/*public int changeXDirection()
	{
		this.xdirection=aleatoireXDirection(-1,1);
		this.xdirection=this.xdirection * -1;
		return this.xdirection;
	}

	public int changeYDirection()
	{
		this.ydirection=aleatoireYDirection(-1,1);
		this.ydirection=this.ydirection * -1;
		return this.ydirection;
	}*/

	public Ballon setCorner()
	{
		this.x=100;
		this.y=100;
		this.xdirection=1;
		this.ydirection=1;
		return this;
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