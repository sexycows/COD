import java.util.ArrayList;

public class Gun
	{
		private static String name; 
		private static int ammunation ;
		private static int speed;
		private static int damage;
		static ArrayList <Gun> guns = new ArrayList <Gun>();
		
		public Gun (String col, int a, int buns,int hi)
		{
			name = col;				
			ammunation = a;
			speed = buns;
			damage = hi;
		}
		public static void main(String[] args)
		{
		 guns.add(new Gun  ("AK-47",150,5,50));
		 guns.add(new Gun  ("Sniper",15,15,100));
		 guns.add(new Gun  ("Rapid",1000,50,5));
		 guns.add(new Gun  ("Spoon",200000000,1,9000));
		}
	public static String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public static ArrayList<Gun> getGuns() 
	{
		return guns;
	}
	
	public static void setGuns(ArrayList<Gun> guns)
	{
		Gun.guns = guns;
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
