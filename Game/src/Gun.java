import java.util.ArrayList;

public class Gun
	{
		private  String name; 
		private  int ammunation ;
		private  int speed;
		private  int damage;
		
		
		public Gun (String col, int a, int buns,int hi)
		{
			name = col;				
			ammunation = a;
			speed = buns;
			damage = hi;
		}
		public  void main(String[] args)
		{
		
		}
	public  String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	

	public int getAmmunation()
		{
			return ammunation;
		}
	
	public void setAmmunation(int ammunation)
		{
			ammunation = ammunation;
		}

	public int getSpeed()
		{
			return speed;
		}

	public void setSpeed(int speed)
		{
			this.speed = speed;
		}

	public int getDamage()
		{
			return damage;
		}

	public void setDamage(int damage)
		{
			this.damage = damage;
		}
		
	}
