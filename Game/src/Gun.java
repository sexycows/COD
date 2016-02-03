
public class Gun
	{
		private String name; 
		private int ammunation, speed,damage ;
		public Gun (String col, int a, int buns,int hi)
			{
				name = col;				
				ammunation = a;
				speed = buns;
				damage=hi;
			}
		
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				name = name;
			}
		public int getAmmunation()
			{
				return ammunation;
			}
		public void setAmmunation(int ammunation)
			{
				ammunation = ammunation;
			}

		public static void main(String[] args)
		{
			 Gun AK=new Gun  ("AK-47",150,5,50);
			 Gun Sniper=new Gun  ("Sniper",15,15,100);
			 Gun Rapid=new Gun  ("Rapid",1000,50,5);
			 Gun Spoon=new Gun  ("Spoon",200000000,1,9000);
		}
		
	}
