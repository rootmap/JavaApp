/**
 * 
 */
package Lesson1;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Some Number : ");
		int userNumber=scan.nextInt();
		System.out.println("User Entered Number is : ");
		System.out.println(userNumber);
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please Input Some Double / Decimal Value : ");
		double userDouble=scan1.nextDouble();
		System.out.println("User Double Inputed value is = ");
		System.out.println(userDouble);
		
		Scanner scan2=new Scanner(System.in);
		System.out.println("Please Input Some String : ");
		String userString=scan2.nextLine();
		System.out.println("Your Inputed String is : ");
		System.out.println(userString);
		
		//printing data from user
		
		
		
	}

}
