/**
 * 
 */
package Lesson1;

/**
 * @author User
 *
 */
public class TutWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<=10) //asc format
		{
			System.out.println(i);
			i++;
		}
		System.out.println("----------------------------------------");
		while(i>=0) //DESC format
		{
			System.out.println(i);
			i--;
		}
		System.out.println("---------------Do While-------------------------");
		int b=0;
		do {
			System.out.println(b);
			b++;
		}while(b<=10);
		

	}

}
