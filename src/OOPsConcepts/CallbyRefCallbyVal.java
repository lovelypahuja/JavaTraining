package OOPsConcepts;

public class CallbyRefCallbyVal {
	int p;
	int q;


	public static void main(String[] args) {
		int x=10;
		int y=20;
		CallbyRefCallbyVal obj=new CallbyRefCallbyVal();
		int d=obj.test(x, y);//call by value or pass by value
		System.out.println(d);
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
public int test(int a, int b) {
	 //a=30;
	 //b=40;
	int c=a+b;
	return c;	
}
//here we are calling reference variable of class
//call by reference as we are passing the value of object reference
//is it possible in java-call by reference-yes by passing obj references
public void swap(CallbyRefCallbyVal t) { 
	int temp=t.p;
	t.p=t.q;
	t.q=temp;
} 
}

