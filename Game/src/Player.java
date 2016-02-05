import java.util.ArrayList;

public class Player
	{
		static String playerName;				
		static int health=100;		
		static Gun gun1;
		
	
		static public void player (String col, int a, Gun b)
			{
				playerName = col;						
				health = a;
				gun1 = b;
			}
		public static void main(String[] args)
			{			
				 
			}
		
		public Gun getG()
		{
			return gun1;
		}
		
		public void setG(Gun g) 
		{
			this.gun1 = g;
		}
		
		public String getPlayerName()
			{
				return playerName;
			}
		public void setPlayerName(String PlayerName)
			{
				PlayerName = PlayerName;
			}
		public int getHealth()
			{
				return health;
			}
		public static void setHealth(int health)
			{
				health = health;
			}
		public static void getGun1(ArrayList<Gun> guns) {
			// TODO Auto-generated method stub
			
		}
		

		
	}