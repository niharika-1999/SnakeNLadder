package com.bridgelabz1;
import java.util.Random;
class SnakeNLadder
{
	final static winpoint = 100;

//SnakeNLadder game with single player at start position 0

public class SnakeNLaddergame {
	 public static void main(String[] args) {
		 
		 SnakeNLadder s = new SnakeNLadder();
		 s.Startposition = 0;
		 System.out.println("Starting position = 0");
		 
	 }
//Roll of dice using RANDOM
	 
	 public int rollDice()
	 {
		 int n=0;
		 Random r = new Random();
		 n=r.nextInt(7);
		 return (n==0?1:n);
		 System.out.println("Press r to roll dice");
	 }
//Player Checks for option
	 
	 public int PlayerValue(int player , int dicevalue)
	 {
		 player=player+dicevalue;
		 if(null!=Noplay.get(player))
		 {
			 System.out.println("Stays in same position");
			 player = Noplay.get(player);
		 }
		 if(null!=snake.get(player))
		 {
			 System.out.println("Moves behind");
			 player = snake.get(player);
		 }
		 if(null!=Ladder.get(player))
		 {
			 System.out.println("Moves ahead");
			 player = Ladder.get(player);
		 }
		 return player;
	 }
				 
	 
 //Value for Player reaching winning position
	 if(player>winpoint)
	 {
		 player = player - dicevalue;
	 }
//Winning Position 100
	 public int isWin(int player)
	 {
		 return winpoint == player;
	 }
	
		
		
}		 		

}
}

