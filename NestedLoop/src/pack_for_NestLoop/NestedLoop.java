package pack_for_NestLoop;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		for(i = 0 ; i < 5; i++) {
			System.out.print("88");
			for(j = i; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.println("88");
		}
	}

}
