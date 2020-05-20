package assignments;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/** 
 * 
 * @author KashmiraPuranik
 *
 */

public class Scenery_Component extends JComponent {
	public void paintComponent(Graphics g)
	{
		
		
		Graphics2D g2 = (Graphics2D) g;
		int x = 540;
		int y = 200;
		Scenery Scenery1 = new Scenery(x,y);
				
				
				Scenery1.draw(g2);
	}
	

}

