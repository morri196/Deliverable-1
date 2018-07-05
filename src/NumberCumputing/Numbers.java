import java.util.Scanner;

public class Numbers {
	public static void main(String [] args){
		Scanner scnr = new Scanner(System.in);
		int hundredsPlace;
		int tensPlace;
		int onesPlace;
		int hundredsPlace2;
		int tensPlace2;
		int onesPlace2;
		int totalA;
		int totalB;
		int totalC;
		boolean numCompatibility; //boolean because it is either true or false depending on computation
		
		hundredsPlace = scnr.nextInt();
		tensPlace = scnr.nextInt();
		onesPlace = scnr.nextInt();
		hundredsPlace2 = scnr.nextInt();
		tensPlace2 = scnr.nextInt();
		onesPlace2 = scnr.nextInt();
		// we will take input from user, which is random three digit number 
		
		System.out.println("Enter First Number:   " + (hundredsPlace + tensPlace + onesPlace));
		
		System.out.println("Enter Second Number:   " + (hundredsPlace2 + tensPlace2 + onesPlace2));
		
		//we then want to total numbers here to see if the totals for each number place matches
		totalA = hundredsPlace + hundredsPlace2;
		totalB = tensPlace + tensPlace2;
		totalC = onesPlace + onesplace2;
		
		
		/*I thought of doing a for loop but i didnt find it fitting (for (i = 0;i < 3; i++)) 
		 * instead I did and if/ else and initialized "numcompatibility" on a conditional basis*/
		
		if (totalA == totalB, totalB == totalC, totalA == totalC) {
			numCompatibility = True;}
			else {
				numCompatibility = false;
			}
		System.out.print(numCompatibility);
				
		
	}

}
