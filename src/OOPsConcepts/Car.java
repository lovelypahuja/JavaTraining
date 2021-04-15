package OOPsConcepts;

public class Car {
			 //class variables or global variables
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		// Class is an entity where we define properties with help of methods and variables
		//new Car() is an object 
		//a,b and c are object reference variables
		//new keyword is used to create an object	
		Car a = new Car();
			Car b = new Car();
			Car c = new Car();
			
			a.mod=2015;
			a.wheel=4;
			
			b.mod=2014;
			b.wheel=4;
			
			c.mod=2013;
			c.wheel=4;
			
			System.out.println(c.wheel);
			System.out.println(c.mod);
			System.out.println(a.mod);
			System.out.println(b.mod);
			
			a=b;
			b=c;
			c=a;
			
			System.out.println(c.mod);
			System.out.println(a.mod);
			System.out.println(b.mod);
			
			
			
			
	}

}
