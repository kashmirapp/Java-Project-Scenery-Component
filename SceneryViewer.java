package assignments;

import javax.swing.JFrame;

public class Scenery_Viewer {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("Scenic Beauty");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SceneryComponent component = new SceneryComponent();
		frame.add(component);
		
		frame.setVisible(true);
	
	}

}
