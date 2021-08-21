package com.bridgelabz1;
import java.util.Random;
class SnakeNLadder{

//SnakeNLadder game with single player at start position 0

public class SnakeNLaddergame {
	 public static void main(String[] args) {
		 
		 SnakeNLadder s = new SnakeNLadder();
		 s.Startposition = 0;
		 
	 }
//Roll of dice using RANDOM
	 
	 public int rollDice()
	 {
		 int n=0;
		 Random r = new Random();
		 n=r.nextInt(7);
		 return (n==0?1:n);
	 }
	 
	 
	
		
		
}		 		

}

