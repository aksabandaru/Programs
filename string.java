package addition;

public class string {

	public static void main(String[] args) {
		String s1="Aksa";
		String s2="Hasan";
		String s3=s1.concat(s2);
		System.out.println(s3);
		StringBuilder s4=new StringBuilder("1100");
		StringBuilder s5=new StringBuilder("1010");
		StringBuilder s6 =s4.append(s5);
		System.out.println(s6);

	}

}
