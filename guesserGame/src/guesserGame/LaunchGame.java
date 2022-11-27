package guesserGame;


import java.util.Scanner;

class Guesser{
	
	private int guessNum;
	
	public int guessNum() {
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			
			System.out.println("Guesser kindly guess the number between 1 to 10 both inclusive:");
			guessNum=scan.nextInt();
			
			if(guessNum<1 || guessNum>10) {
				continue;
			}
			
			return guessNum;
			
		}
		
		
	}
}


class Player{
	
private int guessNum;
	
	public int guessNum(int i) {
		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Player"+i+" kindly guess the number between 1 to 10 both inclusive:");
			guessNum=scan.nextInt();
			if(guessNum<1 || guessNum>10) {
				continue;
			}
			
			return guessNum;
		}
		
	}
}

class Umpire{
	
	private int numFromGuesser;
	private int numFromPlayer1;
	private int numFromPlayer2;
	private int numFromPlayer3;
	
	void collectNumFromGuesser() {
		
		Guesser guess=new Guesser();
		numFromGuesser=guess.guessNum();
		
	}
	
	void collectFromPlayer() {
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessNum(1);
		numFromPlayer2=p2.guessNum(2);
		numFromPlayer3=p3.guessNum(3);
		
	}
	
	void compare() {
		
		int g=numFromGuesser;
		int a=numFromPlayer1;
		int b=numFromPlayer2;
		int c=numFromPlayer3;
		
		if(a==g) {
			if(b==g && c==g) {
				System.out.println("Winner Player1, Player2 & Player 3");
			}else if(b==g) {
				System.out.println("Winner Player1 & Player2");
			}else if(c==g) {
				System.out.println("Winner Player1 & Player3");
			}else {
				System.out.println("Winner Player1");
			}
		}else if(b==g) {
			if(c==g) {
				System.out.println("Winner Player2 & Player3");
			}else {
				System.out.println("Winner Player2");
			}
		}else if(c==g) {
			System.out.println("Winner Player3");
		}else {
			System.out.println("No Winner");
		}
	}
}



public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Umpire umpire=new Umpire();
		umpire.collectNumFromGuesser();
		umpire.collectFromPlayer();
		umpire.compare();
	}

}
