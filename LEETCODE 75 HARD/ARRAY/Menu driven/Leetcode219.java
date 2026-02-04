import java.util.HashSet;
class Leetcode219 {
	
	void main () {
		int arr[] = {1,2,3,1,1,3,45,4};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				System.out.println("Duplicate Found ");
			}
			set.add(arr[i]);
		}
		
		System.out.println("HashSet: " + set);
	}
}