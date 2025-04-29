package pack_for_innerClass;

class Outer {
	int outer_x = 100;
	void test() {
		for(int i = 0 ; i < 10 ; i++) {
			class Inner 
			{
				void display() {
					System.out.println("Display : outer x"+outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
}


public class innerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.test();
	}

}
