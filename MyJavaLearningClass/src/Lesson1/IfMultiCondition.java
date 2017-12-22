/**
 * 
 */
package Lesson1;

/**
 * @author User
 *
 */
public class IfMultiCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		
		int subjectOne=30;
		int subjectTwo=50;
		
		if((subjectOne>=35) && (subjectTwo>=35)) // check all condition is true
		{
			System.out.println("Multi Condition statement is true.");
		}
		else
		{
			System.out.println("Multi Condition is false");;
		}
		
		if((subjectOne>=35) || (subjectTwo>=35)) //check whatever one is true 
		{
			System.out.println("Multi Condition statement is true.");
		}
		else
		{
			System.out.println("Multi Condition is false");;
		}

	}

}
