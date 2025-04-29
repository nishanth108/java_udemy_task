package pack_for_return;

class Test {
	int a;
	
	Test(int i) {
		a = i;
		System.out.println(a);
	}
	
	Test incrByTen() {
		Test temp = new Test(a+10);
		return temp;
	}
}

public class ReturnObj {
		public  static void main(String[] args) {
			Test obj1 = new Test(2);
			
			Test obj2 ;
			
			obj2 = obj1.incrByTen();
			System.out.println("obj1.a "+obj1.a);
			System.out.println("obj2.a "+obj2.a);
			
			obj2 = obj2.incrByTen();
			System.out.println("obj2.a after second increase "+obj2.a);
		}
}
