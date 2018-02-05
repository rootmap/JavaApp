
public class Cube {
	
	int length;
	int bregth;
	int width;
	
	public int callCubeVolume()
	{
		return (length * bregth * width);
	}
	
	Cube () //creating defult constructor
	{
		System.out.println("We are in constructor");
		length=10;
		bregth=10;
		width=10;
		
	}
	
	Cube (int x,int y, int z)
	{
		length=x;
		bregth=y;
		width=z;
	}

}
