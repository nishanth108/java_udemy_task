package pack_for_stock;


class Solution {
	  public int maxProfit(int arr[]) {
	      int buy_price = arr[0];
	      int profit = 0;
	      int max_profit =0;
	      for(int i=1;i<arr.length;i++) {
	          if(buy_price > arr[i]) {
	              buy_price =arr[i];
	          }
	          else {
	              profit = arr[i]-buy_price;
	              if(profit > max_profit) {
	                  max_profit = profit;
	              }
	          }
	      }
	      return max_profit;
	  }
	  
	}

public class StockBuySell {
	//[]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online
		 int price[]={7,1,5,3,6,4};
	        Solution s = new Solution();
	        int m =s.maxProfit(price);
	        System.out.println("The Maximum profit is "+m);
	}

}
