package OOPsConcepts;

public class functionsInJava {

	public static void main(String[] args) {
		
		functionsInJava obj=new functionsInJava();
		//one object will be created, reference variable will be obj referring to object new functionsInJava()
	//after creating the object, copy of all non-static methods will be given to this object	
		obj.test();
		obj.test1();
		obj.test2();
		int add= obj.test3(10, 20);
		System.out.println(add);
		//main method is void, bcoz we never write return statement in main method, so it never returns a value.  	 	
		
	}
		// functions types- a)no ip,no op b) no ip, some op, c)some ip some op
		
		public void test() {
			System.out.println("no i/p,no o/p");
			
		}
		
	public int test1() {
		System.out.println("test return, no ip but some op");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}

	public String test2() {
		System.out.println("test return String, no ip but some op");
		String a="ABC";
		return a;
		
	}
	public int test3(int x, int y) {
		int z=x+y;
		return z;
		
	}
}
