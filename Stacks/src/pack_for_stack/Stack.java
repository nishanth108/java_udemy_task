package pack_for_stack;

class TestStack {
	private int stack[]=new  int[10];
	private int tos;
	
	TestStack() {
		tos =-1;
	}
	
	void push(int item) {
		if(tos == 9) {
			System.out.println("Stack overflow");
		}
		else {
			stack[++tos] =item; 
		}
	}
	
	int pop() {
		if(tos == -1) {
			System.out.println("Stack underflow");
		}
		else {
			return stack[tos--];
		}
		
		
	}
}

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStack ts = new TestStack();
		
		
	}

}
