/**
 * 
 */
package Lesson1;

/**
 * @author User
 *
 */
public class TutcreateMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showStatichello(); //simple method
		showwitParam("Fakhrul"); //method with string param
		showwitParamSum(12,13); //method with int param and math
		int sum=showwitParamSumReturn(2,3); // calling function with return of int typw
		System.out.println(sum); // showing sum of method
	}
	
	public static void showStatichello()
	{
		System.out.println("Hi Fahad");
	}
	
	public static void showwitParam(String name)
	{
		System.out.println("Hi "+name);
	}

	public static void showwitParamSum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static int showwitParamSumReturn(int a, int b)
	{
		//System.out.println(a+b);
		return (a+b);
	}

}
