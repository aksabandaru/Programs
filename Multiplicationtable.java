package loop;
import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n,i,j;
		System.out.println("enter value m:");
		m=sc.nextInt();
		System.out.println("enter value n:");
		n=sc.nextInt();
		for(j=m;j<=n;j++)
		{
			System.out.println("Table of:"+"\n");
			for(i=1;i<=10;i++)
			{
				System.out.println(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
			
		}
			
			
		

		
		
		
		
		

	}

}
