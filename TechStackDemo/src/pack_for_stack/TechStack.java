package pack_for_stack;

class Stack {
	private int tos;
	private int stack[] = new int[10];
	Stack() {
		tos = -1;
		
	}
	
	void push(int item) {
		if (tos == 9) {
			System.out.println("The Stack is overflow");
		} else {
			stack[++tos] = item+1;
		}
	}
	
	int pop() {
		if ( tos == -1 ) {
		 	System.out.println("The stack is underflow");
		} else {
			
			return stack[tos--];
		}
		return 1;
	}
	
}

public class TechStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		for(int i =0 ;i <= 9 ; i++) {
			s.push(i);
		}
		 System.out.println("Poping out the items");
		 for(int i = 0 ; i <= 9 ; i++ ) {
			 System.out.println("The item popped are "+s.pop());
		 }
		
	}
}
