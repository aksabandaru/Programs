package loop;
import  java.util.Scanner;

public class NumberRev {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.println("enter an integer between 1 to 1000");
        int num = obj.nextInt();
        while(num!=0)
        {
        	
        	int r=num%10;
        	System.out.print(r);
        
        	num=num/10;
        }
        
        
        
        	
        
	}

}
