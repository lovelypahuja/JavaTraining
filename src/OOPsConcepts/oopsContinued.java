package OOPsConcepts;

public class oopsContinued {

	public static void main(String[] args) {

System.out.println("a");


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
String s= String.valueOf(j);//stucked

String h=String.valueOf(i);

System.out.println(h+20);
	}

	}


