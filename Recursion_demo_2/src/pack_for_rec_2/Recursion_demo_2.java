package pack_for_rec_2;

class test {
	int[] values;
	test(int i) {
		values = new int[i];
		
	}
	
	void printArray(int i) {
		if( i == 0 ) {
			return;
		}
		else {
			printArray(i-1);
		}
		System.out.println("["+(i-1)+"] ="+values[i-1]+"");
	}
}

public class Recursion_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    test t= new test(10);
    for(int i = 0 ; i<10; i++) {
    	t.values[i] = i;
    }
    t.printArray(10);
	}

}
