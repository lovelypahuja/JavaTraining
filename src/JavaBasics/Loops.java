package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		int i;
		
		for (i=-1;i>=-10;i--)
			System.out.println(i);
		
		
		//disadvantage of while loop:it gives infinite value oif conditin not given
		int j=1;//initialization
		while (j<=10) //condition
			{
			System.out.println(j);
				j++; //increment/decrement
		}

		for (int k=-10;k<=-1;k++)
			System.out.println(k);
		
	}

	
}
