/**
 * 
 */
package Lesson1;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class TutSwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int score=60;
		int score;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Type Score");
		score=scan.nextInt();
		switch(score)
		{
			case 100:
			case 95:
			case 90:
			System.out.println("Your Score is Very Good");
			break;
			
			case 80:
				System.out.println("Your Score is Good");
				break;
				
			case 70:
				System.out.println("Your Score is Average");
				break;
				
			case 60:
				System.out.println("Your Score is OK");
				break;
				
			default :
				System.out.println("Your Result is not Defined");
				break;
		}
				
	}

}
