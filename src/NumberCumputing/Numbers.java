import java.util.Scanner;
//NumberCompatibility *Spell Check*
public class Numbers {
	public static void main(String [] args){
	Scanner scnr = new Scanner(System.in);
		
		int userInput1;
		int userInput2;
		int stCount;
		int i;
		String userInputtxt1;
		String userInputtxt2;
		char[] userInputtxt1AR;
		char[] userInputtxt2AR;
		boolean ansEqual = true;
	
		System.out.println("Enter First Three Digit Number:   ");
		userInput1 = scnr.nextInt();
		
		System.out.println("Enter Second Three Digit Number:   ");
		userInput2 = scnr.nextInt();
		
		userInputtxt1 = Integer.toString(userInput1);//converts interger to string
		userInputtxt2 = Integer.toString(userInput2);
		
		stCount = userInputtxt1.length(); //set string count
		userInputtxt1AR = userInputtxt1.toCharArray();//those 20 characters now goes into my array
		
		stCount = userInputtxt2.length(); 
		userInputtxt2AR = userInputtxt2.toCharArray();
		
		if (userInputtxt1.length() != userInputtxt2.length()) { //this prevents user invalid entry
			System.out.println("Invalid Entry");
		}
		else {
			
		

		for (i = 0; i < stCount-1; i = i + 1) { // stCount-1 because we dont want the loop to exceed array size
			userInput1 = Character.getNumericValue(userInputtxt1AR[i]);//this statement converts char to int
			userInput2 = Character.getNumericValue(userInputtxt2AR[i]);
			
			if (Character.getNumericValue(userInputtxt1AR[i]) + Character.getNumericValue(userInputtxt2AR[i]) != 
					Character.getNumericValue(userInputtxt1AR[i + 1]) + Character.getNumericValue(userInputtxt2AR[i + 1])) {
		ansEqual = false; //the if statement is saying if each corresponding placevalue is not equal to ach other then false
			}
		}
			if (ansEqual) { // has ansEqual ever had the value "false", if not print "true"
			System.out.println("True"); 
			}
			else {
				System.out.println("false"); //or print false
			}
			
			
		
		}		
	}

}
