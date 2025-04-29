package pack_for_boolean;

public class BoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b;
		
		b = false;
		
		System.out.println(" b is " +b);
		
		b = true;
		
		System.out.println("b is "+b);
		
		if(b) {
			System.out.println("This statement can be executed");
		}
		
		b = false;
		
		if(b) {
			System.out.println("This is not Executed");
		}
		
		System.out.println("10>9 is "+(10>19));
	}

}
