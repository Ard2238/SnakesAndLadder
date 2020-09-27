import java.util.Random;

public class SnakesNLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int max = 6;
		int num = rand.nextInt(max) + 1;
		
		System.out.println("The number obtained on rolling the dice is: "+ num);
	}

}
