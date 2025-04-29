package pack_for_recursion;

class factorial {
	int factorials(int n) {
		
		int result =1;
		if( n == 1 ) 
			return 1;
		result = n*factorials(n-1);
		return result;
	}
}


public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f =new factorial();
		System.out.println("The factorial:" +f.factorials(5));
		
	}

}
