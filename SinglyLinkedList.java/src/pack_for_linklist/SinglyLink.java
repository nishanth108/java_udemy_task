package pack_for_linklist;

public class SinglyLink {
	
	private ListNode head;
	
	private static class ListNode {
		private int data; //Generic type
		private ListNode next;
		

	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	
	}
	}
	public void display() {
		ListNode temp = head;
		while(temp !=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("NUll");
	}
	
	public int length() {
		ListNode temp = head;
		int count=0;
		while(temp !=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	//inserting at the begining of the linked list
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
		
	}
	public void insertEnd(int value) {
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		ListNode pcurrent;
		while (current.next != null ) {
			current = current.next;
		}
		current.next=newNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLink sll = new SinglyLink();
//		sll.head =new ListNode(10);
//		ListNode second = new ListNode(5);
//		ListNode third = new ListNode(22);
//		sll.head.next =second;
//		second.next =third;
//		third.next =null;
		sll.display();
		System.out.println(" Length before inserting "+sll.length());
		sll.insertFirst(18);
		sll.insertFirst(22);
		sll.insertFirst(31);
		sll.insertFirst(14);
		sll.insertFirst(18);
		sll.display();
		System.out.println(" Length after inserting "+sll.length());
		
		sll.insertEnd(15);
		sll.display();

	}

}
