package OOpsConceptPart2;

public class TestCar {
//when method with same name and same number of arguments is present in child class as well as parent class 
	//is called method overloading
	public static void main(String[] args) {
		BMW b=new BMW();
		b.Start();//overridden method
		b.theftSafely();//method from child class
		b.Stop();//method from parent class

	}

}
