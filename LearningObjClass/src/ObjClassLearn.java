/**
 * 
 */

/**
 * @author User
 *
 */
public class ObjClassLearn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student mark=new Student();
		mark.id=1;
		mark.name="Mark";
		mark.age=(float)12.6;
		
		System.out.println(mark.name+" is "+mark.age+" Years old.");
		
		
		Student std=new Student(); //using getter & setter called variable encapsulation
		std.setId(2);
		std.setName("Fahad");
		std.setAge(11);
		
		//System.out.println(mark.name+" is "+mark.age+" Years old.");

		System.out.println(std.getName()+" is "+std.getAge()+" Years old.");
		
		//calling constructor in main lib
		
		Cube cube1=new Cube(); //defulat constructor call
		Cube cube2=new Cube(1,3,4); // constructor overloaping caLL
		
		System.out.println(cube1.callCubeVolume());
		System.out.println(cube2.callCubeVolume());

	}

}
