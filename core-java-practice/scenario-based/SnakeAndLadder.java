package senerio_based;

public class SnakeAndLadder {
	
	// Use Case 2: Roll the dice (1 to 6)
	public static int playerRolls() {
		return (int)((Math.random()*6)+1);
	}
	
	// Use Case 3: Check option (No Play, Ladder, Snake)
	public static String checkOption() {
		int rand = (int)(Math.random() * 3);
		if (rand == 0) {
			return "No Play";
		} 
		else if (rand == 1) {
			return "Ladder";
		}
		else {
			return "Snake";
		} 
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder game");
		
		// Use Case 1: Initialize player positions to 0
		int player1pos =0;
		int player2pos =0;
		
		// Use Case 6: Count number of dice rolls
		int diceCount = 0;
		int MAX_DICE_ROLLS = 100;
		
		// Use Case 7: Decide starting player
		boolean isPlayer1Turn = true;
	
		// Use Case 4 & 5: Play until one player reaches position 100
		while(player1pos<100 && player2pos<100 && diceCount<MAX_DICE_ROLLS) {
			
			// Roll the dice
			int dicenumber = playerRolls();
			
			// Check game option
			String option = checkOption();
			diceCount++;
			
			// Player 1 turn
			if(isPlayer1Turn) {
				System.out.println("Player 1 rolled the dice : " + dicenumber);
				
				// No Play condition
				if(option.equals("No Play")) {
					// Player stays at same position
				}
				
				// Ladder condition
				else if(option.equals("Ladder")){
					if(player1pos+dicenumber<=100) {
						player1pos+=dicenumber;
					}
					System.out.println("Player 1 position :"+player1pos);
					
					// Player gets another chance
					continue;
				}
				
				// Snake condition
				else {
					player1pos-=dicenumber;
					if(player1pos<0) {
						player1pos=0;
					}
					System.out.println("Player 1 position :"+player1pos);
				}
				
				// Switch turn to Player 2
				isPlayer1Turn = false;
			}
			
			// Player 2 turn
			else {
				System.out.println("Player 2 rolled the dice : " + dicenumber);
				
				// No Play condition
				if(option.equals("No Play")) {
					// Player stays at same position
				}
				
				// Ladder condition
				else if(option.equals("Ladder")){
					if(player2pos+dicenumber<=100) {
						player2pos+=dicenumber;
					}
					System.out.println("Player 2 position :"+player2pos);
					
					// Player gets another chance
					continue;
				}
				
				// Snake condition
				else {
					player2pos-=dicenumber;
					if(player2pos<0) {
						player2pos=0;
					}
					System.out.println("Player 2 position :"+player2pos);
				}
				
				// Switch turn to Player 1
				isPlayer1Turn = true;
			}
		}

		// Use Case 8: Declare winner
		if (player1pos == 100)
            System.out.println("Player 1 Wins the game ");
        else
            System.out.println("Player 2 Wins the game ");

        // Display total dice rolls
        System.out.println("Total Dice Rolls: " + diceCount);
	}
}
