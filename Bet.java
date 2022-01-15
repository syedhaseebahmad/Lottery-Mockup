package myLottery;
import java.util.ArrayList;
public class Bet {

    protected ArrayList<Integer> userNumbers= new ArrayList();
    protected ArrayList<Integer> goodNumbers= new ArrayList();
    protected ArrayList<Integer> commonNumbers= new ArrayList();
	
    protected int betAmount;
	
	
	Tolo t= new Tolo();
	protected int WinAmount= 0;
	
	
	public Bet(String a1, String a2, String a3, String a4, String betString)
	{
		// TODO Auto-generated constructor stub
		
	//converting values from textfield to integers and adding them to the array userNumbers
//	
		userNumbers.add(Integer.parseInt(a1));
		userNumbers.add(Integer.parseInt(a2));
		userNumbers.add(Integer.parseInt(a3));
		userNumbers.add(Integer.parseInt(a4));
		// taking bet value from textfield 
		betAmount= Integer.parseInt(betString);
	// taking the lottery numbers from tolo class
		goodNumbers= (ArrayList<Integer>) t.winningNumbers;
		
		// comparing the input numbers of user with the lottery numbers and making a new arraylist
			for (int j=0; j<goodNumbers.size();j++) {
				if (userNumbers.contains(goodNumbers.get(j))) {
					commonNumbers.add(goodNumbers.get(j));	
					}
			}
	
		
		
			
	}
	
	public void computeGain() {
	// gives the gain for two conditions
		
		// we use the size of commonNumbers as a key for our conditions 
		int key =commonNumbers.size();
		//switch is use to make code flexible in case we want to introduce new conditions for gain
		switch (key) {
		case 3: {
		    WinAmount = betAmount*5;
		    break;
		}
		case 4: {
			WinAmount = betAmount*50;
			break;
				}
		default:
			WinAmount=0;
		
		}
		
	}
}