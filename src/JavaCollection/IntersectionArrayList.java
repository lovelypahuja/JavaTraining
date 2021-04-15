package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class IntersectionArrayList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("red", "blue", "blue", "green", "red");
		List<String> otherList = Arrays.asList("red", "green", "green", "yellow");
		ArrayList<String> returnList=new ArrayList<String>();

		Iterator<String> it=list.iterator();
		int i;
		while (it.hasNext())
			it.next();
		
			
	int indexOfElement=-1;
	

	if(!otherList.contains(list.get(i))){
				returnList.add(list.get(i));
			}
			if(otherList.contains(list.get(i))){
				indexOfElement=otherList.indexOf(list.get(i));
				otherList.remove(indexOfElement);
			}
				
		}
		
			
			
	}
	

 