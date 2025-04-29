package pack_for_upperToLower;
import java.lang.*;

class solution {
	public String toLowerCase(String s) {
		char[] c = s.toCharArray();
		for (int i =0;i<c.length;i++) {
			if(c[i] >= 65 && c[i] <= 97) {
				c[i] = (char) (c[i]+32);
			}
		}
		return String.valueOf(c);
	}
}
public class Upper {
	public static void main(String args[]) {
		solution s =new solution();
		System.out.print(s.toLowerCase("NeLLO"));
		
	}
}
