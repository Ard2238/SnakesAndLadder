import java.util.Random;

public class SnakesNLadder {
	
	static final int ladder = 1, snake = 2;
	int pos = 0, dice_moves=0, numondice = 0, option = 0;

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

	public void movement(int option, int steps){

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
		
		
		SnakesNLadder p1= new SnakesNLadder();
		SnakesNLadder p2= new SnakesNLadder();

		while( p1.pos<=100 || p2.pos<=100){

			if(p1.pos== 100 || p2.pos ==100)
				break;
			p1.numondice = getNumber(6) + 1;
			p2.numondice = getNumber(6) + 1;

			p1.option = checkOptions();	
			p1.movement(p1.option, p1.numondice);
			p1.dice_moves++;

			while(p1.option == ladder){
				p1.option = checkOptions();	
				p1.movement(p1.option, p1.numondice);
				p1.dice_moves++;
			}

			p2.option = checkOptions();	
			p2.movement(p2.option, p2.numondice);
			p2.dice_moves++;

			while(p2.option == ladder){
				p2.option = checkOptions();	
				p2.movement(p1.option, p1.numondice);
				p2.dice_moves++;
			}

			System.out.println("The current position of p1 is " + p1.pos);
			System.out.println("The current position of p2 is " + p2.pos);
		}

		if(p2.pos == 100){
			System.out.println("The dice was rolled " + p2.dice_moves + " times.");
			System.out.println("P2 is the Winner !!");
		}else{
			System.out.println("The dice was rolled " + p1.dice_moves + " times.");
			System.out.println("P1 is the Winner !!");
		}		
	}

}
