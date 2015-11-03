import java.util.Random;

public class RandomNumberDiceGame {
public static void main(String args[]){
	
		Random dice = new Random();
		int number;
		
		for(int counter = 1; counter <= 5; counter++){
				number = 1+ dice.nextInt(6);
				System.out.println(number + " ");
				
		}
	
	}
}
