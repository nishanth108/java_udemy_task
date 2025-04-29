package pack_for_stack;

class Stack {
	private int tos;
	private int stack[];

	Stack(int size) {
		stack =new int[size];
		tos =-1;
	}
	
	void push(int item) {
		if ( tos == (stack.length)-1) {
			System.out.println("Stack overflow");
		} else {
			stack[++tos] = item;
		}
	}
	
	int pop() {
		if( tos == -1) {
			System.out.println("Stack is underflow");
			return 0;
		} else {
			return stack[tos--];
		}
	}
}



public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack(9);
		for( int i = 0; i <9;i++) {
			s.push(i);
		}
		for( int i = 0; i <9;i++) {
			System.out.println("The Elements are poped"+s.pop());
		}
		
	}

}
