package addition;

public class comparestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Test";
		String s2 = "Test";
		String s3 = "TEST";
		String s4 = "TESTING";
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		char a[] = s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			
			
			System.out.print("\t"+a[i]);

		}
		


		
		
		

		

	}

}
