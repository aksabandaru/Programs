package loop;

import java.util.Scanner;

public class primenumber {
	static int reversenumber(int number) {
		int reversenumber=0;
		while(number!=0) {
			int num=number%=10;
			reversenumber+=num;
			number/=10;

		}
		return reversenumber;	
	}

	static boolean isprime(int number) {
		boolean flag=true;
		for(int ctr=2;ctr<number;ctr++) {
			
			if(number%ctr==0) {
				flag=false;
				break;		

			}
		}

		return flag;
	}

	public static void main(String[] args) {
		Scanner scanObj =new Scanner(System.in);
		System.out.println("enter a number to check whether it is emiphar number or not");
		int num=scanObj.nextInt();
		if(isprime(num)) {
		int reverse=reversenumber(num);
		if(isprime(reverse)){
		System.out.println(num+" "+" is emirph number ");
		}
	}
	else {
		System.out.println("not a emirph number");


	}

	
		}

}
