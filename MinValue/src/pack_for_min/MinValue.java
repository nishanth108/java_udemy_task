package pack_for_min;

public class MinValue {
	
	public int minValues(int[] arr) {
		if(arr.length == 0 || arr == null) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		int min = arr[0];
		for(int i = 1 ; i < arr.length ;i++  ) {
			if( arr[i] < min ) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,15,23,26,10};
		MinValue ma = new MinValue();
		System.out.println(ma.minValues(arr));
	}

}
