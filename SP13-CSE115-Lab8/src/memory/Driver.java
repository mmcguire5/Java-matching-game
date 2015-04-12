package memory;

import javax.swing.JFrame;

public class Driver {
	public static void main(String[] args) {
		JFrame window;
		window = new JFrame ("Mike McGuire - CSE115 - Lab7");
		window.add(new GameBoard());
		window.pack();
		window.setVisible(true);
		
	}
}
