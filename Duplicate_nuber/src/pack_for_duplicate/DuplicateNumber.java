package pack_for_duplicate;
import java.util.HashSet;

class Duplicate {
	public boolean duplicate(int arr[]) {
		HashSet<Integer> numbers = new HashSet<>();
		for(int i = 0 ; i < arr.length; i++) {
			if(numbers.contains(arr[i])) {
				return true;
			}
			else {
				numbers.add(arr[i]);
			}
		}
		return false;
	}
}
public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		Duplicate d =new Duplicate();
		
		System.out.println(d.duplicate(arr));
	}

}
