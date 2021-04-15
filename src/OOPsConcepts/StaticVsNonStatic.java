package OOPsConcepts;
//global variable will be available across all the functions, but for static global variable, we can call directly or by classname while for non static, we have to call by creating an object

public class StaticVsNonStatic {
	String name = "Tom";// non-static global variable
	static int age = 25; //static global variable
	

	public static void main(String[] args) {
	 //how to call static methods and vars
		//1. direct calling: 
		sum();
		//2. Calling by classname: 
		//static method can also be called by object but this is not a good practice
		StaticVsNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticVsNonStatic.age);
		//how to call non-staic methods and vars
		StaticVsNonStatic obj = new StaticVsNonStatic();
		System.out.println(obj.name);
		obj.sendMail();
		System.out.println(obj.age+obj.age);
		

	}
  public void sendMail() {// non-static method
	  System.out.println("send mail method");
  }
  
  public static void sum() {//static method
	 System.out.println("Sum Method"); 
  }
}
