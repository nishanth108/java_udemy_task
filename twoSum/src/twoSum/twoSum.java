package twoSum;
import java.util.List;
import java.util.ArrayList;  // Import ArrayList if you need a specific list implementation


class threeSum {
    
	
	
	
    // Method to sort the array and prepare it for three-sum problem
    public List<List<Integer>> threesum(int[] arr) {
        // Sort the array using quicksort
        quickSortAlgorithm(arr, 0, arr.length - 1);
        List<List<Integer>> result = new ArrayList<>();
        
        if( arr == null || arr.length < 3 ) 
        {
        	return result;	
        }
        
        for(int i = 0 ; i < arr.length-2;i++) {
        	if(i > 0 && arr[i] == arr[i-1]) {
        		continue;
        	}
          int left = i + 1;
          int right = arr.length;
          
          while ( left < right) {
        	  int sum = arr[i]+arr[left]+arr[right];
        	  if( sum  == 0) {
        		  result.add(new ArrayList<>(List.of(arr[i],arr[left],arr[right])));
        		  while(left < right && arr[left] == arr[left+1]) {
        			  left++;
        		  }
        		  
        		  while (left < right && arr[right] == arr[right-1]) 
        		  {
        			  right--;
        		  }
        		  left++;
        		  right--;
        	  }
        	  
        	  else if( sum < 0) {
        		  left++;
        	  }
        	  else {
        		  right--;
        	  }
          }
        
        }
    }

    // QuickSort algorithm with recursive partitioning
    public void quickSortAlgorithm(int[] arr, int left, int right) {
        if (left < right) {  // Base case to stop recursion
            int partitionIndex = quickSort(arr, left, right);
            quickSortAlgorithm(arr, left, partitionIndex - 1);  // Sort left partition
            quickSortAlgorithm(arr, partitionIndex, right);     // Sort right partition
        }
    }

    // Partition method for quicksort
    public int quickSort(int[] arr, int l, int r) {
        int pivot = arr[(l + r) / 2]; // Use the middle element as pivot
        while (l <= r) {
            while (arr[l] < pivot) {
                l++;
            }
            while (arr[r] > pivot) {
                r--;
            }
            if (l <= r) {
                // Swap arr[l] and arr[r]
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return l; // Return the partition index
    }
}

// Main class to test sorting with quicksort
public class twoSum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        threeSum t = new threeSum();
        t.threesum(arr);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
