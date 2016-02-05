import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class COD
	{
	static String name; 
	static JFrame frame = new JFrame();
		public static void main(String[] args)
		{
			//Player newPlayer = new Player ("memelord",100, (Gun.guns.get(0)));
System.out.println(Gun.guns.get(0));
			name = JOptionPane.showInputDialog("What is your name?");  
			JOptionPane.showMessageDialog(frame, "Hi, " + name);
			
			
			
			final String[] genre = { "AK-47", "Sniper", "Rapid", "Spoon" };
			{
				final JFrame frame = new JFrame();
				String favoritePizza = (String) JOptionPane.showInputDialog(frame, "What gun would you like to choose?","Adventure Genre",JOptionPane.QUESTION_MESSAGE,  null, genre, genre[0]);
				
//    				switch(favoritePizza)
//    					{
//    						case "AK-47":
//    						{
//    							Player.setGun1(Gun.guns.get(0).getName());
//    							
//    							break;
//    						}
//    					}
//				if (favoritePizza=="AK-47")
//				{
//					System.out.println(Player.getGun1());
//				}
			}
		}
	}