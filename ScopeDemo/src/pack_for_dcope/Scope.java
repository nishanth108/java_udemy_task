package pack_for_dcope;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x; //known or visible through my main
		
		x= 10;
		
		if(x==10) //new scope is started 
		{
			int y = 20;// is visible only here
			
			System.out.println("x and y"+x+" "+y);
			
			x = y*2;
		}
		
//		y=100throwing error
		System.out.println("x is "+x);
	}

}
