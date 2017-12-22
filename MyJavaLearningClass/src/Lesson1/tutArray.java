/**
 * 
 */
package Lesson1;

/**
 * @author User
 *
 */
public class tutArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray= {1,3,2,4,5};
		//java array can't assign my types of value in one array 
		//like it's not able to store int and decimal value in one aarray
		
		//System.out.println(myArray[0]); //induvidual array print in console
		int i=0;
		while(i<=4)
		{ //without count we have to count manually how many array quantity we have
			System.out.println(myArray[i]);
			i++;
		}

	}

}
