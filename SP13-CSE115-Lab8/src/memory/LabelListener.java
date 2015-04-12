package memory;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LabelListener implements MouseListener {
	private Card card;

	
	public LabelListener(Card c){
		card = c;

}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//make call to filp in card
		card.clicked();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
