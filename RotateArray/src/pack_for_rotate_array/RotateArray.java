package pack_for_rotate_array;
class ArrayRotate {
    public void rotate(int arr[],int k) {
    	int n=arr.length;
        
        //Calling method

        // after only we have to reverse upto k

        // then we have to reverse the rest thing to get the proper output
    	
    	System.out.println("Array before rotating");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
            
        }
        
        reverse(arr,0,n-1);
        
        reverse(arr,0,k-1);
        
        
        reverse(arr,k,n-1);
        System.out.println("Array after rotating");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
            
        }
        
    }
    private int[] reverse(int arr[],int first,int last) {
        int i =first;
        int temp ;
        int j =last;
        while(i<j) {
            temp =arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
        return arr;
    }

  
}
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int k=3;
	        int arr[] ={1,2,3,4,5,6,7};
	        ArrayRotate a = new ArrayRotate();
	        a.rotate(arr,k);
	    
	}

}
