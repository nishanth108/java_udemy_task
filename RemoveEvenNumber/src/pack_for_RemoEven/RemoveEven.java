package pack_for_RemoEven;

public class RemoveEven {

	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] removeEven(int[] arr) {
		int oddCount= 0;
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		int indx=0;
		int[] a =new int[oddCount];
		for(int i = 0 ; i < arr.length ; i++) {
			if( arr[i] % 2 != 0) {
				a[indx] = arr[i];
				indx++;
			}
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveEven remove = new RemoveEven();
		int[] arr= {3,2,1,6,8,5};
		
		printArray(arr);
		int[] result = removeEven(arr);
		printArray(result);
		
	}

}
