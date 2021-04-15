package JavaBasics;

public class TwoDimarray {

	
	public static void main(String[] args) {
		int x[][] = new int[2][3];
		System.out.println(x.length); //rows
		System.out.println(x[0].length); //columns
		x[0][0]=1;
		x[0][1]=1;
		x[0][2]=1;
				
		x[1][0]=1;
		x[1][1]=1;
		x[1][2]=2;

		
		
		for (int i=0;i<x.length;i++)
			for (int j=0;j<x[0].length;j++)
					System.out.println(x[i][j]);
		
		
		
	}

}
