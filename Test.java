// import java.util.*;

// class Test {
	// void main() {
		// missing number code
		// int arr [] = new int[]{1,5,7,9};
		// int i =0;
		// int count = 0;
		// while(i<nums.length) {
		// if(nums[i]!=count) {
			// IO.println(count);
			// count++;
		// }
		// else {
			// count++;
			// i++;
		// }
	// }
	// }
// }
		// List<Integer> list = new ArrayList<>();
		// int index = 0;
		// for(int i = 0;i<arr.length;i++) {
			// index = Math.abs(arr[i])-1;
			// if(arr[index]>0) {
				// arr[index] = -arr[index];
			// }
		// }
		// for(int i=0;i<arr.length;i++) {
			// if(arr[i] > 0) {
				// list.add(i+1);
			// }
		// }
		// IO.println(list);
	// }
	
// }

// class Test {
    // public int subarraySum(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        
        // map.put(0, 1);  // base case
        
        // int currentSum = 0;
        // int count = 0;
        
        // for (int num : nums) {
            // currentSum += num;
            
            // if (map.containsKey(currentSum - k)) {
                // count += map.get(currentSum - k);
            // }
            
            // map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        // }
        
        // return count;
    // }
	// static  public void  main(String [] args) {
		// int arr [] = {1,3,-1,-3,5,3,6,7};
		// int i;
		// IO.println("jjjjjjjjjjjjj   " + i);
		// main();
	// }
	// public static int main() {
		// IO.println("fsfs0");
		// return 1;
	// }
// }

// class Test {
	// void main() {
		// for(int i=0;i<=100;i++) {
			// if(isit(i)) {
				// IO.println(i);
			// }
		// }
	// }
	// boolean isit(int n) {
		// if(n<=2) return false;
		// if(n==2) return true;
		// if(n%2==0) return false;
		
		// for(int i=2;i*i<=n;i++) {
			// if(n%i == 0) {
				// return false;
			// }
		// }
		// return true;
	// }
// }

// import java.util.*;
// class Test {
    // public void firstUniqueEven(int[] nums) {
        // Map<Integer,Integer> map = new TreeMap<>();
        
        // for(int i=0;i<nums.length;i++) {
            // map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
		// IO.println(map);
		// for(int n : map.getValue()) {
			// if(n % 2 == 0) {
				// IO.println(n);
			// }
		// }
        // return -1;
    // }
// void main() {
	// int arr [] = new int[] {1,2,2,2,3,33,3,3};
	// firstUniqueEven(arr);
// }
// }

// class Animal {
    // void makeSound() {
        // System.out.println("The animal makes a sound");
    // }
// }

// class Dog extends Animal {
    // @Override // This tells the compiler we are overriding the parent method
    // void makeSound() {
        // System.out.println("The dog barks");
    // }
// }

// class Cat extends Animal {
    // @Override
    // void makeSound() {
        // System.out.println("The cat meows");
    // }
// }

// class Test  {
	
	// void main() {
		// Dog d = new Dog();
		// d.makeSound();
	// }	
// }

import java.util.*;
class Test {
	void main() {
		 int nums [] = {2,43,1,4,6};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MIN_VALUE;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		}
		// ArrayList<Integer> list = new ArrayList<>(map.size());
		List<Integer> list = new ArrayList<>(map.keySet());
		
		for(int n : map.keySet()) {
			list.add(n);
		}
		IO.println(list.get(list.size()-2));
	}
}



































