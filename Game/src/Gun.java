
public class Gun
	{
		private String name, set; 
		private int ammunation, speed ;
		public Gun (String col, String cl, int a, int buns)
			{
				name = col;
				set = cl;
				ammunation = a;
				speed = buns;
			}
		
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				name = name;
			}
		public String getset()
			{
				return set;
			}
		public void setset(String class1)
			{
				set = class1;
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
			 Gun AK=new Gun  ("AK-47", "LMG",150,5);
			 Gun Sniper=new Gun  ("AK-47", "LMG",15,15);
			 Gun Rapid=new Gun  ("AK-47", "LMG",1000,50);
			 Gun Spoon=new Gun  ("AK-47", "LMG",150,5);
		}
		
	}
