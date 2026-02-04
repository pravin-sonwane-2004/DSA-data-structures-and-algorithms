// Q8. Write a java program to find union array of two unsorted array. 
// Input :-  arr1 = [1, 2, 3]   
// arr2 = [2, 3, 4, 5] 
// Output :- [1, 2, 3, 4, 5] 
// Explanation: 
// ● Union combines all elements from both arrays. 
// ● Duplicates are removed to keep only unique elements. 

class UnionArray {
	void main() {
		int arr1 [] = {1, 2, 3};
		int arr2 [] = {2, 3, 4, 5};
		int newArr [] = new int[arr1.length+arr2.length];
		boolean flag [] = new boolean[newArr.length];
		int n = 0;
		int b = 0;
		for(int i =0;i<arr1.length;i++) {
			newArr[n++] = arr1[i];
			flag[newArr[b++]] = true;
		}
		
		for(int i =0;i<arr2.length;i++) {
			if(!flag[arr2[i]] ) {
				newArr[n++] = arr2[i];
				newArr[b++] = arr2[i];
			}
		}
		
		for(int j: newArr) {
			System.out.println(j);
		}
	
	}
	
}              