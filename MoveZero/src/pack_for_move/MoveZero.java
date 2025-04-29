package pack_for_move;
import java.util.Arrays;
public class MoveZero {
	public int[] movezeros(int[] arr) {
		int j = 0;
		for(int  i = 0;i<arr.length; i++) {
			if( arr[i]!= 1 && arr[j] == 1 ) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if( arr[j]!= 1) {
				j++;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,1,0,25,1,0,26,0,22,0,55};
		MoveZero m=new MoveZero();
		System.out.println(Arrays.toString(m.movezeros(arr)));
	}

}
