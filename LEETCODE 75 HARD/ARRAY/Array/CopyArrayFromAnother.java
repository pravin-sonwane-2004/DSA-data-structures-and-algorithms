class CopyArrayFromAnother {
	void main() {
		int arr[] = {1,2,3,4,5,6,7,8};
		int newArr[] = new int [arr.length];
		
		for(int i =0;i<arr.length;i++) {
			newArr[i] = arr[i];
		}
		
		for(int n : newArr) {
			System.out.println(n);
		}
	}
}