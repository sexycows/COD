import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class COD
	{
	static String name; 
	static ArrayList <Gun> guns = new ArrayList <Gun>();
	static JFrame frame = new JFrame();
		public static void main(String[] args)
		{
			 guns.add(new Gun  ("AK-47",150,5,50));
			 guns.add(new Gun  ("Sniper",15,15,100));
			 guns.add(new Gun  ("Rapid",1000,50,5));
			 guns.add(new Gun  ("Spoon",200000000,1,9000));
			
			Player newPlayer = new Player ("memelord",100, (guns.get(0)));
			System.out.println(guns.get(0).getName());
			name = JOptionPane.showInputDialog("What is your name?");  
			JOptionPane.showMessageDialog(frame, "Hi, " + name);
			
			
			
			final String[] genre = { "AK-47", "Sniper", "Rapid", "Spoon" };
			{
				final JFrame frame = new JFrame();
				String favoritePizza = (String) JOptionPane.showInputDialog(frame, "What gun would you like to choose?","Adventure Genre",JOptionPane.QUESTION_MESSAGE,  null, genre, genre[0]);
				
    				switch(favoritePizza)
    					{
    						case "AK-47":
    						{
    							Player.setGun1(guns.get(0));   		
    							System.out.println(Player.getGun1().getName());    				
    							break;
    						}
    						case "Sniper":
    	    						{
    	    							Player.setGun1(guns.get(1));   		
    	    							System.out.println(Player.getGun1().getName());    				
    	    							break;
    	    						}
    						case "Rapid":
    	    						{
    	    							Player.setGun1(guns.get(2));   		
    	    							System.out.println(Player.getGun1().getName());    				
    	    							break;
    	    						}
    						case "Spoon":
    	    						{
    	    							Player.setGun1(guns.get(3));   		
    	    							System.out.println(Player.getGun1().getName());    				
    	    							break;
    	    						}
    						}			
    				if(Player.getGun1().getSpeed() > Enemy.getGun1().getSpeed())
					}
			}
		public static ArrayList<Gun> getGuns() 
			{
				return guns;
			}
			
		public static void setGuns(ArrayList<Gun> guns)
			{
				guns = guns;
			}
			
	}