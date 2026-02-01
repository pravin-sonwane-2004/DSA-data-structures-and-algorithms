class BinarySearch {
	void main() {
		//perform binaey search operations
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 6;
		IO.println(searchOperation(arr , target));
	}
	public static int searchOperation(int arr [],int target) {
		int start = 0;
		int end = arr.length-1 ;
		
		int mid =  (start+end) / 2;
		while(start <= end) {
		if(arr[mid] == target)  {
			return mid;
		}
			if(arr[mid]<target) {
				end = mid+1;
			}
			else if(arr[mid]>target) {
				start= mid+1;
			}
		}
		return -1;
	}
	
}