import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class COD
	{
	
	static JFrame frame = new JFrame();
		public static void main(String[] args)
		{
			final String[] genre = { "AK-47", "Sniper", "Rapid", "Spoon" };
			{
				final JFrame frame = new JFrame();
				String favoritePizza = (String) JOptionPane.showInputDialog(frame, "What gun would you like to choose?","Adventure Genre",JOptionPane.QUESTION_MESSAGE,  null, genre, genre[0]);
    				switch(favoritePizza)
    					{
    						case "AK-47":
    						{
    							Player.getGun1 (Gun.getGuns());
    							break;
    						}
    					}
			}
		}
	}
//for (int i=0; i<4;i++)
//{
//	 if (Player.guns.get(i).getName()=="heart")
//		{
//			Deck.deck.get(i).setSuit("♡");
//		}
//	 else if (Deck.deck.get(i).getSuit()=="diamond")
//		{
//			Deck.deck.get(i).setSuit("♢");
//		}
//	 else if (Deck.deck.get(i).getSuit()=="club")
//		{
//			Deck.deck.get(i).setSuit("♧");
//		}
//	 else if (Deck.deck.get(i).getSuit()=="spade")
//		{
//			Deck.deck.get(i).setSuit("♤");
//		}
//		
//}