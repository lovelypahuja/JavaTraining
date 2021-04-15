package JavaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraylistCompare {

	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("tom");
		ar.add("harry");
		ar.add("lovely");
		ar.add("rahul");
		ar.add("meme");
		ar.add("meme");
		ar.add("meme");
		ar.add("lovely");
		
		ArrayList<String> br= new ArrayList<String>();
		br.add("tom");
		br.add("harry");
		br.add("def ");
		br.add("rahul");
		br.add("meme");
		br.add("meme");
		br.add("meme");
		br.add("abc");
		
		for(int i=0;i<ar.size();i++)
		{ System.out.println(ar.get(i));}
		ar.removeIf(ar.get(i)==br.get(i));
		
		for(String s: ar) {
			System.out.println(s);
		}
		
		System.out.println("............");
		Iterator<String> it=ar.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("...........");
	ar.stream().forEach(ele-> System.out.println(ele));
		
List<String> ar1= ar.stream().distinct().collect(Collectors.toList());
System.out.println(ar1);

	}

}
