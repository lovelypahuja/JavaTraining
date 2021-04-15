package JavaBasics2;

import java.util.Scanner;

public class pattern1 {
//https://www.csinfo360.com/2020/08/program-to-print-series-1223334444n.html
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number range(limit)");
		int i,j,n;
		n=sc.nextInt();
		System.out.println('1');
		for (i=2;i<=n;i++) {
			if(i>2) {
			System.out.println("");
			System.out.println("2");}
			else System.out.println("1");
			
			for(j=1;j<=i;j++) {
			System.out.print(i);
			}
		
		}
}
}
		
		
		
		