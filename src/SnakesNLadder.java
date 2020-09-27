import java.util.Random;

public class SnakesNLadder {
	
	static final int ladder = 1, snake = 2;
	static int pos = 0, num_dice=0;

	public static int getNumber(int a){
		Random rand = new Random();
		int max =a;
		int num = rand.nextInt(max);

		return num;
	}

	public static int checkOptions() {
		int num = getNumber(3);
		return num;
	}

	public static void movement(int option, int steps){

		switch (option){
			case ladder:
				if(pos + steps <=100)
					pos += steps;
				break;
			case snake:
				if(pos -steps >= 0)
					pos -= steps;
				else
					pos = 0;
				break;
			default: 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(pos <= 100) {
			if(pos == 100)
				break;
			num_dice++;
			int num = getNumber(6) + 1;
			int option = checkOptions();
			movement(option, num);
			
			System.out.println("The current position is: "+pos);
		}
		System.out.println("The dice was rolled "+num_dice+ " times.");
	}

}
