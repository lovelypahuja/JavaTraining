package OOPsConcepts;

public class WrapperClassObject{
	
	public static void main(String[] args)
	{
	//string to int conversion
	String x="100";
	int i= Integer.parseInt(x);
	System.out.println(i);
	
	//string to double conversion
	String k="100.33";
	double d= Double.parseDouble(k);
	System.out.println(d);
	
	//string to boolean conversion
	String b="true";
	boolean t= Boolean.parseBoolean(b);
	System.out.println(t);
	b="100";
	t= Boolean.parseBoolean(b);
	System.out.println(t);
	
	//int to string conversion
	int j=20;
	String s= String.valueOf(j);

	System.out.print(s+20);
	//int ques: if alpha numeric value given for conversion from string to int, number format exception will occur
//to solve, use regex

}
	
}

	
