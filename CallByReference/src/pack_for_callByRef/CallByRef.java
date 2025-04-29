package pack_for_callByRef;

class Test {
	int a,b;
	
	Test(int i, int j) {
		a = i;
		b = j;
	}
	
	void meth(Test o) {
		o.a*=2;
		o.b/=2;
	}
}



public class CallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test ob=new Test(2,10);
		System.out.println("ob.a and ob.b before call :"+ob.a+" "+ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call :"+ob.a+" "+ob.b);
	}

}
