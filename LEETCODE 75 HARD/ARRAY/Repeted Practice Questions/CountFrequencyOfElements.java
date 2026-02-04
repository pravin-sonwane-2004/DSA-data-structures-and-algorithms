class CountFrequencyOfElements {
	void main() {
		int arr [] = {1,1,1,2,2,3,3,4,5,5,5,6,7,7};
		int count = 1;                               //0
		for(int i =1;i<arr.length;i++) { // 1
			if(arr[i]==arr[i-1]) {     // 1==1
				++count;				//1
			}
			else {
	   			System.out.println(arr[i-1] + "  "+ count);
				count=1;
			}
			
		}
		System.out.println(arr[arr.length-1] + "  "+ count);

	}
}