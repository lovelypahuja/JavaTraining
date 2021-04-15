package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList <String> ar= new ArrayList<String>();
		ar.add("Tom");
		ar.add("abc");
		ar.add("cat");
		ar.add("may");
		ar.add("jun");
		
		for(String s : ar)
		{System.out.println(s);}
		
		

	
		System.out.println("---------");
		ar.stream().forEach(ele->System.out.println(ele));
		System.out.println(".......................");
		//iterator
		Iterator<String> it= ar.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("...........");
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		System.out.println("..............");
		
		System.out.println(ar);

	}
}
