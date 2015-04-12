package memory;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Game implements Runnable {
	
	@Override public void run() {
		JFrame frame = new JFrame("SP13-CSE115-Lab8-Memory Game");
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Game());
	}
}