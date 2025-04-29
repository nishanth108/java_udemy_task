package pack_for_singleArray;

public class singleDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			double nums[] = {10.1,11.2,12.3,13.4,14.5};
			
			double result = 0;
			
			int i;
			
			for (i=0; i<5; i++) 
				result = result+nums[i];
			
			System.out.println("Result is :"+result);
			
			System.out.println("Average result :"+result/5);
	}

}
