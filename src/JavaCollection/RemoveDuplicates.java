package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> removedup= new ArrayList<String>(Arrays.asList("Tom","Harry","Steve","Cammy","Cammy","Lovely","pahuja"));
		HashSet<String> hs= new HashSet<String>(removedup);
		ArrayList<String> result= new ArrayList(Arrays.asList(hs));
		System.out.println(result);

	}

}
