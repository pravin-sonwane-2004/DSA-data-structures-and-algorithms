
import java.util.*;

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

// import java.util.*;
// class Test {
	// void main() {
		 // int nums [] = {2,43,1,4,6};
		
		// int max = Integer.MIN_VALUE;
		// int min = Integer.MIN_VALUE;
		// Map<Integer,Integer> map = new HashMap<>();
		// for(int i=0;i<nums.length;i++) {
			// map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		// }
		// ArrayList<Integer> list = new ArrayList<>(map.size());
		// List<Integer> list = new ArrayList<>(map.keySet());
		
		// for(int n : map.keySet()) {
			// list.add(n);
		// }
		// IO.println(list.get(list.size()-2));
	// }
// }



// class A {
    // static {
        // System.out.println("Static A");
    // }

    // {
        // System.out.println("Instance A");
    // }

    // A() {
        // System.out.println("Constructor A");
        // show();
    // }

    // void show() {
        // System.out.println("A show");
    // }
// }

// class B extends A {
    // static {
        // System.out.println("Static B");
    // }

    // int x = 10;

    // {
        // System.out.println("Instance B");
    // }

    // B() {
        // System.out.println("Constructor B");
    // }

    // void show() {
        // System.out.println("B show x = " + x);
    // }
// }

// public class Test {
    // public static void main(String[] args) {
        // new B();
    // }
// }

// import java.util.HashMap;
// import java.util.*;

// class A {
// 	A() {
// 		private A() {
			
// 		}
// 	}
// 	class B extends A () {
// 		IO.println("From b");
// 	}
// }
// class Test {
	// A b = new B();
	  // int [] removeDuplicates(int[] nums,int target) {
		// for(int i=1;i<nums.length;i++) {
			// if(nums[i]+nums[i-1]==target) {
				  // return new int[]{i,i-1};
			// }
		// }  
        // return new int[]{};
    // }
	// void main() {
		   // int arr [] = new int [] {2,3,5,7,9,0};
		   // IO.println(Arrays.toString(removeDuplicates(arr,8)));
	// }
// }





























// // Question 1
// This vacation you went to visit the golden house. There are N rooms in this golden
// house and its owner needs someone to take care of the management of this house.
// As you have been unemployed for a long time, you are interested in this job. Owner
// of this house wanted an intelligent manager for this role, so he created one puzzle
// within that golden house. The person who will be able to solve that puzzle will be the
// manager of the golden house.
// Owner of the house kept some numbers of golden coins in each room. You have to
// choose two rooms, one from where you will enter and other one from where you will
// exit. From any room either you can exit, or you can move to the next room. While
// visiting any room you will collect all the gold coins, and if you enter any room then
// you can’t skip collecting gold coins from that room, you have to take those coins.
// Owner wants to have exactly K coins, when you exit the room, he guarantees that
// there will be at least one possible solution for this puzzle.
// Given number of rooms (N), and number of gold coins in N rooms. You have to find
// room numbers from where you will start and from where you will exit. If there are
// more than one solution possible, then you have to provide a solution with a smaller
// starting room number.
// You can assume that room numbers will start from 1 and end at N.
// Hint: Find a continuous subsequence whose sum will be exactly equal to K.
// Example 1:
// • Input:
// 10 15 -> N =10, K = 15
// 5 3 7 14 18 1 18 4 8 3 -> Number of gold coins in each room.
// • Output:
// 1 3

// class Test {
// 	void main() {
// 		Integer a = 10;
		
// 		for(int i =0;i<100;i++) {
// 			j = 19;
// 		IO.println(a);
// 		}
// 	}                                
// }

// class User {
//     int id;

//     User(int id) {
//         this.id = id;
//     }
// }


// class Test {
// 	void main () {
// 		User obj = new User(2);
// 		obj = new User(2);
// 		User obj1 = new User(2);
		
// 		if(obj == obj1) {
// 			IO.println(obj.equals(obj1));
// 		}
// 		else {
// 			IO.println("false");
// 		}
// 	}
// }

// class A {
	
// }
// class B extends A {
	
// }

// class Test {
	// void main() {
		// A obj = new A();
		
		// if(obj instanceof A) {
			// A a = (A) obj;
			  // System.out.println("Cast done");
			// } else {
			   // System.out.println("Not possible");
			// }
		// }
	// }
	
// import java.util.*;
// class Test {
	// boolean isPelindrome(String s,int start,int end) {
		// while(start<=end) {
			// if(s.charAt(start) != s.charAt(end)) {
				   // return false;
			// }
			// start++;
			// end--;
		// }
		// return true;
	// }
    // public void longestPalindrome(String s) {
        // int max = 0;
        // int secMax = 0;
        // List<String> list = new ArrayList<>();
        // for(int i = 0;i<s.length();i++) {
            // int end = s.length()-1;  
			
                // while(i<end) {
					// if(isPelindrome(s,i,end)) {
					  // list.add(s.substring(i,end+1));
				  // }
				  // end--;
				  // i++;
				// }
        // }
		// IO.println(list);
    // }
	
	// void main() {
		// String s = "babad";
		// longestPalindrome(s);
		
	// }
// }

// class A {
    // A() {
        // System.out.println("A Constructor");
        // show();
    // }

    // void show() {
        // System.out.println("A show");
    // }
// }

// class B extends A {
    // int x = 10;

    // B() {
        // System.out.println("B Constructor");
    // }

    // void show() {
        // System.out.println("B show, x = " + x);
    // }
// }

// public class Test {
    // public static void main(String[] args) {
        // new B();
    // }
// }

// class A {
    // A() {
        // this(10);
        // System.out.println("A default");
    // }

    // A(int x) {
        // System.out.println("A parameterized");
    // }
// }

// class B extends A {
    // B() {
        // super();
        // System.out.println("B default");
    // }
// }

// public class Test {
    // public static void main(String[] args) {
        // new B();
    // }
// }

//A parameterized -> A default -> b default


// class A {
    // A() {
        // System.out.println("A");
    // }
// }

// class B extends A {
    // B() {
        // this(10);
        // System.out.println("B default");
    // }

    // B(int x) {
        // System.out.println("B param");
    // }
// }

// public class Test {
    // public static void main(String[] args) {
        // new B();
    // }
// }

// class A {
    // final int x;

    // A() {
        // x = 10;
    // }
// }

// class B extends A {
    // B() {
        // System.out.println(x);
    // }
// }

// class Test {
	// void main() {
		// new B();
	// }
// }


// class A {
    // static {
        // System.out.println("Static A");
    // }

    // {
        // System.out.println("Instance A");
    // }

    // A() {
        // System.out.println("Constructor A");
    // }
// }

// class B extends A {
    // static {
        // System.out.println("Static B");
    // }

    // {
        // System.out.println("Instance B");
    // }

    // B() {
        // System.out.println("Constructor B");
    // }
// }

// public class Test {
    // public static void main(String[] args) {
        // new B();
    // }
// }
//Static A, Static B , A constructor , B constructor 


// class Singleton {
	// private static Singleton object;
	// private Singleton()  {
		// IO.println("OBJ");
	// }
	// public static Singleton isCreated()  {
		// if(object == null) {
		// object = new Singleton();
	// }
	// return object;
	// }
// }

// class Test {
	
	// void main() {
		// int n = 28;
		// for(int i=0;i<n/2;i++) {
			
		// }
		 // Singleton s = Singleton.isCreated();
		// Singleton s1 = Singleton.isCreated();
		 // IO.println(s==s1);
	// }
// }
// class A {
	// void add() {
		// IO.println("Fdjh");
	// }
// }

// interface i imp{
	// void 
// }

// class Solution {
		// public String simplifyPath(String path) {
			// StringBuilder sb = new StringBuilder();
			// Stack<Character> stack = new Stack<>();
			// for(char c : path.toCharArray()) {
				// if(stack.isEmpty() ) {
					 // stack.push(c);
				// }
				// else {
					// if(stack.peek() != '/') {
						// stack.push(c);
					// }
					// else if(c != '/' && stack.peek() == '/'){
						// stack.push(c);
					// }
				// }
			// }
			// if(stack.peek() == '/') {
				// stack.remove(stack.peek());
			// }
			// for(char c : stack) {
				// sb.append(c);
			// }
			// return sb.toString();
		// }
	// }

// int[] arr = {12, 35, 1, 10, 34, 1};
// int firstMax = Integer.MIN_VALUE;
// int secMax = Integer.MIN_VALUE;

// for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > firstMax) {
        // secMax = firstMax;
        // firstMax = arr[i];
    // } else if (arr[i] > secMax && arr[i] <	firstMax) {
        // secMax = arr[i];
    // }
// }
// secMax is 34
// IO.println(secMax);

	// }
	
// }
		// Solution s = new Solution();
		// String path = "/home//foo/";
		// IO.println(s.simplifyPath(path));
		
		// int [][] mat = new int[][]{
			// {1,2,3},
				// {4,5,6},
					// {7,8,9}
		// };
		
		
		// for(int i=0;i<mat.length;i++) {
			// for(int j=0;j<mat[i].length;j++) {
				// IO.println(mat[i][j]);
			// }
		// }
		
		// int [][]result = new int[3][3];
		
		// IO.println("Multiplication is ");
		
		// for(int i = 0;i<mat.length;i++) {
			// for(int j=0;j<mat[i].length;j++) {
				
					// result[i][j] = mat[i][j] +mat[i][j];
			// }
		// }
		
		// for(int i=0;i<result.length;i++) {
			// for(int j=0;j<result[i].length;j++) {
				// IO.println(result[i][j]);
			// }
		// }
	// }
// }



// public class Test {
    // public static void main(String[] args) {
        // int a = 10;
        // double b = a / 4.0;
        // System.out.println(b);
    // }
// }





// class Test {
	// public static void main(String [] args) {
		// Integer arr [] = new Integer[]{3,3,3,2,21,1,2,3,5,6,4,4,4,5,6,7,5};
		// Set<Integer> set = new HashSet<>(Arrays.asList(3,1,3,3,3,1,12,64,4));
		// IO.println(set);
		// Map<String,Integer> map = new TreeMap<>();
		// map.put("P",10);
		// map.put("S",20);
		// map.put("A",30);
		// map.put("B",40);
		// map.put("C",50);
		
		// Iterable i = map.iterator();
		
		// while(i.hasNext()) {
			// IO.println(i.getKey());
		// }
		
		// for(Map.Entry<String,Integer> entry : map.entrySet()) {
			// IO.println(entry.getKey() + " => " + entry.getValue() + " " + entry);
		// }
		// for(Map entry : map) {
			// IO.println(entry.getKey() + " => " + entry.getValue() + " " + entry);
		// }
		
		// List <Integer> list = new ArrayList<>();
		// list.add(10);
		// list.add(10);
		// list.add(10);
		// list.add(10);
		// list.add(10);
		
		// Iterator<Integer> i = list.iterator();
		// while(i.hasNext()) {
			// IO.println(i.next());
		// }
		
		// int arr [] = new int[]{1,4,5,0,0,0};
		// int arr2 [] = new int []{4,6,8};
		
		// int i = 0; 
		// int j = 0;
		
		// while(i != arr.length && j!= arr2.length) {
			// if(arr[i] < arr2[j]) {
				// arr[i++] =  arr2[j++];
			// }
			// else if(arr[i]>arr2[j]) {
				 // i++;
			// }
		// }
		// IO.println(Arrays.toString(arr));
	// }
// }


// class Test {
	// void main() {
		// Map<Integer,Integer>map = Map.of(1,20, 3,2,4,5,6,7);
	 // for(Map.Entry<Integer,Integer>entry : map.entrySet()) {
		 // IO.println(entry.keySet());
	 // }
	// }
// }              

// list : list is dynamic array which growas with the size increses 
// list default capacity = 10;
// 16 
// 1.5 x

// class Test {
	// void main() {
		// Map<Integer,Integer> map = new HashMap<>();
		
		
		// map.put(1,4);
		// map.put(1,3);
		// map.put(1,4);
		// map.put(1,3);
		// map.put(1,4);
		// map.put(1,3);
		
		
		// list.remove(2);
		// list.set(1, 100);
		// list.add("OM");
		
	
		
		// IO.println(map);
		
		// String str = "Omya";
		// str =  "ommm";
												 
		
		// String o = new String("vishal");
				// IO.println(o.hashCode());
		// String ob = new String("vishal");
				// IO.println(ob.hashCode());
				
		
		// String o = new String("OM");
		// IO.println(o.hashCode());
		// String om = "OM";
		// IO.println(om.hashCode());
		// String str = "ABC CBA";
		// String o = str.trim();
		// String [] s = str.split(" ");
			
		// IO.println(Arrays.toStrig(s));
		// IO.println(o.equals(ob));
		
		
	// }
// }

 // public class ListNode {
    // int val;
    // ListNode next;
    // ListNode() {}
    // ListNode(int val) { this.val = val; }
    // ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 // }
 
 
 
 
 // class Test{
	 // void main() {
		// int n = 123;        
		// int reverse = 1;
        // while(n!=0) {
            // int lastD = n%10;
            // reverse *= lastD *10;    
            // n=n/10;
        // }
		// IO.println(reverse);
		// }
 // 
 
 // class A {
    // int x = 10;
// }
// class B extends A {
    // int x = 20;
// }
// public class Test {
    // public static void main(String[] args) {
        // A obj = new B();
        // System.out.println(obj.x);
    // }
// }


class A {
    static void show() {
        System.out.println("A");
    }
}
class B extends A {
    static void show() {
        System.out.println("B");
    }
}
public class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
