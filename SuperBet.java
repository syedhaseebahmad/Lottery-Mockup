package myLottery;
import java.util.Random;
public class SuperBet extends Bet{
	
	//declaring variables

	protected int superNumber= t.superNumber; 
	protected int userSuperNumber;
	
	
// introducing new super bet string in constuctor for our super bet
	public SuperBet(String a1, String a2, String a3, String a4, String betString, String userSuper){
		super(a1, a2, a3, a4, betString);
		//taking super number from textfield
		userSuperNumber = Integer.parseInt(userSuper);		
		// TODO Auto-generated constructor stub
		
	}
//modifying compute gain method for super bet
	public void computeGain(){
		//System.out.println(commonNumbers); 
		int key = commonNumbers.size();	
		
		System.out.println(key);
		
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
		// using if condition in case super number matches, this condition runs everytime
		// it works because if switch conditions are not met winAmount is 0
		// we could have used switch but the code becomes lengthy :)
		if (userSuperNumber ==superNumber) {
			WinAmount = WinAmount*5;
		}
		
	}
	
	
	}
	


