package JavaBasics;

public class DataTypesandStringConcatenation {

	public static void main(String[] args) {
		//data types
		int i=10;
		char f='a'; //not 'aa'
		double c=12.33;
		double d=10.33;
		//+ sign- concatenation operator
		//print- used to just print on console
		//println- used to print on console in a new line
		
				
		//string concatenation
		int a=100;
		int b=200;
		//k='20'; cannot write in quotes
		String x="Hello";
		String y="World";
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
	}

}
