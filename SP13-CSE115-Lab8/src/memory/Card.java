package memory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;





public class Card{

	private ImageIcon cardUp;
	private ImageIcon cardDown;
	private JLabel actualImage;
	private boolean holder;
	private GameBoard game;
	private LabelListener handler;

	public Card (GameBoard g, String upImages, String downImages){
		
		game = g;
		actualImage = new JLabel();
		cardUp = new ImageIcon(upImages);
		cardDown = new ImageIcon(downImages);
		handler = new LabelListener(this);
		actualImage.addMouseListener(handler);
		actualImage.setIcon(cardDown);
		holder = true;
	}
	
	public void clicked(){
		game.cardClicked(this);
		}
	
	public JLabel getJLabel(){
		return actualImage;
	}
	
	public void flip(){
		if(holder){
			actualImage.setIcon(cardUp);
			holder = false;
		}
		else{
			actualImage.setIcon(cardDown);
			holder = true;
		}
	}
	public void Remove(){
		actualImage.setIcon(null);
		actualImage.removeMouseListener(handler);
	}
	public boolean equals(Card cd){
		String s1 = actualImage.getIcon().toString();
		String s2 = cd.getJLabel().getIcon().toString();
		return s1 == s2;
	}
}
		




