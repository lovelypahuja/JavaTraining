package SeleniumBasics;

public class GenericMethodForDropDown {

	
			
public static void main(String[] args) {
	String helloWorld="This is my Program";
System.out.println("legnth of program is "+getLengthOfString(helloWorld));}

public static int getLengthOfString(String str){
	int i=0;
	try {
		for(i=0;;i++) {
			str.charAt(i);
		}
	}
	catch (Exception e)
	
	{
		return i;		
					
	}
}
}
