/**
 * 
 */
package Lesson1;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class Rectangale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalArea,rectangleHeight,rectangleWidth;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Input Your Rectangle Height = ");
		rectangleHeight=scan.nextDouble();
		
		//Scanner scan1=new Scanner(System.in);
		System.out.println("Please Input Your Rectangle Width = ");
		rectangleWidth=scan.nextDouble();
		
		totalArea=rectangleHeight*rectangleWidth;
		
		System.out.println("Your Area Total Is = "+totalArea);
		
		System.out.println("Have Fun :D");

	}

}
