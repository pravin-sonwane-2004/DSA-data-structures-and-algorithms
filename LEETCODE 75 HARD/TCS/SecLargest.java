class SecLargest{
	public static void main(String args[]) {
		  int arr [] = new int[] {10, 5, 8};
		  int largest = Integer.MIN_VALUE;
		  int secLargest = Integer.MIN_VALUE;
			int i=0;
			for(i=0;i<arr.length;i++) {
				if(arr[i]>largest) {
					secLargest = largest;
					largest = arr[i];
				}
				else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
			}
			IO.println(secLargest);
	}
}