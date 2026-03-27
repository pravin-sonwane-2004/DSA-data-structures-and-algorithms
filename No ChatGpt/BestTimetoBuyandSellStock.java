// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

class BestTimetoBuyandSellStock {
	//ill try first brute force then ill think to optimize
	void main() {
		int arr [] = {7,6,4,3,1};
		// int diff = 0;
		// int secondDiff = 0;
		  // for(int i=0;i<arr.length-1;i++) {
			  // for(int j =i+1;j<arr.length;j++) {
				   // diff = arr[j] - arr[i];
				// secondDiff = Math.max(secondDiff,diff);
			  // }
		  // }
		  // IO.println(secondDiff);
	// }
	//ok so output is comming as i thought
	//its time to improve in logic 
	//what i can do is 
	//1) while triversing the array i can put the elements in array but not pretty sure it will work
	  int min = Integer.MAX_VALUE;
	  int todays =0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i] < min) {
			min = arr[i];
		}
		todays = Math.max(todays,arr[i]-min);
	}
	IO.println(todays);
}
}