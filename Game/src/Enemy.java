import java.util.ArrayList;

public class Enemy
	{
		String enemyName;				
		int enemyHealth;		
		Gun gun2;
		public Enemy (String col, int a, Gun idk)
			{
				enemyName = col;						
				enemyHealth = a;
				gun2 = idk;
			}
		public static void main(String[] args)
			{
				ArrayList <Enemy> enemies = new ArrayList <Enemy>();
				enemies.add (new Enemy("Manaquin",10,(COD.getGuns().getSpeed())));
				enemies.add (new Enemy("Recruit",50));
				enemies.add (new Enemy("Corpral",70));
				enemies.add (new Enemy("Sargent",90));
				enemies.add (new Enemy("Master Sargent",110));
				enemies.add (new Enemy("Captain",130));
				enemies.add (new Enemy("Cheif In Commander",150));		
				System.out.println("jake");
			}
		public String getName()
			{
				return enemyName;
			}
		public void setName(String name)
			{
			enemyName = enemyName;
			}
		public int getHealth()
			{
				return enemyHealth;
			}
		public void setHealth(int health)
			{
			enemyHealth = enemyHealth;
			}
	//milkshake
	}