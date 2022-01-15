package myLottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Tolo {

	protected List<Integer> winningNumbers = new ArrayList<>();
	protected Random rnd = new Random();
	protected int superNumber= rnd.nextInt(10)+1;
	// we can use this number to test the program
//	int superNumber=7;
	
	public Tolo() {
		// TODO Auto-generated constructor stub
	 getWinningNumbers();
	
		
	}
	
	public void getWinningNumbers(){
		// we can use these numbers to test the program
//		winningNumbers.add(1);
//		winningNumbers.add(2);
//		winningNumbers.add(3);
//		winningNumbers.add(4);
	// making an array of random integers that don't repeat	 the same number
	for(int i=0;i<5;i++) {
			
			while(true) {	
				int winningNumber = rnd.nextInt(20)+1;
				if (!winningNumbers.contains(winningNumber)) {
					winningNumbers.add(winningNumber);
					break;
				   }
			             }
				             }



}
}

	
