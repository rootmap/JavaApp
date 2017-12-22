/**
 * 
 */
package Lesson1;

/**
 * @author User
 *
 */
public class tutString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="Hello World"; // Default String Variable
		System.out.println(myString);
		
		System.out.println("_____________Defineing String Length______________");
		int stringLength=myString.length(); //get string length
		System.out.println("My String Length = "+stringLength); // string length showing with concat
		System.out.println("_____________Defineing String In Upper Case______________");
		String makeStringUpperCase=myString.toUpperCase();
		System.out.println("My String In Upper Case = "+makeStringUpperCase); // String In Upper Case showing with concat
		System.out.println("_____________Defineing String In Lower Case______________");
		String makeStringLowerCase=myString.toLowerCase();
		System.out.println("My String In Lower Case = "+makeStringLowerCase); // String In Lower Case showing with concat
		System.out.println("_____________ String Replace______________");
		String replaceStringWithOther=myString.replace('e', 'a');
		System.out.println("My String Replace Case = "+replaceStringWithOther); // String Replace Case showing with concat
		System.out.println("_____________ String Index find______________");
		int myStringIndexof=myString.indexOf('o'); //find the character / string index
		System.out.println("My String Index find Case = "+myStringIndexof); // String index showing Case showing with concat
		System.out.println("_____________Defineing String In Concatetion______________");
		String myStringOne="Hello " + "World";
		System.out.println("My String Concate Case = "+myStringOne); // String concate showing Case showing with concat
		
		
		

	}

}
