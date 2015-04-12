package memory;


import java.awt.GridLayout;

import javax.swing.JPanel;



public class GameBoard extends JPanel {
	private java.util.ArrayList<String> upImages;
	private java.util.ArrayList<String> downImages;
	private java.util.ArrayList<Card> cards;
	
	private Card card1;
	private Card card2;
	private int state;
	private long time;
	private long finishTime;

	public GameBoard(){
		this.setLayout(new GridLayout(4,4));
		upImages = new java.util.ArrayList<String>();
		downImages = new java.util.ArrayList<String>();
		
		downImages.add("Images/B01.png");
		downImages.add("Images/B02.png");
		downImages.add("Images/B03.png");
		
		upImages.add("Images/F01.png");
		upImages.add("Images/F02.png");
		upImages.add("Images/F03.png");
		upImages.add("Images/F04.png");
		upImages.add("Images/F05.png");
		upImages.add("Images/F06.png");
		upImages.add("Images/F07.png");
		upImages.add("Images/F08.png");
		upImages.add("Images/F09.png");
		upImages.add("Images/F10.png");
		upImages.add("Images/F11.png");
		upImages.add("Images/F12.png");
		upImages.add("Images/F13.png");
		upImages.add("Images/F14.png");
		upImages.add("Images/F15.png");
		upImages.add("Images/F16.png");
		upImages.add("Images/F17.png");
		upImages.add("Images/F18.png");
		upImages.add("Images/F19.png");
		upImages.add("Images/F20.png");
		upImages.add("Images/F21.png");
		upImages.add("Images/F22.png");
		
		java.util.Collections.shuffle(upImages);
		java.util.Collections.shuffle(downImages);
		cards = new java.util.ArrayList<Card>();
		String s = downImages.get(0);
		for(int i = 0; i <= 7; i++){
			Card c1 = new Card(this,upImages.get(i),s);
			Card c2 = new Card(this,upImages.get(i),s);
			cards.add(c1);
			cards.add(c2);
		}
		
		java.util.Collections.shuffle(cards);
		
		for(int i = 0; i <= 15; i++){
			add(cards.get(i).getJLabel());
			add(cards.get(i).getJLabel());
			
		}
		state = 0;
		time = -1;
	}
	
	public void cardClicked(Card card){
		
		if(state == 0){
			if(time <= -1){
				time = System.currentTimeMillis();
			}
			card1 = card;
			card.flip();
			state = 1;
			}
		else if(state == 1){
			if(card1 != card){
				card2 = card;
				card.flip();
				state = 2;
			}
		}
		
		else if (state == 2){
			if(card1.equals(card2)){
				cards.remove(card1);
				cards.remove(card2);
				card1.Remove();
				card2.Remove();
				state = 0;
				if(cards.isEmpty()){
					finishTime = System.currentTimeMillis();
					System.out.println("Congrats! You won!!");
					System.out.println("It took you "+((finishTime-time)/1000)+" seconds.");
					System.exit(0);
				}
			}
			else{
				card1.flip();
				card2.flip();
				state = 0;
			}
		}

		
		
		
		}
	}

	
	

