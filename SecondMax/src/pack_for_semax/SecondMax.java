package pack_for_semax;

public class SecondMax {

	public int find2Max(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++ ) {
			if( arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max){
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 91 , 25 , 33 , 20 , 10 };
		SecondMax s = new SecondMax();
		System.out.println(s.find2Max(arr));
	}

}
