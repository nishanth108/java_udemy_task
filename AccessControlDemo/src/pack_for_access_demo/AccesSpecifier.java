package pack_for_access_demo;

class Test {
	int a;//default access specifier 
	public int b; //public access specifier
	private int c;
	
	public void setc(int c) {
		this.c =c;
	}
	
	public int  getC() {
		return c;	
	}
}


public class AccesSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		
		obj.a = 10;
		obj.b = 20;
		obj.setc(10);
		System.out.println("The values of a,b and c are: "+""+obj.a +" "+obj.b +" "+obj.getC());
		
	}

}
