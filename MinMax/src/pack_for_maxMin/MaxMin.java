package pack_for_maxMin;

public class MaxMin {
	
		    
		    public static void findMinMax(int[] arr) {
		        int min = arr[0];
		        int max = arr[0];
		        
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < min) {
		                min = arr[i];
		            } else if (arr[i] > max) {
		                max = arr[i];
		            }
		        }
		        
		        System.out.println("Minimum value is: " + min);
		        System.out.println("Maximum value is: " + max);
		    }
		    
		    public static void main(String[] args) {
		        int[] arr = {5, 6, 84, 3, 2};
		        findMinMax(arr);
		    }
		}

