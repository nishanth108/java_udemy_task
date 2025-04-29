package threeSum;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class solution {
	 
	public List<List<Integer>> sums(int arr[]) {
		
		List<List<Integer>> output = new ArrayList<>();
		if(arr == null || arr.length < 3 ) {
			return output;
		}
		
		//sorting
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr.length-2;i++) {
			
			if( i > 0 && arr[i] == arr[i-1]  ) {
				continue;
			}
			
			
			int left = i+1;
			int right = arr.length-1;
			
			while( left < right) {
				int sum = arr[left]+arr[right]+arr[i];
				if(sum == 0) {
					output.add(Arrays.asList(arr[i],arr[left],arr[right]));
					left++;
					right--;
				}
				else if( sum < 0  )
					left++;
				else
					right--;
			}
			
			
		}
		return output;
		
	}
	
}
public class threeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input one array
		
		int arr[]= {-1,0,1,2,-1,-4}; 
		
//		after sort -[-4,-1,-1,0,2,4] 
		
		solution s = new solution();
		
		List<List<Integer>> output = s.sums(arr);
		System.out.println("the list is:"+output);
		
//		for(List<Integer> innerList: output) {
//			System.out.println(innerList);
//		}
		
		
	}

}
