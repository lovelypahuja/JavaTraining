package OOPsConcepts;

public class localVsGlobal {
	String name="Tom";
	int age=25;
	//global or class variables


	public static void main(String[] args) {
		int i=5;//local variable for main method
		localVsGlobal obj = new localVsGlobal();
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println(i);
		obj.test1();
	}
		public void test() {
			int i=10;
			System.out.println(i);
		}
		public void test1() {
			int i=15;//local variables
			int j=20;
			System.out.println(i);
			System.out.println(j);
			
		}
		
	}

