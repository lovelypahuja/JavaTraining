package OOPsConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(15, 20);
		obj.sum(15.5, 20);
	

	}
	
	public void sum() //when method name is same with different param
	{ 
	System.out.println("sum method with no param");
}
	public void sum(int x) {
		System.out.println("sum method with one param");
		System.out.println(x);
	}

	public void sum(int x, int y) {
		System.out.println("sum method with two param");
		System.out.println(x+y);
	}

	public void sum(double x, int y) {
		System.out.println("sum method with three param");
		System.out.println(x+y);
	}
	//you cannot create a method inside a new method
		//duplicate method- same method with same no. og param/arguments are not allowed
		//method overloading-same method with different i/p param or different type pf ip param within same class
		//main method can also be overloaded
	public static void main(int a) {
		System.out.println("main method with diffrent param");
	}


}
