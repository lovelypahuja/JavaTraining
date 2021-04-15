package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		// array: to store similar data type values in a variable, eg
		//string,boolean and char array

//		lowest index of array=0;
//		upper highest index=4; for i[5]
int i[]=new int[5];
i[1]=10;
i[2]=20;
i[3]=30;
i[4]=40;
i[0]=50;

System.out.println(i[4]);//array index out of bound exception
System.out.println(i.length); //length of array
for (int j=0;j<i.length;j++)
System.out.println(i[j]);

//double array
double a[]= new double[5];
//char array
char b[]= new char[5];
//boolean array
boolean c[]= new boolean[5];
//string array
String d[]= new String[5];
//these are all 1-dimensional array, 
//adv -can store multiple values in single array- collections like hash table, array list, also known as dynamic array 
//disadv- size is fixed, cannot be changed (static array)-
//stores only similar data types- to overcome this problems, we use object arrays
//-Object is the super class of all the classes. Object array is used to store different ty[pes of values
Object ob[]= new Object[5];
ob[0]= "Tom";
ob[1]= "1";
ob[2]= "1998";
ob[3]= "Single";
ob[4]= "India@123";

for (int j=0;j<ob.length; j++)
System.out.println(ob[j]);
  
	
	}
}
