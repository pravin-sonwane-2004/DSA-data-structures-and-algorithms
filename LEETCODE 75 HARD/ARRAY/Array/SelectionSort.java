class SelectionSort {
	void main() {
		int arr [] = {5,2,1,3,5,6,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i]=temp;
				}
			}
			for(int n : arr) {
				System.out.print(" "+n);
		    }
			System.out.println();
		}
		for(int n : arr) {
			System.out.println(n);
		}
	}
}