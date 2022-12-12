package loop;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter time");
		String sentence=scanObj.nextLine();
		if(sentence.charAt(8)=='A') {
			if(Integer.parseInt(sentence.substring(0,2))==12) {
				System.out.println("00"+sentence.substring(2,8));
			}
			else {
				if(sentence.substring(0,2)!="12") {
					System.out.println(sentence.substring(0,8));
				}
			}

		}
		else {
			if(Integer.parseInt(sentence.substring(0,2))==12) {
				System.out.println(sentence.substring(0,8));
			}
			else {
				System.out.println(Integer.parseInt(sentence.substring(0,2))+12+sentence.substring(2,8));
			}
		}


	}

}
