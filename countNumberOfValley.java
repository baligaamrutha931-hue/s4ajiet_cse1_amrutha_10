// Count the number of valleys. 
// You are given a string that represent steps in combination of U and D characters.
// U represents to take a step up in level. 
// D represents to take a step down in level.

// You always start at sea level.
// A valley is a dip from sea level and back to sea level.
// Example:
// Input: UUDDDDUDUU
// Output = 1

// Explanation:
//                            *
//                         *    *
// Sea level __      *          *                    * __ sea level
//                                     *      *     *   
//                                         *     *      --> this is a valley, when reached back to sea level
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int balance = 0;
		int countValley=0;
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		for(char x:path.toCharArray()){
		    if(x=='U'){
		        balance++;
		        if(countValley==0){
		            countValley++;
		        }
		    }
		    if(x=='D'){
		        balance--;
		}
		
	}
	System.out.println(countValley);
}
}
