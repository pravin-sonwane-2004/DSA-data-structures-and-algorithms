class FreqCount{
    public static void countFreq(int[] arr) {
		int count = 1;
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else{
				IO.println(arr[i]+ " -> " + count);
				count = 1;
			}
		}
		if(count > 0 )  {
			  	IO.println(arr[arr.length-1]+ " -> " + count);
		}
	}
	void main() {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
		countFreq(arr);
	}
}