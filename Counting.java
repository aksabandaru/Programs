package loop;

import java.util.Scanner;

public class Counting {
	static void count(int array[]) {
		for(int ctr=0;ctr<array.length;ctr++) {
			int count=1;
			for(int ctr1=ctr+1;ctr1<array.length;ctr1++) {
				if(array[ctr]==array[ctr1]) {
					count++;
				}
			}
			System.out.println(array[ctr]+" "+"appeard for"+count);
			
		}
	}

	public static void main(String[] args) {

		Scanner scanObj =new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scanObj.nextInt();
		//System.out.println("enter the numbers");
		int arr[]=new int[size];
		System.out.println("enter the numbers");
		for(int ctr=0;ctr<arr.length;ctr++) {
			arr[ctr]=scanObj.nextInt();
			//count(arr);
	}
		count(arr);

		}
	}
