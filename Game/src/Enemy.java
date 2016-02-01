
public class Enemy
	{
		String Name;				
		int Health=100;
		
		public Enemy (String col, int a)
			{
				Name = col;						
				Health = a;
			}
		public static void main(String[] args)
			{
			
			}
		public String getName()
			{
				return Name;
			}
		public void setName(String name)
			{
				Name = name;
			}
		public int getHealth()
			{
				return Health;
			}
		public void setHealth(int health)
			{
				Health = health;
			}
	}
