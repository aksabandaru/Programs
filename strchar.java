package addition;
import java.util.Arrays;

public class strchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "EDUBRIDGE";
		char[]dest = new char[9];
		s1.getChars(0,9,dest,0);
		System.out.println(Arrays.toString(dest));

	}

}
