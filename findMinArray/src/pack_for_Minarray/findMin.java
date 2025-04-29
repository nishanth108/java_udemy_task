package pack_for_Minarray;

public class findMin {
	
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i = 0 ;i < arr.length-1; i++) {
			if(arr[i+1] < min ) {
				min = arr[i+1];
			}
		}
		
		return min;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,11,22,0,3};
		int a=minValue(numbers);
		System.out.println("The minimum value is ="+a);
		
	}

}
